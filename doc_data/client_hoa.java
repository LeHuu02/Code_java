
package sever;
import java.io.*;
import java.net.*;
public class client_hoa {
    public static void main(String args[]){
        try{
        Socket s=new Socket("localhost",10);
        DataInputStream is=new DataInputStream(s.getInputStream());
        DataOutputStream os=new DataOutputStream(s.getOutputStream());
        try{
            DataInputStream nhap=new DataInputStream(System.in);
            System.out.println("Nhap vao 1 chuoi: ");
            String str=nhap.readLine();
            os.writeUTF(str);
            os.flush();
            String str1=is.readUTF();
            System.out.println("Chuoi sau khi doi sang chu hoa: "+str1);
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
