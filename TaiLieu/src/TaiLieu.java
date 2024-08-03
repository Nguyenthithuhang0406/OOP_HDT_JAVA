import java.util.Scanner;

public class TaiLieu {
    private String maTL, tenTL;
    private int namXB = 2020;
    private int soTrang;

    public TaiLieu(String maTL, String tenTL, int soTrang) {
        this.maTL = maTL;
        this.tenTL = tenTL;
        this.soTrang = soTrang;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public TaiLieu() {
    }

    public void nhap(){
        System.out.println("moi ban nhap ma tai lieu:");
        Scanner sc = new Scanner(System.in);
        maTL  = sc.nextLine();
        System.out.println("moi ban nhap ten tai lieu:");
        tenTL = sc.nextLine();
        if(tenTL.trim() == "") {
            System.out.println("moi ban nhap lai ten tai lieu, ten tai lieu khong duoc bo trong!");
            tenTL = sc.nextLine();
        }
        System.out.println("moi ban nhap so trang: ");
        soTrang = sc.nextInt();
    }

    public  void inTieuDe(){
        System.out.printf("%-20s %-50s %-20s %-20s", "Ma tai lieu", "ten tai lieu", "nam xuat ban","so trang");
    }

    public void kiemTraSoTrang(){
        if(soTrang == 0){
            System.out.println("vui long kiem tra lai!!!");
        }else{
            if(soTrang < 0){
                System.out.println("So trang khong hop le!!!");
            }else{
                if(soTrang > 500){
                    System.out.println("Tai lieu qua day!!!!!!");
                }
            }
        }
    }

    public void xuatDuLieu(){
        System.out.printf("%-20s %-50s %-20s %-20s", maTL, tenTL, namXB, soTrang);
    }
}
