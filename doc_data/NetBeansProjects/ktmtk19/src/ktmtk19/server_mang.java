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
public class server_mang {
      public static void main(String[] args) {
          int b[]=new int [10];
    try{
        ServerSocket ss=new ServerSocket(10);
            System.out.println("ser ver dang lang nghe");
            try{
            Socket s=ss.accept();
            System.out.println("client da ket noi voi server");
            DataInputStream is=new DataInputStream(s.getInputStream());
             DataOutputStream os=new DataOutputStream(s.getOutputStream());
             String str=is.readUTF();
             System.out.println("sophan tu mang: "+str);
           int n=Integer.parseInt(str);
           for(int i=0;i<n;i++){
              b[i]=Integer.parseInt(is.readUTF());  
              
            }
           System.out.println("mang nhan duoc la: ");
           for(int i=0;i<n;i++){
               System.out.println(b[i]+" ");
               
           }
           int tong=0;
           for(int i=0;i<n;i++){
               tong=tong+b[i];///thay doi thuat toantai day
           }
           System.out.println("tong="+tong);
           os.writeUTF(String.valueOf(tong));
           os.flush();
        }catch(IOException ie){
            System.out.println("loi _clien da huy  ket noi: "+ie);
            
        }
        }catch(IOException e){
                System.out.println("loi2: "+e);
                }
    
    
    }
}



