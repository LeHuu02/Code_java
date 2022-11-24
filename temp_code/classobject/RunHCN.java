/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
power by le minh huu 23/9/2022
ham tinh chu vi dien tich hcn 
*/
package classobject;

import java.util.Scanner;

public class RunHCN {
    public static void main(String[] args) {
        /*goi tu class HCN de thuc hien*/
        HCN hinh1 = new HCN();
        
        /*goi ham nhap voi hien thi*/
        hinh1.nhap();
        hinh1.xuat();
        /*goi va in ra chieu dai chieu rong*/
        System.out.println("chu vi hcn: "+hinh1.chuvi());
        System.out.println("dien tich hcn: "+hinh1.dientich());
    }
}
