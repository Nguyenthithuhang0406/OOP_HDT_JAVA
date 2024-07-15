import java.util.Scanner;

public class Bai20 {
    public static float c;

    public static void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập độ C:  ");
        c = sc.nextFloat();
    }

    public static float Doi(){
        float f = c * 1.8f + 32;
        return f;
    }

    public  static  void xuat(){
        System.out.println(c + " độ C tương đương với " + Doi() + " độ F");
    }

    public static void main(String[] args) {
        nhap();
        xuat();
    }
}
