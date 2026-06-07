package HashMap;
import java.util.*;
public class TopKFrequentElements
{
    public int[] topKFrequent(int[] nums, int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        int[] result = new int[k];

        for(int i = 0; i < k; i++)
        {
            result[i] = list.get(i).getKey();
        }

        return result;
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

        System.out.print("Enter k value: ");
        int k = sc.nextInt();

        TopKFrequentElements obj =
                new TopKFrequentElements();

        int[] result = obj.topKFrequent(nums, k);

        System.out.println("Top K Frequent Elements:");

        for(int num : result)
        {
            System.out.print(num + " ");
        }
    }
}
