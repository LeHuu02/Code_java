
package ktmtk19;
import java.util.Scanner;
import java.lang.Thread;

class xuattmang extends Thread{
    public void run(){
        System.out.println("mang vua nhap la: ");
        for(int i=0;i<ktrathread_2c.n;i++){
            for(int j=0;j<ktrathread_2c.m;j++ ){
                System.out.print(ktrathread_2c.a[i][j]+" ");
                
            }
            System.out.println();
        }
    }
}
class tongsont extends Thread{
    int demuoc, demsnt = 0; 
    int tongnt;
     public void run(){
    System.out.print("Cac so nguyen to trong mang: ");
    for(int i=0;i<ktrathread_2c.n;i++){
    for(int j=0;j<ktrathread_2c.m;j++){
		demuoc=0;
		if(ktrathread_2c.a[i][j]<=1)continue;
		for(int k=2;k<ktrathread_2c.a[i][j];k++){
			if(ktrathread_2c.a[i][j]%k==0)demuoc++;
		}
		if(demuoc==0){
			System.out.println(ktrathread_2c.a[i][j]+" ");
                        demsnt++;
                        tongnt=tongnt+ktrathread_2c.a[i][j];

		}
    }
	}
    System.out.println(" co " +demsnt+ "so nguyen to trong mang: ");
    System.out.println("Tong cac so nguyen to trong mang: "+tongnt);
}
}
 class in_tongcheochinh extends Thread{
     int tong=0;
     public void run(){
         System.out.print("duong cheo chinh: ");
         for(int i=0;i<ktrathread_2c.n;i++){
         for(int j=0;j<ktrathread_2c.m;j++){
             if(i==j){
                 System.out.print(ktrathread_2c.a[i][j]+"\t");
                 tong+=ktrathread_2c.a[i][j];
             }
         }    
         }
         System.out.println("tong cheo chinh: "+tong);
     }

}       
    class in_tongcheophu extends Thread{
     int tong=0,max=ktrathread_2c.n;
     public void run(){
         if(max<ktrathread_2c.m)
             max=ktrathread_2c.m;
         System.out.print("duong cheo phu: ");
         for(int i=0;i<ktrathread_2c.n;i++){
         for(int j=0;j<ktrathread_2c.m;j++){
             if(i+j==max-1){
                 System.out.print(ktrathread_2c.a[i][j]+"\t");
                 tong+=ktrathread_2c.a[i][j];
             }
         }    
         }
         System.out.println("tong cheo phu: "+tong);
     }

}       
 class minhang extends Thread{
     int min;
     public void run(){
          for(int i=0;i<ktrathread_2c.n;i++){
              min=ktrathread_2c.a[i][0];
         for(int j=1;j<ktrathread_2c.m;j++){
             if(min>ktrathread_2c.a[i][j]){
                 min=ktrathread_2c.a[i][j];
             }
     }
          System.out.println("min hang"+i+"la: "+min);
          }
         
     }
}    

