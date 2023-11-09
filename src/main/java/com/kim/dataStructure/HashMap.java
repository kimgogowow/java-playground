package com.kim.dataStructure;

import java.util.Arrays;

public class HashMap {
    private class Entry{
        private int key;
        private String val;
        public Entry(int key, String val){
            this.key = key;
            this.val = val;
        }
        @Override
        public String toString(){
            return val;
        }
    }

    private Entry[] entries = new Entry[5];
    private int size;
    public void put(int key,String val){
        var entry = getEntry(key);
        if(entry != null){
            entry.val = val;
            return;
        }
        if(isFull()) throw new IllegalStateException("the map is full");
        entries[getIndex(key)] = new Entry(key,val);
        size++;
    }
    public String get(int key){
        var entry = getEntry(key);
        return entry == null? null : entry.val;
    }
    public void remove(int key){
       var index = getIndex(key);
       if(index == -1 || entries[index]==null){
           throw new IllegalStateException(
                   "not include this element"
           );
       }
       size--;
       entries[index]=null;
    }
    public int size(){
        return size;
    }
    public Entry getEntry(int key){
        var index = getIndex(key);
        return index>=0? entries[index] :null;
    }
    private int getIndex(int key){
        int step = 0;
        while(step< entries.length){
            int index = index(key,step);
            var entry = entries[index];
            if(entry == null || entry.key == key){
                return index; //该位置可以加新元素或者可以update
            }
        }
        return -1;//找不着这个，大概率是满了
    }
    private boolean isFull() {
        return size == entries.length;
    }
    private int hash(int key){
            return key% entries.length;
    }
    private int index(int key,int i){
            return (hash(key)+i)% entries.length;
    }
    @Override
    public String toString(){
        return Arrays.toString(entries);
    }
}
