import java.util.Scanner;

public class KhachHang {
    private String maKH, diaChi;
    public  void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma khach hang:");
        maKH = sc.nextLine();
        System.out.println("nhap dia chi:");
        diaChi = sc.nextLine();
    }
    @Override
    public String toString() {
        return ( maKH + "\t" + diaChi);
    }
}
