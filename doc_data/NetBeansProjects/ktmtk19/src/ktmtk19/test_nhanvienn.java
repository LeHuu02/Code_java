/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktmtk19;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class test_nhanvienn {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so nhan vien n= ");
        n=sc.nextInt();
        nhanvienn nv=new nhanvienn();
        nhanvienn v[]=new nhanvienn[10];
        System.out.println("nhap thong tin nhan vien");
        nv.nhapTT(v,n);
        System.out.println("hien thong tin nha vien");
        nv.hienTT(v,n);
        nv.luongnhanvien(v,n);
              nv.timten(v,n);  
            System.out.println("Tong phu cap="+nv.tongphucap(v,n));
           
    }
}
