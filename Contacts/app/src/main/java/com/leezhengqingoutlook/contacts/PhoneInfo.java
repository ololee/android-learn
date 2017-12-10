package com.leezhengqingoutlook.contacts;

/**
 * Created by 李正庆 on 2017/12/10.
 */

public class PhoneInfo {
    private String name;
    private String number;
    public PhoneInfo(String name,String number)
    {
        setName(name);
        setNumber(number);
    }
    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(String number) {
        this.number = number;
    }
}
