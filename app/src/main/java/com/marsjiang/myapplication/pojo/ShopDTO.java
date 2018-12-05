package com.marsjiang.myapplication.pojo;

import com.xuxueli.poi.excel.annotation.ExcelSheet;

/**
 * @author Jiang
 * @date 2018-11-28
 */
//@ExcelSheet(name = "商户列表",headColor = HSSFColor.HSSFColorPredefined.LIGHT_GREEN)
@ExcelSheet(name = "商户列表")
public class ShopDTO {

    private int shopId;

    private String shopName;

    public ShopDTO() {
    }

    public ShopDTO(int shopId, String shopName) {
        this.shopId = shopId;
        this.shopName = shopName;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Override
    public String toString() {
        return "ShopDTO{" +
                "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                '}';
    }
}
