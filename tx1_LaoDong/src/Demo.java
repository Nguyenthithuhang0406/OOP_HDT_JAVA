import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Demo {
    public static ArrayList<LaoDong> listLD = new ArrayList<>();

    public static void fakeData(){
        listLD.add(new LaoDong("ld01","Nguyen Thi Thu Hang", 23, LoaiLD.CongNhan));
        listLD.add(new LaoDong("ld02","Nguyen Thi Thu ", 29, LoaiLD.SanXuat));
        listLD.add(new LaoDong("ld03","Nguyen Thi Hang", 15, LoaiLD.CongNhan));
        listLD.add(new LaoDong("ld04","Nguyen Thi C", 9, LoaiLD.CongNhan));
        listLD.add(new LaoDong("ld05","Nguyen Van B", 27, LoaiLD.SanXuat));
    }

    public static void inData(){
        LaoDong ld0 = new LaoDong();
        ld0.inTieuDe();
        for(LaoDong ld : listLD){
            ld.inDuLieu();
        }
    }

    public static void suaData(){
        String tenld;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap ten lao dong muon tim");
        tenld = sc.nextLine();
        boolean kt = false;
        for(LaoDong ld : listLD){
            if(ld.getTenLD().equals(tenld.toUpperCase())){
                System.out.println("tim thay lao dong voi thong tin sau:");
                ld.inDuLieu();

                System.out.println("Nhap thong tin muon sua");

                System.out.println("nhap ma lao dong muon sua:");
                String mald = sc.nextLine();
                if(mald.trim() != "") ld.setMaLD(mald);

                System.out.println("nhap ten moi:");
                String tenMoi = sc.nextLine();
                if(tenMoi.trim() != "") ld.setTenLD(tenMoi);

                System.out.println("nhap so ngay cong");
                int sonc = sc.nextInt();
                if(sonc > 0) ld.setSoNgayCong(sonc);

                System.out.println("nhap loai lao dong. 1 la Cong Nhan, 2 la SanXuat");
                int loaild = sc.nextInt();
                if(loaild == 1) ld.setLoaiLD(LoaiLD.CongNhan);
                else ld.setLoaiLD(LoaiLD.SanXuat);

                kt = true;
            }
        }
        if(kt == false){
            System.out.println("Khong tim thay thong tin!!!");
        }else{
            System.out.println("Danh sach lao dong sau khi sua la:");
            inData();
        }
    }

    public static void timMax(){
        Comparator<LaoDong> c = new Comparator<LaoDong>() {
            @Override
            public int compare(LaoDong o1, LaoDong o2) {
                return o1.tinhThuong() - o2.tinhThuong();
            }
        };

        LaoDong ld0 = Collections.max(listLD, c);
        System.out.println("danh sach lao dong co thuong cao nhat");
        ld0.inTieuDe();
        for(LaoDong ld : listLD){
            if(ld.tinhThuong() == ld0.tinhThuong()){
                ld.inDuLieu();
            }
        }

    }
    public static void main(String[] args) {
        fakeData();
        System.out.println("danh sach lao dong la:");
        inData();
        suaData();
        timMax();
    }
}
