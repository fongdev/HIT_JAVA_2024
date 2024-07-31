/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_buoi3;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author PC
 */
public class bai3 {
    public static void main(String[] args) {
        int a,b,c;
           Random rd=new Random();
           a=rd.nextInt(11);            
           b=rd.nextInt(11);
           c=rd.nextInt(21);
                 
        System.out.println(a+"+"+b+"="+c);
        System.out.print("Phep tinh tren dung hay sai(Y/N):");
        Scanner input=new Scanner(System.in);
        String nhap=input.nextLine();
        String kt1 = new String("Y");
        String kt2 = new String("N");
        if((nhap.equals(kt1) && a+b==c) || (nhap.equals(kt2) && a+b!=c)){
            System.out.println("Chinh xac!");
        }
        else{
            System.out.println("Sai!");
        }
           
    }
}    
        



