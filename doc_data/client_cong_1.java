package sever;
import java.io.*;
import java.net.*;
public class client_cong_1 {
    public static void main(String args[]){
    try{
    Socket s=new Socket("localhost",10);// localhost
    DataInputStream is =new DataInputStream(s.getInputStream());
    DataOutputStream os=new DataOutputStream(s.getOutputStream());
    try{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Nhap a: ");
        String a=br.readLine();
        os.writeUTF(a); 
        os.flush();
        String nhan=is.readUTF();
        System.out.println("Tong= "+nhan);
    }catch(IOException e1){
        System.out.println("\nServer da huy het noi"+ e1);
    }
    os.close();
    is.close();
    s.close();
    }catch(IOException e){
        System.out.println("Loi: "+e);
    }
    }
}

