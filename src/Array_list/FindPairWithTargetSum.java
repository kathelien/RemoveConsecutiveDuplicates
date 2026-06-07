package Array_list;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class FindPairWithTargetSum
{
    public boolean hasPairWithSum(ArrayList<Integer> list, int target)
    {
        HashSet<Integer> set = new HashSet<>();

        for(int num : list)
        {
            int complement = target - num;

            if(set.contains(complement))
            {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        FindPairWithTargetSum obj = new FindPairWithTargetSum();

        boolean result = obj.hasPairWithSum(list, target);

        System.out.println("Pair exists: " + result);
    }
}