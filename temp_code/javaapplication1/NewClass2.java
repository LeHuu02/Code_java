/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//LE MINH HUU KIEM TRA DE 7 3/10/2022
/*
LE MINH HUU KIEM TRA DE 7 3/10/2022
doi tuong CD: ma, ten, ca si, so bai hat, gia thanh
*/
package javaapplication1;

import java.util.Scanner;

public class NewClass2 {
   private String maCD;
   private String ten;
   private String casi;
   private int sobaihat;
   private int giathanh;
   
   public NewClass2(){}
   public NewClass2(String maCD, String ten, String casi, int sobaihat, int giathanh){
       this.maCD = maCD;
       this.ten = ten;
       this.casi = casi;
       this.sobaihat = sobaihat;
       this.giathanh = giathanh;
   }

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
   
    public static void nhaptt(NewClass2 cd[], int n){
        Scanner nhap = new Scanner(System.in);
        String maCD, ten, casi;
        int sobaihat, giathanh;
        int i;
        for(i = 0; i < n; i++){
            System.out.println("thong tin CD thu: "+(i+1));
            System.out.println("nhap vao ma CD: ");
//            nhap.nextLine();
            maCD = nhap.nextLine();
//            System.out.println("ma: "+maCD);
            System.out.println("nhap ten CD: ");
            ten = nhap.nextLine();
            System.out.println("nhap ca si: ");
            casi = nhap.nextLine();
            System.out.println("nhap so bai hat: ");
            sobaihat = nhap.nextInt();
            System.out.println("nhap gia thanh: ");
            giathanh = nhap.nextInt();
            nhap.nextLine();
            cd[i] = new NewClass2(maCD,ten,casi,sobaihat,giathanh){};
        }
    }
    
    public void hienthi1(NewClass2 cd[], int i){
        System.out.println((i+1)+"\t\t"+
                cd[i].getMaCD()+"\t\t"+
                cd[i].getTen()+"\t\t"+
                cd[i].getCasi()+"\t\t"+
                cd[i].getSobaihat()+"\t\t"+
                cd[i].getGiathanh()
                );
    }
    
    public  void hienthi2(NewClass2 cd[], int n){
        int i;
        System.out.println("stt\t\tmaCD\t\tten\t\tca si\t\tso bai hat\t\tgia thanh");
        for(i = 0; i < n; i++){
            hienthi1(cd, i);
//            System.out.println("so: "+i);
        } 
    }
    
    public void in(NewClass2 cd[], int n){
        
    }
    
    public void inthongtin(NewClass2 cd[], int n){
//        System.out.print("bug bug");
         int i;
        System.out.println("stt\t\tmaCD\t\tten\t\tca si\t\tso bai hat\t\tgia thanh");
        for(i = 0; i < n; i++){
                System.out.println((i+1)+"\t\t"+cd[i].getMaCD() );
//            System.out.println("so: "+i);
        }
    }
    public void tongbaihat(NewClass2 cd[], int n){
        int tong = 0;
        for(int i = 0; i < n; i++){
            tong = tong + cd[i].getSobaihat();
        }
        System.out.println("tong so bai hat la: "+tong);
    }
    
    public void timcasi(NewClass2 cd[], int n){
               /*nhap ten can tim kiem*/
      String tena;
      Scanner nhap;
       nhap = new Scanner(System.in);
        System.out.println("nhap ten ca si can tim: ");
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
              hienthi1(cd, i);
          }
      }
      /*neu khong tim thay ai co ten vua nhap*/
      if(dem == 0)
      {
          System.out.println("not find error 404 has name: "+tena);
      }
    }
    
       public void timtheoma(NewClass2 cd[], int n){
               /*nhap ten can tim kiem*/
      String tena;
      Scanner nhap;
       nhap = new Scanner(System.in);
        System.out.println("nhap ma cd can tim: ");
      tena = nhap.nextLine();
      
      /*tim ten vua nhap*/
      int i, dem = 0;
      for(i = 0; i < n; i++)
      {
          /*kiem tra ten bang ham S1.equals(S2)*/
          if(cd[i].getMaCD().equals(tena))
          {
              dem++;
              /*goi ham hien thi thong tin mot nhan vien co vi tri thu i*/
              hienthi1(cd, i);
          }
      }
      /*neu khong tim thay ai co ten vua nhap*/
      if(dem == 0)
      {
          System.out.println("not find error 404 has ma cd: "+tena);
      }
    }
    
}
