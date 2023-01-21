package Stack_Based_Questions;
import java.util.* ;
public class sort_stack 
{
    public static void sorted_insert (Stack <Integer> stack , int num)
    {
        //base case
        if(stack.isEmpty() || !stack.isEmpty() && stack.peek() < num)
        {
            stack.push(num) ;
            return ;
        }

        int big = stack.peek() ;
        stack.pop() ;

        //recursive call
        sorted_insert(stack, num);

        //pushing back
        stack.push(big) ;

    }
    public static void sort(Stack <Integer> stack)
    {
        //base case
        if(stack.isEmpty())
        {
            return ;
        }

        int num = stack.peek() ;
        stack.pop() ;

        //recursive call
        sort(stack);
        
        //insert in sorted manner
        sorted_insert(stack , num) ;
    }
    public static void main(String[] args)
    {
        Stack <Integer> stack = new Stack <> () ;
        stack.push(5) ;
        stack.push(-2) ;
        stack.push(9) ;
        stack.push(-7) ;
        stack.push(3) ;

        sort(stack) ;

        while (!stack.isEmpty())
        {
            System.out.print(stack.peek()+" ") ;
            stack.pop() ;
        }

        
    }
    
}
