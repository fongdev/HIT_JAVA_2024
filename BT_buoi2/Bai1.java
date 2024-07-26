/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_buoi2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float a;
        do{
            System.out.print("Nhap vao ban kinh hinh tron:");
            a=s.nextFloat();
        }
        while(a<0 || a>100);
        double i=3.14;
        System.out.println(2*i*a+" "+i*Math.pow(a, a));
        
    }
}    

