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
public class test_setkhang {
    public static void main(String[] args){
        Scanner nhap=new Scanner(System.in);
        set_khang nv=new set_khang();
        System.out.print("Nhap ma: ");nv.setMakh(nhap.nextInt());
        System.out.print("Nhap ten: ");nhap.nextLine();nv.setHoten(nhap.nextLine());
        System.out.print("Nhap Dia chi: ");nv.setDiachi(nhap.nextLine());
        System.out.print("Nhap sdt: ");nv.setSodt(nhap.nextInt());
           System.out.println(nv.toString());
     set_khang kh1=new set_khang(124,"nguyent thi thanh","bac giang",123456);  
     System.out.println(kh1.toString());
    }
}
