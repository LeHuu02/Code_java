/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktmtk19;

/**
 *
 * @author Admin
 */
public class vandungperson {
   


 
 
    public static void main(String args[]){
        
    person s=new person();
    //toan tu mac dinh khi minh nhap vao, khong co ham "nhap" thi chuoi=null/ so =0
    s.nhaptt();
    s.hientt();
    person s1=new person("KTMT","Bac Giang", 2012);
    s1.hientt();
    }
}


