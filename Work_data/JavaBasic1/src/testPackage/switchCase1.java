/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testPackage;

import java.util.Scanner;

public class switchCase1 {
    public static void main(String[] args) {
        int number, ngay;
        Scanner nhapso = new Scanner(System.in);
        
        /*nhap so */
        System.out.println("nhap gia tri");
        number = nhapso.nextInt();
        switch(number){
            case 1: 
                System.out.println("so Mot");
            case 2: 
                System.out.println("so Hai");
            case 3: 
                System.out.println("so Ba");
            default: 
                System.out.println("ERROR 404!");
        }
        
        /*ngay trong tuan*/
        System.out.println("nhap ngay trong tuan - tu thu 2 den 8: ");
        ngay = nhapso.nextInt();
        switch(ngay){
            case 2:
                System.out.println("thu 2");
                break;
            case 3:
                System.out.println("thu 3");
                break;
            case 4:
                System.out.println("thu 4");
                break;
            case 5:
                System.out.println("thu 5");
                break;
            case 6:
                System.out.println("thu 6");
                break;
            case 7:
                System.out.println("thu 7");
                break;
            case 8:
                System.out.println("thu 8");
                break;
            default:
                System.out.println("CHON DUNG NGAY DI - \n BI LAM SAO DAY - LAM GI CO NGAY NAY");
                break;
        }
    }
}
