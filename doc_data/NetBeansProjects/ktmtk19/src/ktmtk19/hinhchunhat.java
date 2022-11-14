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
public class hinhchunhat {
    public static int dai;
    public static int rong;
    public static void nhaptt(){
        Scanner nhap=new Scanner(System.in);
        System.out.print("nhap chieu dai="); dai=nhap.nextInt();
        System.out.print("nhap chieu rong=");rong=nhap.nextInt();
        
    }
    public static void hientt(){
        System.out.println("chieu dai"+dai+"chieu rong"+rong);
        
    }
    public static int  chuvi(){
        return(dai+rong)*2;
    }
    public static int dientich(){
        return dai*rong;
    }
    
    
}
