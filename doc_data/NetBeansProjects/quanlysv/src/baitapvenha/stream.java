/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapvenha;
import java.io.*;


 

 
public class stream {
    public static void main(String args[]){
        System.out.print("nhap vao mot mang ki tu: ");
        InputStream is=System.in;
        try{
            byte b[]=new byte[10];
            int n=is.read(b);
            String str=new String(b);
            System.out.println("chuoi vua nhap la: "+str);
            System.out.println("so  ki tu doc duoc: "+n);
        }catch(IOException e){
            System.out.println("loi+ "+e);
        }
        
    }
    
}
