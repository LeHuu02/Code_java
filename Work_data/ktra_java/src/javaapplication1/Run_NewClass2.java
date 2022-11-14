/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class Run_NewClass2 {
    public static void main(String[] args) {
        int n;
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap vao so luong nhan vien: ");
        n = nhap.nextInt();
        
        NewClass2 dianhac = new NewClass2();
        NewClass2 cd[] = new NewClass2[10];
        
        System.out.println("nhap thong tin cd:");
        dianhac.nhaptt(cd, n);
        System.out.println("in thong tin cd: ");
//        dianhac.inthongtin(cd, n);
//        dianhac.tongbaihat(cd, n);
//          dianhac.hienthi2(cd, n);
        try {
            dianhac.hienthi2(cd, n);
            dianhac.tongbaihat(cd, n);
//            dianhac.timcasi(cd, n);
            dianhac.timtheoma(cd, n);
        } catch (Exception e) {
            System.out.println("CHUC MUNG BAN NHAN DUOC BUG TO DUNG\nBUG-BUG-BUG");
        }
    }
}
