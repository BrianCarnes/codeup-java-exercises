import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Isla");
        people[1] = new Person("Adelie");
        people[2] = new Person("Willow");

        for (Person person : people) {
            System.out.println("Name = " + person.getName());
        }

        Person[] newArray = addPerson(people, new Person("William"));

        for (Person person : newArray) {
            System.out.println("Name = " + person.getName());
        }

    }

    public static Person[] addPerson(Person[] array, Person personInput){
        Person[] peopleArray = Arrays.copyOf(array, array.length+1);
        peopleArray[peopleArray.length-1] = personInput;
        return peopleArray;
    }

}