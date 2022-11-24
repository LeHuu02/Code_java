/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
LE MINH HUU 6/10/2022
Thread - luong trong java
*/
package Thread;

import java.lang.Thread;
import java.util.Scanner;

/*class tinh tong ke thua tu Thread*/
class tinhtong extends Thread{
    @Override       //ghi de lop con len lop cha
    /*function run chua cac cau lenh de chay nhung khi thuc hien thi goi trong ham start*/
    public void run(){
        int tong = 0;
        for(int i = 0; i < Thread_example.n; i++){
            tong += Thread_example.a[i];
        }
        System.out.println("tong cac phan tu mang la: "+tong);
    }
}

/*class tim max ke thua tu Thread*/
class find_max extends Thread{
    int max = Thread_example.a[0];
    @Override
    public void run(){
        for(int i = 1; i < Thread_example.n; i++){
            if(max < Thread_example.a[i]){
                max = Thread_example.a[i];
            }
        }
        System.out.println("max: "+max);
    }
}
/*lop chinh */
public class Thread_example {
    /*khai bao bien toan cuc co the truy xuat o moi class*/
    static int a[] = new int[10]; 
    static int n;
    /*function main*/
    public static void main(String[] args) {
        /*tao doi tuong nhap */
        System.out.print("nhap so phan tu mang: ");
        Scanner nhap = new Scanner(System.in);
        n = nhap.nextInt();
        
        System.out.println("nhap ptu mang: ");
        for(int i = 0; i < n; i++){
            System.out.print("ptu "+(i+1)+": ");
            a[i] = nhap.nextInt();
        }
        
        /*tao doi tuong tt thuoc class tinhtong*/
        tinhtong tt = new tinhtong();
//        tt.start();     //chay class tinh tong
        /*tao doi tuong timmax thuoc class find_max*/
        find_max timmax = new find_max();
        timmax.start();        
    }

}
