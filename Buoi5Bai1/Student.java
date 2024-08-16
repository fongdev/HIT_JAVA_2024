/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi5Bai1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
// Class School có thuộc tính tên trường và ngày vào trường
//Class Faculty có thuộc tính tên khoa, ngày vào khoa và x có kiểu dữ liệu School, trong class có nhập, xuất dữ liệu của class School
//Clas Student có thuộc tính tên sinh viên, lớp, điểm số và y có kiểu dữ liệu Faculty

public class Student {
    private String tenSinhVien;
    private String lop;
    private float diemSo;
    private Faculty y;

    public Student() {
        y=new Faculty();
    }

    public Student(String tenSinhVien, String lop, float diemSo, Faculty y) {
        this.tenSinhVien = tenSinhVien;
        this.lop = lop;
        this.diemSo = diemSo;
        this.y = y;
    }
    
    Scanner sc=new Scanner(System.in);
            
    
    public void input(){
        System.out.println("Nhap ten Sv:");
        tenSinhVien=sc.nextLine();
        System.out.println("Nhap lop :");
        lop=sc.nextLine();
        System.out.println("Nhap diem so:");
        diemSo=sc.nextFloat();
        sc.nextLine();
        y.input();
    }
    
    public void output(){
        System.out.printf("%-20s%-20s%-20.1f",tenSinhVien,lop,diemSo);
        y.output();
    }
    public static void inTD(){
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n","Name","Class","Score","Faculty","Ngay vao K","School Name","Ngay vao truong");
    }
    
}
