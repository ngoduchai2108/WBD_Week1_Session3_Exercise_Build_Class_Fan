package com.code;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = 0;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.on = on;
        this.radius = radius;
        this.color = color;
        if (on){
            this.speed = speed;
        }else {
            this.speed = 0;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (on && speed >0 && speed <4){
            this.speed = speed;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "A Fan with color = "+getColor()+", radius of Fan = "+ getRadius()+
                (on?", speed of Fan = "+getSpeed()+" and Fan is on.":" and Fan is off.");
    }
}
