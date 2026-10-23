
import java.util.Scanner;

public class Hoten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();

        System.out.println("Ho ten cua ban la: " + hoTen);
        System.out.println("Phien ban moi: " + hoTen);

        sc.close();
    }
}
