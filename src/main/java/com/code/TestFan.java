package com.code;

public class TestFan {
    public static void main(String[] args) {
        //Fan 1
        Fan fan = new Fan(3,true,10,"yellow");
        System.out.println(fan);
        //Fan 2
        fan = new Fan(2,false,5,"blue");
        System.out.println(fan);
    }
}
