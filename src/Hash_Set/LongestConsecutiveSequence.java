package Hash_Set;
import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSequence
{
    public int longestConsecutive(int[] nums)
    {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums)
        {
            set.add(num);
        }

        int longest = 0;

        for(int num : set)
        {
            int current = num;
            int count = 1;

            while(set.contains(current + 1))
            {
                current++;
                count++;
            }

            if(count > longest)
            {
                longest = count;
            }
        }

        return longest;
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

        LongestConsecutiveSequence obj =
                new LongestConsecutiveSequence();

        System.out.println("Longest Consecutive Length: "
                + obj.longestConsecutive(nums));
    }
}
