package com.sjy.observer;

import java.util.Vector;

// 定义主题，以及定义观察者数组，并实现增、删及通知操作。
public class Subject {
    // 观察者的存储集合，不推荐arrayList，线程不安全
    private Vector<Observer> list = new Vector<>();

    // 注册观察者方法
    public void registerObserver(Observer obs) {
        list.add(obs);
    }

    // 删除观察者方法
    public void removeObserver(Observer obs) {
        list.remove(obs);
    }

    // 通知所有的观察者更新
    public void notifyAllObserver(int state) {
        for (Observer observer : list) {
            observer.update(state);
        }
    }
}
