
package ktmtk19;

import java.io.*;
import java.net.*;
public class Server {
    public static void main(String[] args){
        try{
            ServerSocket ss=new ServerSocket(100);
            System.out.println("Server dang lang nghe ...");
            try{
                Socket s=ss.accept();
                System.out.println("da ket noi voi client");
                DataInputStream is =new DataInputStream(s.getInputStream());
                DataOutputStream os=new DataOutputStream(s.getOutputStream());
                while(true){
                String nhan=is.readUTF();
                System.out.println("client gui: "+nhan);
                System.out.println("Server gui: ");
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                String st=br.readLine();
                os.writeUTF(st);
                os.flush();
                }
                        }catch(IOException e1){
                            System.out.println("clinet da huy ket noi" +e1);
                        }
        }catch(IOException e){
            System.out.println("loi "+e);
            
        }
    }
}
