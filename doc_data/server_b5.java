package sever;
import java.io.*;
import java.net.*;
public class server_b5 {
    public static void main(String args[]){
        int n;
        int a[]=new int[10];
        try{
            ServerSocket ss=new ServerSocket(10);
            System.out.println("Server dang lang nghe....");
            try{
                Socket s=ss.accept();
                System.out.println("Client da ket noi");
                DataInputStream is=new DataInputStream(s.getInputStream());
                DataOutputStream os=new DataOutputStream(s.getOutputStream());
          
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
                //xuất mang sang client
                for(int i=0;i<n;i++){
                os.writeUTF(String.valueOf(a[i]));
                os.flush();
                }

                }catch(IOException ie){
                System.out.println("Loi1 - client da huy ket noi");
            }
        }catch(IOException e){
            System.out.println("Loi2+ "+e);
        }
    }
}

