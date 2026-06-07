package Stack;
import java.util.Scanner;
import java.util.Stack;
public class DecodeString
{
    public String decodeString(String s)
    {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String currentString = "";
        int currentNumber = 0;

        for(char ch : s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                currentNumber = currentNumber * 10 + (ch - '0');
            }
            else if(ch == '[')
            {
                countStack.push(currentNumber);
                stringStack.push(currentString);

                currentNumber = 0;
                currentString = "";
            }
            else if(ch == ']')
            {
                int repeat = countStack.pop();
                String previous = stringStack.pop();

                StringBuilder temp = new StringBuilder(previous);

                for(int i = 0; i < repeat; i++)
                {
                    temp.append(currentString);
                }

                currentString = temp.toString();
            }
            else
            {
                currentString += ch;
            }
        }

        return currentString;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter encoded string: ");
        String s = sc.nextLine();

        DecodeString obj = new DecodeString();

        System.out.println("Decoded String: " +
                obj.decodeString(s));
    }
}
