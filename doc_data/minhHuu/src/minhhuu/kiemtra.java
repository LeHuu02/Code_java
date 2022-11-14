/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minhhuu;
import static minhhuu.kiemtra.arr;
import static minhhuu.kiemtra.m;
import static minhhuu.kiemtra.n;
import java.util.Scanner;
/*class main*/
public class kiemtra {
    static int n, m;
    static int [][] arr = new int[100][100];
    public static void main(String[] args) {    
        Scanner nhap = new Scanner(System.in);        
        do{
            System.out.println("nhap vao so phan tu mang: ");
            n = nhap.nextInt();
            m = n;
//            m = nhap.nextInt(); 
        }while(n <= 2 || n >= 50);                
        mang io = new mang();
        io.start();
    }
}

class mang extends Thread{
    @Override
    public void run(){
        nhap();
        xuat(); 
        mang2c m2 = new mang2c();
        m2.start();
        songuyento snt = new songuyento();
        snt.start();
        
    }
    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap  cac phan tu cua mang:  ");
        for(int i = 0; i < kiemtra.n; i++){
            for(int j = 0; j < kiemtra.m; j++){
                System.out.print("phan tu ["+i+"]["+j+"]: ");
                arr[i][j] = nhap.nextInt();
            }
        }
    }
    public void xuat(){
        System.out.println("in ra phan tu mang vua nhap: ");
        for(int i = 0; i < kiemtra.n; i++){
            for(int j = 0; j < kiemtra.m; j++){
                System.out.print("["+i+"]["+j+"]: "+arr[i][j]+"\t");
            }
            System.out.println("");
        }
    }  
}

class songuyento extends Thread{
    @Override
    public void run(){        
//        insnt();
        tongsnt();
    }
    public boolean ktrasnt(int i){
        int dem = 0;
        if(i <=1)
            return false;
        for(int j = 1; j <= i; j++){
            if(i % j == 0){
                dem++;
            }
        }
        return dem == 2;
    }
    public void insnt(){
        int dem = 0;
        System.out.print("\nsnt trong mang la: ");
        for(int i = 0; i < kiemtra.n; i++){
            for(int j = 0; j < kiemtra.m; j++){
               if(ktrasnt(arr[i][j])){
                   System.out.print(arr[i][j]+"\t");
                   dem++;
               }                
            }
        }
        System.out.println("\nso luong snt trong mang la: "+dem);
    }  
    public void tongsnt(){
        int tong = 0;        
        for(int i = 0; i < kiemtra.n; i++){
            for(int j = 0; j < kiemtra.m; j++){
               if(ktrasnt(arr[i][j])){
                   tong +=arr[i][j];
               }                
            }
        }
        System.out.print("\ntong snt trong mang la: "+tong);
    }    
}

class mang2c extends Thread{
    @Override
    public void run(){
        in_tongchinh();
//        in_tongphu();        
//        mincot();
        minhang();
//        maxcot();
//        maxhang();
    }
    public void in_tongchinh(){
        int tong = 0;
        System.out.print("duong cheo chinh: ");
        for(int i = 0; i < kiemtra.n; i++){
            for(int j = 0; j < kiemtra.m; j++){
                if(i == j){
                    System.out.print(arr[i][j]+"\t");
                    tong += arr[i][j];
                }
            }
        }
        System.out.println("\ntong cheo chinh: "+tong);
    }
    public void in_tongphu(){
        int max = kiemtra.n, tong = 0;
        if(max < kiemtra.m)
            max = kiemtra.m;
        System.out.print("duong cheo phu: ");
        for(int i = 0; i < kiemtra.n; i++){
            for(int j = 0; j < kiemtra.m; j++){
                if(i + j == max-1){
                    System.out.print(arr[i][j]+"\t");
                    tong += arr[i][j];
                }
            }
        }
        System.out.println("\ntong cheo phu: "+tong);
    }
    public void minhang(){
        int min;        //theo hang thi gan [i][0]
        for(int i = 0; i < kiemtra.n; i++){
            min = arr[i][0];    //gan ptu dau tien cua moi hang
            for(int j = 1; j < kiemtra.m; j++){
                if(min > arr[i][j]){
                    min = arr[i][j];
                }
            }
            System.out.println("min hang "+i+ "la: "+min);
        }
        
    }
    public void maxhang(){
        int max;        //theo hang thi gan [i][0]
        for(int i = 0; i < kiemtra.n; i++){
            max = arr[i][0];    //gan ptu dau tien cua moi hang
            for(int j = 1; j < kiemtra.m; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
            System.out.println("max hang "+i+ "la: "+max);
        }
        
    }
    public void mincot(){
        int min;
        for(int j = 0; j < kiemtra.m; j++){
            min = arr[j][0];    //gan ptu dau tien cua moi cot
            for(int i = 0; i < kiemtra.n; i++){            
                    if(min > arr[i][j]){
                    min = arr[i][j];
                }
            }
        System.out.println("min cot "+j+ "la: "+min);
        }        
    }
    public void maxcot(){
        int max;
        for(int j = 0; j < kiemtra.m; j++){
            max = arr[j][0];    //gan ptu dau tien cua moi cot
            for(int i = 0; i < kiemtra.n; i++){            
                    if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        System.out.println("max cot "+j+ "la: "+max);
        }        
    }
    
}
