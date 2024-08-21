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
public class CNKSP extends CongNhan {
    private int soSP;
    private double donGia;

    public CNKSP() {
        super();
    }

    public CNKSP(int soSP, double donGia, String hoTen, String ngaySinh, String diaChi, LoaiCongNhan loaiCongNhan) {
        super(hoTen, ngaySinh, diaChi, loaiCongNhan);
        this.soSP = soSP;
        this.donGia = donGia;
    }

    @Override
    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so san pham lam duoc :");
        soSP=sc.nextInt();
        System.out.println("Nhap don gia :");
        donGia=sc.nextDouble();
                
    }
    
    public double thuong(){
        double P=0;
        if(soSP<1000)
            P=0;
        else if(soSP>1100 && soSP<1150)
            P=1000000;
        else if(soSP>1150)
            P=1500000;
        return P;
    }

    @Override
    public double tinhLuong() {
        return soSP*donGia+thuong();
    }
    
}
