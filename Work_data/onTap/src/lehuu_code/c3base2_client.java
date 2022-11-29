/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 /*
power by le minh huu 24/11/2022 @LeHuu02 @copyright
yeu cau:
        - nhap vao cac so va gui tu client sang server.
        - neu nhap ky tu A -> tra ve client tong so vua nhap va thoat

NOTE:
 */
package lehuu_code;

import java.net.*;
import java.io.*;

public class c3base2_client {

    public static void main(String[] args) {
        try {
            while (true) {
                String s1 = "A";
                String str = "m";
                String tong = "x";
                Socket s = new Socket("127.0.0.3", 99);
                System.out.println("ket noi thanh cong: ");
                try {
                    DataInputStream is = new DataInputStream(s.getInputStream());
                    DataOutputStream os = new DataOutputStream(s.getOutputStream());
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    //            lap den khi nao nhap vao ky tu a
                    while (s1.equals(str) != true) {
                        System.out.println("nhap chuoi gui sang server");
                        str = br.readLine();
                        if (s1.equals(str) != true) {
                            os.writeUTF(str);
                            os.flush();
//                     tong = is.readLine();
//                    System.out.println("tong la: "+tong);
                        }
                    }
                    tong = is.readLine();
                    System.out.println("tong la: " + tong);
                } catch (Exception ee) {
                    System.out.println("loi ngat ket noi " + ee);
                }
            }

        } catch (Exception e) {
            System.out.println("error: " + e);
        }
    }
}
