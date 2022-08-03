import java.util.Scanner;

public class controlFlowExercises {
    public static void main(String[] args) {
        grades();
    }

    public static void whileLoop() {
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }
        int j = 100;
        do {
            System.out.print(j + " ");
            j -= 5;
        } while (j >= -10);

        long x = 0;
        System.out.println("\n");
        do {
            System.out.println(x);
            if (x == 0){
                x += 2;
            } else {
                x *= x;
            }
        } while (x <= 1000000);

        int fb = 1;
        while (fb <= 100) {
            System.out.println(fizzBuzz(fb));
            fb++;
        }
    }

    public static String fizzBuzz(int number) {
        if (number % 15 == 0) {
            return "fizzbuzz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else if (number % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(number);
    }

    public static void tableOfPowers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What number would you like to go up to? \n");
        int iterator = scanner.nextInt();
        System.out.println("Here is your table: \n");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        int i = 0;
        for (i = 0; i <= iterator; i++) {
            int squared = i * i;
            int cubed = i * i *i;
            System.out.println(i + "      | "+ squared + "       | " + cubed);
        }
    }

    public static void grades() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("'arry Potter, 'ow did you score on your OWL?");
        int number = scanner.nextInt();
        String grade;
        if (number >= 96) {
            grade = "A+";
        } else if (number > 92) {
            grade = "A";
        } else if (number > 88) {
            grade = "A-";
        } else if (number > 85) {
            grade = "B+";
        } else if (number > 83) {
            grade = "B";
        } else if (number > 79) {
            grade = "B-";
        } else if (number > 67) {
            grade = "C";
        } else if (number >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("You made a " + grade + ", lovely.");
    }
}
