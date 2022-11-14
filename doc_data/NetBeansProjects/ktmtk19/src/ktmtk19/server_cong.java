/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktmtk19;
import java.io.*;
import java.net.*;
/**
 *
 * @author Admin
 */
public class server_cong {
   
    public static void main(String[] args) {
    try{
    ServerSocket ss=new ServerSocket(10);
        System.out.println("Server dang lang nghe ....");
        try{
        Socket s=ss.accept();
            System.out.println("Da ket noi voi client.");
            DataInputStream is=new DataInputStream(s.getInputStream());
            DataOutputStream os=new DataOutputStream(s.getOutputStream());
            int a=Integer.parseInt(is.readUTF());
            System.out.println("\nClient gui: "+a);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Nhap b: ");
        int b=Integer.parseInt(br.readLine());
            int tong=a+b;
            System.out.println("Tinh tong= "+tong);
            os.writeUTF(String.valueOf(tong));
            os.flush();
        }catch(IOException e1){
            System.out.println("Clinet da huy ket noi" + e1);
        }
    }catch(IOException e){
        System.out.println("Loi "+ e);
    }
    }
}


