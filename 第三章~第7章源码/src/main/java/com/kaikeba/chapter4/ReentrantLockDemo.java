package com.kaikeba.chapter4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 创建时间：2019/12/13
 * 开课吧-IT学院
 * 作者:Judy
 */
public class ReentrantLockDemo {
    private int count=0;
    public int getCount() {return count; }
    public void increase(){count++; }

    public static void main(String[] args) {
        ReentrantLockDemo reentrantLockDemo=new ReentrantLockDemo();
        Lock lock=new ReentrantLock();//重入锁实例
        //Thread1，Thread2 拥有相同的重入锁，同时只能有一个线程持有锁。
        new Thread(()->{
            String threadName=Thread.currentThread().getName();
            System.out.println(threadName + "尝试获得锁。");
            lock.lock();
            System.out.println(threadName + "成功获锁。");
            try {
                for (int i = 0; i < 5; i++) {
                    reentrantLockDemo.increase();
                    Thread.sleep(10);
                    System.out.print(threadName + ":" + reentrantLockDemo.getCount()+",");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
            System.out.println("\n"+threadName + "同步语句块，运行结束。");
        },"Thread1").start();
        new Thread(()->{
            String threadName=Thread.currentThread().getName();
            System.out.println(threadName + "尝试获得锁。");
            lock.lock();
            System.out.println(threadName + "成功获锁。");
            try {
                for (int i = 0; i < 5; i++) {
                    reentrantLockDemo.increase();
                    System.out.print(threadName + ":" + reentrantLockDemo.getCount()+",");
                }
            }finally {
                lock.unlock();
            }
            System.out.println("\n"+threadName + "同步语句块，运行结束。");
        },"Thread2").start();
    }
}