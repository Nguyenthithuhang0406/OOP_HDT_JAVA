import java.util.Scanner;

public class BenhNhan extends  Nguoi{
    private String tienSu, chanDoan;
    private BenhVien benhvien;

    public BenhNhan(String ten, String tuoi, String gioiTinh, String tienSu, String chanDoan, BenhVien benhvien) {
        super(ten, tuoi, gioiTinh);
        this.tienSu = tienSu;
        this.chanDoan = chanDoan;
        this.benhvien = benhvien;
    }

    public BenhNhan(String tienSu, String chanDoan, BenhVien benhvien) {
        this.tienSu = tienSu;
        this.chanDoan = chanDoan;
        this.benhvien = benhvien;
    }

    public BenhNhan() {
    }

    public String getTienSu() {
        return tienSu;
    }

    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }

    public String getChanDoan() {
        return chanDoan;
    }

    public void setChanDoan(String chanDoan) {
        this.chanDoan = chanDoan;
    }

    public BenhVien getBenhvien() {
        return benhvien;
    }

    public void setBenhvien(BenhVien benhvien) {
        this.benhvien = benhvien;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("nhap tien su");
        tienSu = sc.nextLine();
        System.out.println("chan doan");
        chanDoan = sc.nextLine();
        benhvien = new BenhVien();
        benhvien.nhap();
    }
    @Override
    public String toString() {
        return ("benh nhan " + super.toString() + " " + tienSu + " " + chanDoan + " tai " + benhvien);
    }
}
