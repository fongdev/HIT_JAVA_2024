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
public class School {
    private String tenTruong;
    private String ngayVaotruong;

    public School() {
    }

    public School(String tenTruong, String ngayVaotruong) {
        this.tenTruong = tenTruong;
        this.ngayVaotruong = ngayVaotruong;
    }
    
    Scanner sc=new Scanner(System.in);
    public void nhap(){
        System.out.println("nhap vao ten truong");
        tenTruong=sc.nextLine();
        System.out.println("nhap ngay vao truong");
        ngayVaotruong=sc.nextLine();
    }
    
    public void xuat(){
        System.out.printf("%-20s%-20s\n",tenTruong,ngayVaotruong);
    }
    
    
}
