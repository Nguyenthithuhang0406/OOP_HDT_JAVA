import java.util.Scanner;

public class Nguoi {
    private String ten, tuoi, gioiTinh;

    public Nguoi(String ten, String tuoi, String gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public Nguoi() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "ten='" + ten + '\'' +
                ", tuoi='" + tuoi + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                '}';
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten");
        ten = sc.nextLine();
        System.out.println("nhap tuoi");
        tuoi = sc.nextLine();
        System.out.println("nhap gioi tinh");
        gioiTinh = sc.nextLine();
    }
}
