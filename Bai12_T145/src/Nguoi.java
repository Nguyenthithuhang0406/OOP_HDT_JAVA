import java.util.Scanner;

public abstract class Nguoi {
    private String hoTen, ngaySinh, diaChi;
    private LoaiSV loaiSV;

    public abstract double tinhDiem();

    public Nguoi(String hoTen, String ngaySinh, String diaChi, LoaiSV loaiSV) {
        try{
            setHoTen(hoTen);
        }catch (Exception e){
            System.out.println("Error: " + e.toString());
        }
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.loaiSV = loaiSV;
    }

    public Nguoi() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin sinh vien: ");
        System.out.println("Nhap ho ten sinh vien:");
        try{
            setHoTen(sc.nextLine());
        }catch (Exception e){
            System.out.println("Error: " + e.toString());
        }
        System.out.println("Nhap ngay sinh:");
        ngaySinh = sc.nextLine();
        System.out.println("Nhap dia chi:");
        diaChi = sc.nextLine();
        System.out.println("Nhap loai sinh vien:");
        System.out.println("Nhap 1: neu la sinh vien cao dang nghe!");
        System.out.println("Nhap 2: neu la sinh vien cao dang chinh quy!");
        try {
            setLoaiSV(sc.nextInt());
        }catch (Exception e){
            System.out.println("Error:" + e.toString());
        }
    }

    public void setHoTen(String hoTen) throws Exception{
        if(hoTen.trim().length() > 0){
            this.hoTen = hoTen;
        }else{
            throw new Exception("Ho ten phai khac rong!");
        }
    }

    public void setLoaiSV( int loai) throws Exception {
        if(loai == 1){
            this.loaiSV = LoaiSV.SVCDN;
        }else{
            if(loai == 2) {
                this.loaiSV = LoaiSV.SVCDCQ;
            }else{
                throw new Exception("loai sinh vien khong hop le:");
            }
        }
    }

    public void inThongTin(){
        System.out.printf("%-30s %-15s %-30s %-20s", hoTen, ngaySinh, diaChi, loaiSV);
    }
}
