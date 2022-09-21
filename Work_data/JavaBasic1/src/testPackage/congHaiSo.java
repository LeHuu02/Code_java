/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*power by le minh huu 8/9/2022*/
package testPackage;

import java.util.Scanner;

public class congHaiSo {
    
    public static void main(String[] args) {
        //long a = 100000000000L,b = 100000000000L,sum;
        long a,b,sum;
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap hai so a b: ");
        a = nhap.nextLong();
        b = nhap.nextLong();
        sum = a + b;
        System.out.println("tong hai so a b la: " +sum);
       
    }
}
