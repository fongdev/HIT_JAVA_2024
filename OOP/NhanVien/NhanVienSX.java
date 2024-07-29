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
public class NhanVienSX extends NhanVien{
    private int soSanPham;
    
    public NhanVienSX() {
        super();
    }


    public NhanVienSX(int soSanPham, String hoTen, int namVaoLam) {
        super(hoTen, namVaoLam);
        this.soSanPham = soSanPham;
    }

   

    
            
    
    @Override
    public double tinhLuong() {
        double l=soSanPham*10000;
        return l;
    }

    
    
    
    
    @Override
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        super.nhap(); 
        System.out.println("nhap so san pham:");
        soSanPham=sc.nextInt();
        
    }

    
    
    @Override
    public void xuatDuLieu() {
        super.xuatDuLieu();
        System.out.printf("%20d%20f\n",soSanPham,(float)(soSanPham*10000));
        
    }


    public static void inTieuDe() {
        NhanVien.inTieuDe(); 
        System.out.printf("%20s%20s\n","so san pham","muc luong");
    }
    
    
    
}
