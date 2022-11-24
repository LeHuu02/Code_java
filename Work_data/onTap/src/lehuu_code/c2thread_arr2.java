/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
power by le minh huu 24/11/2022 @LeHuu02 @copyright
yeu cau:
        - dung thread nhap xuat mang hai chieu
        - in tinh tong cheo chinh/ cheo phu
        - tim min/max hang/cot

NOTE:
*/
package lehuu_code;
import java.util.Scanner;

public class c2thread_arr2 extends Thread{
    static int n, m;
    static int arr[][] = new int [100][100];
    public static void main(String[] args) {
        nhapxuat nx = new nhapxuat();
        nx.start();
    }
}

class nhapxuat extends Thread{
    @Override
    public void run(){
        nhap();
        xuat();
        tinh tt = new tinh();
        tt.run();
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so ptu mang mxn: ");
        c2thread_arr2.m = sc.nextInt();
        c2thread_arr2.n = sc.nextInt();
        System.out.println("nhap mang: ");
        for(int i = 0; i < c2thread_arr2.m; i++){
            for(int j = 0; j < c2thread_arr2.n; j++){
                System.out.print("arr["+i+"]["+j+"]: ");
                c2thread_arr2.arr[i][j] = sc.nextInt();
            }
        }
    }
    public void xuat(){
        System.out.println("in mang: ");
        for(int i = 0; i < c2thread_arr2.m; i++){        
            for(int j = 0; j < c2thread_arr2.n; j++){
                System.out.print(c2thread_arr2.arr[i][j]+"\t");                 
            }
            System.out.println("");
        }        
    }
}
class tinh extends Thread{
    @Override
    public void run(){
        cheocp();
        minhang();
        mincot();
    }
    public void cheocp(){
        int tongc = 0, tongp = 0;
        System.out.println("cheo chinh: ");
        for(int i = 0; i < c2thread_arr2.m; i++){        
            for(int j = 0; j < c2thread_arr2.n; j++){
                if(i == j){
                    System.out.print(c2thread_arr2.arr[i][j]+"\t");                 
                    tongc += c2thread_arr2.arr[i][j];
                }                
            }            
        }
        System.out.println("tong chinh: "+tongc);
        System.out.println("cheo phu: ");
        for(int i = 0; i < c2thread_arr2.m; i++){        
            for(int j = 0; j < c2thread_arr2.n; j++){
                if(i + j == (c2thread_arr2.m) - 1){
                    System.out.print(c2thread_arr2.arr[i][j]+"\t");                 
                    tongp += c2thread_arr2.arr[i][j];
                }                
            }            
        }
        System.out.println("tong phu: "+tongp);        
    }
    public void minhang(){
        int min = c2thread_arr2.arr[0][0];
        for(int i = 0; i < c2thread_arr2.m; i++){        
            min = c2thread_arr2.arr[i][0];
            for(int j = 0; j < c2thread_arr2.n; j++){
                if((c2thread_arr2.arr[i][j]) < min){
                    min = c2thread_arr2.arr[i][j];                    
                }                
            }
        System.out.println("min hang "+i+" la: "+min);            
        }         
    }
    public void mincot(){
        int min = c2thread_arr2.arr[0][0];;
        for(int j = 0; j < c2thread_arr2.n; j++){                
            min = c2thread_arr2.arr[0][j];
            for(int i = 0; i < c2thread_arr2.m; i++){
                if((c2thread_arr2.arr[i][j]) < min){
                    min = c2thread_arr2.arr[i][j];                    
                }                
            }  
            System.out.println("min cot "+j+" la: "+min);
        }
    }        
    
}
