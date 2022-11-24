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
public class clien_hoa {
     public static void main(String[] args) {
    try{
        Socket s=new Socket("127.0.0.1",10);
         DataInputStream is=new DataInputStream(s.getInputStream());
             DataOutputStream os=new DataOutputStream(s.getOutputStream());

             try{
        DataInputStream nhap=new  DataInputStream(System.in);
        System.out.println("nhap vao  mot chuoi: ");
        String str=nhap.readLine();
        os.writeUTF(str);
        os.flush();
        String str1=is.readUTF();
        System.out.println("chuoi saukhi chuyen sang chu hoa: "+str1);
             
    }catch(IOException ie){
        System.out.println("loi: "+ie);
        
    }
              os.close();
             is.close();
             s.close();
              }catch(IOException e){
        System.out.println("loi: "+e);
              }
            
}

     }
