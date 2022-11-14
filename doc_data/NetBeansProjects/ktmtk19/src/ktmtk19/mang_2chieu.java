/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktmtk19;
import java.util.Scanner;
class mang2{
    public void nhapmang(int A[][],int n,int m){
        System.out.println("nhap vao cac phan tu cua mang:");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("a["+i+"]["+j+"]=");
                A[i][j]=sc.nextInt();
            }
        }
    }
    public void xuatmang(int A[][],int n,int m){
       System.out.println("mang vua nhap la:");
       for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
    }
}
    public void maxhang(int A[][],int n,int m){
        int maxh;
        for(int i=0;i<n;i++){
            maxh=A[i][0];
            for(int j=0;j<m;j++){
                if(maxh<A[i][j])maxh=A[i][j];
            }
            System.out.println("phan tu max hang "+i+" = "+maxh);
        }
    }
    
      public void tongcot(int A[][],int n,int m){
         int tongc;
        for(int j=0;j<m;j++){
            tongc=0;
            for(int i=0;i<n;i++){
                tongc=tongc+A[i][j];
            }
            System.out.println("tong cot "+j+" = "+tongc);
     }
}
}
public class mang_2chieu {
    public static void main(String args[]){
        int n,m;
        int A[][]=new int[10][10];
        Scanner sc=new Scanner(System.in);
        System.out.println("mang vua nhap so hang n=:");n=sc.nextInt();
        System.out.println("mang vua nhap so cot  m=:");m=sc.nextInt();
        mang2 m2=new mang2();
        m2.nhapmang(A,n,m);
        m2.xuatmang(A,n,m);
        m2.maxhang(A, n, m);
         // m2.maxcot(A, n, m);
          m2.tongcot(A,n,m);
    }
}
    

