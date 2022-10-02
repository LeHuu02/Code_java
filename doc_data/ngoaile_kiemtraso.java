
package baitap1;
import java.util.Scanner;
class Ngoaile extends Exception{
    Ngoaile(String msg){super(msg);
    }
}

public class ngoaile_kiemtraso {
    public void ngoaile_nhap()throws Ngoaile{
    int m;
    Scanner sc=new Scanner(System.in);
    System.out.println("Nhap m=");;m=sc.nextInt();
    try{
    if(m<2 || m>100)throw new Ngoaile("Gia tri khong hop le");
        System.out.println("Gia tri hop le la:"+m);
    }catch (Ngoaile e){
        System.out.println("Loi: "+e);
    }
}
public static void main(String args[])throws Exception {
    ngoaile_kiemtraso e=new ngoaile_kiemtraso();
    e.ngoaile_nhap();    
 }
}

