package com.dhc.ddshop.pojo.vo;

import com.dhc.ddshop.pojo.po.TbItem;

/**
 * 自定义的商品显示类(VO)
 * User: DHC
 * Date: 2017/11/7
 * Time: 15:32
 * Version:V1.0
 */
public class TbItemCustom extends TbItem{
    private String statusName;

    private String priceView;
    private String catName;

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getPriceView() {
        return priceView;
    }

    public void setPriceView(String priceView) {
        this.priceView = priceView;
    }
}
