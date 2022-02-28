package com.Threads.Synchro;

public class DownloadFile implements Runnable {
    private DownloadStatus status;

    public DownloadFile( DownloadStatus status) {
       this.status= status;
    }

    @Override
    public void run() {
        for (var i = 0; i < 10_000; i++) {
            this.status.incrementtotalByte();
        }
        System.out.println("Download completed :"
                + Thread.currentThread().getName());
    }

}
