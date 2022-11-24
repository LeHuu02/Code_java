/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
lE MINH HUU 4/10/2022 STREAM IN JAVA
luu tru du lieu vao file
*/
package Stream;

/*goi toan bo (*) thu vien java.io*/
import java.io. *;  

public class Stream_in_java {
    public static void main(String[] args) {
        /*tao doi tuong io stream*/
        OutputStream out_str =  System.out;
        
        /*exception*/
        try {
            /*khoi tao chuoi str*/
            String str = "Le Minh Huu - KTMT K19A";
            /*tao mot mang exb kieu byte = lan luot cac ky tu trong chuoi str*/
            byte exb[] = str.getBytes();
            /*ghi mang byte vao doi tuong out_str*/
            out_str.write(exb);
        } catch (IOException e) {   //neu try loi thi thuc hien in ra loi
            System.out.println("ERROR: "+e);
        }
    }
}
