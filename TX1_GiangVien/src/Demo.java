import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Demo {
    public static ArrayList<GiangVien> listGV = new ArrayList<>();
    public static void fakeData(){
        listGV.add(new GiangVien("NguyenThiA", "Ha Dong", LoaiGV.ThinhGiang, 10));
        listGV.add(new GiangVien("NguyenThi B", "Hoai Duc", LoaiGV.CoHuu, 17));
        listGV.add(new GiangVien("Nguyen Van C", "Cau Dien", LoaiGV.CoHuu, 12));
        listGV.add(new GiangVien("Nguyen Ba D", "Tay Ho", LoaiGV.ThinhGiang, 11));
        listGV.add(new GiangVien("Nguyen Tran Minh E", "Ha Dong", LoaiGV.CoHuu, 15));
    }

    public static void inData(){
        GiangVien gv0 = new GiangVien();
        gv0.inTieuDe();
        for(GiangVien gv : listGV){
            gv.inDuLieu();
        }
    }

    public static void timVaSua(){
        Scanner sc = new Scanner(System.in);
        String ten = "";

        while(ten == ""){
            System.out.println("nhap ten muon tim:");
            ten = sc.nextLine();
            if(ten.trim() == ""){
                System.out.println("Ten khong duoc khac rong, moi nhap lai.");
            }
        }

        boolean kt = false;
        for(GiangVien gv : listGV){
            if(gv.getTenGv().toUpperCase().equals(ten.toUpperCase())){
                kt = true;
                System.out.println("tim thay giang vien voi thong tin sau: ");
                gv.inTieuDe();
                gv.inDuLieu();

                System.out.println("nhap thong tin muon sua");

                String tenMoi = "";
                while(tenMoi == ""){
                    System.out.println("nhap ten moi");
                    tenMoi = sc.nextLine();
                }
                gv.setTenGv(tenMoi);

            }
        }
        if(kt == false){
            System.out.println("khong tim thay thong tin nguoi nay!!");
        }else{
            System.out.println("Danh sach giang vien sau khi sua la:");
            inData();
        }
    }

    public static void timVaXoa(){
        Scanner sc = new Scanner(System.in);
        String ten = "";

        while(ten == ""){
            System.out.println("nhap ten muon tim:");
            ten = sc.nextLine();
            if(ten.trim() == ""){
                System.out.println("Ten khong duoc khac rong, moi nhap lai.");
            }
        }

        boolean kt = false;
        for(GiangVien gv : listGV){
            if(gv.getTenGv().toUpperCase().equals(ten.toUpperCase())){
                kt = true;
                System.out.println("tim thay giang vien voi thong tin sau: ");
                gv.inTieuDe();
                gv.inDuLieu();
                listGV.remove(gv);
            }
        }
        if(kt == false){
            System.out.println("khong tim thay thong tin nguoi nay!!");
        }else{
            System.out.println("Danh sach giang vien sau khi xoa la:");
            inData();
        }
    }

    public static void timMax(){
        Comparator<GiangVien> c = new Comparator<GiangVien>() {
            @Override
            public int compare(GiangVien o1, GiangVien o2) {
                return o1.tinhLuong() - o2.tinhLuong();
            }
        };

        GiangVien gv0 = Collections.max(listGV, c);

        System.out.println("Nhung giang vien co luong cao nhat la: ");
        gv0.inTieuDe();
        for(GiangVien gv : listGV){
            if(gv.tinhLuong() == gv0.tinhLuong()){
                gv.inDuLieu();
            }
        }

    }
    public static void main(String[] args) {
        fakeData();
        inData();
        timVaSua();
        timVaXoa();
        timMax();
    }
}
