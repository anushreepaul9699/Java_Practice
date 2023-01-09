package Array_Based_Questions;

public class First_LeftMost_Occurrence 
{
    //defining the function
    static int find_leftmost (int[] arr , int n , int key)
    {
        //declaring 's' and 'e' variable
        int s = 0 ;
        int e  = n-1 ;
        
        //base case
        if(s > e)
        {
            return -1 ;
        }

        //declaring the variable 'ans'
        int ans = -1; 

        //calculating mid 
        int mid = s + (e -s) / 2 ;

        //start of while loop 
        while (s <= e)
        {
            if(arr[mid] == key)
            {
                ans = mid ;
                e = mid - 1 ;
            }

            else if(arr[mid] < key)
            {
                s = mid + 1;
            }

            else
            {
                e = mid - 1;
            }

            //updating the mid
            mid = s + (e - s) /2 ;
        }

        return ans ;
    }
    public static void main(String[] args) 
    {
        //declaring the array
        int[] arr = {1,3,3,5,6,8} ;

        //calculating the size of the array
        int n = arr.length ;

        //declaring the 'key' to search the leftmost occurrence
        int key = 3 ;

        //calling the function -- to find the leftmost/first occurence of the element
        int occur_at = find_leftmost(arr,n , key) ;

        //printing the result 
        if (occur_at == -1)
        {
            System.out.println("Element occurs only once !");
        }

        else
        {
            System.out.println("The element occurs at : "+occur_at) ;
        }
        
    }//end of main class
    
}//end of the program
