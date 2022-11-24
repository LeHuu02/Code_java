
package ktmtk19;

import java.util.Scanner;
//giai pt bac hai
 

public class ptbac2 {

public static void main(String args[]){
    Scanner nhap=new Scanner(System.in);
int a,b,c;
    float delta ;
    float x1, x2;
    
    System.out.print("nhap a=");a=nhap.nextInt();
      System.out.print("nhap b=");b=nhap.nextInt();
        System.out.print("nhap c=");c=nhap.nextInt();
        delta=b*b-4*a*c;
        if(delta<0){
            System.out.println("pt vo nghiem");
        }else if(delta==0){
            x1=-b/(2*a);
            System.out.println("nghiem kep="+x1);
        }else{
            x1=(float)(-b-Math.sqrt(delta))/(2*a);
            x2=(float)(-b+Math.sqrt(delta))/(2*a);
            System.out.println("x1="+x1);
                 System.out.println("x2="+x2);
        }
        
    
    
}

}
