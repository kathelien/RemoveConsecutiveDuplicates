package Hash_Set;
import java.util.HashSet;
import java.util.Scanner;

public class MissingPositiveInteger
{
    public int firstMissingPositive(int[] nums)
    {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums)
        {
            if(num > 0)
            {
                set.add(num);
            }
        }

        int missing = 1;

        while(true)
        {
            if(!set.contains(missing))
            {
                return missing;
            }

            missing++;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }

        MissingPositiveInteger obj = new MissingPositiveInteger();

        System.out.println("First Missing Positive: "
                + obj.firstMissingPositive(nums));
    }
}
