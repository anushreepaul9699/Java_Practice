package Array_Based_Questions;
public class find_pivot
{
    //defining the function
    static int find_pivot_element (int[] arr , int n)
    {
        //declaring 's' and 'e' variable
        int s = 0 ;
        int e = n -1 ;

        //base case 
        if(s > e)
        {
            return -1 ;
        }

        //main part of the function
        
        //calculating mid 
        int mid = s + (e - s) / 2 ;

        //start of while loop
        while(s<e)
        {
            if(arr[mid] >= arr[0])
            {
                s = mid + 1;
            }

            else
            {
                e = mid ;
            }

            //updating mid
            mid = s + (e - s) / 2;
        }

        //returning ans
        return s ;
    
    }//end of function
    public static void main(String[] args) 
    {
        //declaring the array and storing the array size in variable 'n'
        int[] arr ={3,8,10,17,1} ; 
        int n = arr.length ;

        //calling the function to find the pivot(min) element
        int ans = find_pivot_element(arr,n) ;

        //printing the pivot element
        System.out.println("The pivot element is  at index : "+ans) ;

    }//End of main class

}//End of the program