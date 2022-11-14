/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;
import java.io.*;
import java.net.*;

public class Clinet_class {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("127.0.0.1", 100);
            DataInputStream is = new DataInputStream(s.getInputStream());
            DataOutputStream os = new DataOutputStream(s.getOutputStream());
            try{
                while(true){
                System.out.println("Client send to: ");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String st = br.readLine();
                os.writeUTF(st);
                os.flush();
                String nhan = is.readUTF();
                System.out.println("server send to: "+nhan);
                }
            }catch(IOException el){
                System.out.println("server disconnection "+ el);
            }
            /*dong luong*/
            os.close(); //dong luong
            is.close(); //dong server
            s.close();  //dong socket
        }catch(IOException e){
            System.out.println("ERROR: "+ e);
        }
    }
}