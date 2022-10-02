
package ngoaile;
public class NgoaiLe {// Ngoại lệ chia cho 0

    
    public static void main(String[] args) {
        try{
        int a=10, b=0;
        float c=0;
        c=a/b;
            System.out.println("Ket qua="+c);
        }catch(ArithmeticException e){
            System.out.println("Loi:"+e);
        }
    }
    
}
