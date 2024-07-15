import java.util.Scanner;

public class Hang {
    private String tenHang;
    private double soLuong, donGia;
    public String getTenHang() {
        return tenHang;
    }
    public double getSoLuong() {
        return soLuong;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.println("nhap so luong:");
        soLuong = sc.nextDouble();
        System.out.println("nhap don gia:");
        donGia = sc.nextDouble();
    }
    public  double tinhTongTien(){
        return soLuong * donGia;
    }
    public void inTieuDe(){
        System.out.println( "Ten hang \t" + "So luong \t" + "Don gia \t" + "Thanh tien \t");
    }
    public void inDuLieu(){
        System.out.printf("%-10s %-10.2f %-10.2f %10.2f", tenHang , soLuong , donGia , tinhTongTien() , "\n");
    }
}
