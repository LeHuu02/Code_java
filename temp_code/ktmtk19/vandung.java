/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktmtk19;
import java.util.Scanner;

public class vandung{
    public static void main(String args[]){
        int a,b;
        Scanner nhap=new Scanner (System.in);
        System.out.print("nhap a= ");
        a=nhap.nextInt();
        System.out.print("nhap b= ");
        b=nhap.nextInt();
        lop t=new lop();
        System.out.printf("tong ="+t.tong(a,b));
        int hieu=t.hieu(a,b);
        System.out.println("hieu="+hieu);
    }

    
}
