import java.util.Scanner;

public class P02_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = Integer.parseInt(scanner.nextLine());
        double bonus = 0.0;

        if(score <= 100){
            bonus = 5.0;
        }else if (score  > 1000){
            bonus = score * 0.10;
        }else {
            bonus = score * 0.20;
        }


        if(score % 2 == 0){
            bonus = bonus + 1;
        }else if (score % 5 == 0){
            bonus = bonus + 2;
        }

        System.out.println(bonus);
        System.out.println(bonus + score);

    }
}
