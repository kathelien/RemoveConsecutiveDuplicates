package Stack;
import java.util.Scanner;
import java.util.Stack;
public class ValidParentheses
{
 public boolean isValid(String s)
 {
  Stack<Character> stack = new Stack<>();

  for(char ch : s.toCharArray())
  {
   if(ch == '(' || ch == '{' || ch == '[')
   {
    stack.push(ch);
   }
   else
   {
    if(stack.isEmpty())
    {
     return false;
    }

    char top = stack.pop();

    if((ch == ')' && top != '(') ||
            (ch == '}' && top != '{') ||
            (ch == ']' && top != '['))
    {
     return false;
    }
   }
  }

  return stack.isEmpty();
 }

 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter brackets string: ");
  String s = sc.nextLine();

  ValidParentheses obj = new ValidParentheses();

  System.out.println("Valid Parentheses: " +
          obj.isValid(s));
 }
}
