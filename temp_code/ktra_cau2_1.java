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

public class ktra_cau2_1 {
    /*khai báo biến kiểu private*/
   private String maCD; 
   private String ten;
   private String casi;
   private int sobaihat;
   private int giathanh;
   
   /*khởi tạo gia tri tao lap*/
   public ktra_cau2_1(){};
   public ktra_cau2_1(String maCD, String ten, String casi, int sobaihat, int giathanh){
       this.maCD = maCD;
       this.ten = ten;
       this.casi = casi;
       this.sobaihat = sobaihat;
       this.giathanh = giathanh;
   }

   /*code tao bien truy nhap vao private*/
    public String getMaCD() {
        return maCD;
    }
    public String getTen() {
        return ten;
    }
    public String getCasi() {
        return casi;
    }
    public int getSobaihat() {
        return sobaihat;
    }
    public int getGiathanh() {
        return giathanh;
    }
   
    /*function input data*/
    public static void nhaptt(ktra_cau2_1 cd[], int n){
        /*tao doi tuong nhap kieu Scanner*/
        Scanner nhap = new Scanner(System.in);
        String maCD, ten, casi;
        int sobaihat, giathanh;
        int i;
        for(i = 0; i < n; i++){
            System.out.println("\nthong tin CD thu: "+(i+1));
            System.out.print("nhap vao ma CD: ");
            maCD = nhap.nextLine();
            System.out.print("nhap ten CD: ");
            ten = nhap.nextLine();
            System.out.print("nhap ca si: ");
            casi = nhap.nextLine();
            System.out.print("nhap so bai hat: ");
            sobaihat = nhap.nextInt();
            System.out.print("nhap gia thanh: ");
            giathanh = nhap.nextInt();
            nhap.nextLine();
            /*khoi tao tung gia tri trong class*/
            cd[i] = new ktra_cau2_1(maCD,ten,casi,sobaihat,giathanh){};
        }
    }
    
    /*function output 1 data*/
    public void hienthi1(ktra_cau2_1 cd[], int i){
        /*in ra lan luot ca thong tin da nhap cua mot doi tuong*/
        System.out.println((i+1)+"\t\t"+
                cd[i].getMaCD()+"\t\t"+
                cd[i].getTen()+"\t\t"+
                cd[i].getCasi()+"\t\t"+
                cd[i].getSobaihat()+"\t\t"+
                cd[i].getGiathanh()
                );
    }
    
    /*function output n data*/
    public  void hienthi2(ktra_cau2_1 cd[], int n){
        int i;
        System.out.println("stt\t\tmaCD\t\tten\t\tca si\t\tso bai hat\t\tgia thanh");
        /*in ra thong tin cua n doi tuong: goi ham hien thi 1*/
        for(i = 0; i < n; i++){
            hienthi1(cd, i);
        } 
    }
    
    /*in ra tong so bai hat trong danh sach vua nhap*/
    public void tongbaihat(ktra_cau2_1 cd[], int n){
        int tong = 0;
        for(int i = 0; i < n; i++){
            /*duyet lan luot tu doi tuong 1 den n va tinh tong bai hat*/
            tong = tong + cd[i].getSobaihat();
        }
        System.out.println("tong so bai hat la: "+tong);
    }

    /*nhap ten ca si va in ra thong tin cua ca si do*/
    public void timcasi(ktra_cau2_1 cd[], int n){
        /*nhap ten can tim kiem*/
        String tena;
        Scanner nhap;
        nhap = new Scanner(System.in);
        System.out.print("nhap ten ca si can tim: ");
        tena = nhap.nextLine();

        /*tim ten vua nhap*/
        int i, dem = 0;
        for(i = 0; i < n; i++)
        {
            /*kiem tra ten bang ham S1.equals(S2)*/
            if(cd[i].getCasi().equals(tena))
            {
                dem++;
                /*goi ham hien thi thong tin mot nhan vien co vi tri thu i*/
                System.out.println("stt\t\tmaCD\t\tten\t\tca si\t\tso bai hat\t\tgia thanh");
                hienthi1(cd, i);
            }
        }
        /*neu khong tim thay ai co ten vua nhap*/
        if(dem == 0)
        {
            System.out.println("not find error 404 has name: "+tena);
        }
    }
    
    /*in thong tin theo ma nhap vao*/
    public void timtheoma(ktra_cau2_1 cd[], int n){
        /*nhap ma cd can tim kiem*/
        String tena;
        Scanner nhap;
        nhap = new Scanner(System.in);
        System.out.print("nhap ma cd can tim: ");
        tena = nhap.nextLine();

        /*tim ma vua nhap*/
        for(int i = 0; i < n; i++){
            /*kiem tra ten bang ham S1.equals(S2)*/
            if(cd[i].getMaCD().equals(tena)){
                /*goi ham hien thi thong tin mot nhan vien co vi tri thu i*/
               System.out.println("stt\t\tmaCD\t\tten\t\tca si\t\tso bai hat\t\tgia thanh");
                hienthi1(cd, i);
            }
        }
    }
    
}
