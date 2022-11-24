
package ktmtk19;
import java.lang.*;
import java.util.Scanner;
class xau{
    private String str;
   
    public void nhapxau(){
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap vao 1 xau: ");
        str=sc.nextLine();
    }

public void inxau(){
System.out.println("xau vua nhap la: "+str);
}

public int dodai(){
return str.length();
}
/*
public String chuhoa(){
return str.toUpperCase();
}
public String chuthuong(){
return str.toLowerCase();
}
public String chuhoa_1(){
  char[] kytu=str.toCharArray();
  for(int i=0;i<kytu.length;i++){
      if(kytu[i]>=97 && kytu[i]<=122)   //if(kytu[i]>=65 && kytu[i]<=90) 
          kytu[i]=(char)(kytu[i]-32);
                                           //   kytu[i]=(char)(kytu[i]+32);
  }
  return String.valueOf(kytu);
}
public int demtu(){
    int dem=0;
    if(str.charAt(0)!=' ')dem=1;
    for(int i=0;i<str.length()-1;i++){
       if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')dem++;
       
    }
    return dem;
}
public int demso(){
    int dem_so=0;
    for(int i=0;i<str.length();i++){
    if(Character.isDigit(str.charAt(i)))dem_so++;
}
    return dem_so;
}
        
 public int demsohoa(){
    int dem_hoa=0;
    for(int i=0;i<str.length();i++){
    if(Character.isUpperCase(str.charAt(i)))dem_hoa++;
}
    return dem_hoa;
} 
 public int demkhtrang(){
     int dem_kt=0;
     for(int i=0;i<str.length();i++){
         //if(Character.isSpaceChar(str.charAt(i)))dem_kt++;
         if(str.charAt(i)==' ')dem_kt++;
       //ktra chu a if    if(str.charAt(i)=='a')dem_kt++;  
         }
     return dem_kt;
     } 
*/
 public void tachten(){
     int j=0;
     String s=str.trim();
     for(int i=s.length()-1;i>=0;i--){
         if(s.charAt(i)==' '){j=i;break;}
     }
     System.out.println(s.substring(j+1));
 }

public void tachho(){
     int j=0;
     String s=str.trim();
     for(int i=0;i<s.length()-1;i++){
         if(s.charAt(i)==' '){j=i;break;}
     }
     System.out.println(s.substring(0,j));
 } 
/* 
public int dem_G(){
       int d=0;
       String s[]=str.split(" ");
       for(String st:s){
           if(st.endsWith("G") || st.endsWith("g"))d++;
           
       }
       return d;
   }  
*/
public void xoaktrang(){
    str=str.replaceAll(" ", "");
    System.out.println(""+str);      
}  
//System.out.println("Chuoi sau chuan hoa:"+str.replaceAll("\\s+", " ").trim());

}
public class test_xau {
    public static void main(String args[]){
        xau x=new xau();
        x.nhapxau();
        x.inxau();
       // System.out.println("do dai cua xau la: "+x.dodai());
       // System.out.println("chuoi chu thuong la: "+x.chuthuong());
       // System.out.println("chuoi chu hoa la: "+x.chuhoa());
      //  System.out.println("chuoi sau khi doi la: "+x.chuhoa_1());
      //   System.out.println("so tu la: "+x.demtu());
       //  System.out.println("so so la: "+x.demso());
       // System.out.println("dem G: "+x.dem_G());
        // System.out.println("so ktrang la: "+x.demkhtrang());
       //   System.out.println("so chu hoa la: "+x.demsohoa());
        // System.out.println("tach ten la: "); x.tachten();
         System.out.println("tach ho la: "); x.tachho();
         //System.out.println("chuoi sau khi xoa khtr: "); x.xoaktrang();
    }
}

