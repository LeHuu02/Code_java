/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhhuu;
import java.util.Scanner;
     class bt1{
        private String makh;
        private String tenkh;
        private String diachi;
        private int sdt;
        public bt1(){};
        public bt1(String makh, String tenkh, String diachi, int sdt){
            this.makh = makh;
            this.tenkh = tenkh;
            this.diachi = diachi;
            this.sdt = sdt;
        }
        public void setMakh(String makh) {
            this.makh = makh;
        }
        public void setTenkh(String tenkh) {
            this.tenkh = tenkh;
        }
        public void setDiachi(String diachi) {
            this.diachi = diachi;
        }
        public void setSdt(int sdt) {
            this.sdt = sdt;
        }
        public String getMakh() {
            return makh;
        }
        public String getTenkh() {
            return tenkh;
        }
        public String getDiachi() {
            return diachi;
        }
        public int getSdt() {
            return sdt;
        }      
       /* public void xuat(bt1 nv){
            System.out.println("ma kh:"+ nv.getMakh());
            System.out.println("ten kh:"+ nv.getTenkh());
            System.out.println("dia chi kh:"+ nv.getDiachi());
            System.out.println("sdt kh:"+ nv.getSdt());
        }   */     

    @Override
    public String toString() {
        return "bt1{" + "makh=" + makh + ", tenkh=" + tenkh + ", diachi=" + diachi + ", sdt=" + sdt + '}';
    }
        
    }  
public class baitap1 {
  
    
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        bt1 nv = new bt1();
        nv.setMakh(nhap.nextLine());
        nv.setTenkh(nhap.nextLine());
        nv.setDiachi(nhap.nextLine());
        nv.setSdt(nhap.nextInt());
        //nv.xuat(nv);
        System.out.println(nv.toString());
    }
    
}

