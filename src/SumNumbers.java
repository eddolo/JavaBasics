import java.util.Scanner;
public class SumNumbers
{
    public static void main (String [] args)
    {
        int sumTotal = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Input a number to sum to: ");
        int sumTo = reader.nextInt();
        int i = 1;
        while (i <= sumTo)
        {
            sumTotal = sumTotal +i;
            // sumTotal += i;
            i++;

        }
        System.out.println(sumTotal);
    }
}
