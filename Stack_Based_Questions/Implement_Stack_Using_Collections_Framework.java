package Stack_Based_Questions;

import java.util.Stack;

public class Implement_Stack_Using_Collections_Framework 
{
    public static void main(String[] args)
    {
        //implementing stack using collections framework ---- >
        Stack<Integer> s = new Stack <> () ;

        //push operation --- >
        s.push(1) ;
        s.push(2) ;
        s.push(3) ;
        s.push(4) ;
        
        //run till the list is not empty
        while (!s.isEmpty())
        {
            System.out.print(s.peek()+" ") ;
            s.pop() ;
        }
        
    }//end of the main class
    
}//end of the program
