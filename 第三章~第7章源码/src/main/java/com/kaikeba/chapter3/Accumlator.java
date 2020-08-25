package com.kaikeba.chapter3;

import java.util.concurrent.atomic.AtomicInteger;


public class Accumlator implements Runnable {
    private AtomicInteger ai;
    Accumlator(AtomicInteger ai) {
        this.ai = ai;
    }
    @Override
    public void run() {
        //每个线程都执行1000次自增操作
        for (int i = 0; i < 1000; i++) {
            ai.getAndIncrement();
        }
    }
}