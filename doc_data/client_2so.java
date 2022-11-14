
package sever;

public class client_2so {
     public static void main(String args[]){
    try{
           Socket s=new Socket("127.0.0.1",100);//localhost
           DataInputStream is = new DataInputStream(s.getInputStream());
           DataOutputStream os = new DataOutputStream(s.getOutputStream());
           while (true){
           try{
               int a=is.readInt();
               System.out.println("Client gui: "+a);
               int b=is.readInt();
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               String a=br.readLine();
                os.writeUTF(a);
               os.flush();
               String b=br.readLine();
                os.writeUTF(b);
               os.flush();
               if(st.equalsIgnoreCase("exit"))break;
               os.writeUTF(st);
               os.flush();
               String nhan=is.readUTF();
               System.out.println("server gui: "+nhan);
           }catch(IOException e1){
               System.out.println("Server da huy ket noi"+e1);
           }
           }
           os.close();
           is.close();
           s.close();
           
       }catch(IOException e){
           System.out.println("Loi: "+e);
       }
}
}
