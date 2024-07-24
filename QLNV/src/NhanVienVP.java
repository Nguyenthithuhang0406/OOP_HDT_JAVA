import java.util.Scanner;
public class NhanVienVP extends NhanVien{
    private int mucLuong;
    private int ngayNghi;
    public int getMucLuong() {
        return mucLuong;
    }
    public void setMucLuong(int mucLuong) {

        this.mucLuong = mucLuong;
    }
    public int getNgayNghi() {
        return ngayNghi;
    }
    public void setNgayNghi(int ngayNghi) {
        this.ngayNghi = ngayNghi;
    }
    public NhanVienVP(String hoTen, int namVL, int mucLuong, int ngayNghi) {
        super(hoTen, namVL);
        this.mucLuong = mucLuong;
        this.ngayNghi = ngayNghi;
    }
    public NhanVienVP(String hoTen, int namVL) {
        super(hoTen, namVL);
    }
    public NhanVienVP() {
    };

    @Override
    public int tinhLuong() {
        return mucLuong - ngayNghi * 10000;
    }

    @Override
    public int luong(){
        return tinhLuong() + super.PhuCap();
    }
    @Override
    public String toString() {
        return (super.toString() + ", muc luong: " + mucLuong + ", so ngay nghi: " + ngayNghi + ", luong: " + luong() );
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("nhap muc luong");
        mucLuong = sc.nextInt();
        System.out.println("nhap so ngay nghi");
        ngayNghi = sc.nextInt();
    }
}
