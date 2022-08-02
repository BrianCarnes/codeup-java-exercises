import java.util.Scanner;

public class consoleExercises {

    public static void continuedExercises (){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hewwo there, Wascally Wabbit. Pwease enter thwee numbers and thwee words: ");
        int nextInt = scanner.nextInt();
        int nextInt1 = scanner.nextInt();
        int nextInt2 = scanner.nextInt();
        scanner.reset();
        String nextString = scanner.next();
        String nextString1 = scanner.next();
        String nextString2 = scanner.next();
        System.out.println("You picked " + nextInt + nextString + " and " + nextInt1 + nextString1 + " and " + nextInt2 + nextString2);
        scanner.nextLine();
        System.out.print("Let's try a whole sentence! \n>>");
        String nextLine = scanner.nextLine();
        System.out.printf("%s :p",nextLine);

    }
    public static void rectangleCalc () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the classroom: ");
        String length = scanner.nextLine();
        int lengthDimension = Integer.parseInt(length);
        System.out.println("Please enter the width of the classroom: ");
        String width = scanner.nextLine();
        int widthDimension = Integer.parseInt(width);
        int area = lengthDimension * widthDimension;
        int perimeter = (lengthDimension * 2) + (widthDimension * 2);
        System.out.printf("The area of that rectangle is %d\n", area);
        System.out.printf("The perimeter of that rectangle is %d", perimeter);
        scanner.close();
    }
    public static void main (String[] args){
        double pi = 3.14159;
        System.out.format("%.2f%n", pi);
        rectangleCalc();
    }

}
