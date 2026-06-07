package Array_list;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveConsecutiveDuplicates
{
    public ArrayList<Integer> removeConsecutiveDuplicates(ArrayList<Integer> list)
    {
        ArrayList<Integer> result = new ArrayList<>();

        if(list.size() == 0)
        {
            return result;
        }

        result.add(list.get(0));

        for(int i = 1; i < list.size(); i++)
        {
            if(!list.get(i).equals(list.get(i - 1)))
            {
                result.add(list.get(i));
            }
        }

        return result;
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

        RemoveConsecutiveDuplicates obj = new RemoveConsecutiveDuplicates();

        ArrayList<Integer> result =
                obj.removeConsecutiveDuplicates(list);

        System.out.println("After removing consecutive duplicates:");
        System.out.println(result);
    }
}