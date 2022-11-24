
package ktmtk19;
import java.lang.Thread;
import java.util.Scanner;
class tinhTong extends Thread{
int tong=0;
public void run(){
for(int i=0;i<my_thread.n;i++){
tong=tong+my_thread.a[i];
}
    System.out.println("Tong mang = "+tong);
}
}
class timMax extends Thread{
int max=my_thread.a[0];
public void run(){
for(int i=0;i<my_thread.n;i++){
if(my_thread.a[i]>max)max=my_thread.a[i];
}
    System.out.println("Max = "+max);
}
}

public class my_thread {
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
    tinhTong tt=new tinhTong();
    tt.start();
    timMax m=new timMax();
    m.start();
}
}

