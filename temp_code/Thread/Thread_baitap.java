/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
POWER BY LE MINH HUU 6/10/2022
Thread - luong trong java
*/
package Thread;

import static Thread.Thread_baitap.a;
import static Thread.Thread_baitap.n;

import java.lang.Thread;
import java.util.Scanner;

/*class tinh tong ke thua tu Thread*/
class tinhtong extends Thread{
    @Override       //ghi de lop con len lop cha
    /*function run chua cac cau lenh de chay nhung khi thuc hien thi goi trong ham start*/
    public void run(){
        int tong = 0;
        for(int i = 0; i < Thread_baitap.n; i++){
            tong += Thread_baitap.a[i];
        }
        System.out.println("tong cac phan tu mang la: "+tong);
    }
}

/*class tim max ke thua tu Thread*/
class find_max extends Thread{
    int max = Thread_baitap.a[0];
    @Override
    public void run(){
        for(int i = 1; i < Thread_baitap.n; i++){
            if(max < Thread_baitap.a[i]){
                max = Thread_baitap.a[i];
            }
        }
        System.out.println("max: "+max);
    }
}

class nhapxuat extends Thread{
    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap ptu mang: ");
        for(int i = 0; i < Thread_baitap.n; i++){
            System.out.print("ptu "+(i+1)+": ");
            a[i] = nhap.nextInt();
        }
    }
    public void xuat(){
        System.out.print("in ra phan tu trong mang: ");
        for(int i = 0; i < Thread_baitap.n; i++){
            System.out.print(a[i]);
        }
    }
    @Override
    public void run(){
        nhap();
        xuat();
        tinhtoan ttoan = new tinhtoan();
        ttoan.start();
        songuyento snt = new songuyento();
        snt.start();
    }
}

class tinhtoan extends Thread{
    @Override
    public void run(){
        tongmang();
        tongchanle();
        tongchia2_3_5();
        insoam();
        tongvitrichanle();
        timptuvitrix();
        sapxeptang();
        sapxepgiam();
    }
    public void tongmang(){
        int tong = 0;
        for(int i = 0; i < Thread_baitap.n; i++ ){
            tong += a[i];
        }
        System.out.println("tong ptu trong mang la: "+tong);
    }
    public void tongchanle(){
        int tongvtchan = 0, tongvtle  = 0;
        for(int i = 0; i < Thread_baitap.n; i = i+2){
            tongvtchan +=a[i];
            tongvtle +=a[i+1];
        }
        System.out.println("tong ptu o vi tri chan la: "+tongvtchan);
        System.out.println("tong ptu o vi tri le la: "+tongvtle);
    }
    public void tongchia2_3_5(){
        int t2 = 0, t3 = 0, t5 = 0, t55 = 0;
        for(int i = 0; i < Thread_baitap.n; i++){
            /*tong chia 2*/
            if(a[i]%2 == 0){
                t2 += a[i];
            }
            /*tong chia 5*/
            if(a[i]%5 == 0){
                t5 += a[i];
            }
            /*tong chia 3*/
            if(a[i]%3 == 0){
                t3 += a[i];
            }
            /*tong chia 2 va 5*/
            if(a[i]%2 == 0 && a[i]%5 == 0){
                t55 += a[i];
            }           
        }
        System.out.println("tong chia het cho 2: "+t2);
        System.out.println("tong chia het cho 3: "+t3);
        System.out.println("tong chia het cho 5: "+t5);
        System.out.println("tong chia het cho 2 va 5 : "+t55);
    }
    public void insoam(){
        System.out.print("\ncac phan tu co gia tri am trong mang la: ");
        for(int i = 0; i < Thread_baitap.n; i++){
            if(a[i] < 0){
                System.out.print(a[i]+"\t");
            }
        }
    }
    public void tongvitrichanle(){
        int tongvtchan = 0, tongvtle  = 0;
        for(int i = 0; i < Thread_baitap.n; i = i+2){
            tongvtchan +=a[i];
            tongvtle +=a[i+1];
        }
        System.out.println("tong ptu o vi tri chan la: "+tongvtchan);
        System.out.println("tong ptu o vi tri le la: "+tongvtle);
    }
    public void timptuvitrix(){
        int x, dem = 0;
        Scanner nhap = new Scanner(System.in);
        System.out.printf("nhap so phan tu mang: ");
        x = nhap.nextInt();     
        System.out.print("vi tri cua phan tu "+x+" la: ");
        for(int i = 0; i < Thread_baitap.n; i++){
            if(a[i] ==  x){
                System.out.print((i+1)+"\t");
                dem++;
            }
        }
        if(dem == 0){
            System.out.println("khong tim thay pha tu " +x+" trong mang!");
        }
    }
    public void sapxeptang(){
        int temp;
        for(int i = 0; i < (Thread_baitap.n-1); i++){
            for(int j = i+1; j < Thread_baitap.n; j++){
                if(a[i] > a[j]){      //neu vi tri sau lon hon vi tri truoc
                    temp = a[i];      //cho temp =  gtri bien truoc 
                    a[i] = a[j];    //gtri bien truoc bang gtri bien sau
                    a[j] = temp;      //gia tri bien sau = gtri temp
                }
            }
        } 
        System.out.print("\nmang sap xep tang: ");
        for (int i = 0; i < Thread_baitap.n; i++) {
            System.out.printf(a[i] + "\t");
        }
    }
    public void sapxepgiam(){
        int temp;
        for(int i = 0; i < (Thread_baitap.n-1); i++){
            for(int j = i+1; j < n; j++){
                if(a[i] < a[j]){      //neu vi tri sau lon hon vi tri truoc
                    temp = a[i];      //cho temp =  gtri bien truoc 
                    a[i] = a[j];    //gtri bien truoc bang gtri bien sau
                    a[j] = temp;      //gia tri bien sau = gtri temp
                }
            }
        }
        System.out.print("\nmang sap xep giam: ");
        for (int i = 0; i < Thread_baitap.n; i++) {
            System.out.printf(a[i] + "\t");
        }
    }

}

