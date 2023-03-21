public class LogicalAnd {
    public static void main (String [] args) {
        System.out.println("Is number between 1 AND 10?");
        int number = 9;
        if (number > 1 && number < 10)
        {
            System.out.println("Yes! The number is " + number);
        }
        else
        {
            System.out.println("Nope!");
        }
    }
}
