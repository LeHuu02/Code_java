package hellojava;
public class ngoaiLe_soHoc {
    public static void main(String args[]){
    try{
    String str="Hello";
    int n=Integer.parseInt(str);
        System.out.println("\"Gia tri n= \"+n");
    }catch(NumberFormatException e){//vì bắt ngoại lệ rồi lên chương trình vẫn chạy dc
        System.out.println("Xay ra ngoai le ve so hoc");
    }finally{//dù có ngoại lệ hay không vẫn in
        System.out.println("Chuc ban 1 ngay vui ve!");
    }
    }
}
