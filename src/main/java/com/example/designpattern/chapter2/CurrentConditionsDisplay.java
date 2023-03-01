package com.example.designpattern.chapter2;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature; //필드
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay (WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        // 헤당 클래스를 옵저버로 등록함
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("현재 상태 : 온도 "+temperature+" F, 습도 "+humidity+"%");
    }
}
