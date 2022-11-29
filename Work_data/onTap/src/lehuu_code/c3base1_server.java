/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
power by le minh huu 26/11/2022 @LeHuu02 @copyright
yeu cau:
        - gui mot chuoi tu client sang server va nguoc lai
        - gui tu client cau hoi: "xin chao ban", "ban ten gi"
            server gui sang client: tra loi: "xin chao", "toi la huu"

NOTE:
*/
package lehuu_code;

import java.io. *;
import java.net. *;

public class c3base1_server {
    public static void main(String[] args) {
        try{
            //tao server ket noi cong
            ServerSocket ss = new ServerSocket(72);
            System.out.println("server dang cho.....");
            String s1 = new String("xin chao ban");
            String s2 = new String("chao ban");
            String s3 = new String("ban ten gi");
            String s4 = new String("tao ten huu");
            
            //ket noi thanh cong
            try{
                //thuc hien gui chuoi qua lai lien tuc
                while(true){
                    Socket s = ss.accept();
                    //tao phuong thuc nhap is, xuat os
                    DataInputStream is = new DataInputStream(s.getInputStream());
                    DataOutputStream os = new DataOutputStream(s.getOutputStream());
                    //tao pt bo nho dem br
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    //nhan string tu client luu chuoi str
                    while(true){
                        //neu gui chuoi binh thuong qua lai
                        String str = is.readUTF();
                        System.out.println("chuoi tu client: "+str);
                        //gui chuoi sang client
//                        System.out.println("gui chuoi sang client: ");
//                        str = br.readLine();
//                        os.writeUTF(str);
//                        os.flush(); 
                        
                        //nhan mang 1 chieu tu client
//                        str.split(" ");
//                        int arr[] = new int[10];
//                        for(int i = 0; i < str.length(); i++){
//                            arr[i] = Integer.parseInt(str.split());
//                        }
                        
                        
                        //tra loi tu dong
                        if(str.equals(s1) == true){
                            str = s2;
                        }else if(str.equals(s3) == true){
                            str = s4;
                        }else{
                            System.out.println("gui chuoi sang client: ");
                            str = br.readLine();
                        }
                        os.writeUTF(str);
                        os.flush();
                        //dieu kien dung ket noi la nhap "stop"
                        String st = new String("stop");
                        if(str.equals(st) == true){
                            is.close();
                            os.close();
                            s.close();
                            ss.close();
                            break;
                        }
                    }               
                }
            }catch(Exception ee){
                System.out.println("error"+ ee);
            }
        }catch(Exception e){
            System.out.println("error: "+ e);
        }
        
    }
}
