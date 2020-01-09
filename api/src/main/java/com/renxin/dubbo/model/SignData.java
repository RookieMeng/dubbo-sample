package com.renxin.dubbo.model;

public class SignData {

    private long Timestamp;
    private String As;
    private String Cp;
    private String Mac;

    public long getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(long timestamp) {
        Timestamp = timestamp;
    }

    public String getAs() {
        return As;
    }

    public void setAs(String as) {
        As = as;
    }

    public String getCp() {
        return Cp;
    }

    public void setCp(String cp) {
        Cp = cp;
    }

    public String getMac() {
        return Mac;
    }

    public void setMac(String mac) {
        Mac = mac;
    }
}
