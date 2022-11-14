/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktmtk19;

import java.util.Scanner;

   
        
public class swichcase {

    public static void main(String args[]){
        int n;
        Scanner nhap =new Scanner(System.in);
        System.out.print("nhap vao mot so");
        n=nhap.nextInt();
        switch(n){
     case 1: {System.out.println("mot");break;}
     case 2: {System.out.println("hai");break;}
     case 3: {System.out.println("ba");break;}
     default:{System.out.println("hay nhap so khac");break;}
    }
    }
}
