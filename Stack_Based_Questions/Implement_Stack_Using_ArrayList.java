package Stack_Based_Questions;

import java.util.ArrayList;

public class Implement_Stack_Using_ArrayList 
{
    static class Stack
    {
        ArrayList<Integer> lists = new ArrayList<>() ;
    
        //checking list is empty or not -- >
        public  boolean checkEmpty()
        {
            return lists.size()==0 ;
        }
        
        //push operation -- >
        void push (int element)
        {
           lists.add(element) ;
        }

        int pop()
        {
            if(checkEmpty())
            {
                return -1 ;
            }

            int top = lists.get(lists.size() - 1) ;
            lists.remove(lists.get(lists.size() - 1)) ;
            return top ;
        }

        int peek () 
        {
            if(checkEmpty())
            {
                return -1 ;
            }

            return lists.get(lists.size() - 1) ;
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) 
    {
         Stack s = new Stack() ;
       
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.checkEmpty())
        {
            System.out.print(s.peek()+" ");
            s.pop() ;
        }

        
    }//end of main class
    
}
