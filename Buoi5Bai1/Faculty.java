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
public class Faculty {
    private String tenKhoa;
    private String ngayVaoKhoa;
    private School x;

    public Faculty() {
        x=new School();
    }

    public Faculty(String tenKhoa, String ngayVaoKhoa, School x) {
        this.tenKhoa = tenKhoa;
        this.ngayVaoKhoa = ngayVaoKhoa;
        this.x = x;
    }
    
    Scanner sc=new Scanner(System.in);
            
    public void input(){
        x.nhap();
        System.out.println("Nhap vao ten khoa:");
        tenKhoa=sc.nextLine();
        System.out.println("Nhap ngay vao khoa:");
        ngayVaoKhoa=sc.nextLine();
    }
    
    public void output(){
        System.out.printf("%-20s%-20s",tenKhoa,ngayVaoKhoa);
        x.xuat();
    }
}
