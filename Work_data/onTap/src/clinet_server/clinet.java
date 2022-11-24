/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinet_server;
import java.io. *;
import java.net. *;
public class clinet {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("127.0.0.1",100);
            DataInputStream is = new DataInputStream(s.getInputStream());
            DataOutputStream os = new DataOutputStream(s.getOutputStream());
            try{
                DataInputStream nhap = new DataInputStream(System.in);
                System.out.println("nhap gia tri n: ");
                String n = nhap.readLine();
                os.writeUTF(n);
                os.flush();
                String nhan = is.readUTF();
                System.out.println("nhan tu server la: "+nhan);
            }catch(IOException e2){
                System.out.println("error "+ e2);
            }
            
        }catch(IOException e1){
            System.out.println("error "+ e1);
        }
    }
}
