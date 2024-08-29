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
public abstract class LaoDong {
    private String hoTen,maNV,diaChi;
    private LoaiNhanVien loaiNV;

    public LaoDong() {
    }

    public LaoDong(String hoTen,String diaChi,String maNV, LoaiNhanVien loaiNV) {
        try{
            setHoTen(hoTen);       
            setDiaChi(diaChi);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        this.maNV = maNV;
        this.loaiNV = loaiNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) throws Exception{
        if(hoTen.isEmpty())
            throw new Exception("Ten khong duoc bo trong");
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) throws Exception{
        if(diaChi.isEmpty())
            throw new Exception("Dia chi khong duoc bo trong");
        this.diaChi = diaChi;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public LoaiNhanVien getLoaiNV() {
        return loaiNV;
    }

    public void setLoaiNV(LoaiNhanVien loaiNV) {
        this.loaiNV = loaiNV;
    }
    
    public void chuyenTenThanhHoa(String name){
        this.hoTen=name.toUpperCase();
    }
    
    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Nhap vao ho ten : ");
            setHoTen(sc.nextLine());
            System.out.println("NHap vao dia chi:");
            setDiaChi(sc.nextLine());
            System.out.println("Nhap vao maNV:");
            setMaNV(sc.nextLine());
            System.out.println("day la nhan vien : 1.Thoi vu / 2. Chinh thuc");
            int a= Integer.parseInt(sc.nextLine());
            setLoaiNV((a==1)?LoaiNhanVien.NVthoivu:LoaiNhanVien.NVchinhthuc);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public static void inTD(){
        System.out.printf("%-20s%-20s%-20s%-20s%-20s \n","Ho Ten","Dia chi","Ma NV","Loai Nhan vien","luong thang");
    }
    public void xuat(){
        System.out.printf("%-20s%-20s%-20s%-20s%-20.2f \n",hoTen,diaChi,maNV,loaiNV,TinhLuong());
    }
    
    public abstract double TinhLuong();
    
}
