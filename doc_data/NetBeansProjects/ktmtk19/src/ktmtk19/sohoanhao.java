













package ktmtk19;
import java.util.Scanner;

 

 
public class sohoanhao {
    public static boolean hhao(int n){
    
        int tong=0;
        for(int i=1;i<n;i++){
            if(n%i==0)tong=tong+i;
        }
        if(tong==n)return true;
        return false;
        
         
    }
      
     public static void main(String args[]){
        int n;
        Scanner nhap=new Scanner(System.in);
        do{
            System.out.print("Nhap n");
            n=nhap.nextInt();
        }while(n<2 || n>100);
        //kiem tra so nguyen to
        int demuoc=0;
        for(int i=2;i<n;i++){
            if(n%i==0)demuoc++;
        }
        if(demuoc==0){
            System.out.println(n+"la so hoanhao");
        }else{
                System.out.println(n+"khong la hoan hao");
        }
        //in ra songuyen  to
        System.out.print("cac so hoanhao tu1den "+n+"la: ");
        for(int i=0;i<n;i++){
            if(hhao(i))System.out.print(i+" ");
            
        }
        //inran so ngueyn to
        System.out.println("");
        int dem=1,i=1;
        System.out.print("danh sach "+n+"so hoan hao dau tien; ");
        while(dem<=n){
            if(hhao(i)){
                System.out.print(i+" ");
                dem++;
            }
            i++;
            }
        }
        
            }

    