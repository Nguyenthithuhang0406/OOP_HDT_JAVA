import java.time.LocalDate;
import java.util.Scanner;
public class NhanVienSX extends NhanVien {
    private int sanPham;
    public int getSanPham() {
        return sanPham;
    }

    public void setSanPham(int sanPham) {
        this.sanPham = sanPham;
    }
    public NhanVienSX(String hoTen, int namVL, int sanPham) {
        super(hoTen, namVL);
        this.sanPham = sanPham;
    }
    public NhanVienSX(String hoTen, int namVL) {
        super(hoTen, namVL);
    }
    public NhanVienSX() {
    };
    @Override
    public int tinhLuong() {
        return sanPham * 10000;
    }

    @Override
    public int luong(){
        return tinhLuong() + super.PhuCap();
    }

    @Override
    public String toString() {
        return (super.toString() + ", so san pham: " + sanPham + ", luong: " + luong() );
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("nhap so luong san pham");
        sanPham = sc.nextInt();
    }
}
