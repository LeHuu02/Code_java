/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktmtk19;
  import java.io.*;
import java.net.*;


public class server_nguyento {
  


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
          int n=Integer.parseInt(str);
          int  dem=0;
          String str1=" ";
          for(int  i=2;i<n;i++){
              if(n%i==0)dem++;
          }
          if(dem==0){
              System.out.println(" la so nguyen to");
             str1="la nguen to";
                
            }else{
                 System.out.println("0 phai la so nguyen to");
            str1=" 0 la nguen to";
                
          }
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



