import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//Viết mã cho main(sử dụng scanner để nhập từ bàn phím)
//Nhap ten
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ và tên: ");
//        Nhap diem
        String hoTen = scanner.nextLine();
        System.out.print("Điểm: ");
        double diemTB = scanner.nextDouble();
//Xuat ket qua ra man hinh
        System.out.printf("%s %.2f điểm",hoTen, diemTB);
    }
}