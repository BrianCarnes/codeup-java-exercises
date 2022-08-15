package grades;

import util.Input;
import java.util.ArrayList;

public class GradesApplication {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Input input = new Input();
        String result = "";
        boolean exit;
        Student Jordan = new Student("Jordan", "Day", "JDay2077");
        Jordan.setGrades("History", 81);
        Jordan.setGrades("Mathematics", 91);
        Jordan.setGrades("English", 95);
        Jordan.setGrades("Programing", 88);
        students.add(Jordan);
        Student Sarah = new Student("Sarah", "Marshall", "FSMarshall");
        Sarah.setGrades("History", 78);
        Sarah.setGrades("Mathematics", 83);
        Sarah.setGrades("Reading", 84);
        Sarah.setGrades("Programing", 79);
        students.add(Sarah);
        Student Cthulhu = new Student("Cthulhu", "R'lyeh", "CTHULHU");
        Cthulhu.setGrades("History", 99);
        Cthulhu.setGrades("Theater", 99);
        Cthulhu.setGrades("English", 99);
        Cthulhu.setGrades("Programing", 99);
        students.add(Cthulhu);
        Student Codey = new Student("Codey", "Codeup", "CDup2015");
        Codey.setGrades("Rust Programming", 90);
        Codey.setGrades("Mathematics", 100);
        Codey.setGrades("English", 90);
        Codey.setGrades("Programing", 100);
        students.add(Codey);

        while (true) {
            System.out.println("""
                    Welcome!

                    Here are the GitHub usernames of our students:
                    """);
            for (Student student : students) {
                System.out.print("|" + student.getUserName() + "| ");
            }
            result = input.getString("\nWhat student would you like to see more information on?\n");

            for (Student student : students) {
                if (result.equalsIgnoreCase(student.getUserName())) {
                    System.out.println("\nName: " + student.getName() + "Github UserName: " + student.getUserName() + "\nCurrent Average: " + student.gradeAverage());
                    student.getGrades();
                } else {
                    while (!result.equalsIgnoreCase(student.getUserName())) {
                        exit = input.yesNo("\nWould you like to see another student?\n");
                        if (!exit) {
                            System.exit(0);
                        } else {
                            result = input.getString("\nWhat student would you like to see more information on?\n");
                        }
                        if (result.equalsIgnoreCase(student.getUserName())){
                        System.out.println("\nName: " + student.getName() + "Github UserName: " + student.getUserName() + "\nCurrent Average: " + student.gradeAverage());
                        student.getGrades();
                        }
                    }
                }
            }
            exit = input.yesNo("\nWould you like to see another student?\n");
            if (!exit) {
                System.exit(0);
            }
        }
    }
}
