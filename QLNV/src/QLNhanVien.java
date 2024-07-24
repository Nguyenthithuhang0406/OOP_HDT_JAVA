import java.util.*;

public class QLNhanVien {
    public static ArrayList<NhanVien> listNV = new ArrayList<>();
    private static int sl = 0;
    public static void fakeData() {

        listNV.add( new NhanVienSX("Le Huy Hoang", 2019, 10000));
        listNV.add( new NhanVienSX("Le Thanh Thao", 2020, 20000));
        listNV.add(new NhanVienVP("Nguyen Thi Thu Hang", 2020, 10000, 2));
        listNV.add( new NhanVienVP("Luong Thi Phuong", 2022, 9000000, 1));
    }
    public static void inDL() {
        System.out.println("Danh sach nhan vien: ");
        for(NhanVien nv: listNV) {
            if(nv == null) continue;
            System.out.println(nv.toString());
        }
    }
    public static void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong nhan vien (so luong nhan vien <= 96)");

        sl = sc.nextInt();
        int i = 0;
        while ( i < sl) {
            System.out.println("chon loai nhan vie: 1 la nhan vien san xuat, 2 la nhan vien van phong");
            int loai = sc.nextInt();
            NhanVien nv;
            if(loai == 1) {
                nv = new NhanVienSX();
            }else {
                nv = new NhanVienVP();
            }
            nv.nhap();
            listNV.add(nv);

            if(nv.getHoTen().isEmpty()) break;
            i++;
        }
    }

    public static void sortEmployeesByLuong(){
        Comparator<NhanVien> c = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                int typeComparison = (o1 instanceof NhanVienSX ? 0 : 1) - (o2 instanceof NhanVienSX ? 0 : 1);
                if(typeComparison != 0){
                    return typeComparison;
                }
                return Integer.compare(o1.luong() ,o2.luong());
            }
        };
        Collections.sort(listNV, c);
    }

    public static void max(){
        ArrayList<NhanVien> listNVSX = new ArrayList<>();
        ArrayList<NhanVien> listNVVP = new ArrayList<>();

        for(NhanVien nv: listNV){
            if(nv ==  null) continue;
            if(nv instanceof NhanVienSX){
                listNVSX.add(nv);
            }else{
                listNVVP.add(nv);
            }
        }

        Comparator<NhanVien> c = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return Integer.compare(o1.luong(), o2.luong());
            }
        };

        NhanVien nv1 = Collections.max(listNVSX,c);
        NhanVien nv2 = Collections.max(listNVVP, c);
        System.out.println("Nhan vien san xuat co luong cao nhat la: "+ nv1.toString());
        System.out.println("Nhan vien van phong co luong cao nhat la: "+ nv2.toString());
    }
    public static void main(String[] args) {
        fakeData();
        inDL();
        nhap();
        sortEmployeesByLuong();
        inDL();
        max();
    }
}
