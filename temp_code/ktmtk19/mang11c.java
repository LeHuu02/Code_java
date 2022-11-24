/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktmtk19;
import java.lang.Thread;
import java.util.Scanner;
class tinhT extends Thread{
    int tong=0;
    public void run(){
        for(int i=0;i<mang11c.n;i++){
            tong=tong+mang11c.a[i];
        }
        System.out.println("Tong mang = "+tong);
    }
}
class timMa extends Thread{
    int max=mang11c.a[0];
    public void run(){
        for(int i=0;i<mang11c.n;i++){
            if(mang11c.a[i]>max)max=mang11c.a[i];
        }
        System.out.println("Max = "+max);
    }
}
class timMin extends Thread{
    int min=mang11c.a[0];
    public void run(){
        for(int i=0;i<mang11c.n;i++){
            if(mang1c.a[i]<min)min=mang11c.a[i];
        }
        System.out.println("Min = "+min);
    }
}

class timxx extends Thread{
    public void run(){
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Nhap vao x");
        x = sc.nextInt();
        System.out.print( "Nam o cac vi tri: ");
        for(int i=0;i<mang1c.n;i++){
            if(mang1c.a[i]==x)
                System.out.print(i+ " ");
        }
        System.out.println(" ");
    }
}
class tongcll extends Thread{
    int tongc=0,tongl=0;
    public void run(){
        for(int i=0;i<mang11c.n;i++){
            if(mang1c.a[i]%2==0){
                tongc=tongc+mang11c.a[i];
            }else{
                tongl=tongl+mang11c.a[i];

            }
        }
        System.out.println("Tong chan= "+tongc);
        System.out.println("Tong le= "+tongl);
    }
}
class tongvtcl extends Thread{
    int tongc=0,tongl=0;
    public void run(){
        for(int i=0;i<mang11c.n;i++){
            if(i%2==0){
                tongc=tongc+mang11c.a[i];
            }else{
                tongl=tongl+mang11c.a[i];

            }
        }
        System.out.println("Tong chan= "+tongc);
        System.out.println("Tong le= "+tongl);
    }
}
class chia3 extends Thread{
    int tong3=0;
    public void run(){
        for(int i=0;i<mang11c.n;i++){
            if(mang1c.a[i]%3==0){
                tong3=tong3+mang11c.a[i];
            }
        }
        System.out.println("Tong chia het cho 3= "+tong3);

    }
}
class chia5 extends Thread{
    int tong5=0;
    public void run(){
        for(int i=0;i<mang11c.n;i++){
            if(mang11c.a[i]%5==0){
                tong5=tong5+mang11c.a[i];
            }
        }
        System.out.println("Tong chia het cho 5= "+tong5);

    }
}
class chia23 extends Thread{
    int tong=0;
    public void run(){
        for(int i=0;i<mang11c.n;i++){
            if(mang11c.a[i]%2==0 && mang11c.a[i]%3 == 0){
                tong=tong+mang11c.a[i];
            }
        }
        System.out.println("Tong chia het cho 2 va 3= "+tong);

    }
}

class soam extends Thread{

