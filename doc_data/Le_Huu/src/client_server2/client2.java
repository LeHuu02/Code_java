/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_server2;

import java.io. *;
import java.net. *;

public class client2 {
     public static void main(String[] args) {
//        while(true){
            try{
               Socket s = new Socket("127.0.0.2", 90);
               DataInputStream is = new DataInputStream(s.getInputStream());
               DataOutputStream os = new DataOutputStream(s.getOutputStream());            
               while(true){
                try{
                    while(true){
                   System.out.println("client send: ");
                   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                   String st = br.readLine();
                   os.writeUTF(st);
                   os.flush();
                   String nhan = is.readUTF();
                   System.out.println("server send to: "+ nhan);                               
                    }
                 }catch(IOException ee){
                   System.out.println("server disconnection "+ ee);
               }
//               os.close();
//               is.close();
//               s.close();   
               }               
           }catch(IOException e){
               System.out.println("ERROR: "+ e);
           }
//        }
    }
}
