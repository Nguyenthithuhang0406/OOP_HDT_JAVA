import java.util.Scanner;

public class MonHoc implements IO {
    private String maMon, tenMon;
    private int soTC;
    private  LoaiMon loaiMon;

    public MonHoc(String maMon, String tenMon, int soTC, LoaiMon loaiMon) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTC = soTC;
        this.loaiMon = loaiMon;
    }

    public MonHoc() {
    }

    public int getSoTC() {
        return soTC;
    }

    public LoaiMon getLoaiMon() {
        return loaiMon;
    }

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Moi ban nhap thong tin mon hoc!");
            System.out.println("Moi nhap ma mon:");
            String maMon = sc.nextLine();
            setMaMon(maMon);
            System.out.println("Moi nhap ten mon:");
            String tenMon = sc.nextLine();
            setTenMon(tenMon);
            System.out.println("Moi ban nhap so tin chi:");
            int soTC = sc.nextInt();
            setSoTC(soTC);
            System.out.println("Moi ban nhap loai mon:");
            System.out.println("Nhap 1: neu la loai co so!");
            System.out.println("Nhap 2: neu la loai chuyen nganh!");
            int loai = sc.nextInt();
            setLoaiMon(loai);
        }catch (Exception e){
            System.out.println("Error:"+ e.toString());
        }
    }

    @Override
    public void outputData() {
        System.out.printf("%-20s %-50s %-20s %-20s \n", maMon, tenMon, soTC, loaiMon);
    }

    public void setMaMon(String maMon) throws Exception{
        if(maMon.trim().length() != 0){
            this.maMon = maMon;
        }else{
            throw new Exception("Ma mon phai khac rong rong!");
        }
    }

    public void setTenMon(String tenMon) throws Exception{
        if(tenMon.trim().length() != 0){
            this.tenMon = tenMon;
        }else {
            throw new Exception("Ten mon phai khac rong!");
        }
    }

    public void setLoaiMon(int loai) throws Exception{
        if(loai != 1 && loai != 2){
            throw new Exception("loai mon khong hop le!");
        }
        if(loai == 1){
            this.loaiMon = LoaiMon.CoSo;
        }
        if(loai == 2){
            this.loaiMon = LoaiMon.ChuyenNganh;
        }
    }

    public void setSoTC(int soTC) throws Exception{
        if(soTC < 0){
            throw new Exception("so tin chi phai lon hon hoac bang 0!");
        }else{
            this.soTC = soTC;
        }
    }
}
