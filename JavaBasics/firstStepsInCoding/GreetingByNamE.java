import java.util.Scanner;

public class GreetingByNamE {

    public static void main(String[] args){

        Scanner scanner  = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.printf("Hello, %s!", input);
    }
}
