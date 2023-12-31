
package com.mycompany.mca;

import java.util.Scanner;

public class InsertionSort {
    
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
                                  
        for(int i = 1 ;i<n ; i++) 
        {
            int temp = arr[i]; 
            int j = i - 1; 
            
            while(arr[j] > temp && j>=-1 )  
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = temp;
        }
        
        System.out.println(" ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
}
