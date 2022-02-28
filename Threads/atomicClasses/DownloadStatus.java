package com.Threads.atomicClasses;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalBytes;
    private int FilesInTotal;
    private Lock gate = new ReentrantLock();
    private Object totalBytesLock = new Object();
    private Object totalfilessLock = new Object();


    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementtotalByte() {

        this.totalBytes++;
        // cpu takes the value from the ram
        // the cpu changes the value
        // the cpu sends the new value the  memory


        // update= -> 3
    }
}
