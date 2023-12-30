package com.mycompany.mca;

import java.util.Scanner;


public class linkedlist {
    
    Node head;
    
    class Node
    {
        int data;
        Node next;
        
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    
    boolean isEmpty()
    {
       return head == null;
    }
    
    void insert_at_first(int data)
    {
        Node new_node = new Node(data);
        
        if(isEmpty())
        {
            head = new_node;
        }
        else
        {
            new_node.next = head;
            head=new_node;
        }
    }
    
    void insert_at_last(int data)
    {
        Node new_node = new Node(data);
        
        if(isEmpty())
        {
            head = new_node;
        }
        else
        {
            Node temp = head;
            
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }
    
    void insert_at_given_pos(int data,int pos)
    {
        Node new_node = new Node(data);
        if(isEmpty())
        {
            head  = new_node;
        }
        else
        {
            Node temp = head;
            for(int i=0 ;i<(pos-1);i++)
            {
                temp = temp.next;
            }
            new_node.next = temp.next;
            temp.next = new_node;
                    
        }
    }
    
    void delete_at_first()
    {
        if(isEmpty())
        {
            System.out.println("List is Empty..");
        }
        else
        {
            Node temp = head;
            
            temp = temp.next;
            head = temp;
            
        }
    }
    
     void delete_at_last()
    {
        if(isEmpty())
        {
            System.out.println("List is Empty..");
        }
        else
        {
            Node ptr = head;
            Node temp = head.next;
   
            while(temp.next != null)
            {
                 ptr = temp;
                 temp = temp.next;
            }
            ptr.next = null;
            
        }
    }
     
     
     void delete_data(int data)
    {
        if(isEmpty())
        {
            System.out.println("List is Empty..");
        }
        else
        {
            if(head.data == data)
            {
                head = head.next;
                return;
            }
            
            Node temp =  head.next;
            Node ptr = head;
            while(temp != null && temp.data != data)
            {
                ptr = temp;
                temp = temp.next;
            }
            
            if(temp == null)
            {
                System.out.println("Roll Number Not Found...");
            }
            
              ptr.next = temp.next;
        }
    }
     
     
    void display()
    {
        if(isEmpty())
        {
            System.out.println("List is Empty..");
        }
        else
        {
            Node temp = head;
            
            while(temp != null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
            
            
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        linkedlist ll = new linkedlist();
        int ch;
        
        do
        {
            System.out.println("1. for Insert At First...");
            System.out.println("2. for Insert At Last...");
            System.out.println("3. for Insert At Given Pos...");
            System.out.println("4. for Display...");
            
            System.out.print("Enter Your Choice : ");
            ch = sc.nextInt();
            
            switch(ch)
            {
                case 1:
                    System.out.print("Enter Your Data : ");
                    int val = sc.nextInt();
                    
                    ll.insert_at_first(val);
                    break;
                    
                case 2:
                    System.out.print("Enter Your Data : ");
                    int val1 = sc.nextInt();
                    
                    ll.insert_at_last(val1);
                    break;

                case 3:
                    System.out.print("Enter Your Data : ");
                    int val2 = sc.nextInt();
                    
                    System.out.print("Enter Your Position : ");
                    int pos = sc.nextInt();
                    
                    ll.insert_at_given_pos(val2,pos);
                    break;
                    
                    
                case 4:
                    ll.display();
                    break;
                    
                case 5:
                    System.out.println("Exit...");
                    break;
                                  
                case 6:
                    ll.delete_at_first();
                    break;
                    
                case 7:
                    ll.delete_at_last();
                    break;
                    
                case 8:
                    
                    System.out.print("Enter Your Data : ");
                    int val3 = sc.nextInt();
                    
                    ll.delete_data(val3);
                    break;
                    
                default:
                    System.out.println("Enter Right Choice");
            }
        }while(ch != 5);
    }
    
}
