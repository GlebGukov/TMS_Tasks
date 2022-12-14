package com.tms;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Основное задание
//        1. Создать три потока Т1, Т2 и Т3
//        Реализовать выполнение поток в последовательности Т3 -> Т2 -> Т1
//                (используя метод join)
//        Дополнительное задание
//        2. Напишите многопоточный ограниченный буфер с использованием
//        ReentrantLock.
//        3. Напишите многопоточный ограниченный буфер с использованием
//        synchronized
        MyThread myThread = new MyThread();
        MyRunnable myRunnable = new MyRunnable();
        Thread thread3 = new Thread(myRunnable);
        thread3.setName("Поток из ранбл");
        MyThread myThread2 = new MyThread();
        Resourse resourse = new Resourse();
        resourse.setI(200);

        myThread.setResourse(resourse);
        myThread2.setResourse(resourse);



        thread3.start();
        thread3.join();
        myThread.start();
        myThread2.start();
        myThread.join();
        System.out.println(resourse.getI());
        myThread2.join();
        System.out.println(resourse.getI());


    }
}

class MyThread extends Thread {
    Resourse resourse;
    public void setResourse(Resourse resourse){
        this.resourse = resourse;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(MyThread.currentThread().getName() + " " + i);
        }
        resourse.changeResourse();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(MyThread.currentThread().getName() + " " + i);
        }
    }
}

class Resourse {
    private int i;

    public int getI() {
        return i;
    }
    Lock lock = new ReentrantLock();
    public void setI(int i) { // Lock тоже самое что и synchronized ????
        lock.lock();
        this.i = i;
        lock.unlock();
    }

    public synchronized void changeResourse (){
        setI(i);
        i++;
        i++;
        i++;
        setI(i);


    }
}