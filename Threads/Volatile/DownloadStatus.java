package com.Threads.Volatile;

public class DownloadStatus {
    private int totalBytes;
    private int FilesInTotal;
    private volatile boolean isDone = false;

    public  boolean isDone(){
        return isDone;
    }

    public  void done(){
        isDone =true;
    }

    public synchronized int getTotalBytes() {

        return totalBytes;

    }

    public synchronized void incrementtotalByte() {
        this.totalBytes++;
    }

    public synchronized int getFilesInTotal() {
        return FilesInTotal;
    }

    public synchronized void incrementtotalFiles() {

        this.FilesInTotal++;

    }
}
