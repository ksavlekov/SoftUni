import java.util.Scanner;
public class NumberTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                number = row + col + 1;
                if (number > n) {
                    number = 2 * n - number;
                }
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}