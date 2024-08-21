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
public abstract class CongNhan {
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private LoaiCongNhan loaiCongNhan;

    public CongNhan() {
    }

    public CongNhan(String hoTen, String ngaySinh, String diaChi, LoaiCongNhan loaiCongNhan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.loaiCongNhan = loaiCongNhan;
    }

    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        hoTen=sc.nextLine();
        System.out.println("Nhap vao ngay sinh:");
        ngaySinh=sc.nextLine();
        System.out.println("Nhap dia chi:");
        diaChi=sc.nextLine();
        System.out.println("Nhap loai cong nhan 1.CNKSP/2.CNTCN (1/2):");
        loaiCongNhan=((sc.nextInt()==1)?LoaiCongNhan.CNKSP:LoaiCongNhan.CNTCN);
    }
    
    public abstract double tinhLuong();
    
    public void xuat(){
        System.out.printf("%-20s%-20s\n","Ho Ten : ",hoTen);
        System.out.printf("%-20s%-20s\n","Ngay sinh : ",ngaySinh);
        System.out.printf("%-20s%-20s\n","Dia Chi : ",diaChi);
        System.out.printf("%-20s%-20s\n","Loai Cong Nhan : ",loaiCongNhan);
        System.out.printf("%-20s%-20.1f\n","Luong Thang : ",tinhLuong());
    }
    
    
}
