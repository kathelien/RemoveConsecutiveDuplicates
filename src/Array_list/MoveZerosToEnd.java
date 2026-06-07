package Array_list;
import java.util.ArrayList;
import java.util.Scanner;
public class MoveZerosToEnd
{
    public void moveZerosToEnd(ArrayList<Integer> list)
    {
        int zeroCount = 0;

        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i) == 0)
            {
                list.remove(i);
                zeroCount++;
                i--;
            }
        }

        for(int i = 0; i < zeroCount; i++)
        {
            list.add(0);
        }
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

        MoveZerosToEnd obj = new MoveZerosToEnd();

        obj.moveZerosToEnd(list);

        System.out.println("After moving zeros to end:");
        System.out.println(list);
    }
}
