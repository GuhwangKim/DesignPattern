package com.example.designpattern.decoration;

public class DarkRoast extends Beverage{
    public DarkRoast() {
        description ="다크로스트";
    }

    @Override
    public double cost() {
        return 0.3;
    }
}
