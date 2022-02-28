package com.Threads.Volatile;



public class ThreadDemo {
    public static void show (){
        var status = new DownloadStatus();


        var thread1 =new Thread (new DownloadFile(status));
        var thread2 = new Thread(new WhileDone(status));


        thread1.start();
        thread2.start();


    }
}
