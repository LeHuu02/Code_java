/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
bai tap mang mot chieu tinh tong, chan, le, in snt, chinh phuong,....
LE MINH HUU 6/10/2022
*/
package Array;

import java.util.Scanner;

/*tao mot lop ten la mang gom cac ham nhap xuat, tinh tong,....*/
class mang {
    /*ham nhap mang*/
    public void nhapmang(int arr[], int n) {
        Scanner nhap = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("phan tu thu " + (i + 1) + ":\t");
            arr[i] = nhap.nextInt();
        }
    }
    /*ham xuat mang ra man hinh*/
    public void xuatmang(int arr[], int n) {
        System.out.println("in ra mang vua nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.printf(arr[i] + "\t");
        }
    }
    /*ham tinh tong tat ca gia tri trong mang*/
    public void tongmang(int arr[], int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += arr[i];
        }
        System.out.println("\ntong cac phan tu trong mang: " + tong);
    }
    /*ham tinh tong gtri chan va gtri le*/
    public void tongchanle(int arr[], int n) {
        int tongchan = 0, tongle = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                tongchan += arr[i];
            } else {
                tongle += arr[i];
            }
        }
        System.out.println("tong chan: " + tongchan);
        System.out.println("tong chan: " + tongle);
    }
    /*ham tinh tong gia tri chia het cho 2 3 va 5*/
    public void tongchia2_3_5(int arr[], int n){
        int t2 = 0, t3 = 0, t5 = 0, t55 = 0;
        for(int i = 0; i < n; i++){
            /*tong chia 2*/
            if(arr[i]%2 == 0){
                t2 += arr[i];
            }
            /*tong chia 5*/
            if(arr[i]%5 == 0){
                t5 += arr[i];
            }
            /*tong chia 3*/
            if(arr[i]%3 == 0){
                t3 += arr[i];
            }
            /*tong chia 2 va 5*/
            if(arr[i]%2 == 0 && arr[i]%5 == 0){
                t55 += arr[i];
            }           
        }
        System.out.println("tong chia het cho 2: "+t2);
        System.out.println("tong chia het cho 3: "+t3);
        System.out.println("tong chia het cho 5: "+t5);
        System.out.println("tong chia het cho 2 va 5 : "+t55);
    }
    /*ham in ra cac so am trong mang*/
    public void insoam(int arr[], int n){        
        System.out.print("\ncac phan tu co gia tri am trong mang la: ");
        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                System.out.print(arr[i]+"\t");
            }
        }        
    }
    /*ham tinh tong cac gia tri o vi tri chan va le*/
    public void tongvitrichanle(int arr[], int n){     
        int tongvtchan = 0, tongvtle  = 0;
        for(int i = 0; i < n; i = i+2){
            tongvtchan +=arr[i];
            tongvtle +=arr[i+1];
        }
        System.out.println("tong ptu o vi tri chan la: "+tongvtchan);
        System.out.println("tong ptu o vi tri le la: "+tongvtle);
    }
    /*ham in vi tri cua phan tu x*/
    public void timptuvitrix(int arr[], int n){
        int x, dem = 0;
        Scanner nhap = new Scanner(System.in);
        System.out.printf("nhap so phan tu mang: ");
        x = nhap.nextInt();     
        System.out.println("vi tri cua phan tu "+x+" la: ");
        for(int i = 0; i < n; i++){
            if(arr[i] ==  x){
                System.out.print((i+1)+"\t");
                dem++;
            }
        }
        if(dem == 0){
            System.out.println("khong tim thay pha tu " +x+" trong mang!");
        }
    }
    /*ham sap xep tang*/
    public void sapxeptang(int arr[], int n){
        int temp;
        for(int i = 1; i < n; i++){
            for(int j = i+1; j < i; i++){
                if(arr[i] > arr[j]){      //neu vi tri sau lon hon vi tri truoc
                    temp = arr[i];      //cho temp =  gtri bien truoc 
                    arr[i] = arr[j];    //gtri bien truoc bang gtri bien sau
                    arr[j] = temp;      //gia tri bien sau = gtri temp
                }
            }
        } 
        System.out.print("\nmang sap xep tang: ");
        for (int i = 0; i < n; i++) {
            System.out.printf(arr[i] + "\t");
        }
    }
    /*ham sap xep giam*/
    public void sapxepgiam(int arr[], int n){
        int temp;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < i; i++){
                if(arr[i] < arr[j]){      //neu vi tri sau lon hon vi tri truoc
                    temp = arr[i];      //cho temp =  gtri bien truoc 
                    arr[i] = arr[j];    //gtri bien truoc bang gtri bien sau
                    arr[j] = temp;      //gia tri bien sau = gtri temp
                }
            }
        }
        System.out.print("\nmang sap xep giam: ");
        for (int i = 0; i < n; i++) {
            System.out.printf(arr[i] + "\t");
        }
    }
}

