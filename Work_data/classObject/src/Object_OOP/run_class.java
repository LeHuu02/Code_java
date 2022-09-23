/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
code by le minh huu 22/9/2022\
class object - private
*/
package Object_OOP;

import java.util.Scanner;

/*run class input function in NewClass.java*/
public class run_class {
    public static void main(String[] args) {
        /*nhap tong so nhan vien */
        int n;
        /*tao doi tuong nhap de nhap du lieu tu ban phim*/
        Scanner nhap = new Scanner(System.in);
        System.out.print("nhap vao so luong nhan vien: ");
        /*nhap gia tri n*/
        n = nhap.nextInt();
        /*tao mot doi tuong nhanvien thuoc lop NewClass*/
        NewClass nhanvien = new NewClass();
        NewClass nv[] = new NewClass[10];
        
        System.out.print("nhap thong tin nhan vien \n");
        /*goi ham nhapTT tu class NewClass co doi tuong la nhanvien*/
        nhanvien.nhapTT(nv, n);
        System.out.print("in thong in nhan vien: \n");
        nhanvien.hienTT(nv, n);
        
        /*goi ham in thong tin luong > 5tr*/
        nhanvien.luongnv(nv, n);
        
        /*goi ham in ra tong phu cap phai tra*/
        nhanvien.tongphucap(nv, n);
        
        /*goi ham nhap vao ten tim kiem va in ra thong tin*/
        nhanvien.timten(nv, n);
        
    }
}
