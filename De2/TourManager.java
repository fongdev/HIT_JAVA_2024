/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class TourManager {
    static ArrayList<Product> list=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        addTour();
   //     xoa();
  //      timKiemName();
        timKiemPrice();
        sapXep();
        tongTienKho();
    }
    
    public static void addTour(){
        Product t1=new Tour("2 ngay", "xe may", "ff2", "ha noi", 500000, 6);
        Product t2=new Tour("2 ngay", "xe may", "ff5", "HCM", 600000, 20);
        Product t3=new Tour("2 ngay", "xe may", "ff3", "Hai Phong", 1500000, 15);
        Product t4=new Tour("2 ngay", "xe may", "ff4", "Hue", 30000, 10);
        Product t5=new Tour("2 ngay", "xe may", "ff1", "Da Nang", 50000, 2);
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        list.add(t5);
        Tour.inTD();
        for (Product i : list) {
            i.xuat();
        }
    }
    
    public static void xuat(){
        Tour.inTD();
        for (Product i : list) {
            i.xuat();
        }
    }
    
    
    public static void xoa(){
        System.out.println("Nhap vao tour muon xoa vd: Ha noi: ");
        String p=sc.nextLine();
        int a=0;
        for(int i=0;i<list.size();i++){
            if(p.equalsIgnoreCase(list.get(i).getTen())){
                list.remove(i);
                a++;
            }
        }
        if(a==0){
            System.out.println("Tour ko ton tai");
        }
        else{
            xuat();
        }
        
    }
    
    public static void timKiemName(){
        System.out.println("Nhap vao ten tour ban muon tim:");
        String p=sc.nextLine();
        int a=0;
        for(int i=0;i<list.size();i++){
            if(p.equalsIgnoreCase(list.get(i).getTen())){
                System.out.println("Tour ban can tim la:");
                list.get(i).xuat();
                a++;
            }
        }
        if(a==0){
            System.out.println("Tour khong ton tai:");
        }
    }
    
        public static void timKiemPrice(){
        System.out.println("Nhap vao gia tour ban muon tim:");
        double p=sc.nextDouble();
        int a=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getGia()<=(p+1000000) && list.get(i).getGia()>=(p-1000000)){
                System.out.println("Tour ban can tim la:");
                list.get(i).xuat();
                a++;
            }
        }
        if(a==0){
            System.out.println("Tour khong ton tai:");
        }
    }

    public static void sapXep(){
        Collections.sort(list, new Comparator<Product>(){
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getTotalPrice()>o2.getTotalPrice())
                    return 1;
                if(o1.getTotalPrice()<o2.getTotalPrice())
                    return -1;
                return 0;
            }
        });
        
        System.out.println("Danh sach sau khi sap xep la:");
        xuat();
    }
    
    public static void tongTienKho(){
        double p=0;
        for(int i=0;i<list.size();i++){
            p=p+list.get(i).getTotalPrice();
        }
        System.out.println("Tong tien trong kho la:  "+p);
    }
    
}
