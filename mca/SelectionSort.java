
package com.mycompany.mca;

import java.util.Scanner;

public class SelectionSort {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Size Of Array:- ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Enter Data ");
        
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<n-1;i++)
        {
            int index = i;            
            for(int j = i+1;j<n;j++) 
            {
                if(arr[j] < arr[index]) 
                {
                    index = j; 
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
                
        }
        
        System.out.println(" ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
