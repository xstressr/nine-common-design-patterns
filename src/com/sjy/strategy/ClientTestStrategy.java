package com.sjy.strategy;

public class ClientTestStrategy {
    public static void main(String[] args) {
        Context context;
        //  使用支付逻辑A
        context = new Context(new PayStrategyA());
        context.algorithmInterface();
        //  使用支付逻辑B
        context = new Context(new PayStrategyB());
        context.algorithmInterface();
        //  使用支付逻辑C
        context = new Context(new PayStrategyC());
        context.algorithmInterface();
    }
}
