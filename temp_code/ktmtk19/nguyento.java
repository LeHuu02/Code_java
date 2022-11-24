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
public class nguyento {
    public static boolean ngto(int n){
        if(n<2) return false;
        for(int i=2;i<n;i++){
            if(n%i==0)return false;
        }
        return true;
            
        }
    
            public static void main(String args[]){
        int n;
        Scanner nhap=new Scanner(System.in);
        do{
            System.out.print("Nhap n");
            n=nhap.nextInt();
        }while(n<2 || n>100);
        //kiem tra so nguyen to
        int demuoc=0;
        for(int i=2;i<n;i++){
            if(n%i==0)demuoc++;
        }
        if(demuoc==0){
            System.out.println(n+"la so nguyen to");
        }else{
                System.out.println(n+"khong nguen to");
        }
        //in ra songuyen  to
        System.out.print("cac so nguyen to tu1den "+n+"la: ");
        for(int i=0;i<n;i++){
            if(ngto(i))System.out.print(i+" ");
            
        }
        //inran so ngueyn to
        System.out.println("");
        int dem=1,i=1;
        System.out.print("danh sach "+n+"so nguyen to dau tien; ");
        while(dem<=n){
            if(ngto(i)){
                System.out.print(i+" ");
                dem++;
            }
            i++;
            }
        }
        
            }
    

