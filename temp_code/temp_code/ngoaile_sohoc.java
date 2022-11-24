package baitap1;

public class ngoaile_sohoc {

    public static void main(String args[]) {
        try {
            String str = "Hello";
            int n = Integer.parseInt(str);
            System.out.println("Gia tri =" + n);
        } catch (NumberFormatException e) {
            System.out.println("Xay ra ngoai le ve so hoc");
        } finally {
            System.out.println("Chuc ban mot ngay vui ve! ");
        }
    }
}
