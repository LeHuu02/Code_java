/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testPackage;

import java.util.Scanner;

public class inoutString {
    public static void main(String[] args) {
        String str;
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap vao mot chuoi: ");
        str = nhap.nextLine();
            System.out.println("chuoi vua nhap la: " + str);
    }
}
