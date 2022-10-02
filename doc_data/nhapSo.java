/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngoaile;
import java.util.Scanner;
class ngoaile extends Exception{//kế thừa Exception
ngoaile(String msg){super(msg);}//ngoại lệ con do mình tự tạo
}
public class nhapSo {
    public void Ngoaile_nhap() throws ngoaile{
    int m;
    Scanner sc=new Scanner(System.in);
    m=sc.nextInt();
    try{
    if(m<2 || m>100)throw new ngoaile("Gia tri khong hop le");//ủy nhiệm ngoại lệ
        System.out.println("Gia tri hop le la: "+m);
    }catch(ngoaile e){
        System.out.println("Loi: "+e);
    }
    }
    public static void main(String args[])throws Exception{
    nhapSo e=new nhapSo();
    e.Ngoaile_nhap();
    }
}
