package com.example.designpattern.chapter2;


import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature; //필드
    private float humidity;
    private float pressure;

    public void WeatherData(){ // 생성자
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
            // 모든 옵저버들에게 변화를 알려주는 부분
        for(Observer observer : observers){
            observer.update(temperature, humidity, pressure);
        }

    }
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        //measurementsChanged();
    }
}
