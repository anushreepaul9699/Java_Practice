public class find_peak_index_in_Mountain_Array 
{
    //defining the function to find the peak element
    static int find_peak_element (int[] arr , int n)
    {
        //declaring 's' and 'e' variables 
        int s = 0 ;
        int e = n -1 ;

        //base case
        if(s > e)
        {
            return -1 ;
        }

        //main part of the function

        //calculating mid
        int mid = s + (e - s) / 2;

        //start of while loop
        while(s<e)
        {
            if(arr[mid] < arr[mid + 1])
            {
                s = mid + 1;
            }

            else
            {
                e = mid ;
            }

            //updating the mid
            mid = s + (e - s) /2 ;
        }

        return arr[s] ;
    }
    public static void main(String[] args) 
    {
        //declaring the array and storing the size of the array in variable 'n'
        int[] arr = {0,10,5,2} ;
        int n = arr.length ;

        //calling the function to find the peak element in mountain array
        int element = find_peak_element(arr,n) ;

        //printing the peak element
        if(element == -1)
        {
            System.out.println("No such element was found !") ;
        }

        else 
        {
            System.out.println("The peak element is : "+element) ;
        }
        
    }//End of main class
    
}//End of the program
