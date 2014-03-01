package com.mikemenne.cs50examples;


public class HelloWorld {

    public static void main(String[] varArgs) {
        System.out.println("Hello World!");

        Phone phone = new Phone("Android Galaxy");
//        System.out.println(phone.getType() + " is ringing...." + phone.phoneRinging());
        System.out.println(String.format("%s is ringing %s", phone.getType(), phone.phoneRinging()));

        Phone iPhone = new Phone("iPhone 6");
        System.out.println(String.format("%s is ringing %s", iPhone.getType(), iPhone.phoneRinging()));
    }

}
