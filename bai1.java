import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhập số :");
        n = scanner.nextInt();
        int i;
        for ( i =2; i<n; i++) {
            boolean check = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Các số nguyên tố bé hơn " + n + " là:" + i);
            }
        }
    }
}
