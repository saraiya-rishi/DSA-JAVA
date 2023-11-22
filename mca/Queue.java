package com.mycompany.mca;

import java.util.Scanner;

public class Queue {

    int q[];
    int front, rear;
    int size;

    public Queue(int size) {
        this.q = new int[size];
        this.front = -1;
        this.rear = -1;
        this.size = size;
    }

    boolean isEmpty() {
        return rear == -1;
    }

    boolean isFull() {
        return rear == size - 1;
    }

    void enQueue(int value) 
    {
        if(isFull())
        {
            System.out.println("Queue is Full...");
        }
        else if(isEmpty())
        {
            front = rear = 0;
            q[rear] = value;
            display();
        }
        else
        {
            rear++;
            q[rear] = value;
            display();
        }
    }
    
    void deQueue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty...");
        }
        else
        {
            front++;
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
            return q[front];
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
            for(int i=front;i<=rear;i++)
            {
                System.out.println(q[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size Of Queue:- ");
        int n = sc.nextInt();

        Queue q = new Queue(n);
        
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
                    
                    q.enQueue(value);
                    break;
                    
                case 2:
                    q.deQueue();
                    break;
                    
                case 3:
                    System.out.println(q.peek());
                    break;
                    
                case 4:
                    q.display();
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