class maxhang extends Thread{
     int max;
     public void run(){
          for(int i=0;i<ktrathread_2c.n;i++){
              max=ktrathread_2c.a[i][0];
         for(int j=1;j<ktrathread_2c.m;j++){
             if(max<ktrathread_2c.a[i][j]){
                 max=ktrathread_2c.a[i][j];
             }
     }
          System.out.println("max hang"+i+"la: "+max);
          }
         
     }
}
class mincot extends Thread{
    int min;
    public void run(){
        for(int j=0;j<ktrathread_2c.m;j++){
          min=ktrathread_2c.a[j][0];
          for(int i=0;i<ktrathread_2c.n;i++){
              if(min>ktrathread_2c.a[i][j]){
                  min=ktrathread_2c.a[i][j];
              }
          }
          System.out.println("min cot"+j+"la: "+min);
        }
    }
}
class maxcot extends Thread{
    int max;
    public void run(){
        for(int j=0;j<ktrathread_2c.m;j++){
          max=ktrathread_2c.a[j][0];
          for(int i=0;i<ktrathread_2c.n;i++){
              if(max<ktrathread_2c.a[i][j]){
                  max=ktrathread_2c.a[i][j];
              }
          }
          System.out.println("max cot"+j+"la: "+max);
        }
    }
}
class tongchann extends Thread{
    int  tongc;
    public void run(){
        tongc=0;
        for(int i=0;i<ktrathread_2c.n;i++){
         for(int j=0;j<ktrathread_2c.m;j++){
             if(ktrathread_2c.a[i][j]%2==0){
                 tongc+=ktrathread_2c.a[i][j];
    }
         }
        }
        System.out.println("tongcac phan tu chan trong mang la: "+tongc);
    }
}
class max extends Thread{
    int max=ktrathread_2c.a[0][0];
    public void run(){
       for(int i=0;i<ktrathread_2c.n;i++){
         for(int j=0;j<ktrathread_2c.m;j++){
             if(ktrathread_2c.a[i][j]>max){
                 max=ktrathread_2c.a[i][j];  
             }
         }
       }
       System.out.println("max mang= "+max);
    }
}
class  tongcot extends Thread{
    int tongc;
    public void run(){
        
        for(int j=0;j<ktrathread_2c.n;j++){
            tongc=0;
            for(int i=0;i<ktrathread_2c.m;i++){
                tongc+=ktrathread_2c.a[i][j];
                
            }
            System.out.println("tong cot"+j+" = "+tongc);
        }
    }
}
public class ktrathread_2c {
    static int a[][]=new int[10][10];
static int n,m;
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    do{
    System.out.print("Nhap vao so hang n= ");
    n=sc.nextInt();
    System.out.print("Nhap vao so cot m= ");
    m=sc.nextInt();
    }while(n>=5||50<=n);
    System.out.println("Nhap vao phan tu mang:");
    for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                System.out.print("a["+i+"]["+j+"]=");
                a[i][j]=sc.nextInt();
            }
    }
    xuattmang smg=new xuattmang();
    smg.start();
    tongsont tnt=new tongsont();
    tnt.start();
    in_tongcheochinh tcc=new in_tongcheochinh();
    tcc.start();
    in_tongcheophu tcp=new in_tongcheophu();
    tcp.start();
    minhang minh=new minhang();
    minh.start();
    maxhang maxh=new maxhang();
    maxh.start();
    mincot minc=new mincot();
    minc.start();
    maxcot maxc=new maxcot();
    maxc.start();
    tongchann tongchan=new tongchann();
    tongchan.start();
    max maxx=new max();
    maxx.start();
    tongcot tongcot=new tongcot();
    tongcot.start();
}

}
 /*  
//In, đếm, tính tổng các phần tử là số nguyên tố, số hoàn hảo, số chính phương.
class ngto extends Thread{
    int dem;  
     public void run(){
    System.out.print("Cac so nguyen to trong mang: ");
    for(int i=0;i<my_thread_1.n;i++){
    for(int j=0;j<my_thread_1.m;j++){
		dem=0;
		if(my_thread_1.a[i][j]<=1)continue;
		for(int k=2;k<my_thread_1.a[i][j];k++){
			if(my_thread_1.a[i][j]%k==0)dem++;
		}
		if(dem==0){
			System.out.println(my_thread_1.a[i][j]+" ");
		}
    }
	}
    //System.out.println(" co " +dem+ "so nguyen to trong mang: ");
    //System.out.println("Tong cac so nguyen to trong mang: "+tg1);
}
}

//hh
class hoanhao extends Thread{
    int tonguoc;  
     public void run(){
     System.out.print("Cac so hoan hao trong mang: ");
	for(int i=0;i<my_thread_1.n;i++){
        for(int j=0;j<my_thread_1.m;j++){
            tonguoc=0;
            for(int k=1;k<my_thread_1.a[i][j];k++){
		if(my_thread_1.a[i][j]%k==0){
			tonguoc=tonguoc+k;
                }
            }
		if(tonguoc==my_thread_1.a[i][j]){
			System.out.println(my_thread_1.a[i][j]+" ");
			//demuoc=demuoc++;
                        //tonghh=tonghh+my_thread_1.a[i][j];

		}
                
        }
        }
	//System.out.println(" co " +demuoc+ "so hoan hao trong mang: ");
        //System.out.println("Tong cac so hoan hao trong mang: "+tonghh);
     }
}


class chinhp extends Thread{
    //int dem1,tong1=0;
    public void run(){
    int k;
	System.out.print("Cac so chinh phuong trong mang: ");
	for(int i=0;i<=my_thread_1.n;i++){
        for(int j=0;j<my_thread_1.m;j++){
		for (k = 1; k < my_thread_1.a[i][j]; k++) {
                if(my_thread_1.a[i][j] == k*k) {
	    	System.out.println(" "+my_thread_1.a[i][j]);
		}
        }
}
    }
}
}
//tim x trong mang
class timx extends Thread{
    public void run(){
    int x;
    Scanner sc=new Scanner(System.in);
    System.out.println("Nhap x = "); x=sc.nextInt();
    System.out.print("Co phan tu "+x+" o vi tri: ");
       for(int i=1;i<=my_thread_1.n;i++){
    for(int j=0;j<my_thread_1.m;j++){
	if(my_thread_1.a[i][j] == x){      
                   System.out.print("a["+i+"]["+j+"]");
        }
    }
    }
    }
    }
*/