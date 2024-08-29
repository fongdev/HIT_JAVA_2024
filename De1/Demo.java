
package DE1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Demo {
    static ArrayList<LaoDong> list=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        fakeData();
        Demo demo =new Demo();
        int choice;
        
        do{
            inMenu();
            System.out.println("Nhap lua chon cua ban:");
            choice=Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    demo.sapXep();
                    break;
                case 2:
                    demo.timMax();
                    break;
                case 3:
                    demo.nhap();
                    break;
                case 4:
                    demo.sua();
                    break;
                case 5:
                    demo.xoa();
                    break;
                case 6:
                    demo.inTenThanhChuHoa();
                    break;
                case 7:
                    System.out.println("Tam biet.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        }while(choice !=7);
        
        
        
    }
    
    public static void fakeData(){
        LaoDong nv1=new NVChinhThuc(1.3, 4, "Truong Van Phong", "Ha nam", "Haui5", LoaiNhanVien.NVchinhthuc);
        LaoDong nv2=new NVThoiVu(26, 300000, "Tran Tien Dat", "ThaiBinh", "HUSt", LoaiNhanVien.NVthoivu);
        LaoDong nv3=new NVChinhThuc(1.3, 2, "Nguyen Trung Hieu", "Da Nang", "PTiT", LoaiNhanVien.NVchinhthuc);
        LaoDong nv4=new NVChinhThuc(1.3, 3, "To An An", "Nam Dinh", "Haui3", LoaiNhanVien.NVchinhthuc);
        LaoDong nv5=new NVThoiVu(20, 300000, "Truong Van Duy", "Nam Dinh", "HUSt", LoaiNhanVien.NVthoivu);
        list.add(nv1);
        list.add(nv2);
        list.add(nv3);
        list.add(nv4);
        list.add(nv5);
        xuat();
    }
    
    public static void xuat(){
        LaoDong.inTD();
        for (LaoDong i : list) {
            i.xuat();
        }
    }
    
    public static void inMenu(){
        System.out.println("---------------MENU--------------");
        System.out.println("1.Sap xep doi tuong tang dan theo luong.");
        System.out.println("2.Doi tuong luong cao nhat , chi scan 'thoi vu'.");
        System.out.println("3.Nhap them doi tuong.");
        System.out.println("4.Nhap ten doi tuong sua doi tuong.");
        System.out.println("5.Nhap ten doi tuong xoa doi tuong.");
        System.out.println("6.In danh sach ho ten nv chuyen thanh chu hoa.");
        System.out.println("7.Thoat.");
    }
    
    public static void sapXep(){
        Collections.sort(list, new Comparator<LaoDong>(){
            @Override
            public int compare(LaoDong o1, LaoDong o2) {
                if(o1.TinhLuong()>o2.TinhLuong())
                    return 1;
                else if(o1.TinhLuong()<o2.TinhLuong())
                    return -1;
                else
                    return 0;
            }
        });
        System.out.println("------------LOVE------------");
        System.out.println("Danh sach sau khi sap xep la:");
        xuat();
    }
    
    
    public static void timMax(){
        LaoDong a= Collections.max(list, Comparator.comparingDouble(LaoDong::TinhLuong));
        System.out.println("Danh sach nhan vien thoi vu co luong cao nhat la:");
        for (int i=0;i<list.size();i++) {
            if(list.get(i)==a && list.get(i) instanceof NVThoiVu)
                list.get(i).xuat();
        }
    }
    
    public static void nhap(){
        System.out.println("Nhap so doi tuong can them:");
        int n=sc.nextInt();
        sc.nextLine();
        int q ;
        for(int i=0;i<n;i++){
            LaoDong newLD=null;
            System.out.println("Lua chon loai nv: 1.Thoi vu / 2. Chinh thuc");
            q=Integer.parseInt(sc.nextLine());
            if(q==1)
                newLD=new NVThoiVu();
            if(q==2)
                newLD=new NVChinhThuc();
            newLD.nhap();
            list.add(newLD);
        }
        System.out.println("Danh sach sau khi duoc bo sung la:");
        xuat();
    }
    
    public static void sua(){
        System.out.println("Nhap ten doi tuong can sua:");
        String p=sc.nextLine();
        int w=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getHoTen().equalsIgnoreCase(p)){
                System.out.println("Lao dong truoc khi sua la:");
                list.get(i).xuat();
                if(list.get(i) instanceof NVChinhThuc)
                    list.get(i).nhap();
                else
                    list.get(i).nhap();// nv thoi vu
                ++w;
            }
        }
         if(w==0){
                System.out.println("doi tuong ko ton tai");
            }
         else{
              System.out.println("Danh sach sau khi sua la:");
                xuat();
         }
    }
    
    
    public static void xoa(){
        System.out.println("Nhap vao doi tuong can xoa:");
        String p=sc.nextLine();
        int a=0;
        for(int i=0;i<list.size();i++){
            if(p.equalsIgnoreCase(list.get(i).getHoTen()))
            {
                list.remove(i);
                ++a;
            }
        }
        if(a==0){
            System.out.println("doi tuong ko ton tai");
        }
        else{
            System.out.println("Danh sach sau khi xoa la:");
        xuat();
        }
    }
    
    public static void inTenThanhChuHoa(){
        System.out.println("Danh sach lao dong duoc in thanh chu hoa la:");
        for (LaoDong i : list) {
            i.chuyenTenThanhHoa(i.getHoTen());
        }
        xuat();
    }
    
}
