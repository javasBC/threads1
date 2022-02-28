package com.Threads.Adders;

 //  ++   read increment write    - > compare and soap   ++ --
 //  -> Adders  totalBytes+=10;
                                    //
// list<>
// for(s in list)
//     sum += s.status.getTotlaBytes

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {
    private LongAdder totalBytes= new LongAdder(); //LongAdder // DoubleAdder
    private AtomicInteger FilesInTotal;

    public int getTotalBytes() {
        return totalBytes.intValue(); //  Sum
    }

    public void incrementtotalByte() {

        this.totalBytes.increment();
        // cpu takes the value from the ram
        // the cpu changes the value
        // the cpu sends the new value the  memory


        // update= -> 3
    }
}
