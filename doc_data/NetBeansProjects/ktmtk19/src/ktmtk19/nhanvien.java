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
public class nhanvien {
    private static String manv;
    private static String hoten;
    private static float hesoluong;
    private  static float phucap;
    private  static float luong;
     Scanner nhap=new Scanner(System.in);
     
    nhanvien(){}
        nhanvien(String manv,String hoten,float hesoluong,float phucap,float luong){
        this.hoten=hoten;
        this.manv=manv;
        this.hesoluong=hesoluong;
        this.phucap=phucap;
        this.luong=luong;
       
    }
        public static void nhaptt(){
            
     
        Scanner nhap=new Scanner(System.in);
System.out.print("nhap manv="); manv=nhap.nextLine();
System.out.print("nhap ho ten=");  hoten=nhap.nextLine();
System.out.print("nhap hesoluong="); hesoluong=nhap.nextFloat();
System.out.print("nhap phucap="); phucap=nhap.nextFloat();

  nhanvien s = new nhanvien(manv,hoten,hesoluong,phucap,luong);
    
}
        
        public static void hientt(){
              System.out.println(getmanv()+" "+gethoten()+" "+gethesoluong()+" "+getphucap()+" "+getluong());
            
        }
        public static float tinhluong(){
            float luong;
            luong=((1400000*hesoluong)+phucap);
            return luong;
        }

    public static String getmanv() {
        return manv;
    }

    public static String gethoten() {
        return hoten;
    }

    public static float gethesoluong() {
        return hesoluong;
    }

    public static float getphucap() {
        return phucap;
    }

    public static float getluong() {
        return luong;
    }

    public Scanner getnhap() {
        return nhap;
    }
    
}