    public void run(){
        System.out.println("Cac so am trong mang: ");
        for(int i=0;i<mang11c.n;i++){
            if(mang11c.a[i]<0 ){
                System.out.println(mang11c.a[i] + ", ");
            }
        }

    }
}
class SoNT extends  Thread{
    public void run() {
        int dem = 0; int tong = 0;
        boolean check = true;
        System.out.println("Cac so nguyen to trong mang la: ");
        for (int i =0; i < mang11c.n; i ++) {
            check = true;
            if(mang11c.a[i] < 2) continue;
            for (int j = 2; j < mang11c.a[i]; j++) {
                if(mang11c.a[i] % j == 0) {
                    check = false;
                    break;
                }
            }
            if(check) {
                tong = tong + mang11c.a[i];
                dem++;
                System.out.print(mang11c.a[i]+", ");
            }
        }
        System.out.println("tong cac so nguyen to la: "+tong);
        System.out.println("So luong so nguyen to trong mang la:"+dem);
    }
}
class SoHH extends  Thread{
    public void run() {
        int dem = 0; int tong = 0;

        System.out.print("Cac so hoan hao trong mang la: ");
        for (int i =0; i < mang11c.n; i ++) {
            int tonguoc = 0;
            for (int j = 1; j < mang11c.a[i]; j++) {
                if(mang11c.a[i] % j == 0) {
                    tonguoc = tonguoc + j;
                }
            }
            if(tonguoc == mang11c.a[i]) {
                tong = tong + mang11c.a[i];
                dem++;
                System.out.print(mang11c.a[i]+", ");
            }
        }
        System.out.println(" ");
        System.out.println("tong cac so hoan hao la: "+tong);
        System.out.println("So luong so hoan hao trong mang la:"+dem);
    }
}
class SoCP extends  Thread{
    public void run() {
        int dem = 0; int tong = 0;
        System.out.print("Cac so chinh phuong trong mang la: ");
        for (int i =0; i < mang11c.n; i ++) {

            for (int j = 1; j < mang11c.a[i]; j++) {
                if(mang1c.a[i] == j*j) {
                    tong = tong + mang11c.a[i];
                    dem++;
                    System.out.print(mang11c.a[i]+", ");
                    break;
                }
            }

        }
        System.out.println(" ");
        System.out.println("tong cac so chinh phuong la: "+tong);
        System.out.println("So luong so chinh phuong trong mang la:"+dem);
    }
}
 class XuatMang extends Thread {
    public void run() {
        System.out.print("Cac phan tu trong mang la: ");
        for (int i = 0; i < mang11c.n; i++) {
            System.out.print(mang11c.a[i]);
        }
        System.out.println("");
    }
 }
class Sapxeptd extends Thread {
    public void  run() {
        for (int i = 0; i < mang11c.n; i++) {
            for (int j = i+1; j < mang11c.n; j++) {
                if(mang11c.a[j] < mang11c.a[i]) {
                    int tam = mang11c.a[j];
                    mang11c.a[j] = mang11c.a[i];
                    mang11c.a[i] = tam;
                }
            }
        }
        System.out.print("Cac phan tu trong mang la: ");
        for (int i = 0; i < mang11c.n; i++) {
            System.out.print(mang11c.a[i]);
        }
        System.out.println("");

    }
}
class Sapxepgd extends Thread {
    public void  run() {
        for (int i = 0; i < mang11c.n; i++) {
            for (int j = i+1; j < mang11c.n; j++) {
                if(mang11c.a[i] < mang11c.a[j]) {
                    int tam = mang11c.a[j];
                    mang11c.a[j] = mang11c.a[i];
                    mang11c.a[i] = tam;
                }
            }
        }
        XuatMang xm =new XuatMang();
        xm.start();

    }
}
/**
 *
 * @author Admin
 */
public class mang11c {
     static int a[]=new int[10];
    static int n;

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n=");n=sc.nextInt();
        System.out.println("Nhap vao phan tu mang:");
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]=");
            a[i]=sc.nextInt();
        }
        XuatMang xm = new XuatMang();
        xm.start();
        tinhT tt=new tinhT();
        tt.start();
        timMax m=new timMax();
        m.start();
        tongcl tcl=new tongcl();
        tcl.start();
        chia3 c3 = new chia3();
        c3.start();
        chia5 c5 = new chia5();
        c5.start();
        chia23 c23 = new chia23();
        c23.start();
        soam sm = new soam();
        sm.start();
        tongvtcl vtcl = new tongvtcl();
        vtcl.start();
        SoNT snt = new SoNT();
        snt.start();
        SoHH shh = new SoHH();
        shh.start();
        SoCP scp = new SoCP();
        scp.start();
        timx tx = new timx();
        tx.start();
        Sapxeptd sxtd = new Sapxeptd();
        sxtd.start();
        Sapxepgd sxgd = new Sapxepgd();
        sxgd.start();
    }
}
