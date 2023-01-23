package Stack_Based_Questions;

import java.util.ArrayList;
import java.util.*;
public class next_smaller_element 
{
    public static void find_next_smaller(ArrayList<Integer> arr , int n)
    {
        //natun arraylist banalam ans store korar jonneh
        ArrayList<Integer> ans = new ArrayList<>(n) ;

        //stack create kore -1 push korchi
        Stack <Integer> stack = new Stack <>() ;
        stack.push(-1) ;

        //last theke first traverse korbi arraylist e 
        for(int i = n - 1 ; i >= 0 ;i--)
        {
           //check korbe je stack empty ki na jodi empty na hoye then check korbe top element stack er >= current element ki na
            while (!stack.isEmpty() && stack.peek() >= arr.get(i))
            {
                //just pop that element
                stack.pop() ;
            }

            ans.add(stack.isEmpty() ? -1 : stack.peek()) ;
            stack.push(arr.get(i)) ;
        }

        System.out.println() ;

        Collections.reverse(ans);
        
        for(int i = 0 ; i < ans.size() ; i++)
        {
            System.out.print(ans.get(i)+" ");
        }
        
    }
    public static void main(String[] args)
    {
        ArrayList <Integer> arr = new ArrayList<>() ;

        //arraylist e element add korlam
        arr.add(2) ;
        arr.add(1) ;
        arr.add(4) ;
        arr.add(3) ;

        int n = arr.size() ;

        //initial arraylist print korchi
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr.get(i)+" ") ;
        }

        find_next_smaller(arr , n) ;
        
    }
    
}
