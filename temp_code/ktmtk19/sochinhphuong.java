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
public class sochinhphuong {
    public static boolean chphuong(int n){
    
          if((float)Math.sqrt(n) - (int)Math.sqrt(n) == 0)
            {
//                System.out.print(n+"   ");
                return true;
            }
            return false;
    }
      
     public static void main(String args[]){
        int n;
        Scanner nhap=new Scanner(System.in);
        do{
            System.out.print("Nhap n");
            n=nhap.nextInt();
        }while(n<2 || n>100);
        //kiem tra so chinh phuong
        int demuoc=0;
        for(int i=2;i<n;i++){
            if(n%i==1)demuoc++;
        }
        if(demuoc==1){
            System.out.println(n+"la so chinh phuong");
        }else{
                System.out.println(n+"khong la so chinh phuong");
        }
        //in ra chinh phương
        System.out.print("cac so chinh phuong tu 1 den "+n+"la: ");
        for(int i=0;i<n;i++){
            if(chphuong(i))System.out.print(i+" ");
            
        }
        //inran so chinh phuong
        System.out.println("");
        int dem=1,i=1;
        System.out.print("danh sach "+n+"so chinh phuong dau tien; ");
        while(dem<=n){
            if(chphuong(i)){
                System.out.print(i+" ");
                dem++;
            }
            i++;
            }
        }
        
            }

    

