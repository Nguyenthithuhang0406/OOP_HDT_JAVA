import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CongNhanManagerment implements IUtils {
    @Override
    public void saveDataToFile() {

    }

    @Override
    public void getDataFromFile() {

    }

    public ArrayList<CongNhan> listCn = new ArrayList<>();

    @Override
    public  void inputData() {
        listCn.add(new CongNhan("cn1", "Ha", CaType.ca3, 12));
        listCn.add(new CongNhan("cn02", "thu", CaType.ca1, 24));
        listCn.add(new CongNhan("cn3", "Hang", CaType.ca2, 15));
    }

    public void inTieuDe(){
        System.out.printf("%-20s %-30s %-20s %-20s \n", "Ma cong nhan", "Ten cong nhan", "Ca lam", "Tong gio lam");
    }
    @Override
    public void outputData() {
        System.out.println("=====================Danh sach cong nhan===============");
        inTieuDe();
        for(CongNhan cn : listCn){
            cn.inData();
        }
    }

    public void nhapDuLieu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong nhan vien muon them:");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            CongNhan cn = new CongNhan();
            cn.nhapData();
            listCn.add(cn);
        }
    }

    public void timMin(){
        Comparator<CongNhan> c = new Comparator<CongNhan>() {
            @Override
            public int compare(CongNhan o1, CongNhan o2) {
                if(o1.getTongGioLam() == o2.getTongGioLam()){
                    return (o2.getCaType().compareTo(o1.getCaType()));
                }else{
                    return o1.getTongGioLam() - o2.getTongGioLam();
                }
            }
        };

        outputData();

        CongNhan cn = Collections.min(listCn, c);

        System.out.println("Cong nhan so gio lam thap nhat la:");
        inTieuDe();
        cn.inData();
    }

}
