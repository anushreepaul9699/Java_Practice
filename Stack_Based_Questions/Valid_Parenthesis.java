package Stack_Based_Questions;
import java.util.* ;
public class Valid_Parenthesis 
{
    public static boolean valid_or_not (Stack <Character> stack , String str)
    {
        for(int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i) ;
           
            //open bracket hole push korbi
            if(ch == '(' || ch =='{' || ch == '[')
            {
               stack.push(ch) ;
            }
            
            //close bracket pele top ta dekhbi open bracket ache ki na diye pop korbi
            else
            {
                //check korbi stack non-empty ki na -- > jodi hoyee tahole search korbi je closing bracket er 
                /*respective a opening bracket top of the stack e ache ki na */

                if(!stack.isEmpty())
                {
                
                    char top = stack.peek() ;
                    
                    //plus -- > duto match krte hbe : '('  hole ')' thakte hbe 
                    if(top == '{' && ch == '}' || top == '(' && ch == ')' || top == '[' && ch == ']')
                     {
                        //thakle pop korbi 
                        stack.pop() ;
                     }

                    else
                      {
                        //false return korbi
                         return false ;
                      }
                
                }

                //jodi empty hoye r akta bracket string e traverse korte giye recieve hoye tahole false hbe (  respect e kono ) nei
                else
                {
                    return false ;
                }
               
               
            }



           
        }//end of for loop

        if(stack.isEmpty()) // last e jodi empty hoye jaye tahole true else false
            
        return true ;
    

    else
         return false ;
    }

    public static void main(String[] args) 
    {
        String str = "{([])}" ;
        Stack<Character> stack = new Stack<>() ;
        
        boolean ans = valid_or_not(stack , str) ;

        System.out.println(ans) ;
    
    } // end of main class
    
}//end of the program
