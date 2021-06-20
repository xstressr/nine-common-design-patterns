package com.sjy.strategy;

public class PayStrategyA extends PayStrategy{
    @Override
    void algorithmInterface() {
        System.out.println("微信支付");
    }
}
