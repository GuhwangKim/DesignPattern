package com.example.designpattern.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    // weather data 로 부터 변경사항을 받기 위해서 Observer를 구현함
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
