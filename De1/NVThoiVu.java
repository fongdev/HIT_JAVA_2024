/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DE1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class NVThoiVu extends LaoDong{
    private int soNgayCong;
    private double donGia;

    public NVThoiVu() {
        super();
    }

    public NVThoiVu(int soNgayCong, double donGia, String hoTen, String diaChi, String maNV, LoaiNhanVien loaiNV) {
        super(hoTen, diaChi, maNV, loaiNV);
        this.soNgayCong = soNgayCong;
        this.donGia = donGia;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) throws Exception{
        if(soNgayCong<0)
            throw new Exception("so ngay cong phai lon hon khong");
        this.soNgayCong = soNgayCong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
   
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Nhap vao so ngay cong");
            setSoNgayCong(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhap vao don gia;");
            setDonGia(Double.parseDouble(sc.nextLine()));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    public double thuong(){
        double i=0;
        if(soNgayCong>25)
            i=2500000;
        return i;
    }
    
    @Override
    public double TinhLuong(){
        return soNgayCong*donGia+thuong();
    }
    
    
}
