import java.util.*;

public class test {
//    public static PartTimeEmployee[] listnv = new PartTimeEmployee[5];
    public  static ArrayList<PartTimeEmployee> listnv = new ArrayList<>();

//    public static  void fakeData(){
//        listnv[0] = new PartTimeEmployee("Nguyễn Mỹ Linh", 21, Gender.Nu, "Nguyễn Thị Thu Hằng", "01-08-2024", 25);
//        listnv[1] = new PartTimeEmployee("Đặng Thu Trang", 20, Gender.Nu, "Nguyễn Thị Thu Hằng", "02-08-2024", 20);
//        listnv[2] = new PartTimeEmployee("Lương Thị Phượng", 20, Gender.Nu, "Nguyễn Thị Thu Hằng", "28-07-2024", 27);
//        listnv[3] = new PartTimeEmployee("Nguyễn Hải Long", 22, Gender.Nam, "Nguyễn Thị Thu Hằng", "03-08-2024", 40);
//        listnv[4] = new PartTimeEmployee("Trần Ngọc Châu", 19, Gender.Nu, "Nguyễn Thị Thu Hằng", "23-07-2024", 18);
//    }

    public static  void fakeData(){
        listnv.add(new PartTimeEmployee("Nguyễn Mỹ Linh", 21, Gender.Nu, "Nguyễn Thị Thu Hằng", "01-08-2024", 25));
        listnv.add(new PartTimeEmployee("Đặng Thu Trang", 20, Gender.Nu, "Nguyễn Thị Thu Hằng", "02-08-2024", 20));
        listnv.add(new PartTimeEmployee("Lương Thị Phượng", 20, Gender.Nu, "Nguyễn Thị Thu Hằng", "28-07-2024", 27));
        listnv.add(new PartTimeEmployee("Nguyễn Hải Long", 22, Gender.Nam, "Nguyễn Thị Thu Hằng", "03-08-2024", 40));
        listnv.add(new PartTimeEmployee("Trần Ngọc Châu", 19, Gender.Nu, "Nguyễn Thị Thu Hằng", "23-07-2024", 18));
    }

//    public static void inDuLieu(){
//        for(int i = 0; i< 5; i++){
//            System.out.println(listnv[i].toString());
//        }
//    }

    public  static  void inDuLieu(){
        for (PartTimeEmployee nv: listnv) {
            System.out.println(nv.toString());
        }
    }

//    public static void sortByHours(){
//        Comparator<PartTimeEmployee> c = new Comparator<PartTimeEmployee>() {
//            @Override
//            public int compare(PartTimeEmployee o1, PartTimeEmployee o2) {
//                return (o1.getHoursPerWeek() - o2.getHoursPerWeek());
//            }
//        };
//        Arrays.sort(listnv, c);
//    }

    public  static  void sortByHours(){
        Comparator<PartTimeEmployee> c = new Comparator<PartTimeEmployee>() {
            @Override
            public int compare(PartTimeEmployee o1, PartTimeEmployee o2) {
                return o1.getHoursPerWeek() - o2.getHoursPerWeek();
            }
        };

        Collections.sort(listnv, c);
    }
    public static void main(String[] args) {
        fakeData();
        System.out.println("==============Danh sách nhân viên=================");
        inDuLieu();
        System.out.println("===================Danh sách nhân viên sau khi sắp xếp là");
        sortByHours();
        inDuLieu();
    }
}
