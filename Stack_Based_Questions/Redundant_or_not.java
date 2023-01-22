package Stack_Based_Questions;
import java.util.* ;
public class Redundant_or_not 
{
    public static boolean redundant_check (Stack <Character> stack , String str)
    {
         for(int i = 0 ; i<str.length() ; i++)
         {
             char ch = str.charAt(i) ;
            
             //agar open bracket ya koi operator milta hai to just push karenge stack me 
             if(ch == '(' || ch =='+' || ch =='-' || ch == '*' || ch == '/')
             {
                 stack.push(ch) ;
             }

             //agar close bracket ya koi lower case (ignore) milta hai to check karenge ki koi operator hai ya nhi
             // open bracket milne se phle

             else
               {
                  if(ch == ')')
                  {
                      boolean isRedundant = true ;

                    //jab tak koi open bracket nhi mil jata
                    while (stack.peek() != '(')
                    {
                        char top = stack.peek() ;
                         
                        //search for operator --- > + , - , * , /
                        if( top =='+' || top =='-' || top == '*' || top == '/')
                        {
                            isRedundant = false ;
                        }
                        
                        //operator ko delete kro
                        stack.pop() ;
                    }

                    if(isRedundant == true)
                    
                        return true ;
                    //open bracket ko v delete kro
                    stack.pop() ;

                  }

               }

               
         }//end of for loop

         return false ;
    
    }//end of function
    public static void main(String[] args) 
    {
        Stack <Character> stack = new Stack <> () ;
        String str = "((a+b))" ;
        boolean ans = redundant_check(stack,str);

        System.out.println(ans) ;
        
    }//end of main class
    
}//end of the program
