/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai14;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class CNTCN extends CongNhan {
    private double luongCoBan;
    private double heSoLuong;
    private int soNgayCong;

    public CNTCN() {
        super();
    }

    public CNTCN(double luongCoBan, double heSoLuong, int soNgayCong, String hoTen, String ngaySinh, String diaChi, LoaiCongNhan loaiCongNhan) {
        super(hoTen, ngaySinh, diaChi, loaiCongNhan);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.soNgayCong = soNgayCong;
    }

  
    
        public double thuong(){
        if(soNgayCong<20)
            return 0;
        else
            return 1.2*luongCoBan;
    }
    

    @Override
     public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap luong co ban :");
        luongCoBan=sc.nextDouble();
        System.out.println("Nhap he so luong :");
        heSoLuong=sc.nextDouble();
        System.out.println("Nhap vao so ngay cong");
        soNgayCong=sc.nextInt();
                
    }
     
     
    @Override
    public double tinhLuong() {
        return luongCoBan*heSoLuong+thuong();
    }
    
}
