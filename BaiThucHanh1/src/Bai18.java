import java.util.Scanner;

public class Bai18 {
    private static int n;

    public static void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số nguyên cần kiểm tra: ");
        n = sc.nextInt();
    }

    public static boolean KiemTra(){
        if(n <= 1){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void xuat(){
        if(n < 0){
            System.out.println("Số bạn nhập không phải số nguyên dương. Mời nhập lại:");
            nhap();
            xuat();
        }else {
            if(KiemTra() == true){
                System.out.println(n + " là số nguyên tố!");
            }else{
                System.out.println(n + " không là số nguyên tố!");
            }
        }
    }
    public static void main(String[] args) {
        nhap();
        xuat();
    }
}

