package com.aiBanShi.DianShiNet.dto;

/**
 * Created by hanhan on 2017-07-09.
 */
public class OrderInfo {
    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.aiBanShi.DianShiNet.dto.OrderInfo{");
        sb.append("productName='").append(productName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
