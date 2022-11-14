/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_server;
import java.io. *;
import java.net. *;

public class client {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("127.0.0.2", 90);
            DataInputStream is = new DataInputStream(s.getInputStream());
            DataOutputStream os = new DataOutputStream(s.getOutputStream());
            
            try{
                System.out.println("client send to: ");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String st = br.readLine();
                os.writeUTF(st);
                os.flush();
                
            }catch(IOException ee){
                System.out.println("server disconnection "+ ee);
            }
        }catch(IOException e){
            System.out.println("ERROR: "+ e);
        }
    }
}
