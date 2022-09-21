/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testPackage;

import java.util.Scanner;

public class ifHoiCham {
    
    public static void main(String[] args) {
        int a,b;
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap vao hai so a b");
        a = nhap.nextInt();
        b = nhap.nextInt();
        
        int max = 0;
        /*so sanh neu a> b thi thuc hien in a con khong thi in b*/
        max = (a>b)?a:b;
        System.out.println("so lon nhat la: "+max);
    }
    
}
