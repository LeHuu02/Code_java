/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
CAU 2: QUAN LY CONG NHAN.
cho cong nhan gom: ma cn, ten, gioi tinh, nam sinh die chi.
tao lop con nhan gom: 
    cac toan tu tao lap.
    phuong thuc nhap hien thi thong tin sinh vien
tao lop quan ly cn thuc hien:
    nhap n: so luong cn  2 < n < 10. nhap hien thi n cn
    nhap ma cn in ra thong tin
*/
package ontap;
import java.util.Scanner;

//tao class cn
class congnhan{
    int macn;
    String ten;
    String gioitinh;
    int namsinh;
    String diachi;
    //toan tu tao lap trung ten voi ten lop.
    public congnhan(){}
    public congnhan(int macn, String ten, int namsinh, String diachi, String gioitinh){
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.namsinh = namsinh;
        this.macn = macn;
        this.ten = ten;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println("nhap thong tin cong nhan: ");
        System.out.print("nhap ten: ");
        ten = sc.nextLine();
        System.out.print("nhap dia chi:");
        diachi = sc.nextLine();
        System.out.print("nhap gioi tinh: ");
        gioitinh = sc.nextLine();
        System.out.print("nhap tuoi:");
        namsinh = sc.nextInt();
        System.out.print("nhap ma cn: ");
        macn = sc.nextInt();
    }
    public void xuat(){
        
    }

    @Override
    public String toString() {
        return "congnhan{" + "macn=" + macn + ", ten=" + ten + ", gioitinh=" + gioitinh + ", namsinh=" + namsinh + ", diachi=" + diachi + '}';
    }
}

public class OnTap {
    public static void main(String[] args) {
          //nhap so luong cong nhan.
        int n; 
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("nhap so luong cong nhan: ");
            n = sc.nextInt();       
            System.out.println(n);
        }while(n < 2 || n >10);               
        /*tao mang doi tuong cong nhan*/
        congnhan cn[] = new congnhan[10];
        
        //nhap thong tin cong nhan 
        System.out.println("nhap vao thong tin cong nhan");
        for(int i = 0; i < n; i++){            
            cn[i] = new congnhan();
            cn[i].nhap();
        }        
        // in thong tin
        for(int i = 0; i < n; i++){
            System.out.println("cong nhan thu: "+( i+1));
            System.out.println(cn[i].toString());
            
        }
        
        //nhap vao ma cong nhan in ra thong tin cong nhan do
        int maso, dem = 0;
        System.out.println("nhap vao ma cong nhan: ");
        maso = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            if(maso == cn[i].macn){
                System.out.println("thong tin cong nhan co ma: "+maso+" la: \n"+cn[i].toString());
                dem++;
            }
        }
        if(dem == 0){
            System.out.println("khong tim thay cong nhan co ma so: "+maso);
        }
        
        // in ra thong tin cong nhan co que tai thai nguyen
        int demtn = 0;
        String que = "thai nguyen";
        System.out.println("thong tin cong nhan co que thai nguyen la: ");
        for(int i = 0; i < n; i++){
            if(que.equals(cn[i].diachi) == true){
                demtn++;
                System.out.println(cn[i].toString());
            }
        }
        if(demtn == 0){
            System.out.println("khong co cong nhan nao co que tai thai nguyen");
        }
        
        //in ra danh sach thong tin cong nhan ve huu nam tuoi > 60, nu > 55
        int demn = 0;        
        String na = "nam";
        String nu = "nu";
        System.out.println("thong tin cong nhan da nghi huu nam > 60 nu >55: ");
        for(int i = 0; i < n; i++){
            if((2022 - cn[i].namsinh > 60) && na.equals(cn[i].gioitinh) == true){
                demn++;
                System.out.println(cn[i].toString());
            }else if((2022 - cn[i].namsinh > 55) && nu.equals(cn[i].gioitinh) == true){
                demn++;
                System.out.println(cn[i].toString());                
            }
        }
        if(demn == 0){
            System.out.println("khong co cong nhan nao da nghi huu");
        }
        
        //sap xep tang dan danh sach cong nhan theo ma cong nhan
        System.out.println("danh sach sv sau khi sap xep tang dan: ");
        int temp;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(cn[i].macn > cn[j].macn ){
                    temp = cn[j].macn;
                    cn[j].macn = cn[i].macn;
                    cn[i].macn = temp;
                }
            }
        }     
        for(int i = 0; i < n; i++){
            System.out.println(cn[i].toString());                
        }
    }
    
}
