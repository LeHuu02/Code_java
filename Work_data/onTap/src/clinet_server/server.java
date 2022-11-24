/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinet_server;
import java.net. *;
import java.io. *;        

public class server {
    public static void main(String[] args) {
        try{
        ServerSocket ss = new ServerSocket(100);
        System.out.println("socket dang cho doi wait...");
        try{
            Socket s = ss.accept();
            System.out.println("da ket noi");
            DataInputStream is = new DataInputStream(s.getInputStream());
            DataOutputStream os = new DataOutputStream(s.getOutputStream());
            String str = is.readUTF();
            int n = Integer.parseInt(str);
            int tong = 0;
            for(int i = 1; i <=n; i++){
                tong += i;
            }
            System.out.println("tong n = "+tong);
            os.writeUTF(str);
            os.flush();
        }catch(IOException e2){
            System.out.println("loi "+e2);
        } 
        }catch(IOException e1){
            System.out.println("loi "+e1);    
        }
    }
}
