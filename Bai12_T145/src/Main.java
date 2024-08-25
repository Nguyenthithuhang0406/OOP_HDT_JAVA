import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static ArrayList<Nguoi> listSV = new ArrayList<>();

    public static void fakeData(){
        listSV.add(new SVCDN("Nguyen Van A", "03-02-2002", "Ha noi",LoaiSV.SVCDN, 9.2, 3));
        listSV.add(new SVCDCQ("Nguyen thi B","03-05-2001", "Hoai duc",LoaiSV.SVCDCQ, 6.3,9.7, 4));
    }

    public static void inThongTin(){
        for(Nguoi sv : listSV){
            sv.inThongTin();
        }
    }
    public static void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so luong sinh vien:");
        int sl = sc.nextInt();
        for(int i = 1; i <= sl; i++){
            System.out.println("Nhap loai sinh vien:");
            System.out.println("Nhap 1: neu la sinh vien cao dang nghe!");
            System.out.println("Nhap 2: neu la sinh vien cao dang chinh quy!");
            Nguoi sv;
            if(sc.nextInt() == 1){
                 sv = new SVCDN();
            }else{
                 sv = new SVCDCQ();
            }
            sv.nhapThongTin();
            listSV.add(sv);
        }
        System.out.println("Danh sach sinh vien sau khi nhap la:");
        inThongTin();
    }

    public static void sortByDTB(){
        Comparator<Nguoi> c = new Comparator<Nguoi>() {
            @Override
            public int compare(Nguoi o1, Nguoi o2) {
                //Giam dan, neu o1 truoc o2 se la tang dan
                return Double.compare(o2.tinhDiem(), o1.tinhDiem());
            }
        };

        Collections.sort(listSV, c);
    }

    public static void sortByName(){
        Comparator<Nguoi> c = new Comparator<Nguoi>() {
            @Override
            public int compare(Nguoi o1, Nguoi o2) {
                //giam dan, neu o1 truoc o2 la tang dan
                return (o2.getHoTen().compareTo(o1.getHoTen()));
            }
        };
        Collections.sort(listSV, c);
    }
    public static void menu(){
        int chon = 0;
        Scanner sc = new Scanner(System.in);
        while(chon != 1){
            System.out.println("Nhap 1: de thoat!");
            System.out.println("Nhap 2: de nhap thong tin!");
            System.out.println("Nhap 3: de in thong tin!");
            System.out.println("Nhap 4: de sap xep theo DTB!");
            System.out.println("Nhap 5: de sap xep theo ten!");
            System.out.println("Nhap 6: de fakeData!");
            chon = sc.nextInt();
            if(chon == 1) break;
            if(chon == 2) {
                nhapThongTin();
                inThongTin();
            }
            if(chon == 3) inThongTin();
            if(chon == 4) {
                sortByDTB();
                inThongTin();
            }
            if(chon == 5){
                sortByName();
                inThongTin();
            }
            if(chon == 6){
                fakeData();
                inThongTin();
            }
        }
    }
    public static void main(String[] args) {
        menu();
    }
}
