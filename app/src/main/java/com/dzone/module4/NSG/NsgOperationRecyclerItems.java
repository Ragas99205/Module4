package com.dzone.module4.NSG;

public class NsgOperationRecyclerItems {
    String date;
    String desc;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public NsgOperationRecyclerItems(String date, String desc) {
        this.date = date;
        this.desc = desc;
    }

}
