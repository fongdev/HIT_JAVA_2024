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
public class NVChinhThuc extends LaoDong{
    
    private final double LCB=1050000;
    private double heSoLuong;
    private int thamNien;

    public NVChinhThuc() {
        super();
    }

    public NVChinhThuc(double heSoLuong, int thamNien, String hoTen, String diaChi, String maNV, LoaiNhanVien loaiNV) {
        super(hoTen, diaChi, maNV, loaiNV);
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) throws Exception{
        if(thamNien<0){
            setHeSoLuong(1.2);
            throw new Exception("tham nien phai lon hon 0");
        }
        this.thamNien = thamNien;
    }

    @Override
    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Nhap vao he so luong:");
            setHeSoLuong(Double.parseDouble(sc.nextLine()));
            System.out.println("Nhap vao tham nien:");
            setThamNien(Integer.parseInt(sc.nextLine()));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    
    
    public double phuCap(){
        double p;
        if(thamNien>3)
            p=1.2;
        else{
            p=1;
        }
        return LCB*p;
    }
    

    @Override
    public double TinhLuong() {
       return LCB*heSoLuong+phuCap();
        
    }
    
}
