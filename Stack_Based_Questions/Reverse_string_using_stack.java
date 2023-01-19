package Stack_Based_Questions;
import java.util.Stack;

public class Reverse_string_using_stack 
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        String s = "Anushree" ;
        Stack <Character> stringStack = new Stack <> () ;

        //printing the initial string 
        System.out.println("The initial string is  : "+s) ;

        //pushing letters into the array --- >
        for(int i = 0 ; i < s.length() ; i++)
        {
            stringStack.push(s.charAt(i)) ;
        }

        //printing string in reverse order
        StringBuilder ans = new StringBuilder() ;

        while (!stringStack.isEmpty())
        {
          
            char top = stringStack.peek() ;
            ans.append(top);
            stringStack.pop();

        }

        System.out.println("The reverse string is : "+ans);



        
    }
    
}
