package com.kaikeba.chapter4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class ConditionDemo {
    private Lock lock=new ReentrantLock(); //声明重入锁
    private Condition condition=lock.newCondition();//条件变量

    public void waitTest(){
        try {
            lock.lock();//获取锁
            try {
                System.out.println("condition.await，start");
                condition.await();//当前线程释放锁并阻塞
                System.out.println("condition.await，end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }finally {
            lock.unlock();//释放锁
        }
    }

    public void notifyTest(){
        try {
            lock.lock();//获取锁
            System.out.println("condition.notify，start");
            condition.signal();//唤醒等待状态的线程（同一条件变量中的等待线程）
            System.out.println("condition.notify，end");
        }finally {
            lock.unlock();//释放锁
        }
    }


    public static void main(String[] args) throws  Exception{
        ConditionDemo conditionDemo=new ConditionDemo();
        //线程1，进入等待状态
        new Thread(()->{conditionDemo.waitTest();},"Thread-await").start();// 阻塞await
        //休眠一会，保证await先运行。
        Thread.sleep(100);
        new Thread(()->{conditionDemo.notifyTest();},"Thread-signal").start();//唤醒
    }
}