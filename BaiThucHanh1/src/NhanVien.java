import java.util.Scanner;

public class NhanVien {
    private String name, diaChi, ngaySinh, gioiTinh;
    private int id;
    private static int nextId = 1;

    public NhanVien() {
        id = nextId;
        nextId ++;
    }

    public NhanVien(String name, String diaChi, String ngaySinh, String gioiTinh) {
        this.name = name;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập địa chỉ nhân viên: ");
        this.diaChi = sc.nextLine();
        System.out.println("Nhập ngày sinh nhân viên: ");
        this.ngaySinh = sc.nextLine();
        System.out.println("Nhập giới tính nhân viên: ");
        this.gioiTinh = sc.nextLine();
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                '}';
    }

    public void xuat(){
        System.out.println("Thông tin nhân viên vừa nhập là: ");
        System.out.println(toString());
    }

    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.nhap();
        nv.xuat();
    }

}
