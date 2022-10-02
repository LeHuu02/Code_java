package baitap1;
import java.io.*;
public class cong_stream {
    public static void main(String args[]) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Nhap vao 1 chuoi: ");
    String str=br.readLine();
    System.out.println("Chuoi vua nhap la: "+str);
    int a,b;
    System.out.println("Nhap a=");
    a=Integer.parseInt(br.readLine());
    System.out.println("Nhap b=");
    b=Integer.parseInt(br.readLine());
    System.out.println("Tong = "+(a+b));
    }
}
