package Stack_Based_Questions;

import java.util.*;
public class next_greater 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> arr = new ArrayList<>() ;

        arr.add(2) ;
        arr.add(1) ;
        arr.add(4) ;
        arr.add(3) ;

        int size = arr.size() ;
 
        System.out.println("Input ArrayList is : ");
        for(int i = 0 ; i < size ; i++)
        {
            System.out.print(arr.get(i)+" ") ;
        }

        ArrayList<Integer> ans = new ArrayList<>(size) ;

        Stack<Integer> stack = new Stack <> () ;
        stack.push(-1) ;

        for(int i = size - 1 ; i >= 0 ; i--)
        {
            int curr = arr.get(i) ;

            while (!stack.isEmpty() && stack.peek() <= curr)
            {
                stack.pop() ;
            }

            ans.add(stack.isEmpty() ? -1 : stack.peek()) ;

            stack.push(curr) ;
        }

        System.out.println(); 

        Collections.reverse(ans);

       System.out.println("The output arraylist is : ") ;

       for(int i = 0 ; i < ans.size() ; i++)
       {
        System.out.print(ans.get(i)+" ") ;
       }
        
    }
    
}
