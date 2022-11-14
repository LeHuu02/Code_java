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
public class tessNewClass2 {
   public static void main(String[] args) {
        int n;
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap vao so luong nhan vien: ");
        n = nhap.nextInt();
        
        NewClass2 cd = new NewClass2();
        NewClass2 d[] = new NewClass2[10];
        
        System.out.println("nhap thong tin cd:");
        cd.nhaptt(d, n);
        System.out.println("in thong tin cd: ");
       cd.inthongtin(d,n);
        cd.tongbaihat(d,n);
          cd.hienthi2(d,n);
      
            cd.timtheoma(d,n);
        
          
        }
    }
  

