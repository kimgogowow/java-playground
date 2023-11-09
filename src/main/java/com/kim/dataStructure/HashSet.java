package com.kim.dataStructure;

import java.util.Arrays;

/**
 * Constructor: Initializes arrays for data and flags (used to indicate if a slot is in use), and sets the capacity.
 * 1.hash(int value): A simple hash function to calculate the index. It's important to use Math.abs to avoid negative indices.
 * 2.add(int value): Tries to add a value. If the hashed index is already occupied, it uses linear probing to find the next free slot.
 * 3.contains(int value): Checks if a value is present in the set.
 * 4.remove(int value): Removes a value if it exists in the set.
 * 5.size(): Returns the current number of elements in the set.
 */
public class HashSet {
    private Integer[] set;
    private int size,capacity;
    private boolean[] used;//check the hashed uniquenes

    public HashSet(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.set = new Integer[capacity];
    }

    public int hash(int item){
        return Math.abs(item % capacity);
    }
    public int index(int item,int i){
        return (hash(item)+i)%capacity;
    }
    public void add(int item){
        if(size == capacity) throw new IllegalStateException("it is full");
        int index = getIndex(item);
        if(index== -1){
            throw new IllegalStateException("no suitable slot for it");
        }
        set[index] = item;
        size++;

    }
    public boolean contains(int item){
        int index = getIndex(item);
        return set[index]!=null;
    }
    public int getIndex(int item){
        int step = 0;
        while(step<set.length){
            int index = index(item,step);
            if(set[index] == null || set[index]== item){
                return index;
            }
        }
        return -1;
    }
    public void remove(int item){
        int index = getIndex(item);
        if(index==-1||set[index]!=item){
            throw new IllegalStateException("no such element");
        }
        set[index] = null;
        size--;

    }
    public int size(){
        return size;
    }

    public String toString(){
        return Arrays.toString(set);
    }
}
