public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(42, 69));
        System.out.println(subtraction(42, 69));
        System.out.println(multiplication(42, 69));
        System.out.println(division(42, 0));
        System.out.println(division(42, 69));
    }
    public static int addition(int x, int y) {
        return x + y;
    }
    public static int subtraction(int x, int y) {
        return x - y;
    }
    public static int multiplication(int x, int y) {
        return x * y;
    }
    public static double division(double x, double y) {
        String zero = "Imagine that you have zero cookies, \nand you split them evenly among zero friends. \nHow many cookies does each person get? \nSee? It doesn’t make sense. \nAnd Cookie Monster is sad that there are no cookies, \nand you are sad that you have no friends.";
        if (y == 0) {
            System.out.println(zero);
            return 0;
        } else return x / y;
    }
}


