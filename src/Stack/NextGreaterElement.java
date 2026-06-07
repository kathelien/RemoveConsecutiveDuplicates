package Stack;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
public class NextGreaterElement
{
    public int[] nextGreaterElement(int[] nums)
    {
        int[] result = new int[nums.length];

        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < nums.length; i++)
        {
            while(!stack.isEmpty() &&
                    nums[i] > nums[stack.peek()])
            {
                result[stack.pop()] = nums[i];
            }

            stack.push(i);
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

        NextGreaterElement obj = new NextGreaterElement();

        int[] result = obj.nextGreaterElement(nums);

        System.out.println("Next Greater Elements:");

        for(int num : result)
        {
            System.out.print(num + " ");
        }
    }
}
