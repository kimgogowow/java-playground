package com.kim.dataStructure;

import java.util.Arrays;

/**
 * 1.enqueue：将新元素加至队尾
 * 2.dequeue：移除并返回头部的元素
 * 3.peek：查看，返回队列头部的元素
 * 4.isEmpty
 *
 */
public class Queue {
    private int[] queue;
    //front - HEAD
    //rear - END
    private int front,rear,size,capacity;
    public Queue(int capacity){
        this.capacity = capacity;
        queue = new int[capacity];
        front = size = 0;
        rear = capacity-1;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == capacity;
    }
    public void enqueue(int item){
        if(size==0){
            queue[0] = item;
        }

        if(isFull()){
            throw new IllegalStateException("IS FULL");
            /**
             * 异常的语义含义：IllegalStateException 用于指示对象的当前状态与执行某些操作不兼容。
             * 在这种情况下，如果队列已满，则尝试向其添加更多元素是不允许的，因为这违反了队列的大小限制。
             * 这种状态（队列已满）使得 enqueue 操作在当前上下文中不合法。
             */
        }

        rear = (rear+1) % capacity;//计算下一个要放入的队尾的位置
        queue[rear] = item;
        size++;
    }
    public int dequeue(){
        if(isEmpty()) throw new IllegalStateException("queue is empty");
        int target = queue[front];
        front = (front+1)%capacity;
        /**
         * capacity = 5
         * queue = [2,3,5,0,0]
         * target = 2;
         * front = 0;
         * rear = 4;
         *
         * front.change = (0+1)%5 = 1;
         * queue.updated = [0,3,5,0,0];
         *
         *
         */
        size--;
        return target;


    }
    public int peek(){
        if(size==0) throw new IllegalStateException("queue is empty");
        return queue[front];
    }
    public String toString(){
        return Arrays.toString(queue);
    }


}
