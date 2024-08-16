
package BT_buoi3;

import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        String hv =new String("Square");
        String tg =new String("Triangle");
        String ht =new String("Circle");
        Scanner input=new Scanner(System.in);
        String type;
        int n;
        int a,b,c;
        type=input.nextLine();
            if(type.equals(hv) || type.equals(tg) || type.equals(ht)){
                //hinh vuong
                if(type.equals(hv)){
                     n=input.nextInt();
                     System.out.println(Math.pow(n, 2));
                }
                //hinh tam giac
                if(type.equals(tg)){
                    a=input.nextInt();
                    b=input.nextInt();
                    c=input.nextInt();
                        if(a<=0 || b<=0 ||c<=0){
                             System.out.print(-1);
                        }
                    double p=(a+b+c)/2;
                    double S= Math.sqrt(p*(p-a)*(p-b)*(p-c));
                    System.out.printf("%.2f",S);
  
                }
                //hinh tron
                if(type.equals(ht)){
                    n=input.nextInt();
                    double S=Math.PI*Math.pow(n, 2);
                    System.out.printf("%.2f",S);
                }
            } 
                else{
                    System.out.println("Hinh dang khong hop le!");
                }
        
    }
        
}
