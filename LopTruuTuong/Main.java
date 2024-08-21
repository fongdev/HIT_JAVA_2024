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
public class Main {
    static CongNhan [] a=new CongNhan[5];
    static Scanner sc=new Scanner(System.in);
    static int soCN,loaiCN;
    static CongNhan []b=new CongNhan[soCN];
    
    public static void main(String[] args) {
        fakeData();
        inFake();
        nhapDL();
        inDL();
    }
    
    public static void fakeData(){
        a[0]=new CNKSP(1234, 2000, "Sinh Tran", "1-1-1111", "Ha nam", LoaiCongNhan.CNKSP);
        a[1]=new CNKSP(1000, 2000, "Ngyen Cuong", "2-1-1111", "Quang ninh", LoaiCongNhan.CNKSP);
        a[2]=new CNTCN(7000, 1, 21, "Phong", "23-3-2005", "Ha nam", LoaiCongNhan.CNTCN);
        a[3]=new CNKSP(900, 2000, "Dat bu", "3-1-1111", "Ha nam", LoaiCongNhan.CNKSP);
        a[4]=new CNTCN(7000, 1, 21, "Tai chan", "28-3-2005", "Ha nam", LoaiCongNhan.CNTCN);
    }
    
    public static void inFake(){
        for(int i=0;i<5;i++){
            a[i].xuat();
            System.out.println("");
        }
    }
    
    public static void nhapDL(){
        System.out.println("Nhap so cong nhan:");
        soCN=sc.nextInt();
        b=new CongNhan[soCN];
        for(int i=0;i<soCN;i++){
            System.out.println("1.CNKSP/2.CNTCN:");
            loaiCN=sc.nextInt();
            if(loaiCN==1)
                b[i]=new CNKSP();
            else
                b[i]=new CNTCN();
            b[i].nhap();
        }
    }
    
    public static void inDL(){
        System.out.println("Danh sach cong nhan khoan SP:");
        for(int i=0;i<soCN;i++){
            if(b[i] instanceof CNKSP)
                b[i].xuat();
        }
        System.out.println("Danh sach cong nhan tinh CN:");
        for(int i=0;i<soCN;i++){
            if(b[i] instanceof CNTCN)
                b[i].xuat();
        }
    }    
    
}
