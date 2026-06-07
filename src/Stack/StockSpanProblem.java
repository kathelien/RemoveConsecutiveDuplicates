package Stack;
import java.util.Scanner;
import java.util.Stack;
public class StockSpanProblem
{
    public int[] stockSpan(int[] prices)
    {
        int[] span = new int[prices.length];

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < prices.length; i++)
        {
            while(!stack.isEmpty() &&
                    prices[stack.peek()] <= prices[i])
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
                span[i] = i + 1;
            }
            else
            {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter stock prices:");

        for(int i = 0; i < n; i++)
        {
            prices[i] = sc.nextInt();
        }

        StockSpanProblem obj = new StockSpanProblem();

        int[] result = obj.stockSpan(prices);

        System.out.println("Stock Span:");

        for(int span : result)
        {
            System.out.print(span + " ");
        }
    }
}
