package Array_list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RotateArrayList
{
    public ArrayList<Integer> rotateRight(ArrayList<Integer> list, int k)
    {
        Collections.rotate(list, k);
        return list;
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

        System.out.print("Enter k value: ");
        int k = sc.nextInt();

        RotateArrayList obj = new RotateArrayList();

        System.out.println("Rotated ArrayList:");
        System.out.println(obj.rotateRight(list, k));
    }
}