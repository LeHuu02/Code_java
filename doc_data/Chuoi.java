
package chuoi;
import java.lang.*;
import java.util.Scanner;  

class chuoi1{
private String str;
//nhap chuoi
public void nhap(){
Scanner sc=new Scanner(System.in);
System.out.print("nhap vao 1 chuoi: ");
str=sc.nextLine();
}
//xuat chuoi
public void xuat(){
System.out.println(" chuoi vua nhap la: "+str);
}
//do dai
public int dodai(){
return str.length();
}
//chuyen chu thuong sang hoa
public String chuhoa(){
return str.toUpperCase();
}
//chu hoa sang thuong
public String chuthuong(){
return str.toLowerCase();
}
public String chuhoa2(){
char[] kytu=str.toCharArray();
for(int i=0;i<kytu.length;i++){
if(kytu[i]>=97 && kytu[i]<=122) //chu thuong thi f(kytu[i]>=65 && kytu[i]<=90)
    kytu[i]=(char)(kytu[i]-32); // kytu[i]=(char)(kytu[i]+32);
}
  return String.valueOf(kytu);
}

public int demtu(){
int dem=0;
if(str.charAt(0)!=' ')dem=1;
for(int i=0;i<str.length()-1;i++){
if(str.charAt(i)==' '&& str.charAt(i+1)!= ' ')dem++;
}
return dem;
}
// dem so trong chuoi
public int demso(){
int demso=0;
for(int i=0;i<str.length();i++){
if(Character.isDigit(str.charAt(i)))demso++;

}
return demso;
}
//dem ki tu hoa
public int demkytuhoa(){
int demhoa=0;
for(int i=0;i<str.length();i++){
if(Character.isUpperCase(str.charAt(i)))demhoa++;
}
return demhoa;
}
//dem ki tu a trong chuoi
public int demkitua(){
int dema=0;
for(int i=0;i<str.length();i++){
if(str.charAt(i)=='a')dema++;
}
return dema;
}
//tach ten
public void tachten(){
int j=0;
String s=str.trim();
for(int i=str.length()-1;i>=0;i--){
if(s.charAt(i)==' '){j=i;break;}
}
System.out.println(s.substring(j+1));

    
}
//dem G
public int demG(){
int d=0;
String s[]=str.split(" ");
for(String st:s){
if (st.endsWith("G")|| st.endsWith("g"))d++;
}
return d;
}
// tach ho
public void tachho(){
int j=0;
String s=str.trim();
for(int i=0;i<str.length()-1;i++){
if(s.charAt(i)==' '){j=i;break;}
}
System.out.println(s.substring(0,j));

    
}
}
public class Chuoi {
public static void main(String args[]){
chuoi1 x=new chuoi1();
x.nhap();
x.xuat();
System.out.print("do dai cua chuoi la: "+x.dodai());
//cach 1
//System.out.println("\nchuoi chu hoa la:"+x.chuhoa());
//.out.println("\nchuoi chu hoa la:"+x.chuthuong());
//cach2
System.out.println("\nchuoi chu hoa la:"+x.chuhoa2());
System.out.print("\nSo tu trong chuoi:"+x.demtu());
System.out.print("\nSo so trong chuoi:"+x.demso());
    System.out.println("\nKI tu a trong chuoi:"+x.demkitua()); 
System.out.println("\n So ki tu hoa trong chuoi "+x.demkytuhoa());
    System.out.print("Ten trong chuoi:");x.tachten();
    System.out.println("Chuoi ket thuc bang ki tu G:"+x.demG());
    System.out.print("Ho trong chuoi:");x.tachho();
}      
}
