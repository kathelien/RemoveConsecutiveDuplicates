package Hash_Set;
import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber
{
    public boolean isHappy(int n)
    {
        HashSet<Integer> set = new HashSet<>();

        while(n != 1)
        {
            int sum = 0;

            while(n > 0)
            {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }

            if(set.contains(sum))
            {
                return false;
            }

            set.add(sum);
            n = sum;
        }

        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        HappyNumber obj = new HappyNumber();

        System.out.println("Is Happy Number: " + obj.isHappy(n));
    }
}
