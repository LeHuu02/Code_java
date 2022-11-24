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
public class nhanvienn {
    private int manv;
    private String hoten;
    private int heso;
    private int phucap;
    
    public nhanvienn(){}
    public nhanvienn(int manv, String hoten, int heso, int phucap) {
        this.manv = manv;
        this.hoten = hoten;
        this.heso = heso;
        this.phucap = phucap;
        
    }

    public int getManv() {
        return manv;
    }

    public String getHoten() {
        return hoten;
    }

    public int getHeso() {
        return heso;
    }

    public int getPhucap() {
        return phucap;
    }
    

      

   public static void nhapTT(nhanvienn nv[],int n){
       Scanner nhap=new Scanner (System.in);
       int manv,heso,phucap;
             
       String hoten;
       for(int i=0;i<n;i++){
           System.out.print("ma nhan vien: ");manv=nhap.nextInt();
            System.out.print("hoten: ");nhap.nextLine();hoten=nhap.nextLine();
             System.out.print("he so: ");heso=nhap.nextInt();
              System.out.print("phu cap: ");phucap=nhap.nextInt();
             
       nv[i]=new nhanvienn(manv,hoten,heso,phucap);
       }
       
   } 
   public void hienTT(nhanvienn nv[],int n){
      System.out.println("ma nv - hoten - heso- phucap-luong");
       for(int i=0;i<n;i++){
           System.out.println(nv[i].getManv()+"-"+nv[i].getHoten()+"-"+nv[i].getHeso()+"-"+nv[i].getPhucap()+"-"+nv[i].tinhluong());
       }
   }
   public int tinhluong(){
            
            return(1800000*getHeso())+getPhucap();
           
        }
   public void luongnhanvien(nhanvienn nv[],int n){
       System.out.println("nhan vien co luong lon hon 5 tr la:");
       System.out.println("ma nv - ho ten - he so - phu cap - luong");
       for(int i=0;i<n;i++){
           if(nv[i].tinhluong()>5000000)
               System.out.println(nv[i].getManv()+"-"+nv[i].getHoten()+"-"+nv[i].getHeso()+"-"+nv[i].getPhucap()+"-"+nv[i].tinhluong());
       }
   }
   public void timten(nhanvienn nv[],int n){
       String ten;
       Scanner nhap=new Scanner (System.in);
        System.out.println("nhap ten can tim:");ten=nhap.nextLine();
       System.out.println("nhan vien can tim la:");
        System.out.println("ma nv - ho ten - he so - phu cap - luong");
        for(int i=0;i<n;i++){
            if (nv[i].getHoten().equals(ten))
                 System.out.println(nv[i].getManv()+"-"+nv[i].getHoten()+"-"+nv[i].getHeso()+"-"+nv[i].getPhucap()+"-"+nv[i].tinhluong());
                
        }
   }
  
   public int tongphucap(nhanvienn nv[],int n){
       int tong=0;
       for(int i=0;i<n;i++){
           tong=tong+nv[i].getPhucap();
           
       }
       //System.out.println("tong phu cap=:"+tong);
        return tong;
   }
}
    


