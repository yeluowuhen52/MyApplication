package com.marsjiang.myapplication.pojo;

import com.xuxueli.poi.excel.annotation.ExcelSheet;

import java.io.Serializable;

/**
 * @author Jiang
 * @date 2018-11-30
 */
@ExcelSheet(name = "123321")
public class MedicineInfo implements Serializable {
    private static final long serialVersionUID = -1932095083361691656L;
    //药品编号
    private String 药品编号;
    //是否基本药物
    private String 是否基本药物;
    //采购方式
    private String 采购方式;
    //目录类型
    private String 目录类型;
    //通用名
    private String 通用名;
    //剂型
    private String 剂型;
    //规格
    private String 规格;
    //转换系数
    private String 转换系数;
    //单位
    private String 单位;
    //包装单位
    private String 包装单位;
    //生产企业
    private String 生产企业;
    //投标企业
    private String 投标企业;
    //挂网价
    private String 挂网价;
    //山西上一轮中标价
    private String 山西上一轮中标价;
    //北京挂网价
    private String 北京挂网价;
    //三明价格
    private String 三明价格;
    //最小价格
    private String 最小价格;

    public MedicineInfo() {
    }

    public MedicineInfo(String 药品编号, String 是否基本药物, String 采购方式, String 目录类型, String 通用名, String 剂型, String 规格, String 转换系数, String 单位, String 包装单位, String 生产企业, String 投标企业, String 挂网价, String 山西上一轮中标价, String 北京挂网价, String 三明价格, String 最小价格) {
        this.药品编号 = 药品编号;
        this.是否基本药物 = 是否基本药物;
        this.采购方式 = 采购方式;
        this.目录类型 = 目录类型;
        this.通用名 = 通用名;
        this.剂型 = 剂型;
        this.规格 = 规格;
        this.转换系数 = 转换系数;
        this.单位 = 单位;
        this.包装单位 = 包装单位;
        this.生产企业 = 生产企业;
        this.投标企业 = 投标企业;
        this.挂网价 = 挂网价;
        this.山西上一轮中标价 = 山西上一轮中标价;
        this.北京挂网价 = 北京挂网价;
        this.三明价格 = 三明价格;
        this.最小价格 = 最小价格;
    }

    @Override
    public String toString() {
        return "MedicineInfo{" +
                "药品编号='" + 药品编号 + '\'' +
                ", 是否基本药物='" + 是否基本药物 + '\'' +
                ", 采购方式='" + 采购方式 + '\'' +
                ", 目录类型='" + 目录类型 + '\'' +
                ", 通用名='" + 通用名 + '\'' +
                ", 剂型='" + 剂型 + '\'' +
                ", 规格='" + 规格 + '\'' +
                ", 转换系数='" + 转换系数 + '\'' +
                ", 单位='" + 单位 + '\'' +
                ", 包装单位='" + 包装单位 + '\'' +
                ", 生产企业='" + 生产企业 + '\'' +
                ", 投标企业='" + 投标企业 + '\'' +
                ", 挂网价='" + 挂网价 + '\'' +
                ", 山西上一轮中标价='" + 山西上一轮中标价 + '\'' +
                ", 北京挂网价='" + 北京挂网价 + '\'' +
                ", 三明价格='" + 三明价格 + '\'' +
                ", 最小价格='" + 最小价格 + '\'' +
                '}';
    }

    public String get药品编号() {
        return this.药品编号;
    }

    public void set药品编号(String 药品编号) {
        this.药品编号 = 药品编号;
    }

    public String get是否基本药物() {
        return this.是否基本药物;
    }

    public void set是否基本药物(String 是否基本药物) {
        this.是否基本药物 = 是否基本药物;
    }

    public String get采购方式() {
        return this.采购方式;
    }

    public void set采购方式(String 采购方式) {
        this.采购方式 = 采购方式;
    }

    public String get目录类型() {
        return this.目录类型;
    }

    public void set目录类型(String 目录类型) {
        this.目录类型 = 目录类型;
    }

    public String get通用名() {
        return this.通用名;
    }

    public void set通用名(String 通用名) {
        this.通用名 = 通用名;
    }

    public String get剂型() {
        return this.剂型;
    }

    public void set剂型(String 剂型) {
        this.剂型 = 剂型;
    }

    public String get规格() {
        return this.规格;
    }

    public void set规格(String 规格) {
        this.规格 = 规格;
    }

    public String get转换系数() {
        return this.转换系数;
    }

    public void set转换系数(String 转换系数) {
        this.转换系数 = 转换系数;
    }

    public String get单位() {
        return this.单位;
    }

    public void set单位(String 单位) {
        this.单位 = 单位;
    }

    public String get包装单位() {
        return this.包装单位;
    }

    public void set包装单位(String 包装单位) {
        this.包装单位 = 包装单位;
    }

    public String get生产企业() {
        return this.生产企业;
    }

    public void set生产企业(String 生产企业) {
        this.生产企业 = 生产企业;
    }

    public String get投标企业() {
        return this.投标企业;
    }

    public void set投标企业(String 投标企业) {
        this.投标企业 = 投标企业;
    }

    public String get挂网价() {
        return this.挂网价;
    }

    public void set挂网价(String 挂网价) {
        this.挂网价 = 挂网价;
    }

    public String get山西上一轮中标价() {
        return this.山西上一轮中标价;
    }

    public void set山西上一轮中标价(String 山西上一轮中标价) {
        this.山西上一轮中标价 = 山西上一轮中标价;
    }

    public String get北京挂网价() {
        return this.北京挂网价;
    }

    public void set北京挂网价(String 北京挂网价) {
        this.北京挂网价 = 北京挂网价;
    }

    public String get三明价格() {
        return this.三明价格;
    }

    public void set三明价格(String 三明价格) {
        this.三明价格 = 三明价格;
    }

    public String get最小价格() {
        return this.最小价格;
    }

    public void set最小价格(String 最小价格) {
        this.最小价格 = 最小价格;
    }
}
