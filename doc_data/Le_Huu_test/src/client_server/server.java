/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_server;
import java.io. *;
import java.net. *;
import java.util. *;

public class server {
    public static void main(String[] args) {
        try{
            Scanner nhap = new Scanner(System.in);
            ServerSocket ss = new ServerSocket(90);
            System.out.println("Server waiting ............");
            try{
                Socket s = ss.accept();
                System.out.println("connection to client");
                DataInputStream is = new DataInputStream(s.getInputStream());
                DataOutputStream os = new DataOutputStream(s.getOutputStream());
                String nhan = is.readUTF();
                System.out.println("client sen to: "+ nhan);
               
            }catch(IOException ee){
                System.out.println("ERROR clinet disconnection"+ee);
            }
        }catch(IOException e){
            System.out.println("ERROR "+e);
        }
    }
}
