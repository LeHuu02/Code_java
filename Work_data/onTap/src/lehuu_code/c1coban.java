/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
power by le minh huu 24/11/2022 @LeHuu02 @copyright
yeu cau:
        - nhap xuat mang 1 chieu
        - tim so nguyen to va in ra
*/
package lehuu_code;
import java.util.Scanner;
public class c1coban {
    public static void main(String[] args) {
        int n;
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu mang: ");
        n = sc.nextInt();
        //nhap mang
        System.out.println("nhap gia tri: ");
        for(int i = 0; i < n; i++){
            System.out.println("arr["+(i+1)+"]: ");
            arr[i] = sc.nextInt();
        }
        //xuat mang
        System.out.println("in mang vua nhap: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+"\t");
        }
        //tim so nguyen to
        int dem;
        System.out.print("\nso nguyen to trong mang la: ");
        for(int i = 0; i < n; i++){
            dem = 0;
            for(int j = 1; j <= arr[i]; j++){
              if(arr[i]%j == 0){
                  dem++;
              }  
            }
            if(dem == 2){
                System.out.print(arr[i]+"\t");
            }
        }
    }
}
