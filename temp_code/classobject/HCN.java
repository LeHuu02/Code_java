/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
power by le minh huu 23/9/2022
ham tinh chu vi dien tich hcn
*/
package classobject;

import java.util.Scanner;

public class HCN {
    /*xay dung thuoc tinh cua lop kieu public*/
    public static int dai;
    public static int rong;
    
    /*function input data*/
    public static void nhap()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("chieu dai:");
        dai = input.nextInt();
        System.out.println("chieu rong:");
        rong = input.nextInt();
    }
    
    /*function output data*/
    public static void xuat()
    {
        System.out.println("dai: "+dai+"    rong: "+rong);        
    }
    
    /*function tinh chu vi hcn*/
    public static int chuvi()
    {
        return (dai+rong)*2;
    }
    
    /*function tinh dien tich hcn*/
    public static int dientich()
    {
        return (dai*rong);
    }
    
}
