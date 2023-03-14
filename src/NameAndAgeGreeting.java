import java.util.Scanner;
public class NameAndAgeGreeting {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = reader.nextLine();
// reads a line entered by the user
        System.out.println("How old are you?");
        int age = Integer.parseInt(reader.nextLine());
        // reads a string entered by the user and transform it in an integer
        System.out.println("Your name is: " + name + " and you are " + age + " years old, nice to meet you!");


    }
}
