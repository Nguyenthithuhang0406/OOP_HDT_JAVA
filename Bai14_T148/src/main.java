import java.util.ArrayList;

public class main {
    public static ArrayList<CongNhan> listCN = new ArrayList<>();

    public static void fakeData(){
        listCN.add(new CNKSP("nguyen van a", "ha noi", "04-03-2001", 25, 20));
        listCN.add(new CNTCN("Nguyen thi c", "ha nam", "01-03-2001", 2000000, 30, 1.2) );
    }

    public static void inDuLieu(){
        System.out.println("Danh sach cong nhan la:");
        System.out.println("Cong nhan khoan san pham");
        CNKSP cn1 = new CNKSP();
        cn1.inTieuDe();
        for(CongNhan cn : listCN){
            if(cn instanceof CNKSP){
                cn.inThongTin();
            }
        }

        System.out.println("Cong nhan tinh cong nhat:");
        CNTCN cn2 = new CNTCN();
        cn2.inTieuDe();
        for(CongNhan cn : listCN){
            if(cn instanceof CNTCN){
                cn.inThongTin();
            }
        }
    }
    public static void main(String[] args) {
        fakeData();
        inDuLieu();
    }
}
