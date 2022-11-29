/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
power by le minh huu 24/11/2022 @LeHuu02 @copyright
yeu cau:
        - truyen nhan tu client sang server
        - gui mot ky tu/ mot chuoi ky tu qua lai
        - tu dong gui ky tu 

NOTE:
*/
package lehuu_code;

import java.io. *;
import java.net. *;

public class c3base1_client {
    public static void main(String[] args) {
        try{
            //tao socket, ip: ket noi voi server
            Socket s = new Socket("127.0.0.2", 72);
            try{
                //thuc hien gui chuoi qua lai lien tuc
                while(true){
                    System.out.println("da ket noi thanh cong ");
                    //tao pt nhap is, xuat os
                    DataInputStream is = new DataInputStream(s.getInputStream());
                    DataOutputStream os = new DataOutputStream(s.getOutputStream());
                    //tao bo dem nhap
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    //gui chuoi sang server
                    while(true){
                        System.out.println("gui chuoi sang server: ");
                        String str = br.readLine();
                        os.writeUTF(str);
                        os.flush();
                        //nhan chuoi tu server
                        str = is.readUTF();
                        System.out.println("chuoi nhan tu server: "+str); 
                        
                        //gui mang mot chieu sang server tinh tong roi gui lai client
//                        int []arr =  {3,5,1,8,6};
//                        for(int i = 0; i < arr.length; i++){
//                            os.writeUTF(arr[i]+" ");
//                            
//                        }
                        
                        
                        
                        //dieu kien dung ket noi la nhap "stop"
                        String st = new String("stop");
                        if(str.equals(st) == true){
                            is.close();
                            os.close();
                            s.close();
                            break;
                        }
                    }
                }              
            }catch(Exception ee){
                System.out.println("error "+ ee);
            }
        }catch(Exception e){
            System.out.println("error: "+e);
        }
    }
    
}
