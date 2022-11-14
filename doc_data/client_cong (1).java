package sever;
import java.io.*;
import java.net.*;
public class client_cong {
     public static void main(String args[]){
        try{
        Socket s=new Socket("localhost",10);
        DataInputStream is=new DataInputStream(s.getInputStream());
        DataOutputStream os=new DataOutputStream(s.getOutputStream());
        try{
            DataInputStream nhap=new DataInputStream(System.in);
            System.out.print("Nhap vao so a: ");
            String str1=nhap.readLine();
            os.writeUTF(str1);
            os.flush();
            System.out.print("Nhap vao so b: ");
            String str2=nhap.readLine();
            os.writeUTF(str2);
            os.flush();
            String nhan=is.readUTF();
            System.out.println("Ket qua la: "+nhan);
             }catch(IOException ie){
            System.out.println("Loi ket noi: "+ie);
            }
        }catch(IOException e){
            System.out.println("Loi: "+e);
        }
    }
}

