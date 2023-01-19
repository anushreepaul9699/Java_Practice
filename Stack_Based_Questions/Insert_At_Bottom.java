package Stack_Based_Questions;
import java.util.*;
public class Insert_At_Bottom 
{
    public static void insert_at_bottom (int data , Stack<Integer> s)
    {
        //base case--- > jakhn stack empty
        if(s.isEmpty())
        {
            s.push(data) ;
            return ;
        }
        
        //top element ke peek kore pop korchi ---- > jakkhn stack empty hoye jachche : takhn new element ke push kore 
        //abar ager element ke push kore dichchi
        
        //deleting top elements -- >
        int top = s.pop() ;
        insert_at_bottom(data, s);

        //pushing back --- > previous elements
        s.push(top) ;

    }//end of function
    public static void main(String[] args) 
    {
        Stack<Integer> s = new Stack<>() ;
        s.push(1) ;
        s.push(2) ;
        s.push(3) ;

        insert_at_bottom(5, s);

        while(!s.isEmpty())
        {
            System.out.print(s.peek()+" ");
            s.pop() ;
        }
        
    }//end of main class
    
}//end of the program
