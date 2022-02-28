package com.Threads.Synchro;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private AtomicInteger totalBytes = new AtomicInteger();
    private int filesInTotal;
    private Lock gate = new ReentrantLock();
    private Object totalBytesLock = new Object();
    //private Object totalfilessLock = new Object();


    public int getTotalBytes() {

        return totalBytes.get();

    }

    public  void incrementtotalByte() {
        this.totalBytes.getAndIncrement();   //++x    /x++
    }
    public  void dectotalByte() {
        this.totalBytes.decrementAndGet();
    }

}
