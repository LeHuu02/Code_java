/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//lE MINH HUU 4/10/2022 STREAM IN JAVA
package Stream;

import java.io. *;

public class Add_stream {
    public static void main(String[] args) throws Exception{
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("nhap vao mot chuoi");
        /*nhap chuoi theo doi tuong buffered reader*/
        //khoi tao bien str = gia tri vua nhap
        String str = br.readLine(); 
        System.out.println("chuoi vua nhap la: "+str);
        
        int a,b;
        System.out.print("nhap vao so a: ");
        a = Integer.parseInt(br.readLine());
        System.out.print("nhap vao so b: ");
        b = Integer.parseInt(br.readLine());
        
        System.out.println("tong a+b: "+(a+b));
    }
}
