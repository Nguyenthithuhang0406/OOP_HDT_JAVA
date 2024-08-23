import java.util.Scanner;

public class CNTCN extends CongNhan{
    private int luongCoBan, soNgayCong;
    private double heSoLuong;

    public CNTCN(String hoTen, String diaChi, String ngaySinh, int luongCoBan, int soNgayCong, double heSoLuong) {
        super(hoTen, diaChi, ngaySinh, LoaiCN.CNTCN);
        this.luongCoBan = luongCoBan;
        try{
            setSoNgayCong(soNgayCong);
        }catch (Exception e){
            System.out.println("Error:" + e.toString());
        }
        this.heSoLuong = heSoLuong;
    }

    public CNTCN() {
        super(null, null, null, LoaiCN.CNTCN);
    }

    public double tinhThuong(){
        double thuong = 0;
        if(soNgayCong >= 20)  thuong =  1.2 * luongCoBan;
        return thuong;
    }
    @Override
    public double tinhLuong() {
        return luongCoBan * heSoLuong + tinhThuong();
    }

    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap luong co ban: ");
        luongCoBan = sc.nextInt();
        System.out.println("nhap he so luong:");
        heSoLuong = sc.nextDouble();
        System.out.println("Nhap so ngay cong:");
        try{
            setSoNgayCong(sc.nextInt());
        }catch (Exception e){
            System.out.println("Error: " + e.toString());
        }
    }

    public void setSoNgayCong(int soNgayCong) throws Exception{
        if(soNgayCong >= 0) this.soNgayCong = soNgayCong;
        else{
            throw  new Exception("So ngay cong khong hop le!");
        }
    }

    public void inThongTin(){
        super.inThongTin();
        System.out.printf("%-20s %-20s %-20s \n", luongCoBan, heSoLuong, soNgayCong);
    }

    public void inTieuDe(){
        System.out.printf("%-30s %-30s %-20s %-20s %-20s %-20s %-20s %-20s %-20s \n", "ho ten", "dia chi", "ngay sinh", "loai cong nhan", "luong co ban", "he so luong", "so ngay cong", "thuong", "luong");
    }
}
