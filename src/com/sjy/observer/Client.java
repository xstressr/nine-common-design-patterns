package com.sjy.observer;

public class Client {
    public static void main(String[] args) {
        //  目标对象
        RealObserver subject = new RealObserver();
        //  创建多个观察者
        ObserverImpl obs1 = new ObserverImpl();
        ObserverImpl obs2 = new ObserverImpl();
        ObserverImpl obs3 = new ObserverImpl();
        //  注册到观察队列中
        subject.registerObserver(obs1);
        subject.registerObserver(obs2);
        subject.registerObserver(obs3);
        //  改变State状态
        subject.setState(300);
        System.out.println("obs1观察者的MyState状态值为：" + obs1.getMyState());
        System.out.println("obs1观察者的MyState状态值为：" + obs2.getMyState());
        System.out.println("obs1观察者的MyState状态值为：" + obs3.getMyState());
        //  改变State状态
        subject.setState(400);
        System.out.println("obs1观察者的MyState状态值为：" + obs1.getMyState());
        System.out.println("obs1观察者的MyState状态值为：" + obs2.getMyState());
        System.out.println("obs1观察者的MyState状态值为：" + obs3.getMyState());
    }
}
