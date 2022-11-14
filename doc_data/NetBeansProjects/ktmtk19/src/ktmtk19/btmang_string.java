
package ktmtk19;
import java.lang.*;
import java.util.Scanner;

 class mangstring{
      private String str;
   
    public void nhapxauu(){
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap vao 1 xau: ");
        str=sc.nextLine();
    }

public void inxauu(){
System.out.println("xau vua nhap la: "+str);
}
public void nhapmang(String str[], int n){
       System.out.println("nhap vao ten sinh vien trong mang: ");
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<n;i++){
           System.out.println("sinh vien thu ["+ i +"] la : ");
           str[i]=sc.nextLine();
       }
   }
  public void xuatmang(String str[], int n){
       System.out.println("sinh vien vua nhap la: ");
        for(int i=0;i<n;i++){
           System.out.println(str[i] + " ");
        }
  }
  public void sapxep(String str[]){
      String temp;
      for(int i=0;i<str.length;i++){
          for(int j=i+1;j<str.length;j++){
              if(str[i].compareTo(str[j])>0){
                  temp=str[i];
                  str[i]=str[j];
                  str[j]=temp;
              }
          }
          
      }
      System.out.print("cac chuoi sau khi sap xep la: ");
      for(int i=0;i<str.length;i++){
          System.out.print(str[i] +", ");
          
      }
      }
  public void tachhoo(){
     int j=0;
     String s=str.trim();
     for(int i=0;i<s.length()-1;i++){
         if(s.charAt(i)==' '){j=i;break;}
     }
     System.out.println(s.substring(0,j));
 } 
public void xoaktrangg(){
    str=str.replaceAll(" ", "");
    System.out.println(""+str);      
}  
    

 }
    
       
       
       
public class btmang_string {
  public static void main(String[] args){
    mangstring x =new mangstring();
    x.nhapxauu();
    x.inxauu();
    System.out.print("ho trong chuoi la: ");
    x.tachhoo();
    System.out.print("sau khi xoa khoang trang la: ");
    x.xoaktrangg();
       int n;
       Scanner sc=new Scanner(System.in);
       System.out.print("nhap vao so luong sinh vien cua mang n= ");
       n=sc.nextInt();
       String[] a=new String[n];
       x.nhapmang(a,n);
       x.xuatmang(a,n);
       x.sapxep(a);
    }
 
}

   
