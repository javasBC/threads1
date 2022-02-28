package com.Threads.SynchronizedCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.atomic.LongAdder;

public class ThreadDemo {
    public static void show () {
        Collection<Integer> collection=
                Collections.synchronizedCollection(new ArrayList<>());
        var l1 = Arrays.asList(1,2,3);
        var l2 = Arrays.asList(4,5,6);
        var l3 = Arrays.asList(7,8,9);

        var thread1 = new Thread(new AddToCollec(l1,collection));
        var thread2 = new Thread(new AddToCollec(l2,collection));
        var thread3 = new Thread(new AddToCollec(l3,collection));
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        }catch (InterruptedException e){

        }
        System.out.println(collection);



    }
}
