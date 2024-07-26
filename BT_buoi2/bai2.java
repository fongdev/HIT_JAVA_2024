/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_buoi2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class bai2 {
    static long n;
    static int[] a=new int[100];
   
    static Scanner s=new Scanner(System.in);
    
    public static void nhap(){
        do{
            System.out.print("nhap vao gia tri nguyen cua mang:");
            n=s.nextInt();           
        }
        while(n>Math.pow(10, 4));
    }
    
    
    public static void nhapmang(){
        for(int i=0;i<n;i++){
            System.out.print("a"+i+"=");
            a[i]=s.nextInt();
        }
    }
    
    public static void xuatmang(){
        for(int i=0;i<n;i++){
            System.out.print("a"+i+"="+a[i]+"\t");
        }
    }
    
    public static void  biendoi(){        
        for(int i=0;i<n;i++){
            if(i%2==1){
                if(i==0 || i==(n-1))
                    a[i]+=Math.abs(a[i-1]);
                else{
                    a[i]+=Math.abs(a[i+1]-a[i-1]);
                }
            }
       
        }
    }   
    
    public static void main(String[] args) {
        nhap();
        nhapmang();
        biendoi();
        xuatmang();
    }
}
