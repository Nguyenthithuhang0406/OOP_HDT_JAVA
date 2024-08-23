import java.util.Scanner;

public abstract class CongNhan {
    private String hoTen, diaChi, ngaySinh;
    private LoaiCN loaiCN;

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap thong tin cong nhan:");
        System.out.println("Moi ban nhap hoc ten:");
        try{
            setHoTen(sc.nextLine());
        }catch (Exception e){
            System.out.println("error:" + e.toString());
        }
        System.out.println("Moi ban nhap dia chi:");
        diaChi = sc.nextLine();
        System.out.println("Moi ban nhap ngay sinh:");
        ngaySinh = sc.nextLine();
        System.out.println("Moi ban nhap loai cong nhan:");
        System.out.println("Nhap 1: Cong nhan khoan san pham!");
//        System.out.println("Nhap 2: Cong nhan tinh cong nhat!");
//        int n = sc.nextInt();
//        if(n == 1){
//            loaiCN = LoaiCN.CNKSP;
//        }else{
//            loaiCN = LoaiCN.CNTCN;
//        }
    }

    public void setHoTen(String hoTen) throws Exception{
        if(hoTen.trim().length() > 0){
            this.hoTen = hoTen;
        }else{
            throw new Exception("Ho Ten khong duoc de trong!");
        }
    }

    public CongNhan(String hoTen, String diaChi, String ngaySinh, LoaiCN loaiCN) {
        try {
            setHoTen(hoTen);
        }catch (Exception e){
            System.out.println("Error: " + e.toString());
        }
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.loaiCN = loaiCN;
    }

    public CongNhan() {
    }

    public abstract double tinhLuong();

    public void inThongTin(){
        System.out.printf("%-30s %-30s %-20s %-20s", hoTen, diaChi, ngaySinh, loaiCN);
    }
}

