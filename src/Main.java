import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập wight : ");
        double w = scanner.nextDouble();
        System.out.println("nhập heigh : ");
        double h = scanner.nextDouble();
        Hieu hieu = new Hieu(w,h);
        System.out.println("Hiếu có wight và heigh là : "+ hieu.display());
        System.out.println("Hiếu có diện tích là : "+ hieu.getArea());
        System.out.println("Hiếu có chu vi là : "+ hieu.getPrimeter());
    }
}