
package ktmtk19;
import java.util.Scanner;
public class tonghieu {
public static void main(String args[]){
int a,b,tong=0,hieu=0,tich=0;
float thuong=0;
Scanner nhap=new Scanner(System.in);
System.out.print("nhap a="); a=nhap.nextInt();
System.out.print("nhap b="); b=nhap.nextInt();    tong=a+b;
    hieu=a-b;
    tich=a*b;
    thuong=(float)a/b;
    System.out.println(" tong="+tong+" hieu="+hieu+ " tich="+tich+ " thuong="+thuong);
}
}
