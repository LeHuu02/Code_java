/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;

import java.io. *;
import java.net. *;
import java.util.Scanner;

public class Server_class {

    public static void main(String[] args) {        
        try{
            Scanner nhap =  new Scanner(System.in);
            ServerSocket ss = new ServerSocket(100);
            System.out.println("Server dang cho...........");
            while(true){    
                try{
                    Socket s = ss.accept();
                    System.out.print("Connection to client.");
                    DataInputStream is = new DataInputStream(s.getInputStream());
                    DataOutputStream os = new DataOutputStream(s.getOutputStream());
                    String nhan = is.readUTF();
                    System.out.println("Client send to: "+ nhan);
                    System.out.print("Server send to: ");
                    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
                   /*nhap  mot chuoi*/
                    String st = br.readLine();
                    /*gui so nguyen sang clinet tinh tong ben clinet roi gui lai kq sang server*/
                    int a, b;
                    /*gui so nguyen*/
                    System.out.println("nhap so nguyen: ");
                    a = is.readInt();
                    b = is.readInt();
                    os.writeUTF(st);
                    os.writeInt(a);
                    os.writeInt(b);
                    os.flush();
                }catch(IOException el){
                    System.out.println("ERROR: Clinet disconnection "+ el);
                }
            }
        }catch(IOException e){
            System.out.println("ERROR "+e);
        }            
              
    }
}
