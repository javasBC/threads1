package com.Threads.SynchronizedCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AddToCollec implements Runnable {
    Collection<Integer> collection;
    List<Integer> list ;
    public AddToCollec(List<Integer> list , Collection<Integer> collection){
        this.collection=collection;
        this.list=list;
    }

    @Override
    public void run() {
        collection.addAll(list);
    }
}
