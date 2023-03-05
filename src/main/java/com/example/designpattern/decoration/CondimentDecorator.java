package com.example.designpattern.decoration;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    // 데코레이터가 감쌀 음료를 나타내는 객체를 지정
    public abstract String getDescription();
}
