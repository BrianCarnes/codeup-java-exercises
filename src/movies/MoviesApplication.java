package movies;

import util.Input;

public class MoviesApplication {
    private static final Input input = new Input();
    private static final Movie[] movies = MoviesArray.findAll();
    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    What would you like to do?

                    0 - exit
                    1 - view all movies
                    2 - view movies in the musical category
                    3 - view movies in the drama category
                    4 - view movies in the horror category
                    5 - view movies in the sci-fi category""");
            System.out.println("\nEnter your choice: ");
            int choice = input.getInt(0,5);
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    for (Movie movie : movies) {
                        System.out.println("Try movie: " + movie.getName() + " -- " + movie.getCategory());
                    }
                    break;
                case 2:
                    printMoviesByCat("musical");
                    break;
                case 3:
                    printMoviesByCat("drama");
                    break;
                case 4:
                    printMoviesByCat("horror");
                    break;
                case 5:
                    printMoviesByCat("scifi");
                    break;
            }
        }
    }

    public static void printMoviesByCat(String cat) {
        System.out.println("Here are the movies in the " + cat + " category :D");
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(cat)) {
                System.out.println("Try movie: " + movie.getName() + " -- " + movie.getCategory());
            }
        }
    }
}
