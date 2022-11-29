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

import java.net. *;
import java.io. *;

public class c3base2_server {
    public static void main(String[] args) {
        String s1 = "A";
        String str = "m";
        int tong = 0;
        try{
            while (true){
            ServerSocket ss = new ServerSocket(99);
            System.out.println("server dang cho.....");
                try{
                Socket s = ss.accept();
                DataInputStream is = new DataInputStream(s.getInputStream());
                DataOutputStream os = new DataOutputStream(s.getOutputStream());
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                while(s1.equals(str) != true){
                    str = is.readUTF();
                    if(s1.equals(str) != true){
                    tong += Integer.parseInt(str);
                    System.out.println("nhan duoc: "+str);
                    System.out.println("tong: "+tong);
//                    os.writeUTF(String.valueOf(tong));
//                    os.flush();
                    }
                }
                String t = br.readLine();
                os.writeUTF(t);
                System.out.println("tong: "+tong);
                os.writeUTF(String.valueOf(tong));
                os.flush();
                }catch(Exception ee){
                    System.out.println("client disconnecter ..."+ ee);
                }
            }
        }catch(Exception e){
            System.out.println("error "+ e);
        }
        
    }
}
