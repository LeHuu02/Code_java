package baitap1;
import java.io.*;
public class VD_output {
    public static void main(String args[]) {
    OutputStream os=System.out;
    try{
    String str="Ky thuat may tinh";
    byte b[]=str.getBytes();
    os.write(b);
    }catch(IOException e){
     System.out.println("Loi:"+e);
    }
    }
}
