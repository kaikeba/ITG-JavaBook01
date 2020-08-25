package com.kaikeba.chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        //创建10个线程，同时对同一个atomicInteger实例对象执行累加操作
        AtomicInteger aiShare=new AtomicInteger();
        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new Accumlator(aiShare));
            list.add(t);
            t.start();
        }

        //等待所有线程运行结束
        for (Thread t : list) {
            t.join();
        }

        //输出aiShare的值
        System.out.println(aiShare.get());
    }
}
