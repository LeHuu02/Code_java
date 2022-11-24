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
public class hinhtron {
    static final float pi=3.14f;
        public static void main(String args[]){
int r;
float p=0, s=0;
Scanner nhap=new Scanner(System.in);
    System.out.println("nhap ban kinh r=");
    r=nhap.nextInt();
    p=2*pi*r;
    s=pi*r*r;
    System.out.println("chuvi="+p+"dien tich="+s);
        
    
        }  
}
