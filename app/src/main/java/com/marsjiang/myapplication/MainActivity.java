package com.marsjiang.myapplication;

import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.maning.mndialoglibrary.MProgressDialog;
import com.marsjiang.myapplication.pojo.MedicineInfo;
import com.marsjiang.myapplication.pojo.ShopDTO;
import com.marsjiang.myapplication.utils.ExcelExportUtil;
import com.marsjiang.myapplication.utils.ExcelImportUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    private static ScheduledExecutorService pool = Executors.newScheduledThreadPool(1);
    private StringBuffer stringBuffer;
    private List<MedicineInfo> medicineInfos;
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Toast.makeText(MainActivity.this, "ok", Toast.LENGTH_LONG).show();
//            ((TextView) findViewById(R.id.tvShow)).setText(stringBuffer.toString());
            MProgressDialog.dismissProgress();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stringBuffer = new StringBuffer();
        final String path = Environment.getExternalStorageDirectory().getPath();
        final List<ShopDTO> shopDTOS = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ShopDTO shopDTO = new ShopDTO(i, "test" + i);
            shopDTOS.add(shopDTO);
        }


        //导出
        findViewById(R.id.btnExport).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (medicineInfos == null) {
                    Toast.makeText(MainActivity.this, "暂无数据,请先导入!", Toast.LENGTH_SHORT).show();
                    return;
                }

                File file = new File(path + "/test.xlsx");
                if (file.exists()) {
                    Toast.makeText(MainActivity.this, "导出文件已存在，请确认无误后再试!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //不需要文字
                MProgressDialog.showProgress(MainActivity.this, "");
                Runnable task = new Runnable() {
                    @Override
                    public void run() {
                        long timeBefore = System.currentTimeMillis();

                        ExcelExportUtil.exportToFile(path + "/test.xlsx", medicineInfos);
                        long timeAfter = System.currentTimeMillis();

                        Log.d("Export myTime", String.valueOf((timeAfter - timeBefore) / 1000));
                        mHandler.sendEmptyMessage(0);

                    }
                };
                pool.schedule(task, 0, TimeUnit.MILLISECONDS);
            }
        });
        //导入
        findViewById(R.id.btnImport).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                List<Object> shopDatas = ExcelImportUtil.importExcel(path + "/test.xlsx", ShopDTO.class);
//                if (shopDatas == null) {
//                    Toast.makeText(MainActivity.this, "暂无数据,请先导出!", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                List<ShopDTO> shopDTOs = (List<ShopDTO>) (List) shopDatas;
//                StringBuffer stringBuffer = new StringBuffer();
//                for (ShopDTO shopDTO : shopDTOs) {
//                    stringBuffer.append(shopDTO.toString() + "\n");
//                }
//                ((TextView) findViewById(R.id.tvShow)).setText(stringBuffer.toString());

                //不需要文字
                MProgressDialog.showProgress(MainActivity.this, "");

                Runnable task = new Runnable() {
                    @Override
                    public void run() {
                        long timeBefore = System.currentTimeMillis();
                        List<Object> medicineLits = ExcelImportUtil.importExcel(path + "/testest.xls", MedicineInfo.class);
                        long timeAfter = System.currentTimeMillis();

                        Log.d("Import myTime", String.valueOf((timeAfter - timeBefore) / 1000));
//                        MProgressDialog.dismissProgress();
                        if (medicineLits == null) {
                            Toast.makeText(MainActivity.this, "暂无数据,请先导出!", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        medicineInfos = (List<MedicineInfo>) (List) medicineLits;
                        for (MedicineInfo shopDTO : medicineInfos) {
                            stringBuffer.append(shopDTO.toString() + "\n");
                        }
                        mHandler.sendEmptyMessage(0);
                    }
                };
                pool.schedule(task, 0, TimeUnit.MILLISECONDS);

            }
        });
    }
}
