import java.util.Scanner;

public class NgayThang {
    private int ngay, thang, nam;
    public  void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        ngay = sc.nextInt();
        System.out.println("Nhap thang:");
        thang = sc.nextInt();
        System.out.println("Nhap nam:");
        nam = sc.nextInt();
    }

    public String inNgay(){
        return (ngay + "/" + thang + "/" + nam );
    }
}
