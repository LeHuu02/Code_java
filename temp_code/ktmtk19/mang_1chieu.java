
package ktmtk19;
import java.util.Scanner;
class mang{
    public void nhapmang(int a[],int n){
        System.out.println("nhap vao cac phan tu mang:");
        Scanner sc=new Scanner (System.in);
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]=");
            a[i]=sc.nextInt();
            
        }      
    }
    public void xuatmang(int a[],int n){
        System.out.println("mang vua nhap la:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");  
    }
    }
    public int tongmang(int a[],int n){
        int tong=0;
        for(int i=0;i<n;i++){
            tong=tong+a[i];
            
        }
        return tong;
    }
    public int tongchan(int a[],int n){
      int  tongchan=0;
      for(int i=0;i<n;i++){
          if(a[i]%2==0){
              tongchan=tongchan+a[i];
          }
          
      }
      return tongchan;
    }
   public int tongle(int a[],int n){
      int  tongle=0;
      for(int i=0;i<n;i++){
          if(a[i]%2==1){
              tongle=tongle+a[i];
          }
          
      }
      return tongle;
    }
   public int chiahetcho3(int a[],int n){
      int  chia3=0;
      for(int i=0;i<n;i++){
          if(a[i]%3==0){
              chia3=chia3+a[i];
          }
          
      }
      return chia3;
    }
    public void xuatsoam(int a[],int n){
        System.out.println("mang vua nhap co cac so am la:");
        for(int i=0;i<n;i++){
            if(a[i]<0){
            System.out.print(a[i]+" ");  
    }
    }
  
}
    
    public int tongngto(int a[],int n){
       int tongnto=0,dem=0;
       for(int i=0;i<n;i++){
           dem=0;
           if(a[i]<2)continue;
           for(int j=2;j<a[i];j++){
               if(a[i]%j==0)dem++;
               
           }
           if(dem==0)tongnto=tongnto+a[i];
       }
       return tongnto;
        }
}

public class mang_1chieu {
    public static void main(String args[]){
        int n;
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao so luong phan tu mang n=");
        n=sc.nextInt();
        mang m=new mang();
        m.nhapmang(a, n);
        m.xuatmang(a, n);
        m.xuatsoam(a,n);
        System.out.println("tong nguyen to="+m.tongngto(a, n));
        System.out.println("tong mang="+m.tongmang(a, n));
        System.out.println("tong chan="+m.tongchan(a, n));
         System.out.println("tong le="+m.tongle(a, n));
         System.out.println("tong cac so chia het cho 3="+m.chiahetcho3(a, n));
    }
    
}
