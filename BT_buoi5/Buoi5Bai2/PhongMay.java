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
public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private QuanLy x;
    private May y;
    private Integer n;

    public PhongMay() {
        x=new QuanLy();
        y=new May();
    }

    public PhongMay(String maPhong, String tenPhong, double dienTich) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
    }
    Scanner sc=new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap ma phong");
        maPhong=sc.nextLine();
        System.out.println("nhap ten phong");
        tenPhong=sc.nextLine();
        System.out.println("Nhap dien tich");
        dienTich=sc.nextDouble();
        sc.nextLine();
        x.nhap();
        y.nhap();
                  
    }
    
    public static void inTD(){
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s \n","Ma Phong","Ten Phong","Dien Tich","Ma ql","ho ten","ma may","ten may","tinh trang");
    }
    
    public void xuat(){
        System.out.printf("%-20s%-20s%-20.1f",maPhong,tenPhong,dienTich);
        x.xuat();
        y.xuat();
    }
    
}
