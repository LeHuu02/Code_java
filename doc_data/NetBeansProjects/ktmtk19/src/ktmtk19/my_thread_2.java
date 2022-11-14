/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktmtk19;
import java.util.Scanner;
import java.lang.Thread;
class xuatmang extends Thread{
    public void run(){
        System.out.println("mang vua nhap la: ");
        for(int i=0;i<my_thread_2.n;i++){
            for(int j=0;j<my_thread_2.m;j++ ){
                System.out.print(my_thread_2.a[i][j]+" ");
                
            }
            System.out.println();
        }
    }
}
class tinhtong extends Thread{
    int tong=0;
    public void run(){
        for(int i=0;i<my_thread_2.n;i++){
            for(int j=0;j<my_thread_2.m;j++)
                tong=tong+my_thread_2.a[i][j];      
            }
        System.out.println("tong mang= "+tong);
        
        }
    }
class tongchan extends Thread{
    int tongc=0,tongl=0,dem=0;
    public void run(){
        System.out.print("cac so chan trong mng la: ");
        for(int i=0;i<my_thread_2.n;i++){
            for(int j=0;j<my_thread_2.m;j++){
                if(my_thread_2.a[i][j]%2==0){
                    dem++;
                    tongc=tongc+my_thread_2.a[i][j];
                    System.out.println(" "+my_thread_2.a[i][j]);
            }else{
                    tongl=tongl+my_thread_2.a[i][j];
                }
            }
        }
        System.out.println("Co "+dem+" so chan trong mang");
        System.out.println("Tong chan= "+tongc);
        System.out.println("Tong le= "+tongl);
        }
        }
    class chiah5 extends Thread{
        int tong=0,dem=0;
        public void run(){
            System.out.print("cac so 0 chia het cho 5 la: ");
             for(int i=0;i<my_thread_2.n;i++){
    for(int j=0;j<my_thread_2.m;j++){
        if(my_thread_2.a[i][j]%5!=0){
            dem++;
            tong=tong+my_thread_2.a[i][j];
            System.out.println(" "+my_thread_2.a[i][j]);
            
        }
        
    }
             }
             System.out.println("co "+dem+" so khong chia het cho 5");
              System.out.println("Tong khong chia het cho 5= "+tong);
    }
        }
public class my_thread_2 {
  static int a[][]=new int[10][10];
static int n,m;
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("nhap vao so hang n= ");n=sc.nextInt();
     System.out.print("nhap vao so cot m= ");m=sc.nextInt();
     System.out.print("nhap vaophan tu mang:");
     for(int i=0;i<n;i++ ){
         for(int j=0;j<m;j++){
             System.out.print("a["+i+"]["+j+"]=");
             a[i][j]=sc.nextInt();
         }
     }
     xuatmang xm=new xuatmang();
     xm.start();
     tinhtong tt=new tinhtong();
     tt.start();
     tongchan tc=new tongchan();
     tc.start();
     chiah5 c5=new chiah5();
     c5.start();
}
}

