package Sorting_Algorithms;

public class Bubble_Sort
{
    static void sort_array (int[] arr , int n)
    {
        //base_case 
        if(n == 0)
        {
            return ;
        }

        //taking extra variable to perform swapping
        int temp = 0 ;

        //main part of the function --- to sort the array
        for(int i = 0 ; i < n - 1 ; i++)
        {
            for(int j = 0 ;j < n - i - 1 ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    //swapping -- swap(arr[j] , arr[j+1])
                    temp = arr[j+1] ; 
                    arr[j+1] = arr[j] ;
                    arr[j] = temp ;
                }
            
            }//end of for loop -- jth loop
        
        }//end of for loop --- i th loop
    }
    public static void main(String[] args) 
    {
        //declaring the array ---- unsorted array
        int[] arr = {1,7,5,8,2,9} ;

        //storing the size of the array in variable 'n'
        int n =arr.length ;

        //printing initial array
        System.out.println("Printing the initial array ! ") ;
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+ " ") ;
        }

        //calling the function -- to sort the array
        sort_array(arr,n) ;

        //printing the resultant array --- after sorting
        System.out.println();
        System.out.println ("The array after sorting is : ") ;
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+" ") ;
        }
        
    }//end of main class
    
}//end of the program
