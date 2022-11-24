/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
bai tap mang hai chieu tinh tong, chan, le, in snt, chinh phuong,....
POWER BY LE MINH HUU 6/10/2022
Viết chương trình nhập vào số hàng n, và số cột m của mảng từ bàn phím (n>0, m>0).
Nhập mảng/xuất mảng.
Tính tổng các phần tử mảng, tổng các phần tử chẵn, tổng các phần tử lẻ, tổng các phần tử chia hết cho 3, tổng các phần tử không chia hết cho 5 (tương tự các bài toán in ra màn hình và đếm).
Tính tổng các phần tử chia hết cho cả 2 và 3.
Tìm min / tìm max trong mảng.
In ra màn hình các phần tử âm/dương trong mảng.
In ra màn hình các số nguyên tố, số hoàn hảo, số chính phương trong mảng.
Tìm phần tử x trong mảng
*/
package Array;
import java.util.Scanner;
/*class main*/
public class Mang_2_chieu {
    public static void main(String[] args) {
        int [][] arr = new int[100][100];
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap vao so phan tu mang: ");
        int n, m;
        n = nhap.nextInt();
        m = nhap.nextInt();
        
        mang io = new mang();
        io.nhap(arr, n, m);
        io.xuat(arr, n, m);
        io.tongmang(arr, n, m);
        io.tongchanle(arr, n, m);
        io.tongchia2_3_5(arr, n, m);
        io.insoam(arr, n, m);
        io.minmax(arr, n, m);
        
        mang2c m2 = new mang2c();
        m2.in_tongchinh(arr, n, m);
        m2.in_tongphu(arr, n, m);
        m2.maxcot(arr, n, m);
        m2.maxhang(arr, n, m);
        m2.mincot(arr, n, m);
        m2.minhang(arr, n, m);
        
        songuyento snt = new songuyento();
        snt.insnt(arr, n, m);
        snt.tongsnt(arr, n, m);
    }
}

class mang{
    public void nhap(int arr[][], int n, int m){
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap  cac phan tu cua mang:  ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("phan tu ["+i+"]["+j+"]: ");
                arr[i][j] = nhap.nextInt();
            }
        }
    }
    public void xuat(int arr[][], int n, int m){
        System.out.println("in ra phan tu mang vua nhap: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("["+i+"]["+j+"]: "+arr[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public void tongmang(int arr[][], int n, int m){
        int tong = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                tong += arr[i][j];
            }
        }
        System.out.println("tong phan tu mang: "+tong);
    }
    public void tongchanle(int arr[][], int n, int m){
        int tongchan = 0, tongle = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j]%2 == 0){
                    tongchan +=arr[i][j];
                }else{
                    tongle +=arr[i][j];
                }
            }
        }
        System.out.println("tong le phan tu mang: "+tongle);
        System.out.println("tong chan phan tu mang: "+tongchan);
    }
    public void timptuvitrix(int arr[][], int n, int m){
        Scanner nhap = new Scanner(System.in);
        System.out.print("nhap phan tu can tim mang: ");
        int x = nhap.nextInt();
        int dem = 0;
        System.out.println("vi tri cua ptru "+x+ " la: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(x == arr[i][j]){
                    dem++;
                    System.out.println("["+i+"]{"+j+"]");
                }
            }
        }
        if(dem == 0){
            System.out.print("khong tim thay ptu "+x+" trong mang");
        }
    }
    public void tongchia2_3_5(int arr[][], int n, int m){     
        int t2 = 0, t3 = 0, t5 = 0, t55 = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                /*tong chia 2*/
                if(arr[i][j]%2 == 0){
                    t2 += arr[i][j];
                }
                /*tong chia 5*/
                if(arr[i][j]%5 == 0){
                    t5 += arr[i][j];
                }
                /*tong chia 3*/
                if(arr[i][j]%3 == 0){
                    t3 += arr[i][j];
                }
                /*tong chia 2 va 5*/
                if(arr[i][j]%2 == 0 && arr[i][j]%5 == 0){
                    t55 += arr[i][j];
                }          
            }
        }
        System.out.println("tong chia het cho 2: "+t2);
        System.out.println("tong chia het cho 3: "+t3);
        System.out.println("tong chia het cho 5: "+t5);
        System.out.println("tong chia het cho 2 va 5 : "+t55);
    }
    public void insoam(int arr[][], int n, int m){
        System.out.println("cac phan tu co gia tri am trong mang: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] < 0){
                    System.out.print(arr[i][j]+"\t");
                }
            }
        }
    }
    public void minmax(int arr[][], int n, int m){
        int min = arr[0][0], max = arr[0][0]; 
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(min > arr[i][j]){
                    min = arr[i][j];
                }
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("max trong mang: "+max);
        System.out.println("min trong mang: "+min);
    }  
}

class songuyento{
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
    public void insnt(int arr[][], int n, int m){
        int dem = 0;
        System.out.print("\nsnt trong mang la: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
               if(ktrasnt(arr[i][j])){
                   System.out.print(arr[i][j]+"\t");
                   dem++;
               }                
            }
        }
        System.out.println("\nso luong snt trong mang la: "+dem);
    }  
    public void tongsnt(int arr[][], int n, int m){
        int tong = 0;        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
               if(ktrasnt(arr[i][j])){
                   tong +=arr[i][j];
               }                
            }
        }
        System.out.print("\ntong snt trong mang la: "+tong);
    }    
}

class mang2c{
    public void in_tongchinh(int arr[][], int n, int m){
        int tong = 0;
        System.out.print("duong cheo chinh: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == j){
                    System.out.print(arr[i][j]+"\t");
                    tong += arr[i][j];
                }
            }
        }
        System.out.println("\ntong cheo chinh: "+tong);
    }
    public void in_tongphu(int arr[][], int n, int m){
        int max = n, tong = 0;
        if(max < m)
            max = m;
        System.out.print("duong cheo phu: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i + j == max-1){
                    System.out.print(arr[i][j]+"\t");
                    tong += arr[i][j];
                }
            }
        }
        System.out.println("\ntong cheo phu: "+tong);
    }
    public void tongcheochinh(int arr[][], int n, int m){
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                
            }
        }
        
    }
    public void minhang(int arr[][], int n, int m){
        int min;        //theo hang thi gan [i][0]
        for(int i = 0; i < n; i++){
            min = arr[i][0];    //gan ptu dau tien cua moi hang
            for(int j = 1; j < m; j++){
                if(min > arr[i][j]){
                    min = arr[i][j];
                }
            }
            System.out.println("min hang "+i+ "la: "+min);
        }
        
    }
    public void maxhang(int arr[][], int n, int m){
        int max;        //theo hang thi gan [i][0]
        for(int i = 0; i < n; i++){
            max = arr[i][0];    //gan ptu dau tien cua moi hang
            for(int j = 1; j < m; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
            System.out.println("max hang "+i+ "la: "+max);
        }
        
    }
    public void mincot(int arr[][], int n, int m){
        int min;
        for(int j = 0; j < m; j++){
            min = arr[j][0];    //gan ptu dau tien cua moi cot
            for(int i = 0; i < n; i++){            
                    if(min > arr[i][j]){
                    min = arr[i][j];
                }
            }
        System.out.println("min cot "+j+ "la: "+min);
        }        
    }
    public void maxcot(int arr[][], int n, int m){
        int max;
        for(int j = 0; j < m; j++){
            max = arr[j][0];    //gan ptu dau tien cua moi cot
            for(int i = 0; i < n; i++){            
                    if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        System.out.println("max cot "+j+ "la: "+max);
        }        
    }
    
}
