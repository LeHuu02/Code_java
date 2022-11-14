
package ktmtk19;
import java.util.Scanner;

public class khachhang {
      private  int makh;
    private  String hoten;
    private  int tuoi;
    private  String diachi;
    private  int  sodt;

 
    
    public khachhang(){}
   public khachhang(int makh,String hoten,int tuoi,String diachi,int sodt){
        this.makh=makh;
        this.hoten=hoten;
        this.tuoi=tuoi;
        this.diachi=diachi;
        this.sodt=sodt;
    }

    public int getTuoi() {
        return tuoi;
    }

    public int getMakh() {
        return makh;
    }

    public String getHoten() {
        return hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public int getSodt() {
        return sodt;
    }


    public static void nhapTT(khachhang kh[],int n){
       Scanner nhap=new Scanner (System.in);
       int tuoi,sodt,makh;
             
       String hoten,diachi;
       for(int i=0;i<n;i++){
            System.out.print("hoten:");//nhap.nextLine();
             hoten=nhap.nextLine();
            
             System.out.print("dia chi:");//nhap.nextLine();
            diachi=nhap.nextLine();
            System.out.print("ma khach hang:");
             makh=nhap.nextInt();
            System.out.print("tuoi:");tuoi=nhap.nextInt();
            
             System.out.print("sodt:");sodt=nhap.nextInt();
            nhap.nextLine();
              
             
       kh[i]=new khachhang(makh,hoten,tuoi,diachi,sodt){};
       }
       
   } 
   public  void hienTT(khachhang kh[],int n){
      System.out.println("ma kh - hoten - tuoi- diachi-sodt");
      for(int i=0;i<n;i++){
     
           System.out.println(kh[i].getMakh()+"_"+kh[i].getHoten()+"-"+kh[i].getTuoi()+"-"+kh[i].getDiachi()+"-"+kh[i].getSodt());
      }
   }
 public  void khlonhon60(khachhang kh[],int n){
     System.out.println("khach hang co tuoi lon hon 60 la:");
     System.out.println("ma kh - hoten - tuoi- diachi-sodt");
       for(int i=0;i<n;i++){
           if(kh[i].getTuoi()>60)
       
           System.out.println(kh[i].getMakh()+"-"+kh[i].getHoten()+"-"+kh[i].getTuoi()+"-"+kh[i].getDiachi()+"-"+kh[i].getSodt());
 }
}
 public  void sodienthoai(khachhang kh[],int n){
     System.out.println("khach hang co so dt 123456 la:");
     System.out.println("ma kh - hoten - tuoi- diachi-sodt");
       for(int i=0;i<n;i++){
           if(kh[i].getSodt()==123456)
       
           System.out.println(kh[i].getMakh()+"-"+kh[i].getHoten()+"-"+kh[i].getTuoi()+"-"+kh[i].getDiachi()+"-"+kh[i].getSodt());
 }
}
 public void timten(khachhang kh[],int n){
       String ten;
       Scanner nhap=new Scanner (System.in);
        System.out.println("nhap ten can tim:");ten=nhap.nextLine();
       System.out.println("khach hang can tim la:");
        for(int i=0;i<n;i++){
            if (kh[i].getHoten().equals(ten))
                System.out.println(kh[i].getMakh()+"-"+kh[i].getHoten()+"-"+kh[i].getTuoi()+"-"+kh[i].getDiachi()+"-"+kh[i].getSodt());
        }
   }
    
}
