public class LogicalOr {
    public static void main (String [] args){
        System.out.println("Does the analysis show a result less than 2 OR greater than 5?");
        int number = 7;
        if (number < 2 || number > 5)
        {
            System.out.println("Yes! You should contact your GP for a follow up.");
        }
        else
        {
            System.out.println("No!");
        }
    }
}
