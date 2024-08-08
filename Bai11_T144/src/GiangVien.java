import java.util.Scanner;

public abstract class GiangVien {
    private String hoTen, diaChi, loaiGV;

    public GiangVien(String hoTen, String diaChi, String loaiGV) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiGV = loaiGV;
    }

    public GiangVien() {
    }

    public  void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin giang vien: ");
        System.out.println("Nhap ho ten giang vien:");
        hoTen = sc.nextLine();
        System.out.println("Nhap dia chi:");
        diaChi = sc.nextLine();
    }

    public abstract  int tinhLuong();

    public void inThongTin(){
        System.out.printf("%-30s %-30s %-30s", hoTen, diaChi, loaiGV);
    }
}
