
package sever;
import java.io.*;
import java.net.*;
public class server_hoa {
    public static void main(String args[]){
        try{
            ServerSocket ss=new ServerSocket(10);
            System.out.println("Server dang lang nghe....");
            try{
                Socket s=ss.accept();
                System.out.println("Client da ket noi");
                DataInputStream is=new DataInputStream(s.getInputStream());
                DataOutputStream os=new DataOutputStream(s.getOutputStream());   
                String str=is.readUTF();
                System.out.println("Client gui: "+str);
                String str1=str.toUpperCase();
                System.out.println("Chuoi chu hoa: "+str1);
                os.writeUTF(str1);
                os.flush();
            }catch(IOException ie){
                System.out.println("Loi1 - client da huy ket noi");
            }
        }catch(IOException e){
            System.out.println("Loi2+ "+e);
        }
    }
}
