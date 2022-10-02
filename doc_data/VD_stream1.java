
package baitap1;
import java.io.*;
public class VD_stream1 {
    public static void main(String args[]) {
        System.out.println("Nhap ky tu vao tu ban phim: ");
        InputStream is=System.in;
        try{
            int n=is.read();
            System.out.println("Ky tu vau nhap vao la: "+(char)n);
        }catch (IOException e){
            System.out.println("Loi: "+e);
        }
    }
}
