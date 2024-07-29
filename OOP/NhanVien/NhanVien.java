/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public abstract class NhanVien {
    private String hoTen;
    private int namVaoLam;
    public abstract double tinhLuong();
    private final double phuCap1=100000;

    public NhanVien() {
    }

    public NhanVien(String hoTen, int namVaoLam) {
        this.hoTen = hoTen;
        this.namVaoLam = namVaoLam;
    }
    
    public double tinhPhuCap(){
        Date now=new Date();
        int d=LocalDate.now().getYear();
        return phuCap1+(d-namVaoLam)*10000;
    
    }

    public double getPhuCap1() {
        return phuCap1;
    }
    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten nhan vien:");
        hoTen=sc.nextLine();
        System.out.println("Nhap nam vao lam:");
        namVaoLam=sc.nextInt();
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamVaoLam() {
        return namVaoLam;
    }

    public void setNamVaoLam(int namVaoLam) {
        this.namVaoLam = namVaoLam;
    }
    
    /**
     *
     */
    public static void inTieuDe(){
        System.out.printf("%20s%20s","ho ten","nam vao lam");
    }
    
    public void xuatDuLieu(){
        System.out.printf("%20s%20d",hoTen,namVaoLam);
    }

  
}    
