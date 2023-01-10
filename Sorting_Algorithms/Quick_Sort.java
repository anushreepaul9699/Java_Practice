package Sorting_Algorithms;

public class Quick_Sort 
{
    static int partition(int[] arr ,int n , int s , int e)
    {
        int count = 0 ;
        int pivot = arr[s] ;

        //counting number of elements less than pivot
        for(int i = s + 1 ; i < n ; i++)
        {
            if(arr[i] <= pivot)
            {
                count++ ;
            }
        }

        //correct pivot index
        int correct_pivot_index = s + count ;

        //swapping (arr[s] , arr[correct pivot index]) -- 
        int temp = arr[correct_pivot_index] ;
        arr[correct_pivot_index] = arr[s] ;
        arr[s] = temp ;
        
    
        //taking two pointers 'i' & 'j' 
        int i = s ;
        int j = e ;

        //start of while loop 
        while (i < correct_pivot_index && j > correct_pivot_index)
        {
            while(arr[i] <= pivot)
            {
                i++ ;
            }

            while(arr[j] > pivot)
            {
                j-- ;
            }

            while (i < correct_pivot_index && j > correct_pivot_index)
            {
                //do swapping 
                int temp_variable = arr[i] ;
                arr[i] = arr[j] ;
                arr[j] = temp_variable ;
            }
        }//end of while loop

       return correct_pivot_index ;
    
    }//end of the function

    //defining the function 
    static void sort_array (int[] arr ,int n , int s , int e)
    {
        //base case 
        if(s >= e)
        {
            return ;
        }
        
        //to get pivot index
        int p = partition(arr , n , s , e)  ;

        //recursive calls --- to sort the array
        sort_array(arr, n , s , p-1);
        sort_array(arr, n, p+1, e);
    }
    public static void main(String[] args) 
    {
         //declaring the array --- to sort the array
         int[] arr ={5, 1, 4, 2, 8} ;

         //storing the size of the array
         int n = arr.length ;
 
         //printing initial array --- before sorting
         System.out.println("The array before sorting is : ") ;
         for(int i = 0 ; i < n ; i++)
         {
             System.out.print(arr[i]+ " ") ;
         }
 
         //calling the function to sort the array
         sort_array (arr, n , 0 , n - 1) ;
 

         //printing the resultant array\
         System.out.println() ;
         System.out.println("The resultant array is : ") ;
         for(int i = 0 ; i < n ; i++)
         {
             System.out.print(arr[i]+ " ");
         }
         
        
    }//end of main class
    
}//end of the program
