package com.benonshi.array;

import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: BenOnSHI
 * @Date: 2020/7/10 17:27
 **/
public class Test {

    static ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    static Lock readLock = readWriteLock.readLock();
    static Lock writeLock = readWriteLock.writeLock();

    private volatile boolean flag = false;

    LinkedList<String> linkedList = new LinkedList();

    public void producer(String msg) {
        writeLock.lock();
        try {
            linkedList.add(msg);
            flag = true;
        } finally {
            writeLock.unlock();
        }
    }

    public void consumer() {
        while (true) {
            readLock.lock();
            try {
                String poll = linkedList.poll();
                System.out.println(poll);
                System.out.println(linkedList.size());
//                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                readLock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        Test queueTest = new Test();
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                queueTest.producer("生产消息" + i);
            }
        }).start();
        new Thread(() -> {
            queueTest.consumer();
        }).start();

        System.out.println("结束");
    }


}
