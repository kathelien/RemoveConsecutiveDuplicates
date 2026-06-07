package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class CommonUniqueElements
{
    public List<Integer> intersection(int[] arr1, int[] arr2)
    {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> common = new HashSet<>();

        for(int num : arr1)
        {
            set.add(num);
        }

        for(int num : arr2)
        {
            if(set.contains(num))
            {
                common.add(num);
            }
        }

        return new ArrayList<>(common);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter first array elements:");
        for(int i = 0; i < n1; i++)
        {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter second array elements:");
        for(int i = 0; i < n2; i++)
        {
            arr2[i] = sc.nextInt();
        }

        CommonUniqueElements obj = new CommonUniqueElements();

        List<Integer> result = obj.intersection(arr1, arr2);

        System.out.println("Common Unique Elements: " + result);
    }
}