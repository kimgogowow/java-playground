package com.kim.dataStructure;

import java.util.Arrays;

/**
 * 1.push(int item)-add to the top
 * 2.peek()-return the top element
 * 3.pop()-remove and return the top
 */
public class Stack {
    private int[] stack;
    private int top,size,capacity;
    public Stack(int capacity){
        this.capacity = capacity;
        top = -1;//there is no top yet
        size = 0;
        stack = new int[capacity];
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == capacity;
    }
    public void push(int item){
        if(size == capacity){
            throw new IllegalStateException("the stack is full");
        }
        top ++;
        stack[top] = item;
        size++;
    }
    public int peek(){
        if(isEmpty()) throw new IllegalStateException("it is empty");
        return stack[top];
    }
    public int pop(){
        if(isEmpty()) throw new IllegalStateException("it is empty");
        int target = stack[top];
        top--;
        size--;
        return target;
    }
    public String toString(){
        return Arrays.toString(stack);
    }
}
