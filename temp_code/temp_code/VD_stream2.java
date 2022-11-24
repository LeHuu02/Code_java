package baitap1;
import java.io.*;
public class VD_stream2 {
    public static void main(String args[]) {
        System.out.println("Nhap vao 1 mang ky tu: ");
        InputStream is=System.in;
        try{
          byte b[]=new byte[10];
          int n=is.read(b);
          String str=new String(b);
            System.out.println("Chuoi vua nhap la:"+str);
            System.out.println("So ky tu doc duoc:"+n);
        }catch(IOException e){
            System.out.println("Loi: "+e);
        }
    }
}
