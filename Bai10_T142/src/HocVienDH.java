import java.util.ArrayList;
import java.util.Scanner;

public class HocVienDH extends  HocVien{
    private int soBuoi;
    final int donGiaDH = 250000;

    public HocVienDH(String hoTen, String diaChi, int loaiUT, int soBuoi) {
        super(hoTen, diaChi, "Do hoa", loaiUT);
        this.soBuoi = soBuoi;
    }

    public HocVienDH() {
        super(null, null, "Do hoa", 0);
    }

    @Override
    public int hocPhi() {
        if(super.getLoaiUT() == 1){
            return soBuoi * donGiaDH - 1000000;
        }else{
            return soBuoi * donGiaDH - 500000;
        }
    }

    public  void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("nhap so buoi:");
        soBuoi = sc.nextInt();
    }

    public void inThongTin(){
        super.inThongTin();
        System.out.printf("%-20s %-20s %-20s", soBuoi, donGiaDH, hocPhi());
    }
}
