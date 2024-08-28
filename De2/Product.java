/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public abstract class Product {
    private String ID;
    private String ten;
    private double gia;
    private int soLuong;

    public Product() {
    }

    public Product(String ID, String ten, double gia, int soLuong) {
        this.ID = ID;
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

   
    public abstract double getTotalPrice();
    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao ten :");
        ten=sc.nextLine();
        System.out.println("Nhap ID :");
        ID=sc.nextLine();
        System.out.println("Nhap vao gia :");
        gia=sc.nextDouble();
        sc.nextLine();
        System.out.println("NHap vao so luong :");
        soLuong=sc.nextInt();
    }
    

    
    public void xuat(){
        System.out.printf("%-20s%-20s%-20.3f%-20d",ID,ten,gia,soLuong);
    }
    
}
