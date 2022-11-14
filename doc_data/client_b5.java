package sever;
import java.io.*;
import java.net.*;
public class client_b5 {
    public static void main(String args[]){
        int b[]=new int[10];
    try{
    Socket s=new Socket("localhost",10);//địa chỉ ip: 127.0.0.1 hoặc localhost,số hiệu cổng giống bên server
    DataInputStream is=new DataInputStream(s.getInputStream());//nhập gắn với client
    DataOutputStream os=new DataOutputStream(s.getOutputStream());//xuất gắn với client
    try{
        String str=is.readUTF();
        System.out.println("So phan tu mang = "+str);
                int n=Integer.parseInt(str);
                for(int i=0;i<n;i++){
                    b[i]=Integer.parseInt(is.readUTF());
                }
                System.out.println("Mang nhan duoc la: ");
                for(int i=0;i<n;i++){
                    System.out.println(b[i]+" ");
                }
                int tong=0;
                for(int i=0;i<n;i++){
                    tong=tong+b[i];
                }
                System.out.println("Tong = "+tong);
                os.writeUTF(String.valueOf(tong));
                os.flush();
        
    
 }catch(IOException ie){
        System.out.println("Loi ket noi: "+ie);
    }
    os.close();//đóng luồng xuất
    is.close();//đóng luồng nhập
    s.close();//đóng socket
    }catch(IOException e){
        System.out.println("loi: "+e);//trường hợp không tạo ra dc socket
    }
    
    }
}

