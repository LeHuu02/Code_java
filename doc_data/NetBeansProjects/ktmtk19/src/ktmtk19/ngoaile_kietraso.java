/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktmtk19;
import java.util.Scanner;
class Ngoaile extends Exception{
    Ngoaile(String msg){super(msg);}
}

public class ngoaile_kietraso {
    public void ngoaile_nhap() throws Ngoaile{
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap m="); 
        m=sc.nextInt();
        try{
            if(m<2  || m>100)throw new Ngoaile("gia tri khong hop le");
            System.out.println("gia tri hop le la: "+m);
        }catch (Ngoaile e){
            System.out.println("loi : "+e);
            

        }
        
    }

public static void main(String args[])throws Exception{
    ngoaile_kietraso e=new ngoaile_kietraso();
    e.ngoaile_nhap();

}
}