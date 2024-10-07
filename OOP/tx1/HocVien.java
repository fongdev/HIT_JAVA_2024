/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tx1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class HocVien {
    private String hoTen;
    private String diaChi;
    private LoaiHV loaiHV;
    private int soBuoiHoc;
    private final double donGia=100000;
    private int hocVienLoai;

    public HocVien() {
    }

    public HocVien(String hoTen, String diaChi, LoaiHV loaiHV, int soBuoiHoc,int hocVienLoai) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiHV = loaiHV;
        this.soBuoiHoc = soBuoiHoc;
        this.hocVienLoai=hocVienLoai;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public LoaiHV getLoaiHV() {
        return loaiHV;
    }

    public void setLoaiHV(LoaiHV loaiHV) {
        this.loaiHV = loaiHV;
    }

    public int getSoBuoiHoc() {
        return soBuoiHoc;
    }

    public void setSoBuoiHoc(int soBuoiHoc) {
        if(soBuoiHoc<0){
            System.out.println("So buoi hoc phai lon hon 0");
            setSoBuoiHoc(0);
        }
        this.soBuoiHoc = soBuoiHoc;
    }

    public int getHocVienLoai() {
        return hocVienLoai;
    }

    public void setHocVienLoai(int hocVienLoai) {
        this.hocVienLoai = hocVienLoai;
    }
    
    
    
    
    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao ho ten:");
        hoTen=sc.nextLine();
        System.out.println("Nhap vao dia chi:");
        diaChi=sc.nextLine();
        
        
        
        
        System.out.println("Nhap loai hoc vien(1/2)1.DoHoa/2.Laptrinh");
        int n=sc.nextInt();
        sc.nextLine();
        setLoaiHV((n==1)?LoaiHV.DoHoa:LoaiHV.LapTrinh);//mat na nhap lieu
        
        
        System.out.println("Nhap so buoi hoc:");
        setSoBuoiHoc(sc.nextInt());
        System.out.println("Nhap loai hoc vien:");
        hocVienLoai=sc.nextInt();
        
    }
    
//        ho ten       dia chi           
    
    public static void inTD(){
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n","Ho ten","Dia chi","Loai HV","So Buoi Hoc","Hoc Vien loai","Hoc Phi");
    }
    
    public void inDL(){
        System.out.printf("%-20s%-20s%-20s%-20d%-20d%-20f\n",hoTen,diaChi,loaiHV,soBuoiHoc,hocVienLoai,hocPhi());
    }
    
    public double hocPhi(){
        double uuTien=0;
        if(hocVienLoai==1)
            uuTien=500000;
        else
            uuTien=1000000;
        return soBuoiHoc*donGia-uuTien;
    }
   
  
}
