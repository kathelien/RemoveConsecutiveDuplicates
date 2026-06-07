package HashSet;
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

        int maxLength = 0;

        for(int num : nums)
        {
            if(!set.contains(num - 1))
            {
                int currentNum = num;
                int length = 1;

                while(set.contains(currentNum + 1))
                {
                    currentNum++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
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

        LongestConsecutiveSequence obj = new LongestConsecutiveSequence();

        System.out.println("Longest Consecutive Length: " +
                obj.longestConsecutive(nums));
    }
}