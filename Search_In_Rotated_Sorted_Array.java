public class Search_In_Rotated_Sorted_Array 
{
    //function to find the pivot element 
    static int getpivot (int[] arr ,int n)
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
        while(s < e)
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
    
    }//End of function

    //function of binary search--------to search in 1st or 2nd line
    static int binary_search(int[] arr , int s , int e ,int n , int search)
    {
        //main part of the function---- to find the element's index
        
        //calculating mid
        int mid = s + (e - s) / 2 ;

        //start of while loop
        while (s <= e)
        {
           if(arr[mid] == search)
           {
              return mid ;
           }

           if(arr[mid] < search)
           {
             s = mid + 1;
           }

           else
           {
             e = mid - 1 ;
           }

           //updating the mid
           mid = s + ( e - s ) / 2 ;
        }

        return -1 ;

    }
    //defining the function--- to search the element
    static int search_element(int[] arr ,int n , int search)
    {
  
        //main part of the function-------- find pivot then compare with search on the basis of some condition
        int p = getpivot(arr,n) ;

        System.out.println("The pivot element is "+p);

        //comparing with search
        if(arr[p] <= search && search <= arr[n - 1])
        {
            return binary_search(arr, p , n-1 , n, search) ;
        }

        else
             return binary_search(arr , 0 , p-1 , n , search) ;
    }
    public static void main(String[] args) 
    {
        //declaring the array and calculating the size of the array 
        int[] arr = {4,5,6,7,0,1,2} ;
        int n = arr.length ;

        //declaring the search element
        int search = 0 ;

        //calling the function
        int answer = search_element(arr,n,search) ;

        System.out.println(answer) ;

        //printing the result 
        if(answer == -1)
        {
            System.out.println("No such element was found !") ;
        }

        else
        {
            System.out.println("The element "+" "+ search +" "+"was found at index : "+ answer) ;
        }
        
    }//End of main class
    
}//End of the program
