
package ktmtk19;

import java.util.Scanner;
public class tamgiac {
public static void main(String args[]){
int a,b,c;
float p=0; 
double s=0;
Scanner nhap=new Scanner(System.in);
System.out.print("nhap a="); a=nhap.nextInt();
System.out.print("nhap b="); b=nhap.nextInt();
System.out.print("nhap c="); c=nhap.nextInt();
p=a+b+c/2;
s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
System.out.println("chuvi="+(p*2)+"dien tich="+s);
}
}

