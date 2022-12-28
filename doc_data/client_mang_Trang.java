/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import java.io.*;
import java.net.*;
public class client_mang {
    public static void main(String args[]){
        int n;
        int a[]=new int[10];
    try{
    Socket s=new Socket("localhost",10);
    DataInputStream is=new DataInputStream(s.getInputStream());
    DataOutputStream os=new DataOutputStream(s.getOutputStream());
    try{
    DataInputStream nhap=new DataInputStream(System.in);
        System.out.println("Nhap vao so phan tu mang= ");
        n=Integer.parseInt(nhap.readLine());
        
        os.writeUTF(String.valueOf(n));
        os.flush();
        
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]=");
        a[i]=Integer.parseInt(nhap.readLine());
        }
        System.out.println("Mang vua nhap la: ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]+ " ");
        }
        
        for(int i=0;i<n;i++){
        os.writeUTF(String.valueOf(a[i]));
        os.flush();
        }
        String nhan=is.readUTF();
        System.out.println("Tong mang= "+nhan);
    }catch(IOException ie){
        System.out.println("Loi ket noi: "+ie);
    }
    os.close();
    is.close();
    s.close();
    }catch(IOException e){
        System.out.println("loi: "+e);
    }
    
    }
}
