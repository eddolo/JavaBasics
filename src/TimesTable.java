import java.util.Scanner;
public class TimesTable {
public static void main (String [] args)
{
    Scanner reader = new Scanner(System.in);
    System.out.print("What times table would you like? : ");
    int timestable = reader.nextInt();
    System.out.println("Here is the times table for number " + timestable + " :");

    // this will run the loop 12 times adding 1 to the original value each time
    for(int i=1; i<13; i++)
    {
        // this will print out each of the loops up until the for loop is completed <13
        System.out.println(timestable + " x " + i + " = " + timestable * i);

    }
}
}
