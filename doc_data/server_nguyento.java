/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sever;
import java.io.*;
import java.net.*;
public class server_nguyento {
    public static void main(String args[]){
        try{
            ServerSocket ss=new ServerSocket(10);
            System.out.println("Server dang lang nghe....");
            try{
                Socket s=ss.accept();
                System.out.println("Client da ket noi");
                DataInputStream is=new DataInputStream(s.getInputStream());
                DataOutputStream os=new DataOutputStream(s.getOutputStream());
                String str=is.readUTF();
                System.out.println("Client gui: "+str);
                int n=Integer.parseInt(str);
                int dem=0;
                String str1=" ";
                for(int i=2;i<n;i++){
                    if(n%i==2)dem++;
         
                }if(dem==0){
                    System.out.println(n+ "la so nguyen to");
                    str1="La so nguyen to";
                }else{
                    System.out.println(n+" khong phai la so nguyen to");
                    str1="Khong phai so nguyen to";
                }
                os.writeUTF(str1);
                os.flush();
                }catch(IOException ie){
                System.out.println("Loi1 - client da huy ket noi");
            }
        }catch(IOException e){
            System.out.println("Loi2+ "+e);
        }
    }
}
