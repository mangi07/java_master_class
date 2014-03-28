package com.mikemenne.cs50examples;

public class HelloWorld {

    public static void main(String[] varArgs) {
        System.out.println("Hello World!");

        GenericPhone genericPhone = new GenericPhone("Android Galaxy");
//        System.out.println(genericPhone.getType() + " is ringing...." + genericPhone.phoneRinging());
        System.out.println(String.format("%s is ringing %s", genericPhone.getType(), genericPhone.phoneRinging()));

        GenericPhone iGenericPhone = new GenericPhone("iGenericPhone 6");
        System.out.println(String.format("%s is ringing %s", iGenericPhone.getType(), iGenericPhone.phoneRinging()));

        AndroidPhone androidPhone = new AndroidPhone("iGenericPhone 6");
//        System.out.println(String.format("%s is ringing %s", androidPhone.sendTextMessage(), iGenericPhone.phoneRinging()));
    }
