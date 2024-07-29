/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class NhanVienDemo {
    public static void main(String[] args) {
        //nhapDL();               
        //xuatDL();
        fakeData();
        inFake(n);
    }
    
    static Scanner sc=new Scanner(System.in);
    static NhanVien n[]=new NhanVien[100];
    static int soNV,loaiNV;
    static double tongLuong=0;
    
    
    public static void nhapDL(){
        System.out.print("Nhap so nhan vien:  ");
        soNV=sc.nextInt();
        n=new NhanVien[soNV];
        for(int i=0;i<soNV;i++){
            System.out.print("1.nhap NVNP,2 nhap NVSX:  ");
            loaiNV=sc.nextInt();
            if(loaiNV==1)
                n[i]=new NhanVienVP();
            if(loaiNV==2)
                n[i]=new NhanVienSX();
            n[i].nhap();
            
            tongLuong=n[i].tinhLuong()+n[i].tinhPhuCap();
        }
        
    }
    public static void xuatDL(){
        System.out.println("Danh sach nhan vien VP:");
        NhanVienVP.inTieuDe();
        for(int i=0;i<soNV;i++)
            if(n[i] instanceof NhanVienVP)
                n[i].xuatDuLieu();
        System.out.println("Danh sach nhan vien SX:");
        NhanVienSX.inTieuDe();
        for(int i=0;i<soNV;i++)
            if(n[i] instanceof NhanVienSX)
                n[i].xuatDuLieu();
        System.out.printf("\n%80s%f","tong luong: ",tongLuong);
    }
    
    public static void inFake(NhanVien n[]){
        NhanVienVP.inTieuDe();
        for(int i=0;i<soNV;i++)
            if(n[i] instanceof NhanVienVP)
                n[i].xuatDuLieu();
        System.out.println("Danh sach nhan vien SX:");
        NhanVienSX.inTieuDe();
        for(int i=0;i<soNV;i++)
            if(n[i] instanceof NhanVienSX)
                n[i].xuatDuLieu();
     
        }
        

    
    
    public static void fakeData(){
        
        NhanVien sx1 =new NhanVienSX(2020,"Truong Van Phong",2000);
        NhanVien sx2=new NhanVienSX(2021,"To An An",1000);
        NhanVien vp1=new NhanVienVP(0, 1000,"Giang A pho", 2021);
        NhanVien vp2=new NhanVienVP(3, 5000,"Kim kkk", 2019);
        n[1]=sx1;
        n[2]=sx2;
        n[3]=vp1;
        n[4]=vp2;
        soNV=4;
    }
    
    
}
