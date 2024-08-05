import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public  static ArrayList<HocVien> listHv = new ArrayList<>();

    public static void fakeData(){
        listHv.add(new HocVienDH("Nguyen Thi Hai Yen", "Nam Dinh",1, 18));
        listHv.add(new HocVienLT("Nguyen Thi Thu Hang", "Ha Noi", 2, 16));
    }

    public static void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong hoc vien");
        int sl = sc.nextInt();
        for(int i = 0; i < sl; i++){
            System.out.println("nhap loai chuong trinh cua hoc vien");
            System.out.println("1: do hoa");
            System.out.println("2: lap trinh");
            int l = sc.nextInt();

            HocVien hv;
            if(l == 1){
                 hv = new HocVienDH();
            }else{
                 hv = new HocVienLT();
            }

            hv.nhapThongTin();

            listHv.add(hv);
        }
    }

    public static  void inThongTin(){
        System.out.println("Hoc vien do hoa:");
//        System.out.printf("%-30s %-30s %-30s %-30s %-20s %-20s %-20s", "Ho ten", "Dia Chi", "Loai Chuong Trinh", "Loai uu tien", "So buoi", "don gia ", "hoc phi");
        for( HocVien hv : listHv){
            if(hv instanceof HocVienDH){
                hv.inThongTin();
                System.out.println();
            }
        }
        System.out.println("Hoc vien lap trinh:");
//        System.out.printf("%-30s %-30s %-30s %-30s %-20s %-20s %-20s", "Ho ten", "Dia Chi", "Loai Chuong Trinh", "Loai uu tien", "So buoi", "don gia ", "hoc phi");
        for( HocVien hv : listHv){
            if(hv instanceof HocVienLT){
                hv.inThongTin();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        fakeData();
        nhap();
        inThongTin();
    }
}
