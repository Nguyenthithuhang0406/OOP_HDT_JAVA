public class Demo {
    private static HoaDon hd;
    public static void main(String[] args) {
        hd = new HoaDon();
        hd.nhap();
        System.out.println("danh sach hang truoc khi sap xep");
        hd.inDuLieu();
        System.out.println("danh sach hang sau khi sap xep");
        hd.sapXep();
        hd.inDuLieu();
        System.out.println("hang co so luong lon nhat la");
        Hang h = hd.timMax();
        h.inDuLieu();
    }
}
