package HashMap;
import java.util.*;
public class FindDuplicateFileNames
{
    public List<String> findDuplicates(String[] files)
    {
        HashMap<String, Integer> map = new HashMap<>();

        for(String file : files)
        {
            map.put(file, map.getOrDefault(file, 0) + 1);
        }

        List<String> duplicates = new ArrayList<>();

        for(Map.Entry<String, Integer> entry : map.entrySet())
        {
            if(entry.getValue() > 1)
            {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of files: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] files = new String[n];

        System.out.println("Enter file names:");

        for(int i = 0; i < n; i++)
        {
            files[i] = sc.nextLine();
        }

        FindDuplicateFileNames obj =
                new FindDuplicateFileNames();

        List<String> result = obj.findDuplicates(files);

        System.out.println("Duplicate File Names:");
        System.out.println(result);
    }
}