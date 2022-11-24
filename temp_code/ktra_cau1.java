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

public class ktra_cau1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Xin chao\n");
        int number;
        Scanner nhap = new Scanner(System.in);
        
        //nhap
        System.out.println("nhap so: ");
        number = nhap.nextInt();
        in_n_soChinhPhuong(number);
    }
     /*
    so chinh phuong la so gia tri binh phuong cua mot so: 
    1^2 = 1     2^2 = 4     3^2 = 9 ==> 1,4,9 la so chinh phuong
    cach lam can bac hai (float) cua n - can bac hai (int) cua n == 0
    => so chinh phuong
    */
    public static boolean ktSoChinhPhuong(int n){
    
            if((float)Math.sqrt(n) - (int)Math.sqrt(n) == 0)
            {
//                System.out.print(n+"   ");
                return true;
            }
            return false;
    }
    
            /*in n so chinh phuong*/
    public static void in_n_soChinhPhuong(int n){
        int dem = 0, i = 1;
        
        while(dem < n){
            /*goi ham ktra shh*/
            if(ktSoChinhPhuong(i) == true){
                System.out.print(i+ "   ");            
                dem++;
            }
            i++;
    
        }
    }
}
