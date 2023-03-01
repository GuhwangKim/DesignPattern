package com.example.designpattern.chapter2;

public interface Subject {
    public void registerObserver(Observer ob);
    public void removeObserver(Observer ob);
    public void notifyObservers();//주제의 상태가 변경되었을 때 모든 옵저버에게 변경 내용을 알림
}
