import java.util.Scanner;

public class NhanVien {
    private String name;
    private DiaChi address;
    private String dob;
    private String gender;
    public NhanVien(String name, DiaChi address, String dob, String gender) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
    }
    public NhanVien() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DiaChi getAddress() {
        return address;
    }

    public void setAddress(DiaChi address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return (name + " sinh ngay " + dob + " gioi tinh " + gender + " thuoc thon " + address.getThon() + " xa " + address.getXa() + " huyen " + address.getHuyen() + " tinh " + address.getTinh() );
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten");
        name = sc.nextLine();
        System.out.println("nhap ngay sinh");
        dob = sc.nextLine();
        System.out.println("nhap gioi tinh");
        gender = sc.nextLine();
        System.out.println("nhap dia chi");
        address = new DiaChi();
        address.nhap();
    }
}
