/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class NhanVienVP extends NhanVien{
    private int soNgayNghi;
    private double mucLuong;

    public NhanVienVP() {
        super();
    }


    public NhanVienVP(int soNgayNghi, double mucLuong, String hoTen, int namVaoLam) {
        super(hoTen, namVaoLam);
        this.soNgayNghi = soNgayNghi;
        this.mucLuong = mucLuong;
    }
    
    
    

    @Override
    public double tinhLuong() {
      double l=mucLuong-(soNgayNghi*10000);
      return l;
    }

    @Override
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        super.nhap(); 
        System.out.println("Nhap so ngay nghi :");
        soNgayNghi=sc.nextInt();
        System.out.println("Nhap muc luong :");
        mucLuong=sc.nextDouble();
    }

    @Override
    public void xuatDuLieu() {
        super.xuatDuLieu();
        System.out.printf("%20d%20f\n",soNgayNghi,mucLuong);
    }

    public static void inTieuDe() {
        NhanVien.inTieuDe();
        System.out.printf("%20s%20s\n","so ngay nghi","muc luong");
    }

    
    
   
    
    
    
    
    

    
    
    
    
    
}
