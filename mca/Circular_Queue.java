
package com.mycompany.mca;

public class Circular_Queue {
    int cq[];
    int front ,rear;
    int size;

    public Circular_Queue(int size) {
        this.cq = new int[size];
        this.front = -1;
        this.rear = -1;
        this.size = size;
    }
    
    boolean isFull()
    {
        return front == (rear + 1) % size;
    }
    
    boolean isEmpty()
    {
        return (front == -1 && rear == -1) || (front == rear);
    }
}
