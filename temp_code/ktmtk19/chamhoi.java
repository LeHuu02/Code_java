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
public class chamhoi {
    public static void main(String args[]){
int a,b;
Scanner nhap=new Scanner(System.in);
System.out.print("nhap a="); a=nhap.nextInt();
System.out.print("nhap b="); b=nhap.nextInt();    
 
 int max=0;
 max=(a>b)?a:b;
 
System.out.println(" Max="+max);
}
}
    

