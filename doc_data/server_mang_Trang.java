
package socket;
import java.io.*;
import java.net.*;
public class server_mang {
    public static void main(String args[]){
        int b[]=new int [10];
    try{
    ServerSocket ss= new ServerSocket(10);
        System.out.println("Server dang lang nghe...");
        try{
        Socket s=ss.accept();
            System.out.println("Client da ket noi voi Server");
            DataInputStream is=new DataInputStream(s.getInputStream());
            DataOutputStream os=new DataOutputStream(s.getOutputStream());
            String str=is.readUTF();
            System.out.println("So phan tu mang: "+str);
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
            System.out.println("Tong= "+tong);
            os.writeUTF(String.valueOf(tong));
            os.flush();
            }catch(IOException ie){
            System.out.println("Loi 1-client da huy ket noi: "+ie);
        }
    }catch(IOException e){
        System.out.println("Loi 2: "+e);
    }
}
}
