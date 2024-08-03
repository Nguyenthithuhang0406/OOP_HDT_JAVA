import java.util.ArrayList;
import java.util.Scanner;

public class TaiLieuDemo {
    public static ArrayList<TaiLieu> listTL = new ArrayList<>();

    public static void fakeData(){
        listTL.add(new TaiLieu("TL01", "Giao trinh tieng anh", 200));
        listTL.add(new TaiLieu("TL02", "Giao trinh huong doi tuong", 250));
        listTL.add(new TaiLieu("TL02", "Giao tinh cau truc du lieu", 130));
    }

    public static void suaTL(int nxb){
        for(TaiLieu tl : listTL){
            if(tl.getNamXB() == nxb){
                tl.setNamXB(2014);
            }
        }
    }
    public static void main(String[] args) {
        fakeData();
        TaiLieu tl1 = new TaiLieu();
        tl1.inTieuDe();
        System.out.println();
        for(TaiLieu tl : listTL){
            tl.xuatDuLieu();
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap so luong tai lieu: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("moi ban nhap tai lieu thu "+ (i+1));
            TaiLieu tl = new TaiLieu();
            tl.nhap();
            listTL.add(tl);
        }
        System.out.println("=============tai lieu sau khi nhap la========================");
        tl1.inTieuDe();
        System.out.println();
        for(TaiLieu tl : listTL){
            tl.xuatDuLieu();
            System.out.println();
        }

        System.out.println("nhap nam xuat ban muon sua: ");
        int nxb = sc.nextInt();
        suaTL(nxb);
        System.out.println("===============Danh sach tai lieu sau khi sua la=====================");
        tl1.inTieuDe();
        System.out.println();
        for(TaiLieu tl : listTL){
            tl.xuatDuLieu();
            System.out.println();
        }
    }
}
