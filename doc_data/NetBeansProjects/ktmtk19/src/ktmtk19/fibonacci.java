
package ktmtk19;

import java.util.Scanner;
public class fibonacci {
    
public static int fibo(int n){
    if(n==0||n==1)return 1;
    return(fibo(n-1)+fibo(n-2));
}
    public static void main(String args[]){
        int n;
        Scanner nhap=new Scanner(System.in);
        System.out.print("Nhapn=");n=nhap.nextInt();
        System.out.print("cac so fibonalcci la ");
        for(int i=0;i<=n;i++){
            System.out.print(fibo(i)+" ");
        }
    }
}
