package com.Threads.Volatile;

import jdk.jshell.Snippet;

public class DownloadFile implements Runnable {
    private DownloadStatus status;

    public DownloadFile( DownloadStatus status) {
        this.status= status;
    }

    @Override
    public void run() {
        for (var i = 0; i < 1_000_000; i++) {

            this.status.incrementtotalByte();
        }
        status.done();
        synchronized (status) {
            status.notify();
        }
        System.out.println("Download Completed"
                +Thread.currentThread().getName());
    }
}
