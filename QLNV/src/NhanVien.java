
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public abstract class NhanVien {
    private String hoTen;
    private int namVL;
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamVL() {
        return namVL;
    }
    public void setNamVL(int namVL) {
        this.namVL = namVL;
    }
    public NhanVien(String hoTen, int namVL) {
        super();
        this.hoTen = hoTen;
        this.namVL = namVL;
    }
    public NhanVien() {
        super();
    }

    public abstract int tinhLuong();
    public abstract int luong();
    public int PhuCap() {
        Date now = new Date();
        int year = LocalDate.now().getYear();
        return 100000 + (year - namVL) * 20000;
    }
    @Override
    public String toString() {
        return ("Nhan vien: " + hoTen + " ,nam vao lam: " + namVL);
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap ten nhan vien");
        hoTen = sc.nextLine();
        System.out.println("nhap nam vao lam");
        namVL = sc.nextInt();
    }
}

