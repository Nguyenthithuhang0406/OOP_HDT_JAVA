import java.util.Scanner;

public class CongNhan {
    private String maCN, tenCN;
    private CaType caType;
    private int tongGioLam;

    public CaType getCaType() {
        return caType;
    }

    public int getTongGioLam() {
        return tongGioLam;
    }

    public CongNhan() {
    }

    public CongNhan(String maCN, String tenCN, CaType caType, int tongGioLam) {
        try{
            this.maCN = maCN;
            setTenCN(tenCN);
            this.caType = caType;
            setSoGioLam(tongGioLam);
        }catch (Exception e){
            System.out.println("Error:" + e.toString());
        }
    }

    public void setTenCN(String tenCN) throws Exception{
        if(tenCN.trim().length() > 0){
            this.tenCN = tenCN;
        }else{
            throw new Exception("Ten cong nhan phai khac rong!");
        }
    }

    public void setSoGioLam(int soGioLam) throws Exception{
        if(soGioLam >= 10){
            this.tongGioLam = soGioLam;
        }else {
            throw new Exception("So gio lam khong duoc nho hon 10!");
        }
    }

    public void inData(){
        System.out.printf("%-20s %-30s %-20s %-20s \n", maCN, tenCN, caType, tongGioLam);
    }

    public void setMacn(String maCn) throws Exception{
        if(maCn.trim().length() > 0){
            this.maCN = maCn;
        }else{
            throw new Exception("Ma phai khac rong!");
        }
    }
    public void nhapData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap thong tin cong nhan:");
        System.out.println("Moi ban nhap ma cong nhan:");
        try{
            setMacn(sc.nextLine());
        }catch (Exception e){
            System.out.println("Error:" + e.toString());
        }
        System.out.println("Moi ban nhap ten cong nhan:");
        try{
            setTenCN(sc.nextLine());
        }catch (Exception e){
            System.out.println("Error:" + e.toString());
        }
        System.out.println("Moi ban nhap ca lam viec:");
        System.out.println("Nhap 1: neu la ca1");
        System.out.println("Nhap 2: neu la ca2");
        System.out.println("Nhap 3: neu la ca3");
        int n = sc.nextInt();
        if(n == 1) caType = CaType.ca1;
        if(n == 2) caType = CaType.ca2;
        if(n == 3) caType = CaType.ca3;
        System.out.println("Moi ban nhap so gio lam:");
        try{
            setSoGioLam(sc.nextInt());
        }catch (Exception e) {
            System.out.println("Nhap 1: neu la ca1");
        }
    }
}