class songuyento extends Thread{
    
    @Override
    public void run(){
        insntkieu1();
        demsnt();  
        tongsnt();
    }
    /*snt la so chi chia het cho 1 va chinh no*/
    public boolean ktrasnt(int i) {
        int dem = 0;
        if(i <= 1)
            return false;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                dem++;
            }
        }
        return dem == 0;    /*neu dem == 0 thi in ra dung nguoc lai in sai*/
    }
    /*in snt theo kieu cu*/
    public void insnt() {
        int dem;
        System.out.println("so nguyen to trong mang la:");
        for (int i = 0; i < Thread_baitap.n; i++) {
            dem = 0;
            for (int j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    dem++;
                }
            }
            if (dem == 2) {
                System.out.print(a[i] + "\t");
            }
        }
    }
    /*in snt sd ham ktrasnt*/
    public void insntkieu1() {
        System.out.println("\nso nguyen to trong mang la:");
        for (int i = 0; i < Thread_baitap.n; i++) {
            if(ktrasnt(a[i])){
                System.out.print(a[i] + "\t");
            }
        }
    }
    /*dem snt co trong mang*/
    public void demsnt() {
        int dem = 0;
        for (int i = 0; i < Thread_baitap.n; i++) {
            if(ktrasnt(a[i])){
                dem++;
            } 
        }
        System.out.print("\nco trong mang la co tat ca la: "+dem+" snt");
    }
    /*tinh tong cac snt co trong man*/
    public void tongsnt() {
        int tong = 0;
        for (int i = 0; i < Thread_baitap.n; i++) {
            if(ktrasnt(a[i])){
                tong += a[i];
            } 
        }
        System.out.print("\ntong so snt co trong mang la: "+tong);
    }
}

/*lop chinh */
public class Thread_baitap {
    /*khai bao bien toan cuc co the truy xuat o moi class*/
    static int a[] = new int[10]; 
    static int n;
    /*function main*/
    public static void main(String[] args) {
        /*tao doi tuong nhap */
        System.out.print("nhap so phan tu mang: ");
        Scanner nhap = new Scanner(System.in);
        n = nhap.nextInt();

        /*tao doi tuong tt thuoc class tinhtong*/
        tinhtong tt = new tinhtong();
//        tt.start();     //chay class tinh tong
        /*tao doi tuong timmax thuoc class find_max*/
        find_max timmax = new find_max();
//        timmax.start();  
        
        nhapxuat io = new nhapxuat();
        io.start();
        
        tinhtoan ttoan = new tinhtoan();
//        ttoan.start();
    
        songuyento snt = new songuyento();
//        snt.start();
    }
    
}
