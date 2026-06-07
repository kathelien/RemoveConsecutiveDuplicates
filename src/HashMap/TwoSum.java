package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum
{
    public int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            int difference = target - nums[i];

            if(map.containsKey(difference))
            {
                return new int[]{map.get(difference), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
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

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        TwoSum obj = new TwoSum();

        int[] result = obj.twoSum(nums, target);

        System.out.println("Indices: [" +
                result[0] + ", " + result[1] + "]");
    }
}