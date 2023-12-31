
package com.mycompany.mca;

import java.util.Scanner;

public class BinaryTree {
    
    class Node
    {
        int data;
        Node left,right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    Node create()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Data: ");
        int data = sc.nextInt();
        
        if(data == 0)
            return null;
        
        Node newNode = new Node(data);
        
        System.out.println("\nEnter Left for " + newNode.data);
        newNode.left = create();
        
        System.out.println("\nEnter Right for " + newNode.data);
        newNode.right = create();
        
        return newNode;
    }
    
    void Inorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
        
    }
    
    void Preorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        
        System.out.print(root.data + " "); 
        Preorder(root.left);
        Preorder(root.right);
        
    }
    
    void Postorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data + " " );
        
        
    }
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        BinaryTree bt = new BinaryTree();
        int ch;
        Node root = null;
        
        do
        {
            
            System.out.println("\n1. Create Tree");
            System.out.println("2. Inorder Traversal");
            System.out.println("3. Preorder Traversal");
            System.out.println("4. Postorder Traversal");
            
            System.out.print("\nEnter Your Choice: ");
            ch = sc.nextInt();
            
            switch(ch)
            {
                case 1:
                    System.out.println("Enter Data For Binary Tree\n");
                    root = bt.create();
                    break;
                    
                case 2:
                    bt.Inorder(root);
                    break;  
                    
                case 3:
                    bt.Preorder(root);
                    break;  
                    
                case 4:
                    bt.Postorder(root);
                    break;  
                  
                case 5:
                    System.out.println("Exit....");
                    break;
                    
                default:
                    System.out.println("Plzz,Enter Right Choice..");
                    break; 
            }
            
        }while(ch != 5);
    }
}
