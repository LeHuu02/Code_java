package sever;
import java.io.*;
import java.net.*;
public class client_mang {
public static void main(String args[]){
        int n;
        int a[]=new int[10];
    try{
    Socket s=new Socket("localhost",10);//địa chỉ ip: 127.0.0.1 hoặc localhost,số hiệu cổng giống bên server
    DataInputStream is=new DataInputStream(s.getInputStream());//nhập gắn với client
    DataOutputStream os=new DataOutputStream(s.getOutputStream());//xuất gắn với client
    try{
    DataInputStream nhap=new DataInputStream(System.in);//cho phép nhập vào 1 chuỗi
        System.out.println("Nhap vao so phan tu mang= ");
        n=Integer.parseInt(nhap.readLine());
        os.writeUTF(String.valueOf(n));
        os.flush();
        //nhap cac phan tu mang
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]=");
        a[i]=Integer.parseInt(nhap.readLine());
        }
        System.out.println("Mang vua nhap la: ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]+ " ");
        }
        //xuất mang sang server
        for(int i=0;i<n;i++){
        os.writeUTF(String.valueOf(a[i]));
        os.flush();
        }
        String nhan=is.readUTF();
        System.out.println("Tong mang= "+nhan);
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

