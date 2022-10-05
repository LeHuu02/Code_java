/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
lE MINH HUU 4/10/2022 STREAM IN JAVA
*/
package Stream;
import java.io. *;
public class Stream_example {
    public static void main(String[] args) {
        vd1();
        vd2();
    }
    public static void vd1(){
        System.out.print("nhap vao ky tu tu ban phim: ");
        InputStream is = System.in;
        try{
            int n = is.read();
            System.out.println("ky tu vua nhap: "+(char)n);
        }catch(IOException e){
            System.out.println("ERROR "+e);
        }
    }
    public static void vd2(){
        System.out.print("nhap vao mang ky tu: ");
        InputStream is = System.in;
        try{
            byte b[]= new byte[10]; //tạo mảng b có mãx 10 ptu
            is.read(b);     //chuyen sang che do nhap is.read
            int m = is.read(b); //nhập vào chuỗi ghi vao mang b
            String str = new String(b); //gán giá trị mảng b cho chuõi str
            System.out.println("chuoi ky tu vua nhap: "+str);
            System.out.println("ky tu cuoi cung vua nhap: \t "+(m) );
        }catch(IOException e){
            System.out.println("ERROR "+e);
        }        
    }
}
