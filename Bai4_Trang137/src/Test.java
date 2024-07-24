import java.util.Scanner;

public class Test {
    private static int n;
    private static BenhNhan[] listbn;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong benh nhan");
        n = sc.nextInt();
        listbn = new BenhNhan[n];
        for(int i = 0; i < n; i++){
            listbn[i] = new BenhNhan();
            listbn[i].nhap();
        }
        System.out.println("danh sach benh nhan sau khi nhap la:");
        for(int i = 0; i< n; i++){
            System.out.println(listbn[i].toString());
        }
    }
}
