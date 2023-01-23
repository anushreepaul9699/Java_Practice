package Stack_Based_Questions;
import java.util.* ;
public class Make_Valid_braces 
{
    public static int make_valid (String str)
    {
        //base case 
        if(str.length() % 2 == 1)
        {
            return -1 ;
        }

        Stack <Character> stack = new Stack <> () ;
        
        //valid part ami remove korchi akhane --- >
        for(int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i) ;

            if(ch == '{')
            {
                stack.push(ch) ;
            }

            else 
            {
                if(!stack.isEmpty() && stack.peek() == '{')
                {
                    stack.pop() ;
                }

                else
                  {
                     stack.push(ch) ;
                  }
            }
            
        }

        //count_variables 'a' & 'b' --- > no._of open braces r close_braces count korar jonneh after removing valid part
        int a = 0 , b = 0 ;

        while (!stack.isEmpty())
        {
            if(stack.peek() == '{')
            {
                b++ ;
            }

            else
            {
                a++ ;
            }

            stack.pop() ;
        }

       int ans = (a+1) / 2 + (b+1) / 2 ;

       return ans ;
    }
    public static void main(String[] args) 
    {
        String str = "}}}{{{" ;
        
        int answer = make_valid(str) ;

        System.out.println(answer) ;
        
    }
    
}
