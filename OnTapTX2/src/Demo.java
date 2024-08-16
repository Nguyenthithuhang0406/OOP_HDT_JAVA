import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Demo {
    public static ArrayList<MonHoc> listMH = new ArrayList<>();

    public static void fakeData(){
        listMH.add(new MonHoc("MH01", "Cau truc du lieu va giai thuat", 3, LoaiMon.CoSo));
        listMH.add(new MonHoc("MH02", "Thiet ke web nang cao", 3, LoaiMon.ChuyenNganh));
        listMH.add(new MonHoc("MH03", "Thuc tap co so nganh", 3, LoaiMon.CoSo));
    }

    public static void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so luong mon hoc:");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            MonHoc mh = new MonHoc();
            mh.inputData();
            listMH.add(mh);
        }
    }
    public static void inTieuDe(){
        System.out.printf("%-20s %-50s %-20s %-20s \n", "Ma mon", "Ten mon", "So tin chi", "Loai mon");
    }
    public static void inDuLieu(){
        inTieuDe();
        for(MonHoc mh : listMH){
            mh.outputData();
        }
    }
    public static void timMax(){
        Comparator<MonHoc> c = new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
               if(o1.getSoTC() == o2.getSoTC()){
                   return (o1.getLoaiMon().compareTo(o2.getLoaiMon())) ;
               }else{
                   return o2.getSoTC() - o1.getSoTC();
               }
            }
        };

        MonHoc mh0 = Collections.max(listMH, c);
//        Collections.sort(listMH, c);
        System.out.println("Cac mon hoc co so tin chi lon nhat la:");
        inTieuDe();
        boolean kt = false;
        for(MonHoc mh : listMH){
            if(mh.getSoTC() == mh0.getSoTC() && mh.getLoaiMon() == LoaiMon.CoSo){
                mh.outputData();
                kt = true;
            }
        }
        if(kt == false){
            mh0.outputData();
        }
    }
    public static void main(String[] args) {
        fakeData();
        nhap();
        System.out.println("Danh sach mon sau khi bo sung la:");
        inDuLieu();
        timMax();
    }
}
