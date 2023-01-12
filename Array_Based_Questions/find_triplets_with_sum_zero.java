package Array_Based_Questions;

import java.util.Arrays;

public class find_triplets_with_sum_zero 
{
    //defining the function find_triplets
    static void find_triplets (int[] arr , int n )
    {
        Arrays.sort(arr) ;

        for(int i = 0 ; i < n ; i++)
        {
            int lo = i + 1 ;
            int hi = n - 1 ;
            int x = arr[i] ;

            while (lo < hi)
            {
               if(arr[lo] + arr[hi] + x  == 0)
               {
                  System.out.print(x + " ") ;
                  System.out.print(arr[lo] + " ") ;
                  System.out.print(arr[hi] + " ");
                  System.out.println();

                  lo++ ;
                  hi-- ;
               
             }

               else if(arr[lo] + arr[hi] + x < 0)
               {
                  lo++ ;
               }

               else
               {
                 hi-- ;
               }
            
            }
        }

    }
    public static void main(String[] args) 
    {
        //declaring the array
        int[] arr = {0, -1, 2, -3, 1} ;

        //storing the length of the array in the variable 'n'
        int n = arr.length ;

        //calling the function
        find_triplets(arr,n) ;
        
    }
    
}
