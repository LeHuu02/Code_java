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

public class NewClass {
    /*class goi cac thuoc tinh theo kieu private -> tinh bao dong trong OOP*/
    private int manv;
    private String hoten;
    private int heso;
    private int phucap;
    
    public NewClass(){};
    /*ham public giup truy nhap cac thuoc tinh kieu private*/
    public NewClass (int manv, String hoten, int heso,int phucap)
    {
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
    
    /*ham nhap thong tin n nhan vien*/
    public static void nhapTT(NewClass nv[], int n)
    {
        Scanner nhap = new Scanner(System.in);
        int manv, heso, phucap;
        String hoten;
        int i;
        for(i = 0; i < n; i++)
        {
            System.out.println("nhan vien thu : "+(i+1));
            System.out.print("nhap ma nhan vien: ");
            manv = nhap.nextInt();
            System.out.print("nhap he so nhan vien: ");
            heso = nhap.nextInt();
            System.out.print("nhap phu cap nhan vien: ");
            phucap = nhap.nextInt();
            System.out.print("nhap ho ten nhan vien: ");
            nhap.nextLine();
            hoten = nhap.nextLine();
            nv[i] = new NewClass(manv,hoten,heso,phucap);
            System.out.println(" ");
        }
    }
    
    /*hien thi toa bo thong tin nhan vien*/
    public  void hienTT(NewClass nv[], int n)
    {
        int i;
        System.out.print("stt\t\tma nv\t\tho ten\t\the so\t\tphu cap\t\tluong\n");
        for(i = 0; i < n; i++)
        {
            /*call funct hienthi1*/
            hienthi1(nv, i);
        }
    }
    
    /*hien thi thong tin cua mot nhan vien thu tu i*/
    public void hienthi1(NewClass nv[], int i)
    {
            System.out.println((i+1)+"\t\t"+
                    nv[i].getManv()+"\t\t"+
                    nv[i].getHoten()+"\t\t"+
                    nv[i].getHeso()+"\t\t"+
                    nv[i].getPhucap()+"\t\t"+
                    tinhluong(nv, i)); 
    }
    
    /*ham tinh luong cua tung nhan vien*/
    public  int tinhluong(NewClass nv[],int i)
    {
        int luong = 0;
        luong = 1800000* nv[i].getHeso() +nv[i].getPhucap();
        return luong;
    }
    
    /*function in ra thong tin nhan vien co luong lon hon 5 trieu*/
   public void luongnv(NewClass nv[], int n)
   {
       System.out.println("thong tin nhan vien co luon lon hon 5 trieu: ");
       int i, tinh, dem = 0;
        System.out.print("stt\t\tma nv\t\tho ten\t\the so\t\tphu cap\t\tluong\n");
       /*duyet tu dau den cuoi danh sach*/
       for(i = 0; i < n ; i++)
       {
           /*hien thi luong neu luong lon hon 5 tr*/
           tinh = tinhluong(nv, i);
           if(5000000 <= tinh )
           {
               /*hien thi nhan vien co thu tu i*/
               hienthi1(nv, i);  
               dem++;
           }
       }
       /*neu khong co ai co luong lon hon 5tr thi in ra khong co*/
       if(dem == 0)
       {
           System.out.println("khong co nhan vien nao co luong > 5 tr");   
       }
   }
   
   /*function tinh tong phu cap phai tra cho nhan vien*/
   public void tongphucap(NewClass nv[], int n)
   {
       int tongpc = 0;
       int i;
       /*duyet tu dau den cuoi danh sach roi tinh tong phu cap*/
       for(i = 0; i < n; i++)
       {
           tongpc = tongpc + nv[i].getPhucap();
       }
       System.out.println("tong phu cap cho tat cac nhan vien la: "+tongpc);
   }
   
   /*function find name input and print information*/
   public void timten(NewClass nv[], int n)
   {
       /*nhap ten can tim kiem*/
      String ten;
      Scanner nhap = new Scanner(System.in);
      ten = nhap.nextLine();
      
      /*tim ten vua nhap*/
      int i, dem = 0;
      for(i = 0; i < n; i++)
      {
          /*kiem tra ten bang ham S1.equals(S2)*/
          if(nv[i].getHoten().equals(ten))
          {
              dem++;
              /*goi ham hien thi thong tin mot nhan vien co vi tri thu i*/
              hienthi1(nv, i);
          }
      }
      /*neu khong tim thay ai co ten vua nhap*/
      if(dem == 0)
      {
          System.out.println("not find error 404 has name: "+ten);
      }
   }
   
}
