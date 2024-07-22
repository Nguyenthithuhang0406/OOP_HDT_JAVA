
import java.util.Scanner;

public class Test {
    private static int soLuong;
    private static NhanVien[] listnv;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap so luong nhan vien");
        soLuong = sc.nextInt();
        listnv = new NhanVien[soLuong];
        for(int i = 0; i < soLuong; i++){
            listnv[i] = new NhanVien();
            listnv[i].nhap();
        }
        System.out.println("danh sach nhan vien sau khi nhap la: ");
        for(int i = 0; i < soLuong; i++){
            System.out.println(listnv[i].toString());
        }
    }
}
