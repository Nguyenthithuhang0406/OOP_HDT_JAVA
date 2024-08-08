import java.util.Scanner;

public class HocVienLT extends HocVien{
    private int soBuoi;
    final  int donGiaLT = 350000;

    public HocVienLT(String hoTen, String diaChi, int loaiUT, int soBuoi) {
        super(hoTen, diaChi, "Lap trinh", loaiUT);
        this.soBuoi = soBuoi;
    }

    public HocVienLT() {

        super(null, null, "Lap trinh", 0);
    }

    @Override
    public int hocPhi() {
        if(super.getLoaiUT() == 1){
            return soBuoi * donGiaLT - 1000000;
        }else{
            return soBuoi * donGiaLT - 800000;
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
        System.out.printf("%-20s %-20s %-20s", soBuoi, donGiaLT, hocPhi());
    }
}
