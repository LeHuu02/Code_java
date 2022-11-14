/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktmtk19;
 import java.util.Scanner; 
/**
 *
 * @author Admin
 */
public class person {
    private static String hoten;
    private static String diachi;
    private  static int namsinh;
     Scanner nhap=new Scanner(System.in);
     
    person(){}
        person(String hten,String dchi,int nsinh){
        this.hoten=hten;
        this.diachi=dchi;
        this.namsinh=nsinh;
       
    }
        public static void nhaptt(){
            
     
        Scanner nhap=new Scanner(System.in);

System.out.print("nhap ho ten=");  hoten=nhap.nextLine();
System.out.print("nhap dia chi="); diachi=nhap.nextLine();
System.out.print("nhap nam sinh="); namsinh=nhap.nextInt();
person s=new person(hoten,diachi,namsinh);

        }
        public static void hientt(){
              System.out.println(gethoten()+" "+getdiachi()+" "+getnamsinh());
            
        }

    public  static String gethoten() {
        return hoten;
    }

    public  static String getdiachi() {
        return diachi;
    }

    public static int getnamsinh() {
        return namsinh;
    }
        
    }

    

