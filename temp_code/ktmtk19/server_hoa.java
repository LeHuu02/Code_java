/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktmtk19;
import java.io.*;
import java.net.*;

public class server_hoa {
    public static void main(String[] args) {
    try{
        ServerSocket ss=new ServerSocket(10);
            System.out.println("ser ver dang lang nghe");
            try{
            Socket s=ss.accept();
            System.out.println("client da ket noi voi server");
            DataInputStream is=new DataInputStream(s.getInputStream());
             DataOutputStream os=new DataOutputStream(s.getOutputStream());
             String str=is.readUTF();
             System.out.println("clien gui: "+str);
             String  str1=str.toUpperCase();
             System.out.println("chuoi chu hoa: "+str1);
             os.writeUTF(str1);
             os.flush();
        }catch(IOException ie){
            System.out.println("loi _clien da huy  ket noi: "+ie);
            
        }
        }catch(IOException e){
                System.out.println("loi2: "+e);
                }
    
    
    }
}

