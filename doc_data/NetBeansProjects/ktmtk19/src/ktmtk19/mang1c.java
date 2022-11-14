/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktmtk19;
import java.lang.Thread;
import java.util.Scanner;
class Tong extends Thread{
int tong=0;
public void run(){
for(int i=0;i<mang1c.n;i++){
tong=tong+mang1c.a[i];
}
    System.out.println("Tong mang = "+tong);
}
}
class Max extends Thread{
int max=mang1c.a[0];
public void run(){
for(int i=0;i<mang1c.n;i++){
if(mang1c.a[i]>max)max=mang1c.a[i];
}
    System.out.println("Max = "+max);
}
}
class Min extends Thread{
int min=mang1c.a[0];
public void run(){
for(int i=0;i<mang1c.n;i++){
if(mang1c.a[i]<min)min=mang1c.a[i];
}
    System.out.println("Min = "+min);
}
}

class tongcl extends Thread{
    int tongc=0,tongl=0;
    public void run(){
        for(int i=0;i<mang1c.n;i++){
        if(mang1c.a[i]%2==0){
            tongc=tongc+mang1c.a[i];
        }else{
            tongl=tongl+mang1c.a[i];
            
        }
    }
      System.out.println("tong chan ="+tongc);
      System.out.println("tong le ="+tongl);
    }
}
class timx extends Thread{
    public void run(){
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("nhap vao x:");
        x=sc.nextInt();
        System.out.print("nam o vi tri thu :");
        for(int i=0;i<mang1c.n;i++){
            if(mang1c.a[i]==x)
                System.out.print(i+ " ");
            
        }
        System.out.println(" ");
    }
}
   class tongvttcl extends Thread{
  int tongc=0,tongl=0;
    public void run(){
  for(int i=0;i<mang1c.n;i++){
  if(i%2==0){
            tongc=tongc+mang1c.a[i];
     }else{
                 tongl=tongl+mang1c.a[i];
    }
   }
    System.out.println("Tong vi tri chan= "+tongc);
    System.out.println("Tong vi tri le= "+tongl);
  }
 }
class chia55 extends Thread{
    int tong5=0;
    public void run(){
        for(int i=0;i<mang1c.n;i++){
            if(mang1c.a[i]%5==0){
                tong5=tong5+mang1c.a[i];
            }
        }
        System.out.println("Tong chia het cho 5= "+tong5);

    }
}
class chia233 extends Thread{
   int tong=0;
   public void run(){
       for(int i=0;i<mang1c.n;i++){
           if(mang1c.a[i]%2==0 && mang1c.a[i]%3==0 ){
               tong=tong+mang1c.a[i];
               
           }
       }
       System.out.println("tong chia het cho 2 va 3"+tong);
   }
}
class soamm extends Thread{
    public void run(){
    System.out.println("cac so am trong mang la: ");
    for(int i=0;i<mang1c.n;i++){
    if(mang1c.a[i]<0){
        System.out.println(mang1c.a[i] +", ");
    }
}
}
}
class sonto extends Thread{
    public void run(){
        int dem=0; int tong=0;
        boolean check = true;
        System.out.println("cac so nguyen to co trong mang la:");
        for(int i=0;i<mang1c.n;i++){
            check=true;
            if(mang1c.a[i]<2)continue;
            for(int j=2;j<mang1c.a[i];j++){
                if(mang1c.a[i]%j==0){
                    check=false;
                    break;
                }
            }
            if (check){
                tong=tong+mang1c.a[i];
                dem++;
                System.out.println(mang1c.a[i]+", ");
            }
        }
        System.out.println("tong cac so nguyen to la: "+tong);
        System.out.println("So luong so nguyen to trong mang la:"+dem);
    }
}
   class sohhh extends Thread{
       public void run(){
           int dem=0; int tong=0;
           System.out.println("cac so hoan hao co trong mang la:");
for(int i=0;i<mang1c.n;i++){
    int tonguoc=0;
    for(int j=1;j<mang1c.a[i];j++){
        if(mang1c.a[i] %j==0){
            tonguoc=tonguoc+j;
        }
    }
    if(tonguoc==mang1c.a[i]){
        tong=tong+mang1c.a[i];
        
        dem++;
        System.out.print(mang1c.a[i]+", ");
        
    }
        }
        System.out.println(" ");
        System.out.println("tong cac so hoan hao la: "+tong);
        System.out.println("So luong so hoan hao trong mang la:"+dem);
       }
   }
class socpp extends Thread{
    public void run(){
        int dem=0; int tong=0;
        System.out.print("cca so chinh phupng trong mag la:");
        for(int i=0;i<mang1c.n;i++){
            for(int j=1;j<mang1c.a[i];j++){
                if(mang1c.a[i]==j*j){
                    tong=tong+mang1c.a[i];
                    dem++;
                    System.out.print(mang1c.a[i]+", ");
                    break;
                }
            }
        }
         System.out.println(" ");
        System.out.println("tong cac so chinh phuong la: "+tong);
        System.out.println("So luong so chinh phuong trong mang la:"+dem);
    }}
class xuatmangg extends Thread{
    public void run(){
        System.out.print("cac phan tu cua mang la: ");
        for(int i=0;i<mang1c.n;i++){
            System.out.print(mang1c.a[i]);
            
        }
        System.out.println(" ");
    }
}
class sapxeptd extends Thread{
    public void run(){
        for(int i=0;i<mang1c.n;i++){
            for(int j=i+1;j<mang1c.n;j++){
                if(mang1c.a[i]<mang1c.a[i]){
                    int tam= mang1c.a[j];
                    mang1c.a[j]=mang1c.a[i];
                    mang1c.a[i]=tam;
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
class sapxepgd extends Thread {
    public void  run() {
        for (int i = 0; i < mang1c.n; i++) {
            for (int j = i+1; j < mang1c.n; j++) {
                if(mang11c.a[i] < mang1c.a[j]) {
                    int tam = mang1c.a[j];
                    mang1c.a[j] = mang1c.a[i];
                    mang1c.a[i] = tam;
                }
            }
        }
        xuatmangg xm =new xuatmangg();
        xm.start();

    }
}


public class mang1c {
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
    Tong tt=new Tong();
    tt.start();
    Max m=new Max();
    m.start();
    Min n=new Min();
    n.start();
    tongcl tcl=new tongcl();
    tcl.start();
    tongvttcl vttcl=new tongvttcl();
    vttcl.start();  
    chia55 c55=new chia55();
    c55.start();
    chia233 c233=new chia233();
    c233.start();
    soamm am=new soamm();
    am.start();
    sonto nto=new sonto();
    nto.start();
    sohhh hh=new sohhh();
    hh.start();
    socpp cpp=new socpp();
    cpp.start();
   xuatmangg magg=new xuatmangg();
   magg.start();
    sapxeptd td=new sapxeptd();
    td.start();
    sapxepgd gd=new sapxepgd();
    gd.start();       
    timx tx=new timx();
    tx.start();
}
}
  

