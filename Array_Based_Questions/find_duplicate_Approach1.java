package Array_Based_Questions;

import java.util.Arrays;

public class find_duplicate_Approach1 
{
    //defining the function
    static int find_duplicate (int[] arr ,int n)
    {
        //sorting the array
        Arrays.sort(arr);

        //for loop---- to traverse the array
        for(int i = 0 ; i < n - 1 ; i++)
        {
            if(arr[i] == arr[i+1])
            {
                return arr[i] ;
            }
        }

        return -1 ;
    
    }//End of function
    public static void main(String[] args) 
    {
        //declaring the array and calculating the array's size
        int[] arr = {1,3,4,2,2} ;
        int n = arr.length ;

        //calling function------ to find the duplicate element
        int ans = find_duplicate(arr,n) ;

        //printing the answer

        if(ans == -1)
        {
            System.out.println("No duplicate element is found !");
        }

        else
        {
            System.out.println("The duplicate element is : "+ans);
        }
        
    }//End of main class
    
}//End of the program
