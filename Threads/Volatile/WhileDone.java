package com.Threads.Volatile;

import javax.swing.plaf.nimbus.State;

public class WhileDone implements Runnable {
    DownloadStatus status = new DownloadStatus();

    public WhileDone(DownloadStatus status){
        this.status=status;
    }

    @Override
    public void run() {
        while (!status.isDone())
        {
            synchronized (status){
            try {
                status.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                }
            }


        }
        System.out.println("Dooooooooooooone!!!!!!! "+
                status.getTotalBytes());
        ;

    }
}
