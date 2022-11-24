/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktmtk19;
import java.util.Scanner;


public class tesskhachhang {
    public static void main(String args[]){
        int n;
        
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("nhap so nhan vien 2<n<10 ");
        n=sc.nextInt();
        }while(2>n || n>10);
        khachhang kh=new khachhang();
        khachhang h[]=new khachhang[10];
        System.out.println("nhap thong tin nhan vien");
        kh.nhapTT(h,n);
        System.out.println("hien thong tin nha vien");
        kh.hienTT(h,n);
       kh.sodienthoai(h,n);
       kh.khlonhon60(h,n);
             kh.timten(h,n);  
            
    }
}

