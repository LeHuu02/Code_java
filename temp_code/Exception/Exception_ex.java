/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
lE MINH HUU 4/10/2022 EXCEPTION IN JAVA
*/
package Exception;

import java.util.Scanner;

public class Exception_ex {
    /*ngoai le exception*/
    public static void main(String[] args) {
//        exception_demo();
        chuyen_str_number();
    }
    
    /*
    khi goi ham con vao ham main trong cung 1 class thi 
    ham con phai su dung static moi co the goi vao duoc
    */
    public static void exception_demo(){
        /*thuc hien lenh trong try*/
        try {
            int a = 5, b = 0, c = 0;
            c = a/b;    //b = 0 -> phep tinh nay loi
            System.out.println("gia tri cua thuong"+c );
        }
        /*neu try loi thi se thuc hien catch*/
        catch (Exception e) {
            System.out.println("ERROR: "+ e);
        } finally { //luon thuc hien cho du try va catch co dung hay sai
            System.out.println("HE LO MOI NGUOI NHE");
        }
    }
    
    /*chuyen doi chuoi sang so trong java*/
    public static void chuyen_str_number(){
        String str;
        int n;
        Scanner nhap = new Scanner(System.in);
        
        /*thuc hien try*/
        try {
            /*nhap chuoi chuyen sang so*/
            System.out.print("nhap chuoi chuyen so: ");
            str = nhap.nextLine();
            /*chuyen doi kieu string sang kieu int*/
            n = Integer.parseInt(str);
            System.out.println("so vua nhap duoc la: "+n);
        } catch (NumberFormatException e) {
            System.out.println("ERROR exception math number: "+e);
        }finally{
            System.out.println("CHUC BAN NGAY MOI NO BUG");
        }
        
    }
}
