package HashMap;
import java.util.*;
public class CharacterFrequencySort
{
    public String frequencySort(String s)
    {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Character> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> map.get(b) - map.get(a));

        StringBuilder result = new StringBuilder();

        for(char ch : list)
        {
            for(int i = 0; i < map.get(ch); i++)
            {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        CharacterFrequencySort obj =
                new CharacterFrequencySort();

        System.out.println("Sorted String: "
                + obj.frequencySort(s));
    }
}

