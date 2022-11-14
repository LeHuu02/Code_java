package sever;
import java.io.*;
import java.net.*;
public class Sever {
    public static void main(String[] args) {//co vao/ra dư lieu và dùng socket -> bat ngoai le
        try{
            ServerSocket ss=new ServerSocket(100);
            System.out.println("Server dang lang nghe.......");
            try{
                Socket s=ss.accept();
                System.out.println("Da ket noi voi client.");
                DataInputStream is=new DataInputStream(s.getInputStream());
                DataOutputStream os=new DataOutputStream(s.getOutputStream());
                while (true){
                String nhan=is.readUTF();
                System.out.println("client gui: "+nhan);
                System.out.println("Server gui: ");
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String st = br.readLine();
            os.writeUTF(st);
            os.flush();
                }    
        }catch(IOException e1){
            System.out.println("Client da huy ket noi "+e1);
        }
    }catch(IOException e){
            System.out.println("loi "+e);
                    }
        /*try{// 1 server socket,  1 gt ao
        ServerSocket ss=new ServerSocket(100);// 0 ... 65535
            System.out.println("Sever dang lang nghe ....");
            try{
                Socket s=ss.accept();
                System.out.println("da ket noi voi client.");
                DataInputStream is = new DataInputStream(s.getInputStream()); // nhap 1 chuoi khac voi InputStream chi nhap ky tu
                DataOutputStream os=new DataOutputStream(s.getOutputStream());
                while(true){
                String nhan=is.readUTF();// chap nhan ky tu kieu unikey
                System.out.println("client gui: "+nhan);
                System.out.println("server gui: ");
                BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
                String st=br.readLine();
                os.writeUTF(st);
                os.flush();
                }
            }catch(IOException e1){
                System.out.println("Client da huy ket noi "+ e1);
            }
        }catch(IOException e){
            System.out.println("Loi "+e);
        }*/
}
}
