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
public class Tour extends Product{
    private String soNgayDiTour;
    private String phuongTien;

    public Tour() {
    }
    

    public Tour(String soNgayDiTour, String phuongTien, String ID, String ten, double gia, int soLuong) {
        super(ID, ten, gia, soLuong);
        this.soNgayDiTour = soNgayDiTour;
        this.phuongTien = phuongTien;
    }
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao ngay di tour :");
        soNgayDiTour=sc.nextLine();
        System.out.println("Nhap vap phuong tien di chuyen:");
        phuongTien=sc.nextLine();
    }
    
        public static void inTD(){
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n","ID","Ten san pham","Gia ban","So luong","Phuong tien","Thanh tien");
    }
    @Override
        public void xuat(){
            super.xuat();
            System.out.printf("%-20s%-20.2f\n",phuongTien,getTotalPrice());
        }

    @Override
    public double getTotalPrice() {
            return getSoLuong()*getGia()+((10*1.0)/100)*(getSoLuong()*getGia());        
    }
    
}
