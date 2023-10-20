
package com.mycompany.mca;

import java.util.Scanner;

public class Queue {
    
    int q[];
    int front,rear;
    int size;

    public Queue(int size) {
        this.q = new int[size];
        this.front = -1;
        this.rear = -1;
        this.size = size;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter Size Of Queue:- "); 
        int n = s.nextInt();
        
        Queue q = new Queue(n);
        
        
        
        
     }
    
    
   
}