/*lop so nguyen to*/
class songuyento {

    /*snt la so chi chia het cho 1 va chinh no*/
    public boolean ktrasnt(int i) {
        int dem = 0;
        if(i <= 0)
            return false;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                dem++;
            }
        }
        return dem == 0;    /*neu dem == 0 thi in ra dung nguoc lai in sai*/
    }
    /*in snt theo kieu cu*/
    public void insnt(int arr[], int n) {
        int dem;
        System.out.println("so nguyen to trong mang la:");
        for (int i = 0; i < n; i++) {
            dem = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    dem++;
                }
            }
            if (dem == 2) {
                System.out.print(arr[i] + "\t");
            }
        }
    }
    /*in snt sd ham ktrasnt*/
    public void insntkieu1(int arr[], int n) {
        System.out.println("\nso nguyen to trong mang la:");
        for (int i = 0; i < n; i++) {
            if(ktrasnt(arr[i])){
                System.out.print(arr[i] + "\t");
            }
        }
    }
    /*dem snt co trong mang*/
    public void demsnt(int arr[], int n) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if(ktrasnt(arr[i])){
                dem++;
            } 
        }
        System.out.print("\nco trong mang la co tat ca la: "+dem+" snt");
    }
    /*tinh tong cac snt co trong man*/
    public void tongsnt(int arr[], int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if(ktrasnt(arr[i])){
                tong += arr[i];
            } 
        }
        System.out.print("\ntong so snt co trong mang la: "+tong);
    }
}

/*class chinh*/
public class Array_basic {

    /*function main*/
    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner nhap = new Scanner(System.in);
        System.out.printf("nhap so phan tu mang: ");
        int n;
        n = nhap.nextInt();
        
        /*tao doi tuong a tu class mang o tren*/
        mang a = new mang();
        a.nhapmang(arr, n);
        a.xuatmang(arr, n);
        a.tongmang(arr, n);
        a.tongchanle(arr, n);
        a.tongchia2_3_5(arr, n);
        a.tongvitrichanle(arr, n);
        a.timptuvitrix(arr, n);
        a.sapxepgiam(arr, n);
        a.sapxeptang(arr, n);        
        a.insoam(arr, n);  
        
                int temp;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < i; j++){
                if(arr[i] > arr[j]){      //neu vi tri sau lon hon vi tri truoc
//                    temp = arr[i];      //cho temp =  gtri bien truoc 
//                    arr[i] = arr[j];    //gtri bien truoc bang gtri bien sau
//                    arr[j] = temp;      //gia tri bien sau = gtri temp
//                    
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        } 
        System.out.print("\nmang sap xep tang: ");
        for (int i = 0; i < n; i++) {
            System.out.printf(arr[i] + "\t");
        }
        
        /*tao doi tuong snt thuoc lop songuyento*/
        songuyento snt = new songuyento();
        snt.insntkieu1(arr, n);
        snt.demsnt(arr, n);
        snt.tongsnt(arr, n);
    }


}
