/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tx1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
    static ArrayList<HocVien> list=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        fakeData();
        sua();
        xoa();
        timKiem();
    }
    
    public static void fakeData(){
        HocVien a1=new HocVien("To An An", "Ha nam",LoaiHV.DoHoa, 16,1);
        HocVien a2=new HocVien("Phong", "Thai binh", LoaiHV.DoHoa, 19,1);
        HocVien a3=new HocVien("Nga", "Ha noi", LoaiHV.LapTrinh, 8,2);
        HocVien a4=new HocVien("Duong", "Ha nam", LoaiHV.DoHoa, 12,1);
        HocVien a5=new HocVien("My", "Japan", LoaiHV.LapTrinh, 23,2);
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        xuat();
    }
    
    
    public static void xuat(){
        HocVien.inTD();
        for(int i=0;i<list.size();i++){
            list.get(i).inDL();
        }
    }
    
     public static void sua(){
        System.out.println("Nhap vao ten doi tuong can sua:");
        String a;
        a=sc.nextLine();
        int p=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getHoTen().equalsIgnoreCase(a)){
                p++;
                System.out.println("Nhap ten can sua:");
                list.get(i).setHoTen(sc.nextLine());
                System.out.println("Nhap dia chi can sua:");
                list.get(i).setDiaChi(sc.nextLine());
                System.out.println("Sua loai hv:");
                int n=Integer.parseInt(sc.nextLine());
                list.get(i).setLoaiHV((n==1)?LoaiHV.DoHoa:LoaiHV.LapTrinh);
                System.out.println("sua so buoi hoc;");
                list.get(i).setSoBuoiHoc(sc.nextInt());
                System.out.println("sua loai uu tien hv");
                list.get(i).setHocVienLoai(sc.nextInt());
                sc.nextLine();
            }
        }
        if(p==0){
            System.out.println("ten hoc vien ko ton tai.");
        }
        else
            xuat();
    }
    
    public static void xoa(){
        System.out.println("Nhap vao ten can xoa:");
        String a=sc.nextLine();
        int p=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getHoTen().equalsIgnoreCase(a)){//so sanh ten
                p++;
                list.remove(i);// xoa doi tuong
            }
        }
        if(p==0){
            System.out.println("Danh sach sau khi xoa la");
            System.out.println("ten hoc vien ko ton tai.");
        }
        else
            xuat();
        
    }
    
    
    public static void timKiem(){
       System.out.println("Nhap vao ten can tim kiem thong tin:");
        String a=sc.nextLine();
        int p=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getHoTen().equalsIgnoreCase(a)){
                p++;
                list.get(i).inDL();
            }
        }
        if(p==0){
            System.out.println("ten hoc vien ko ton tai.");
        }
    }
    

}
