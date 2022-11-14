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
public class server_client {
    public static void main(String srgs[]){
        try{
            Socket s=new Socket("127.0.0.1",100);//localhost
            DataInputStream is=new DataInputStream(s.getInputStream());
              DataOutputStream os=new DataOutputStream(s.getOutputStream());
              
            try{
                while(true){
                System.out.println("client gui: ");
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                String st=br.readLine();
                if(st.equalsIgnoreCase("exit"))break;
                os.writeUTF(st);
                os.flush();
                String nhan=is.readUTF();
                System.out.println("server gui: "+nhan);
               
                }
              }catch(IOException e1){
            System.out.println("server da huy ket noi: "+e1);
                      }   
              
            os.close();
            is.close();
            s.close();
                    
        }catch(IOException e){
            System.out.println("loi: "+e);
    
                    }
    }
    
}