package Hash_Set;
import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeatedElement
{
    public int firstRepeated(int[] nums)
    {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums)
        {
            if(set.contains(num))
            {
                return num;
            }

            set.add(num);
        }

        return -1;
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

        FirstRepeatedElement obj = new FirstRepeatedElement();

        System.out.println("First Repeated Element: " +
                obj.firstRepeated(nums));
    }
}