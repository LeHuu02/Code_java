/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
power by le minh huu 24/11/2022 @LeHuu02 @copyright
yeu cau:
        - tao doi tuong cong nhan gom: ma sv, ten, tuoi, phu cap\
        - nhap xuat ds cn
        - in sinh vien co luong >2000. luong = 200*phucap
        - nhap ma cn in ra thong tin
        - tach ten va ho cong nhan

NOTE:
*/
package lehuu_code;
import java.util.Scanner;

class congnhan{
    private String macn;
    private String ten;
    private int tuoi;
    private int phucap;
    private int luong;
    
    public congnhan(){};
    public congnhan(String macn, String ten, int tuoi, int phucap, int luong){
        this.macn = macn;
        this.phucap = phucap;
        this.ten = ten;
        this.tuoi = tuoi;
        this.luong = luong;
    }

    public String getMacn() {
        return macn;
    }
    public String getTen() {
        return ten;
    }
    public int getTuoi() {
        return tuoi;
    }
    public int getPhucap() {
        return phucap;
    }
    public int getLuong() {
        return luong;
    }
    
    public void nhap(congnhan cn[], int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ds cong nhan: ");
        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("nhap cn thu: "+(i+1));
            System.out.println("nhap ma: ");
            macn = sc.nextLine();
            System.out.println("nhap ten: ");
            ten = sc.nextLine();
            System.out.println("nhap tuoi: ");
            tuoi = sc.nextInt();
            System.out.println("nhap phucap: ");
            phucap = sc.nextInt();
            luong = 200*phucap;
            cn[i] = new congnhan(macn, ten, tuoi, phucap,luong){};
            
        }
    }
    public void xuat(congnhan cn[], int n){
        System.out.println("in danh sach cn: ");
        for(int i = 0; i < n; i++){
            System.out.println(cn[i].toString());
        }
    }

    @Override
    public String toString() {
        return "congnhan{" + "macn=" + macn + ", ten=" + ten + ", tuoi=" + tuoi + ", phucap=" + phucap + ", luong=" + luong + '}';
    }
    public void timkiem(congnhan cn[], int n){
        Scanner sc = new Scanner(System.in);
        String name;
        int dem = 0;
        System.out.println("nhap ten can tim: ");
        name = sc.nextLine();
        for(int i = 0; i < n; i++){
            if(name.equals(cn[i].ten) == true){
                System.out.println(cn[i].toString());
                dem++;
            }
        }
        if(dem == 0){
            System.out.println("khong co thong tin cn can tim: ");
        }
    }
    public void tachten(congnhan cn[], int n){
        /*
        tach ten: 
        cach lam: 
                - chuyen chuoi string sang mang ky tu: charAt()
                - xoa khoang trang dau cuoi: trim();
                - do chieu dai chuoi: length();
                - duyet tu cuoi den khoang trang dau tien: 
                - copy chuoi tu khoang trang den het: subString();
        */
        int i, x = 0;
        String str, yourname;
        for(i = 0; i < n; i++){
            str = cn[i].ten;
            str = str.trim();
            for(int j = (str.length())-1; j > 0; j--){
                if(str.charAt(j) == ' '){
                    x = j;
                    break;
                }                
            }
            yourname = str.substring(x);
            System.out.println("ten la: "+yourname);
        }
        
    }
    public void tachho(congnhan cn[], int n){
        /*
        tach ten: 
        cach lam: 
                - chuyen chuoi string sang mang ky tu: charAt()
                - xoa khoang trang dau cuoi: trim();
                - do chieu dai chuoi: length();
                - duyet tu dau den khoang trang dau tien: 
                - copy chuoi tu dau den khoang trang : subString(x,y);
        */
        int i, x = 0;
        String str, ho;
        for(i = 0; i < n; i++){
            str = cn[i].ten;
            str = str.trim();
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == ' '){
                    x = j;
                    break;
                }                
            }
            ho = str.substring(0, x);
            System.out.println("ho la: "+ho);
        }
        
    }
}
public class c2object_cn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap so luong cn: ");
        n = sc.nextInt();
        congnhan congn = new congnhan();
        congnhan cn[] = new congnhan[10];
//        congn.nhap(cn, n);
//        congn.xuat(cn, n);
        try{
            congn.nhap(cn, n);
            congn.xuat(cn, n);
            congn.tachten(cn, n);
            congn.tachho(cn, n);
        }catch(Exception e){
            System.out.println("CHUC MUNG BAN CO BUG BUG "+ e);
        }
        
    }
}
