
package com.mycompany.mca;

import java.util.Scanner;

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
        return (front == -1 && rear == -1);
    }
    
    void enQueue(int value)
    {
        if(isFull())
        {
            System.out.println("Queue is Full...");
        }
        else if (isEmpty()) 
        {
            front = rear = 0;
            cq[rear] = value;
            display();
        }
        else
        {
            rear = (rear + 1) % size;
            cq[rear] = value;
            display();
        }
    }
    
    void deQueue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty...");
        }
        else if(front == rear)
        {
            System.out.println("Queue is Empty...");
            front = -1;
        }
        else
        {
            front = (front + 1) % size;
            display();
        }
    }
    
    int peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty...");
        }
        else
        {
            return cq[front];
        }
        return 0;
    }
    
    void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty...");
        }
        else
        {
            int i;
            for(i=front;i!=rear;i = (i + 1) % size)
            {
                System.out.println(cq[i]);
            }
             System.out.println(cq[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size Of Queue:- ");
        int n = sc.nextInt();

        Circular_Queue cq = new Circular_Queue(n);
        
        boolean key = true;
        
        while(key)
        {
            System.out.println("1. Insert The Data");
            System.out.println("2. Delete The Data");
            System.out.println("3. Peek Of The Data");
            System.out.println("4. Display The Data");
            System.out.println("5. Exit...");
            
            System.out.print("Enter Your Choice:-");
            int choice= sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Value:- ");
                    int value = sc.nextInt();
                    
                    cq.enQueue(value);
                    break;
                    
                case 2:
                    cq.deQueue();
                    break;
                    
                case 3:
                    System.out.println(cq.peek());
                    break;
                    
                case 4:
                    cq.display();
                    break;
                    
                case 5:
                    key = false;
                    break;
                    
             
                default:
                    System.out.println("Please Enter Right Choice...");
            }
        }

    }
}
