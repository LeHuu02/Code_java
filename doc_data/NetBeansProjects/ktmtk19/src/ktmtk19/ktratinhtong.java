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
public class ktratinhtong {
   	  public static void main(String[] args) {
        int  sum = 0,n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số n: ");
     n=sc.nextInt();
        
        for(int i = 1; i <=n; i++)
        {
          System.out.println("Nhập vào số thu: "+i);
          i=sc.nextInt();
                  
             sum = sum + i;
            
        }
        System.out.println("Tổng các số tự nhiên  là: "+sum);

        System.out.println("------------------------------------");
        
    }
}

