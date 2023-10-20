
package com.mycompany.mca;

import java.util.Scanner;

public class Stack {

    int s[];
    int top;
    int size;

    public Stack(int size) {
        this.s=new int [size];
        this.top = -1;
        this.size = size;
    }
    
    boolean isEmpty()
    {
        return top == -1;
    }
    
    boolean isFull()
    {
        return top == size - 1;
    }
    
    void push(int value)
    {
        if(isFull())
        {
            System.out.println("Stack is Full...");
        }
        else
        {
            top++;
            s[top]=value;
            display();
        }
    }
    
    void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty...");
        }
        else
        {
            top--;
            display();
        }
    }
    
    int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty...");
        }
        else
        {
            return s[top];
        }
        return 0;
    }
    void display()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty...");
        }
        else
        {
            for(int i=top;i>=0;i--)
            {
                System.out.println(s[i]);
            }
        }
    }
    
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Size of Stack:- ");
        int n = sc.nextInt();
        
        Stack s = new Stack(n);
        
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
                    System.out.print("Enter The Value:- ");
                    int value = sc.nextInt();
                    
                    s.push(value);
                    break;
                
                case 2:
                    s.pop();
                    break;
                  
                case 3:
                    System.out.println(s.peek());
                    break;
                   
                case 4:
                    s.display();
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
