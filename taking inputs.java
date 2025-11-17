import java.util.Scanner;

class Person {
    private String fullName;
    private int userAge;

    Person(String fullName, int userAge) {
        this.fullName = fullName;
        this.userAge = userAge;
    }

    void showDetails() {
        System.out.println("Name: " + fullName);
        System.out.println("Age: " + userAge);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String enteredName = input.nextLine();

        System.out.print("Enter your age: ");
        int enteredAge = input.nextInt();

        Person p = new Person(enteredName, enteredAge);

        p.showDetails();

        input.close();
    }
}
