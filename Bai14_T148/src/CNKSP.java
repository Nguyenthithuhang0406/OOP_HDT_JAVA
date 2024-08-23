import java.util.Scanner;

public class CNKSP extends CongNhan{
    private int soSP, soLuongQuyDinh;
    private final int donGiaSP = 100000;


    public int tinhThuong(){
        int thuong = 0;
        if(soSP - soLuongQuyDinh >= 100 && soSP < 150) thuong = 1000000;
        if(soSP - soLuongQuyDinh >= 150) thuong = 1500000;
        return thuong;
    }
    @Override
    public double tinhLuong() {
        return soSP * donGiaSP + tinhThuong();
    }

    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so san pham:");
        try{
            setSoSP(sc.nextInt());
        }catch (Exception e){
            System.out.println("Error: " + e.toString());
        }
        System.out.println("Nhap so luong san pham quy dinh:");
        soLuongQuyDinh = sc.nextInt();
    }

    public void setSoSP( int soSP) throws Exception{
        if(soSP >= 0){
            this.soSP = soSP;
        }else{
            throw  new Exception("So san pham khong hop le!");
        }
    }

    public void inThongTin(){
        super.inThongTin();
        System.out.printf("%-20s %-20s %-20s %-20s \n", soSP, donGiaSP, tinhThuong(), tinhLuong());
    }

    public void inTieuDe(){
        System.out.printf("%-30s %-30s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "Ho ten", "Dia chi", "Ngay sinh", "Loai cong nhan", "so san pham", "so san pham quy dinh", "don gia san pham", "thuong", "luong");
    }

    public CNKSP(String hoTen, String diaChi, String ngaySinh, int soSP, int soLuongQuyDinh) {
        super(hoTen, diaChi, ngaySinh, LoaiCN.CNKSP);
        try{
            setSoSP(soSP);
        }catch (Exception e){
            System.out.println("Error: " + e.toString());
        }
        this.soLuongQuyDinh = soLuongQuyDinh;
    }

    public CNKSP() {
        super(null, null, null, LoaiCN.CNKSP);
    }
}
