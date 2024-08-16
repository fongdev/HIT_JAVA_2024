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
public class QuanLy {
    private String maQuanLy;
    private String hoTen;

    public QuanLy() {
    }

    public QuanLy(String maQuanLy, String hoTen) {
        this.maQuanLy = maQuanLy;
        this.hoTen = hoTen;
    }
    Scanner sc=new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap vao ma quan ly:");
        maQuanLy=sc.nextLine();
        System.out.println("Nhap vao ho ten:");
        hoTen=sc.nextLine();
    }
    
    public void xuat(){
        System.out.printf("%-20s%-20s",maQuanLy,hoTen);
    }
}
