import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjectives = {"giddy", "serendipitous", "eager", "austere", "idyllic", "unique", "stupendous", "thicc", "fire", "cosmic"};
    public static String[] nouns = {"lung", "cello", "abode", "tesla", "honda", "pheasant", "toe", "flier", "commons", "flashlight"};


    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        System.out.println(getWord(adjectives) + "-" + getWord(nouns));
    }

    public static String getWord(String[] words){
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        return words[randomIndex];
    }

}