package grades;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private final String firstName;
    private final String lastName;
    private final String userName;
    private final Map<String, Integer> grades;
    private double gradeAverage;

    public Student(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.grades = new HashMap<>();
        this.gradeAverage = 0;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setGrades(String subject, int grade) {
        grades.put(subject, grade);
    }

    public void getGrades() {
        grades.forEach(
                (key, value)
                        -> System.out.println("Subject: " + key + " Grade: " + value));
        }

    public double gradeAverage() {
        for (double grade : grades.values()) {
            this.gradeAverage += grade;
        }
        return this.gradeAverage / grades.size();
    }
}
