package com.mikemenne.cs50examples;

/**
 * Created by IntelliJ IDEA.
 * User: mpmenne
 * Date: 2/28/14
 * Time: 10:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class GenericPhone implements Phone {

    private String type;

    public GenericPhone(String phoneType) {
        type = phoneType;
    }

    public String phoneRinging() {
        return "Rinng  Rinnggg Ringg";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
