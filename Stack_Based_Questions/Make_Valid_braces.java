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
            
            //jodi open bracket hoye : --- >
            if(ch == '{')
            {
                //stack e push hbe -- >
                stack.push(ch) ;
            }

            else 
            {
                //jodi stack empty na hoye r close bracket recieve hoye tahole dekhbi top e open braket ache ki na 
                // { = recieve && }=top element : {} valid part ---> then remove top  
                if(!stack.isEmpty() && stack.peek() == '{')
                {
                    //remove top element
                    stack.pop() ;
                }

                else
                  {
                    //jodi suru tei } bracket recieve hoye tahole push hbe
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
