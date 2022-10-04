/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
LE MINH HUU KIEM TRA DE 7 3/10/2022
doi tuong CD: ma, ten, ca si, so bai hat, gia thanh
yêu cầu: + nhập xuất thông tin n đĩa cd
         + tạo các biến là private
         + khởi tạo giá trị tạo lập: insert code geter
         + in ra tổng số các bài hat
         + tìm kiếm và in ra theo tên và mã cd
*/
package Kiem_tra;

import java.util.Scanner;

public class ktra_cau2_2_Run {
     public static void main(String[] args) {
        int n;
        /*nhap vao tong so dia nhac */
        Scanner nhap = new Scanner(System.in);
        System.out.print("nhap vao so luong nhan vien: ");
        n = nhap.nextInt();
        
        /*tao mot doi tuong tu class ktra_cau2_1*/
        ktra_cau2_1 dianhac = new ktra_cau2_1();
        ktra_cau2_1 cd[] = new ktra_cau2_1[10];
        
        /*nhap thong tin*/
        System.out.println("nhap thong tin cd:");
        dianhac.nhaptt(cd, n);
        System.out.println("in thong tin cd: ");
        /*binh thuong thuc hien*/
        try {
            dianhac.hienthi2(cd, n);
            dianhac.tongbaihat(cd, n);
//            dianhac.timcasi(cd, n);
            dianhac.timtheoma(cd, n);
        }
        /*neu loi tron try thi thuc hien catch*/
        catch (Exception e) { 
            System.out.println("CHUC MUNG BAN NHAN DUOC BUG TO DUNG\nBUG-BUG-BUG");
        }
    }
}
