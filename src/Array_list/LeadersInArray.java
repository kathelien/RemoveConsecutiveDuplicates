package Array_list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeadersInArray
{
    public ArrayList<Integer> findLeaders(ArrayList<Integer> list)
    {
        ArrayList<Integer> leaders = new ArrayList<>();

        int max = list.get(list.size() - 1);
        leaders.add(max);

        for(int i = list.size() - 2; i >= 0; i--)
        {
            if(list.get(i) > max)
            {
                max = list.get(i);
                leaders.add(max);
            }
        }

        Collections.reverse(leaders);
        return leaders;
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

        LeadersInArray obj = new LeadersInArray();

        ArrayList<Integer> result = obj.findLeaders(list);

        System.out.println("Leaders in the array:");
        System.out.println(result);
    }
}