/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testPackage;

import java.util.Scanner;

public class ptBacHai {
    public static void main(String[] args) {
        
        float a,b,c, denta, x1,x2;
        Scanner nhapso = new Scanner(System.in);
        System.out.println("nhap ba so a b c: ");
        
        /*nhap ba so a b c*/
        a = nhapso.nextFloat();
        b = nhapso.nextFloat();
        c = nhapso.nextFloat();
        
        /*tinh den ta*/
        denta = b*b - 4*a*c;
        
        if(denta  < 0){
            System.out.println("phuong trinh da cho vo nghiem! :)))");            
        }
        else if(denta == 0){
            x1 = -(b/(2*a));
            System.out.println("pt da cho co nghiem kep x1 = x2 = "+x1);
        }else{
            x1 = (float)(-b + Math.sqrt(denta))/(2*a);
            x2 = (float)(-b - Math.sqrt(denta))/(2*a);
            System.out.println("pt co 2 nghiem phan biet: x1 = " +x1+"\tx2 = "+x2);
        }
    }
}
