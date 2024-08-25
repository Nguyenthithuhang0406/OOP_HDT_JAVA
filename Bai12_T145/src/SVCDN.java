import java.util.Scanner;

public class SVCDN extends Nguoi{
    private double TDKT;
    private int SMKT;

    public SVCDN(String hoTen, String ngaySinh, String diaChi, LoaiSV loaiSV, double TDKT, int SMKT) {
        super(hoTen, ngaySinh, diaChi, loaiSV);
        try {
            setTDKT(TDKT);
            setSMKT(SMKT);
        }catch (Exception e){
            System.out.println("Error:" + e.toString());
        }
    }

    public SVCDN() {
        super();
    }

    @Override
    public double tinhDiem() {
       double DTB = TDKT * 1.0 / SMKT;
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
        }catch (Exception e){
            System.out.println("Error: " + e.toString());
        }

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

    public void inThongTin(){
        super.inThongTin();
        System.out.printf("%-10s %-10s %-10s \n", TDKT, SMKT, tinhDiem());
    }
}
