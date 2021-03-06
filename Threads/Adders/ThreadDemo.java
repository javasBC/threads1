package com.Threads.Adders;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show (){
        var staus= new DownloadStatus();
        List<Thread> threads= new ArrayList<>();

        System.out.println(Thread.currentThread().getName());


        for(var i=0;i<10;i++) {
            Thread thread = new Thread(new DownloadFile(staus));
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(staus.getTotalBytes());


    }
}
