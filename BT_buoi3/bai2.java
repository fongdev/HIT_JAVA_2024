/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_buoi3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class bai2 {
    public static void main(String[] args) {
        nhap(a);       
        if(KTdoixung(a)){
            System.out.println(b.toUpperCase());  
        }
        else{
            System.out.println(b.toLowerCase());
        }
        
    }
    static String [] a=new String[1000];
    static boolean test=true;
    static  String b;
    static Scanner input=new Scanner(System.in);
    // ham nhap 
    public static void nhap(String []a){
        b=input.nextLine();
        a=b.split("");// tach chuoi
    }    
    // ham kt doi xung
    public static boolean KTdoixung(String a[]){
        for(int i=0 ;i<b.length();i++){
            int x=b.length()-1-i;
            if(a[i] != a[x]){
                test=false;
                break;
            }
        }
        return test;
    }
      
}
