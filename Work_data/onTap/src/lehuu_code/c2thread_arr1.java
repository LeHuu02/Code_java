/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
power by le minh huu 24/11/2022 @LeHuu02 @copyright
yeu cau:
        - sd thread nhap xuat mang 1 chieu
        - tinh tong, sap xep, tim min
        - in va tinh tong so chinh phuong

NOTE:
*/
package lehuu_code;
import java.util.Scanner;
import java.math. *;

import static lehuu_code.c2thread_arr1.n;
import static lehuu_code.c2thread_arr1.arr;

public class c2thread_arr1 extends Thread{
    static int n;
    static int arr[] = new int[50];
    public static void main(String[] args) {        
        nhapxuat nx = new nhapxuat();
        nx.start();
    }
}

//class nhap xuat
class nhapxuat extends Thread{
    @Override
    public void run(){
        nhap();
        xuat();
        tinh tt = new tinh();
        tt.run();
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so ptu mang: ");
        c2thread_arr1.n = sc.nextInt();
        System.out.println("nhap gia tri: ");
        int i;
        for(i = 0; i < c2thread_arr1.n; i++){
            System.out.println("arr["+(i)+"]: ");
            c2thread_arr1.arr[i] = sc.nextInt();
        }
    }
    public void xuat(){
        System.out.println("in phan tu mang: ");
        int i;
        for(i = 0; i < c2thread_arr1.n; i++){
            System.out.print(c2thread_arr1.arr[i]+"\t");
        }
    }
}

//class tinh toan
class tinh extends Thread{
    @Override
    public void run(){
        tong();
        sapxep();
//        nhapxuat nx = new nhapxuat();
//        nx.xuat();
        min();
        chinhphuong();
    }
    public void tong(){
        int tong = 0;
        for(int i = 0; i < c2thread_arr1.n; i++){
            tong += c2thread_arr1.arr[i];
        }
        System.out.println("tong mang la: "+tong);
    }
    public void sapxep(){   //tang
        int temp;
        for(int i = 0; i < (c2thread_arr1.n)-1; i++){
            for(int j = i+1; j < c2thread_arr1.arr[i]; j++){
                if(c2thread_arr1.arr[i] > c2thread_arr1.arr[j]){
                    temp = c2thread_arr1.arr[i];
                    c2thread_arr1.arr[i] = c2thread_arr1.arr[j];
                    c2thread_arr1.arr[j] = temp;
                }
            }
        }
        System.out.println("mang sau khi xap xep: ");
        for(int i = 0; i < c2thread_arr1.n; i++){
            System.out.print(c2thread_arr1.arr[i]+"\t");
        }
    }
    public void min(){
        int min = c2thread_arr1.arr[0];
        for(int i = 1; i < c2thread_arr1.n; i++){
            if(min > c2thread_arr1.arr[i]){
                min = c2thread_arr1.arr[i];
            }
        }
        System.out.println("min mang la: "+min);
    }
    public void chinhphuong(){
        int tong = 0;
        System.out.println("so chinh phuong la: ");
        for(int i = 0; i < c2thread_arr1.n; i++){
            if((float)Math.sqrt(c2thread_arr1.arr[i]) - (int)Math.sqrt(c2thread_arr1.arr[i]) == 0){
                tong += c2thread_arr1.arr[i];
                System.out.print(c2thread_arr1.arr[i]+"\t");
            }
        }
        System.out.println("tong so chinh phuong: "+tong);
    }
}
