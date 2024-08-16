/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi5Bai1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        nhap();
        xuat();
    }
    static Scanner sc=new Scanner(System.in);
    static int n;
    static Student [] a=new Student[1000];

    public static void nhap(){
       
        System.out.println("Nhap so luong sinh vien:");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=new Student();
            a[i].input();
        }    
    }
    
    public static void xuat(){
        Student.inTD();
        for (int i=0;i<n;i++) {
            a[i].output();
        
        }
    }
}
