
package com.mycompany.mca;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Size Of Array:- ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Enter Data ");
        
        for(int i=0;i<=n-1;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(" ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        
        System.out.print("Enter Value to be Search :- ");
        int data = sc.nextInt();
        
        int count = 0,i;
        
        for( i=0;i<arr.length;i++)
        {
            if(data == arr[i])
            {
                count++;
                break;
            }
        }
        
        if(count > 0)
        {
            System.out.print("Value Found at " + (i+1) + " Postion.");
        }
        else
        {
             System.out.print("Value Not Found.");
        }
        
        
        
    }
}
