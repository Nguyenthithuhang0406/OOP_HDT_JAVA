public class LaoDong {
    private String maLD, tenLD;
    private int soNgayCong;
    final int donGiaNgayCong = 100000;
    private LoaiLD loaiLD;

    public LaoDong(String maLD, String tenLD, int soNgayCong, LoaiLD loaiLD) {
        try {
            this.maLD = maLD;
            this.tenLD = tenLD;
//            this.soNgayCong = soNgayCong;
            setNgayCong(soNgayCong);
            this.loaiLD = loaiLD;
        }catch (Exception ex){
            System.out.println("loi:" + ex.toString());
        }
    }

    public void setNgayCong(int  soNC) throws Exception{
        if(soNC < 0){
            soNC = 0;
            throw  new Exception("so ngay cong khong duoc nho hon 0!");
        }
        this.soNgayCong = soNC;
    }
    public LaoDong() {
    }

    public String getTenLD() {
        return tenLD.toUpperCase();
    }

    public void setTenLD(String tenLD) {
        this.tenLD = tenLD;
    }

    public void setMaLD(String maLD) {
        this.maLD = maLD;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public void setLoaiLD(LoaiLD loaiLD) {
        this.loaiLD = loaiLD;
    }

    public int tinhThuong(){
        int thuong = 0;
        if(soNgayCong >= 15 && soNgayCong < 25) thuong = 700000;
        if(soNgayCong >= 25) thuong = 1000000;
        return thuong;
    }

    public int tinhLuong(){
        return soNgayCong * donGiaNgayCong + tinhThuong();
    }

    public void inTieuDe(){
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s \n", "ma lao dong", "ten lao dong", "so ngay cong", "donGiaNgayCong", "thuong", "luong");
    }

    public void inDuLieu(){
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s \n", maLD, getTenLD(), soNgayCong, donGiaNgayCong, tinhThuong(), tinhLuong());
    }
}
