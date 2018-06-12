package com.example.len.coolweather.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {

    private int id;

    private String privinceName;

    private int privinceConde;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getPrivinceName() {
        return privinceName;
    }

    public void setPrivinceName(String privinceName) {
        this.privinceName = privinceName;
    }

    public int getPrivinceConde() {
        return privinceConde;
    }

    public void setPrivinceConde(int privinceConde) {
        this.privinceConde = privinceConde;
    }
}
