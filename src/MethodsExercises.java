import java.util.Locale;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(42, 69));
        System.out.println(subtraction(42, 69));
        System.out.println(multiplication(42, 69));
        System.out.println(division(42, 0));
        System.out.println(division(42, 69));
        factorial();
    }
    public static int addition(int x, int y) {
        return x + y;
    }
    public static int subtraction(int x, int y) {
        return x - y;
    }

//    public static int multiplication(int x, int y) {
//        int solution = 0;
//        int i;
//        for (i = 0; i < y; i++) {
//            solution += x;
//        }
//        return solution;
//    }
    public static int multiplication (int x, int y){
        if (x < y) return multiplication(y, x);
        else if (y != 0) return (x + multiplication(x, y - 1));
        else return 0;
    }
    public static double division(double x, double y) {
        String zero = "Imagine that you have zero cookies, \nand you split them evenly among zero friends. \nHow many cookies does each person get? \nSee? It ydoesn’t make sense. \nAnd Cookie Monster is sad that there are no cookies, \nand you are sad that you have no friends.";
        if (y == 0) {
            System.out.println(zero);
            return 0;
        } else return x / y;
    }

    public static boolean getInteger(int min, int max, int input) {
        if (min > max) return getInteger(max, min, input);
        else return input >= min && input <= max;
    }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        int i;
        int solution = 1;
        StringBuilder output = new StringBuilder();
        System.out.println("Please enter a number between 1 and 10.");
        int response = scanner.nextInt();
        while (!getInteger(1,10, response)) {
            System.out.println("Please enter a number between 1 and 10.");
            response = scanner.nextInt();
        }

        output.append(response).append("! = ");

        for (i = 1; i <= response; i++) {
            output.append(i).append(" x ");
            solution *= i;

            if (i == response) {
                output.delete(output.length() -3, output.length()).append(" = ");
                output.append(solution);
            }
        }
        System.out.println(output);
    }
    public static void diceRoll(int x) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int dice1=(int)(Math.random()*x+1);
            int dice2=(int)(Math.random()*x+1);
            int sum = dice1 + dice2;

            System.out.println("Roll: total = " + sum + "dice 1: " + dice1 + ", dice 2: " + dice2);
            System.out.println("Would you like to roll again? y/n");
            String re = scanner.next();
            if (!re.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
    public static void guessHighLow() {
        Scanner scanner = new Scanner(System.in);
        int correctNum = (int)(Math.random()*100+1);
        while (true) {
            System.out.println("enter a number 1-100");
            int guess1 = scanner.nextInt();

            if(guess1 < correctNum){
                System.out.println("Higher");
            } else if(guess1 > correctNum){
                System.out.println("Lower");
            } else if(guess1 == correctNum){
                System.out.println("correct!");
                break;
            }
            else{
                System.out.println("not a valid option");
            }
        }
    }
}


