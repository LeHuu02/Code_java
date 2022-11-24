/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
lE MINH HUU 4/10/2022 EXCEPTION IN JAVA

I DON'T UNDERSTAND THIS THROWS
LEARNING AGAIN 
*/
package Exception;

import java.util.Scanner;

class NgoaiLe extends Exception{

    public NgoaiLe(String msg) {
        super(msg);
    }
}

public class exception_math {
    public static void main(String[] args) throws Exception{
        exception_math ex = new exception_math();
        ex.Nhap_exception();
    }
    
    public void Nhap_exception() throws NgoaiLe{
        /*nhap gia tri m*/
        int m;
        Scanner nhap = new Scanner(System.in);
        System.out.print("nhap gia tri m: ");
        m = nhap.nextInt();
        
        /*thu hien ngoai le*/
        try{
            if(2 > m || m > 100)throw new NgoaiLe( "gia tri nhap khong hop le");
                System.out.println("gia tri hop le la: "+m);
        }catch(NgoaiLe e){
            System.out.println("ERROR "+ e);
        }
    }
}
