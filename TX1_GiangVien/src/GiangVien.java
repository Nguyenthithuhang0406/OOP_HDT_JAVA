public class GiangVien {
    private String tenGv, diaChi;
    private LoaiGV loaiGV;
    private final int luongCoBan = 130000;
    private int soTietDay;
    private final int giaTienTietDay = 160000;

    public GiangVien(String tenGv, String diaChi, LoaiGV loaiGV, int soTietDay) {
        try{
            this.tenGv = tenGv;
            this.diaChi = diaChi;
            this.loaiGV = loaiGV;
            setSoTietDay(soTietDay);
        }catch (Exception e){
            System.out.println("loi: " + e.toString());
        }
    }

    public void setSoTietDay(int soTiet) throws Exception{
        if(soTiet < 0){
            soTiet = 0;
            throw new Exception("so tiet day phai lon hon 0!!");
        }
        this.soTietDay = soTiet;
    }

    public GiangVien() {
    }

    public String getTenGv() {
        return tenGv;
    }

    public void setTenGv(String tenGv) {
        this.tenGv = tenGv;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setLoaiGV(LoaiGV loaiGV) {
        this.loaiGV = loaiGV;
    }

    public int tinhLuong(){
        return luongCoBan + soTietDay * giaTienTietDay;
    }

    public void inTieuDe(){
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s \n", "Ten Giang vien", "dia chi", "loai giang vien", "luong co ban", "so tiet day", "gia tien", "luong");
    }

    public void inDuLieu(){
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s \n", tenGv, diaChi, loaiGV, luongCoBan, soTietDay, giaTienTietDay, tinhLuong());
    }
}
