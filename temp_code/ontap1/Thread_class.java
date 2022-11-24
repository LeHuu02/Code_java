/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
THREAD HAI CHIEU

*/
package ontap1;
import java.util.Scanner;
import java.lang.Thread;
import static ontap1.Thread_class.arr;
import static ontap1.Thread_class.m;
import static ontap1.Thread_class.n;

class sum extends Thread{
    int tong = 0;
    @Override
    public void run(){
        tinh();
        max();
        in_snt();
    }
    public void tinh(){
        for(int i  = 0; i < Thread_class.m; i++){
            for(int j = 0; j < Thread_class.n; j++){
                tong += Thread_class.arr[i][j];
            }
        }
        System.out.println("tong cac phan tu trong mang la: "+tong);
    }    
    public void max(){
        int max = Thread_class.arr[0][0];
        for(int i  = 0; i < Thread_class.m; i++){
            for(int j = 0; j < Thread_class.n; j++){
                if(max < Thread_class.arr[i][j] )
                    max = Thread_class.arr[i][j];
            }
        }  
        System.out.println("max: "+max);
    }
    public void inmang(){
        System.out.println("mang vua nhap la: ");
        for(int i  = 0; i < Thread_class.m; i++){
            for(int j = 0; j < Thread_class.n; j++){
                System.out.print(Thread_class.arr[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public boolean ktsnt(int n){
        int dem = 0;
        for(int i = 1; i <=n; i++){
            if(n % i == 0){
                dem++;
            }
        }
        if(dem == 2) return true;
        return false;
    }
    public void in_snt(){
        int dem = 0;
        System.out.println("so nguyen to trong mang la: ");
        for(int i  = 0; i < Thread_class.m; i++){
            for(int j = 0; j < Thread_class.n; j++){
                if(ktsnt(Thread_class.arr[i][j]) == true){
                    System.out.println(Thread_class.arr[i][j]);
                    dem++;
                }                    
            }
        }
        if(dem == 0){
            System.out.println("khong co so nguyen to trong mang");
        }
    }
}

class hangcot extends Thread{
    @Override
    public void run(){
        maxhang();
        maxcot();
        cheochinh();
        cheophu();
    }
    //max hang
    public void maxhang(){
        int max, tonghang;
        for(int i  = 0; i < Thread_class.m; i++){
            max = Thread_class.arr[i][0];
            tonghang = 0;
            for(int j = 0; j < Thread_class.n; j++){
                tonghang += Thread_class.arr[i][j];
                if(max < Thread_class.arr[i][j] )
                    max = Thread_class.arr[i][j];
            }
            System.out.println("hang: "+(i+1)+" co tong la:  la "+tonghang+" max la: "+max );
        }          
        
    }
    //max cot
    public void maxcot(){
        int max, tongcot ;
        for(int j = 0; j < Thread_class.n; j++){        
            max = Thread_class.arr[0][j];
            tongcot = 0;
            for(int i  = 0; i < Thread_class.m; i++){    
                tongcot += Thread_class.arr[i][j];
                if(max < Thread_class.arr[i][j] )
                    max = Thread_class.arr[i][j];
            }
            System.out.println("cot: "+(j+1)+" co tong la:  la "+tongcot+" max la: "+max );
        }          
        
    }    

    //in + tong cheo chinh
    public void cheochinh(){
        int tongcheochinh = 0;
        System.out.println("duong cheo chinh cua mang la: ");
        for(int i  = 0; i < Thread_class.m; i++){
            for(int j = 0; j < Thread_class.n; j++){                
                if( i == j){
                    System.out.print(Thread_class.arr[i][j]+"\t");
                    tongcheochinh += Thread_class.arr[i][j];
                }                    
            }
        }                  
        System.out.println("\ntong duong cheo chinh mang la: "+ tongcheochinh);
    }
    //in + tong cheo phu
    public void cheophu(){
        int tongcheophu = 0;
        System.out.println("duong cheo phu cua mang la: ");
        for(int i  = 0; i < Thread_class.m; i++){
            for(int j = 0; j < Thread_class.n; j++){                
                if( i + j + 1 == Thread_class.n){
                    System.out.print(Thread_class.arr[i][j]+"\t");
                    tongcheophu += Thread_class.arr[i][j];
                }                    
            }
        }                  
        System.out.println("\ntong duong cheo phu mang la: "+ tongcheophu);
    }
    
}

public class Thread_class {
    static int arr[][] = new int[10][10];
    static int m, n;
    
    public void inmang(){
        System.out.println("mang vua nhap la: ");
        for(int i  = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so pha tu mang m n:");
        m = sc.nextInt();
        n = sc.nextInt();
        for(int i  = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print("arr["+i+"]["+j+"]:  ");
                arr[i][j] = sc.nextInt();
            }
        }
        //goi ham in ra mang hai chieu.
        Thread_class tc = new Thread_class();
        tc.inmang();
        
        //goi ham tinh tong
        sum su = new sum();
//        su.start();
        hangcot ht = new hangcot();
        ht.start();
    }
    

}
