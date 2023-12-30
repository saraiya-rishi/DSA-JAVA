
package com.mycompany.mca;

import java.util.Scanner;

public class BinarySearch {
    
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
        
        for(int i = 0 ; i<n ;i++)
        {
            for(int j = i+1 ;j<n;j++)
            {
                if(arr[i]>arr[j]) 
                {
                    int a;
                    
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                    
                }
            }
        }
        
        
        System.out.println(" ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        
        
        System.out.print("Enter Value to be Search :- ");
        int data = sc.nextInt();
        
        int count = 0;
        int low=0,high=arr.length - 1,mid=0;
        
        while(low <= high)
        {
            mid = (low+high)/2;
            
            if(data == arr[mid])
            {
                count++;
                break;
            }
            else if(data > arr[mid])
            {
                low = mid + 1;
            }
            else if(data < arr[mid])
            {
               high = mid - 1; 
            }
        }
        
        if(count > 0)
        {
            System.out.print("Value Found at " + (mid + 1) + " Postion.");
        }
        else
        {
             System.out.print("Value Not Found.");
        }
       
    }
}
