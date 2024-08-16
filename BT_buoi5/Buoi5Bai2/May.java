/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi5Bai2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class May {
    private String maMay;
    private String tenMay;
    private String tinhTrang;

    public May() {
    }

    public May(String maMay, String tenMay, String tinhTrang) {
        this.maMay = maMay;
        this.tenMay = tenMay;
        this.tinhTrang = tinhTrang;
    }
    Scanner sc=new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap vao ma may");
        maMay=sc.nextLine();
        System.out.println("Nhap vao ten may");
        tenMay=sc.nextLine();
        System.out.println("nhap vao tinh trang");
        tinhTrang=sc.nextLine();
    }
    
    public void xuat(){
        System.out.printf("%-20s%-20s%-20s\n",maMay,tenMay,tinhTrang);
        
    }
    
}
