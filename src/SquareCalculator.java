import java.util.Scanner;
//this called the scanner
public class SquareCalculator {
    // this create a new java class called SquareCalculator that run the program called SquareCalculator
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //this is the scanner method to let the user insert inputs
        // in the main i created the different method with their datatype and their values
        double width = Double.parseDouble(reader.nextLine());
        double height = Double.parseDouble(reader.nextLine());
        double perimeter = (width + height)*2;
        double area = width*height;

        // in here we gonna have the user entering new values and output the new results
        System.out.println("What's the width of your square?");
        System.out.println("What's the height of your square?");
        System.out.println("The area is "+ area + " cm.");



    }
}
