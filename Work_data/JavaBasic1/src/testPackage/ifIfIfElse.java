/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testPackage;

import java.util.Scanner;

public class ifIfIfElse {
    public static void main(String[] args) {
        int a,b,c;
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap ba so a b c: ");
        
        /*nhap 3 so a b c*/
    a = nhap.nextInt();
    b = nhap.nextInt();
    c = nhap.nextInt();
        
        /*kiem tra max*/
        int max = a;
        
        if(c == b){
            if(max < c){
                max = c;
            }
        }
        if(c > b){
            if(max < c){
                max = c;
            }
        }
        if(b > c){
            if(max < b){
                max = b;
            }
        }
        
        /*
        max = a;
        if(max < b) max = b;
        if(max < c) max = c;
        */
        System.out.println("so lon nhat la: " +max);
    }   
}
