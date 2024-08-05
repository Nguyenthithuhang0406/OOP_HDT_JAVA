import java.util.Scanner;

public abstract class HocVien {
    private String hoTen;
    private String diaChi;
    private String loaiCT;
    private int loaiUT;

    public abstract int hocPhi();

    public HocVien(String hoTen, String diaChi, String loaiCT, int loaiUT) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiCT = loaiCT;
        this.loaiUT = loaiUT;
    }

    public HocVien() {
    }

    public int getLoaiUT() {
        return loaiUT;
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap thong tin hoc vien: ");
        System.out.println("Ho va ten:");
        hoTen = sc.nextLine();
        System.out.println("Dia chi:");
        diaChi = sc.nextLine();
//        System.out.println("Loai chuong trinh :");
//        System.out.println("1: do hoa");
//        System.out.println("2: lap trinh");
//        int l = sc.nextInt();
//        if(l == 1) loaiCT = "Do hoa";
//        else loaiCT = "Lap trinh";
        System.out.println("Nhap loai uu tien (1 hoac 2):");
        loaiUT = sc.nextInt();
    }

    public void inThongTin(){
        System.out.printf("%-30s %-30s %-30s %-30s", hoTen, diaChi, loaiCT, loaiUT);
    }
}
