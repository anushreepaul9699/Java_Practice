package Stack_Based_Questions;
import java.util.* ;

public class delete_middle_element 
{
    public static void delete_middle (Stack<Integer> stack , int count , int mid)
    {
        //base_case
        if(count == mid )
        {
            stack.pop() ;
            return ;
        }

        int num = stack.peek() ;
        stack.pop() ;

        delete_middle(stack, count+1, mid);
        stack.push(num) ;
    }
  public static void main(String[] args) 
  {
    Stack<Integer> stack = new Stack<>() ;
       
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5) ;

    int count = 0 ;

    int size = stack.size() ;

    int mid = size / 2 ;

    delete_middle(stack , count , mid) ;

    while(!stack.isEmpty())
    {
        System.out.print(stack.peek()+" ") ;
        stack.pop() ;
    }
    
  }
    
}
