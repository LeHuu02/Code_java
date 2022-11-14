/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktmtk19;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class set_khang {
private int makh;
private String hoten;
private String diachi;
private int sodt;

    public set_khang() {}

    public set_khang(int makh, String hoten, String diachi, int sodt) {
        this.makh = makh;
        this.hoten = hoten;
        this.diachi = diachi;
        this.sodt = sodt;
    }

    public int getMakh() {
        return makh;
    }

    public void setMakh(int makh) {
        this.makh = makh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getSodt() {
        return sodt;
    }

    public void setSodt(int sodt) {
        this.sodt = sodt;
    }

    @Override
    public String toString() {
        return "set_khang{" + "makh=" + makh + ", hoten=" + hoten + ", diachi=" + diachi + ", sodt=" + sodt + '}';
    }

    
}
