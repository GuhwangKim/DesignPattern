package com.example.designpattern.decoration;

public class StarbucksCoffe {

    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription()+" $"+beverage.cost());
    }
}
