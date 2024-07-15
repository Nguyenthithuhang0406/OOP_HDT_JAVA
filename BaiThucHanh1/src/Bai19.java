import java.util.Scanner;

public class Bai19 {
    private static int gio, phut, giay;

    public static void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số giờ: ");
        gio = sc.nextInt();
        System.out.println("Mời bạn nhập số phút:");
        phut = sc.nextInt();
        System.out.println("Nhập số giây: ");
        giay = sc.nextInt();
    }

    public static int Doi(){
        int g = gio * 3600 + phut * 60 + giay;
        return g;
    }

    public static void xuat(){
        System.out.println(gio + " giờ " + phut + " phút " + giay + " giây bằng: " + Doi() + " giây.");
    }

    public static void main(String[] args) {
        nhap();
        xuat();
    }
}

