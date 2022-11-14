/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktmtk19;
import java.io.*;
import java.net.*;
/**
 *
 * @author Admin
 */
public class client_cong {
  
     public static void main(String args[]){
    try{
    Socket s=new Socket("127.0.0.1",10);// localhost
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


