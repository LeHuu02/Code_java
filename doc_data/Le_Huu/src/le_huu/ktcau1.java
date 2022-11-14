/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
cau 1 nhap n so tu ban phim tinh tong va hien thi kq
*/
package le_huu;
import java.util.Scanner;

public class ktcau1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("nhap gia tri n: ");
        int n = nhap.nextInt();
        int j;
        int tong = 0;
        for(int i = 1; i <= n; i++){
            System.out.print("so thu: "+(i)+" la: ");
            j = nhap.nextInt();
            tong += j;
        }
        System.out.println("tong cac so vua nhap la: "+tong);
    }
}
