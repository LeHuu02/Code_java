package sever;
import java.io.*;
import java.net.*;
public class server_cong {
    public static void main(String args[]){
        try{
            ServerSocket ss=new ServerSocket(10);
            System.out.println("Server dang lang nghe....");
            try{
                Socket s=ss.accept();
                System.out.println("Client da ket noi");
                DataInputStream is=new DataInputStream(s.getInputStream());
                DataOutputStream os=new DataOutputStream(s.getOutputStream());   
                String str1=is.readUTF();
                String str2=is.readUTF();
                System.out.println("Client gui: "+str1);
                int a=Integer.parseInt(str1);
                System.out.println("Client gui: "+str2);
                int b=Integer.parseInt(str2);
                int tong;
                tong = a+b;
                System.out.println("Tong = "+tong);
                os.writeUTF(String.valueOf(tong));
                os.flush();
                }catch(IOException ie){
                System.out.println("Loi1 - client da huy ket noi");
            }
        }catch(IOException e){
            System.out.println("Loi2+ "+e);
        }
    }
}

