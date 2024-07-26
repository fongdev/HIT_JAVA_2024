/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_buoi2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class bai3 {
    static int n;
    static int [][] array=new int[n][n];
    static int h1=0,h2=n-1,c1=0,c2=n-1,tam=1;
    static Scanner s=new Scanner(System.in);
    
    public static void main(String[] args) {
        nhap(n);
        matrix(array,h1,h2,c1,c2,tam);
        xuat(array);
    }
    
    public static void nhap(int n){
        System.out.print("nhap co ma tran ");
        n=s.nextInt();
    }
    
    public static void xuat(int array[][]){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(array[i][j]+"  ");
            }
            System.out.println("");
        }        
          
        }
    
    public static void matrix(int [][]array,int h1,int h2,int c1,int c2,int tam){
        
            for(int i=c1;i<=c2;i++){
                array[h1][i]=tam;
                tam++;
            }
            h1++;
            for(int i=h1;i<=h2;i++){
                array[i][c2]=tam;
                tam++;
            }
            --c2;
            if(h1<h2){
                for(int i=c2;i>=c1;i--){
                    array[h2][i]=tam;
                    tam++;  
                }
                --h2;
            }
            if(c1<c2){
                for(int i=h2;i>=h1;i--){
                    array[i][c1]=tam;
                    ++tam;
                }
                ++c1;
            }
        }
        
    
}
