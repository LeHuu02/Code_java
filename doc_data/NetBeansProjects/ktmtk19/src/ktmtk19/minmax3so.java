/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktmtk19;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class minmax3so {
    public static void main(String args[]){
     int a,b,c;
Scanner nhap=new Scanner(System.in);
System.out.print("nhap a="); a=nhap.nextInt();
System.out.print("nhap b="); b=nhap.nextInt(); 
 System.out.print("nhap c="); c=nhap.nextInt();
 //tim so lon nhat
 int max=a;
 if(max<b)
     max=b;
 
 if(max<c)
     max=c;
 
 
System.out.println(" so lon nhat trong 3 so"+max);   
    }
}

