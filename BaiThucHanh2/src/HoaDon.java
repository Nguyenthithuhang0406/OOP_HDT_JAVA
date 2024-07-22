import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class HoaDon {
    private String soHD;
    private int soMatHang;
    private KhachHang kh;
    private Hang[] dsHang;
    private NgayThang ngayHD;

    public  void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hoa don: ");
        soHD = sc.nextLine();
        ngayHD = new NgayThang();
        ngayHD.nhap();
        kh = new KhachHang();
        kh.nhap();
        System.out.println("nhap so mat hang: ");
        soMatHang = sc.nextInt();
        dsHang = new Hang[soMatHang];
        for(int i = 0; i < soMatHang; i++){
            dsHang[i] = new Hang();
            dsHang[i].nhap();
        }
    }

    public double tinhTongTien(){
        double tt = 0;
        for(int i = 0; i < soMatHang; i++){
            tt += dsHang[i].tinhTongTien();
        }
        return  tt;
    }
    public void inDuLieu(){
        System.out.printf("%-10s %-10s" , soHD , ngayHD.inNgay() , "\n");
        System.out.println();
        System.out.println(kh.toString());
        System.out.println();
        Hang h = new Hang();
        h.inTieuDe();
        for(int i = 0; i < soMatHang; i++){
            dsHang[i].inDuLieu();
            System.out.println();
        }
    }

    public void sapXep(){
        Comparator c = new Comparator<Hang>() {
            @Override
            public int compare(Hang o1, Hang o2) {
                return Double.compare(o1.tinhTongTien(), o2.tinhTongTien());
            }
        };
        Arrays.sort(dsHang, c);
    }

    public Hang timMax(){
        Comparator c = new Comparator<Hang>() {
            @Override
            public int compare(Hang o1, Hang o2) {
                return Double.compare(o1.getSoLuong(), o2.getSoLuong());
            }
        };
        Hang h = Collections.max(Arrays.asList(dsHang), c);
        return h;
    }
}
