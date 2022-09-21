/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
power by le minh huu 15/9/2022
bai tap tong hop so nt, so hoan hao so chinh phuong so fibonacii
*/

package testPackage;

import java.util.Scanner;

public class btTonghop {
    /*function main*/
    public static void main(String[] args) {
        int number;
        Scanner nhapso = new Scanner(System.in);
        
        /*nhap so tu 2 den 100*/
        do{
            System.out.println("nhap so: ");
            number = nhapso.nextInt();
        }while(number < 0 || number > 10000000);
//        ktSNT(number);
//        inSNT(number);
//        in_n_stn(number);
//        ktSoHoanHao(number);
//        inSoHoanHao(number);
//          in_n_soHoanHao(number);
//          ktSoChinhPhuong(number);
//          inSoChinhPhuong(number);
          inSoFibo(number);
    }
    
    /*=====================SO NGUYEN TO==================*/
    /*
    snt la so chi chi het cho 1 va chinh no
    dung for duyen tu dau so thu 2 den < n
    neu so nao chia het thi bien dem ++
    */
    public static boolean ktSNT(int n){
        int i, demso = 0;
        
        if(n <= 1){
            return false;
        }
        for(i = 2; i < n; i++)
        {
            if(n % i == 0)
            {
                demso++;
            }
        }
        if(demso == 0){
            return true;
        }
        return false;
//        if(demso == 0)
//        {
//            System.out.println("so: "+n+" la so nguyen to");
//        }else{
//            System.out.println("so: "+n+" khong la so nguyen to");
//        }
    }
    
    /*in lan luot  so nguyen to <= n*/
    public static void inSNT(int n){
         int j, i, demso;
         
         /*duyet lan luot tu 2 den gia tri n*/
        for(i = 2; i <= n; i++)
        {
            /*kiem tra tung so xem co phai snt khong*/
            demso = 0;
            for(j = 2; j < i; j++){
                /*neu i chia het cho j thi tang bien dem len 1*/
                if(i % j == 0)
                {   
                    demso++;
                }
            }
            if(demso == 0){
                System.out.print(i+"    ");
            }
        } 
    }
    
    /*in n so nguyen to*/
    public static void in_n_stn(int n){
        int dem = 0, i = 0;
        /*in n snt dau tien, KHONG phai in snt tu 1 den n*/
        while(dem < n){
            /*goi ham ktra snt*/
            if(ktSNT(i) == true){
                System.out.print(i);            
                dem++;
            }
            i++;
    
        }
    }
    
    /*=====================SO HOAN HAO===================*/
    /*
    kiem tra so hoan hao
    so hoan hao la so co tong cac uoc bang chinh no
    */
    public static boolean ktSoHoanHao(int n){
        int i, tonguoc = 0;
        
        if(n < 1){
            return false;
        }
        for(i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                tonguoc = tonguoc + i;
//                System.out.print(i+ "  ");
            }
        }
//        System.out.print(n+ "  ");
        if(tonguoc == n){
//            System.out.print(n+ "  ");
            return true;
        }
        return false;
    }
    
    /*in so hoan hao den gia tri thu n*/
    public static void inSoHoanHao(int n){
         int i;
         
         /*duyet lan luot tu 1 den gia tri n*/
        for(i = 1; i <= n; i++)
        {
           if(ktSoHoanHao(i) == true){
               System.out.print(i+"   ");
           }
        } 
    }
    
        /*in n so hoan hao*/
    public static void in_n_soHoanHao(int n){
        int dem = 0, i = 0;
        
        while(dem < n){
            /*goi ham ktra shh*/
            if(ktSoHoanHao(i) == true){
                System.out.print(i+ "   ");            
                dem++;
            }
            i++;
    
        }
    }
    
    /*=====================SO CHINH PHUONG===================*/
    
    /*
    so chinh phuong la so gia tri binh phuong cua mot so: 
    1^2 = 1     2^2 = 4     3^2 = 9 ==> 1,4,9 la so chinh phuong
    cach lam can bac hai (float) cua n - can bac hai (int) cua n == 0
    => so chinh phuong
    */
    public static boolean ktSoChinhPhuong(int n){
    
            if((float)Math.sqrt(n) - (int)Math.sqrt(n) == 0)
            {
//                System.out.print(n+"   ");
                return true;
            }
            return false;
    }
    
    /*in so chinh phuong den gia tri thu n*/
    public static void inSoChinhPhuong(int n){
         int i;
         
         /*duyet lan luot tu 1 den gia tri n*/
        for(i = 1; i <= n; i++)
        {
           if(ktSoChinhPhuong(i) == true){
               System.out.print(i+"   ");
           }
        } 
    }
    
        /*in n so chinh phuong*/
    public static void in_n_soChinhPhuong(int n){
        int dem = 0, i = 0;
        
        while(dem < n){
            /*goi ham ktra shh*/
            if(ktSoChinhPhuong(i) == true){
                System.out.print(i+ "   ");            
                dem++;
            }
            i++;
    
        }
    }
    
    
    /*=====================SO FIBONACCI===================*/
    
    /*
    so fibonacci la so fibo = fibo(n - 1) + fibo(n - 2)
    dung de quy hoac poling
    tinh so fibonacci thu n
    */
    
    /*in so fibo tu 1 den n*/
    public static void inSoFibo(int n){
        int i, j, sofibo = 1;
        int sotruoc1, sotruoc2;
        
        System.out.print(" so fibo lan luot tu 0 den "+n+" la: \n");
        
        if(n == 0 || n == 1) 
        {
            System.out.print( "1    1   ");
            sofibo = 1;
        }
        /*duyet n so fibonacci*/
        for(i = 1; i <= n; i++){
            sotruoc1 = 1;
            sotruoc2 = 1;
            
            /*tinh so fibonacci*/
            for(j = 0; j < i - 2; j++)
            {
                sofibo = sotruoc1 + sotruoc2;
                sotruoc2 = sotruoc1;
                sotruoc1 = sofibo;
            }
            System.out.print(sofibo+ "      ");
            /*in 10 so fibo roi xuong dong*/
            if(i == 10)
            {
            System.out.println("");
            }
        }
        
    }
    
}
