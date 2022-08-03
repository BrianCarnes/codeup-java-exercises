import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bob is lonely, talk to him, will ya?");
        String response = scanner.nextLine();
        String bobResponse;
        if (response.endsWith("?")) {
            bobResponse = "Sure";
        } else if (response.endsWith("!")) {
            bobResponse = "Whoa, calm down.";
        } else if (response.length() == 0) {
            bobResponse = "Fine, be that way";
        } else bobResponse = "Whatever";
        System.out.println("Bob: " + bobResponse);
    }
}
