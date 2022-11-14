
package sever;
import java.io.*;
import java.net.*;
public class client {
    public static void main(String args[]){
         try{
           Socket s=new Socket("127.0.0.1",100);//localhost
           DataInputStream is = new DataInputStream(s.getInputStream());
           DataOutputStream os = new DataOutputStream(s.getOutputStream());
           while (true){
           try{
               System.out.println("Client gui: ");
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               String st=br.readLine();
               if(st.equalsIgnoreCase("exit"))break;
               os.writeUTF(st);
               
               os.flush();
               String nhan=is.readUTF();
               System.out.println("server gui: "+nhan);
           }catch(IOException e1){
               System.out.println("Server da huy ket noi"+e1);
           }
           }
           os.close();
           is.close();
           s.close();
           
       }catch(IOException e){
           System.out.println("Loi: "+e);
       }
        /*
        try{
        Socket s=new Socket("127.0.0.1",100);//local host
        DataInputStream is=new DataInputStream(s.getInputStream());
        DataOutputStream os=new DataOutputStream(s.getOutputStream());
        while(true){
        try{
            
            System.out.print("Client gui: ");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String st=br.readLine();
            if(st.equalsIgnoreCase("exit"))break;
            os.writeUTF(st);
            os.flush();
            String nhan=is.readUTF();
            System.out.println("Server gui: "+nhan);
            }
        }catch(IOException e1){
            System.out.println("Server da huy ket noi"+ e1);
            
        }
        
        os.close();
        is.close();
        s.close();
        
        }catch(IOException e){
            System.out.println("Loi "+e);
        }*/
    }
}
