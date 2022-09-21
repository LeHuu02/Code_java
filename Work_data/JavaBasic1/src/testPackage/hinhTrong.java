/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testPackage;

import java.util.Scanner;

public class hinhTrong {
    static final float pi = 3.14f;
//    float a = 0f, p = 0f, s = 0f;
//    int r;
    
    public static void main(String[] args) {
        float a = 0f, p = 0f, s = 0f;
        float r;
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap ban kinh r: ");
        r = nhap.nextFloat();
        p = 2*pi*r;
        s = pi*r*r;
        System.out.println("chu vi: " +p+ "\tdien tich: "+s);
    }
}