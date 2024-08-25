import java.util.Scanner;

public class SVCDCQ extends Nguoi{
    private double TDKT, DTKTHP;
    private int SMKT;

    public SVCDCQ(String hoTen, String ngaySinh, String diaChi, LoaiSV loaiSV, double TDKT, double DTKTHP, int SMKT) {
        super(hoTen, ngaySinh, diaChi, loaiSV);
        try {
            setTDKT(TDKT);
            setSMKT(SMKT);
            setDTKTHP(DTKTHP);
        }catch (Exception e){
            System.out.println("Error: " + e.toString());
        }
    }

    public SVCDCQ() {
        super();
    }

    public void setTDKT(double TDKT) throws Exception{
        if(TDKT < 0){
            throw new Exception("Tong diem cac mon kiem tra khong duoc nho hon 0!");
        }
        this.TDKT = TDKT;
    }

    public void setSMKT(int SMKT) throws Exception{
        if(SMKT < 0){
            throw new Exception("So mon kiem tra khong duoc nho hon 0!");
        }
        this.SMKT = SMKT;
    }

    public void setDTKTHP(double DTKTHP) throws Exception{
        if(DTKTHP < 0){
            throw new Exception("Tong diem cac mon kiem tra khong duoc nho hon 0!");
        }
        this.DTKTHP = DTKTHP;
    }
    @Override
    public double tinhDiem() {
        double DTB = (TDKT * 1.0 / SMKT + DTKTHP) / 3;
        return DTB;
    }

    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap tong diem cac mon kiem tra:");
            setTDKT(sc.nextDouble());
            System.out.println("nhap so mon kiem tra:");
            setSMKT(sc.nextInt());
            System.out.println("Nhap diem thi ket thuc hoc phan:");
            setDTKTHP(sc.nextDouble());
        }catch (Exception e){
            System.out.println("Error: " + e.toString());
        }
    }
    public void inThongTin(){
        super.inThongTin();
        System.out.printf("%-10s %-10s %-10s %-10s \n", TDKT, SMKT, DTKTHP, tinhDiem());
    }

}
