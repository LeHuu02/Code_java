package chuoi;
import java.lang.*;
import java.util.Scanner;  
class chuoi2{
   private String str;
//nhap chuoi
public void nhap(){
Scanner sc=new Scanner(System.in);
System.out.print("nhap vao 1 chuoi: ");
str=sc.nextLine();
}
//xuat chuoi
public void xuat(){
System.out.println(" chuoi vua nhap la: "+str);
}
//tach ho
public void tachho(){
int j=0;
str.trim();
for(int i=0;i<str.length()-1;i++){
if(str.charAt(i)==' '){j=i;break;}
}
System.out.println(str.substring(0,j));  
}
// xoa khoang trang trong chuoi
public void chuanhoa(){
    System.out.println("Chuoi sau chuan hoa:"+str.replaceAll("\\s+", " ").trim());

}

}
public class baitapLMS {
    public static void main(String args[]){
    chuoi2 x=new chuoi2();
x.nhap();
x.xuat();
        System.out.print("Ho trong chuoi: ");x.tachho();
        x.chuanhoa();
        
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
         n = sc.nextInt();
         sc.nextLine();
        // khởi tạo mảng arr
        String[] arr = new String[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i <n; i++) {
            System.out.printf("chuoi[%d]=",i+1);          
            arr[i]=sc.nextLine(); 
            
        }
        System.out.print("Mang vua nhap la:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        //sap xep 
     String temp;
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].compareTo(arr[j])>0)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("\nChuỗi sau khi sắp xếp là:");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

}       
    
    }

