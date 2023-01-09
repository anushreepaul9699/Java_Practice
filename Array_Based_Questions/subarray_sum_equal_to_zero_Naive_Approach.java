package Array_Based_Questions;

public class subarray_sum_equal_to_zero_Naive_Approach
{
    //defining the function -- to check whether any subarray exists
    static boolean find_subarray (int[] arr , int n , int target)
    {
        for(int i = 0 ; i < n ; i++)
        {
            //initialising the current sum
            int current_sum = arr[i] ;
            
            //checking if current_Sum == target or not
            if(current_sum == target)
            {
                return true ;
            }

            else
            {
                //check for another sub array
                for(int j = 1 ; j < n ; j++)
                {
                    current_sum += arr[j] ;
                    if (current_sum == target)
                    {
                        return true ;
                    }
                }

            }
        }

        return false ;
    
    }//end of the function
    public static void main(String[] args)
    {
        //declaring the array and storing the size of the array in variable 'n'
        int[] arr = {4,2,-3 ,1, 6} ;
        int n = arr.length ;

        //declaring the target
        int target = 0 ;

        //calling the function
        boolean ans = find_subarray(arr,n,target) ;

        //printing the result
        if(ans)
        {
            System.out.println("Yes subarray exists !") ;
        }

        else
        {
            System.out.println("No subarray exists !") ;
        }

        
    }//end of main class

    
}//end of the program
