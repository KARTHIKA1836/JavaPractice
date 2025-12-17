package com.kce.f230.dsa;
import java.util.Scanner;
import com.kce.java.*;
public class LinearSearch {
	
    public static void main(String args[]) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter n : ");
    	int n=s.nextInt();
    	int[] a=new int[n];
    	System.out.println("Enter element : ");
    	for(int i=0;i<n;i++) {
    		a[i]=s.nextInt();
    		}
    	System.out.println("Enter key :");
    	int key=s.nextInt();
     
        int search(int[] a,int key) {
   	
   		for(int i=0;i<n;i++) {
   			if(a[i]==key) {
   				return i;
   			}
   		}
   		
   		return -1;
   	}
       int res=search(a,key);
        System.out.println();
    }
}
