
package sever;
import java.io.*;
import java.net.*;
public class client_nguyento {
    public static void main(String args[]){
        try{
        Socket s=new Socket("localhost",10);//127.0.0.1
        DataInputStream is=new DataInputStream(s.getInputStream());
        DataOutputStream os=new DataOutputStream(s.getOutputStream());
        try{
            DataInputStream nhap=new DataInputStream(System.in);
            System.out.println("Nhap vao 1 so: ");
            String str=nhap.readLine();
            os.writeUTF(str);
            os.flush();
            String nhan=is.readUTF();
            System.out.println("Ket qua la: "+nhan);
             }catch(IOException ie){
            System.out.println("Loi ket noi: "+ie);
        }
        os.close();
        is.close();
        s.close();
        }catch(IOException e){
            System.out.println("Loi: "+e);
        }
    }
}
