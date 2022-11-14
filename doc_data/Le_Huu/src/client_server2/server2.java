/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_server2;
import java.io. *;
import java.net. *;
import java.util. *;

public class server2 {
   public static void main(String[] args) {
//        while(true){ 
            try{
                 Scanner nhap = new Scanner(System.in);
                 ServerSocket ss = new ServerSocket(90);
                 System.out.println("Server waiting ............");
                 while(true){
                    try{
                     Socket s = ss.accept();
                     System.out.println("connection to client");
                     DataInputStream is = new DataInputStream(s.getInputStream());
                     DataOutputStream os = new DataOutputStream(s.getOutputStream());
                     String st1 = new String("ten ban la gi");
                     String st2 = new String("ban co khoe khong");
                     String st3 = new String("toi la server");
                     String st4 = new String("toi khoe");
                     while(true){
//                         String st;
                     String nhan = is.readUTF();
                     System.out.println("client send to: "+ nhan);
                     System.out.println("server send: ");
                     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                        
                     String st;// = br.readLine();
                     if(true == (nhan.equals(st1))){
//                            System.out.println("toi la server");
                         st = st3;
                        }
                        else if(true == nhan.equals(st2)){
//                            System.out.println("toi khoe");
                            st = st4;
                        }else{
                            st = br.readLine();                          
                        }
//                     String st = br.readLine();
                     os.writeUTF(st);
                     os.flush();
                        }
                        }catch(IOException ee){
                         System.out.println("ERROR clinet disconnection"+ee);
                     }
                 }
             }catch(IOException e){
                 System.out.println("ERROR "+e);
             }
    } 
}
