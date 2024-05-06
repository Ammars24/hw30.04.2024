import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean exists = false;
        for (int a = 0; a <= n / 3; a++) {
            if ((n - 3 * a) % 5 == 0) {
                System.out.println(a + " " + (n - 3 * a) / 5);
                exists = true;
                break;
            }
        }

        if (!exists) {
            System.out.println("-1 - 1");
        }
    }
}
