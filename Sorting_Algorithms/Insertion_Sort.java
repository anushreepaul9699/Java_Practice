package Sorting_Algorithms;

public class Insertion_Sort 
{
    static void sort_array (int[] arr , int n)
    {
        //base case
        if (n == 0)
        {
            return ;
        }

        //main part of the function -- to sort the array
        for(int i = 1 ; i < n ; i++)
        {
            int temp = arr[i] ;
            int j = i - 1 ;

            for(;j>=0 ;j--)
            {
                if(temp < arr[j])
                {
                    arr[j+1] = arr[j] ;
                }

                else
                {
                    break ;
                }
            }

            arr[j+1] = temp ;
        }
    
    }//end of the function
    public static void main(String[] args) 
    {
        //declaring the array --- to sort the array
        int[] arr ={1,7,5,8,2,9} ;

        //storing the size of the array
        int n = arr.length ;

        //printing initial array --- before sorting
        System.out.println("The array before sorting is : ") ;
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+ " ") ;
        }

        //calling the function to sort the array
        sort_array (arr,n) ;

        //printing the resultant array
        System.out.println();
        System.out.println("The resultant array is : ") ;
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        
        
    }//end of main class
    
}//end of the program
