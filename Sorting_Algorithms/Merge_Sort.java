package Sorting_Algorithms;

public class Merge_Sort 
{
    static void merge (int[] arr , int n , int s , int e , int mid)
    {
        //taking two pointers to point to the starting index of both the arrays
        int index_1 = 0 ;
        int index_2 = 0 ;
        
        //taking a variable k to point to the starting index of the original array
        int k = s;
        
        //calculating the length of both the arrays
        int length_1 = mid - s + 1 ;
        int length_2 = e - mid ;

        //copying the array elements into two separate arrays
        int[] a1 = new int [length_1] ;
        for(int i = 0 ; i < length_1 ; i++)
        {
            a1[i] = arr[k++] ;
        }

        int[] a2 = new int [length_2] ;
        for(int i = 0 ; i < length_2 ; i++)
        {
            a2[i] = arr[k++] ;
        }

        //initialise k = s ;
        k = s ;
        
        //merging two sorted arrays using an extra space--- O(1)
        while (index_1 < length_1 && index_2 < length_2)
        {
            if(a1[index_1] < a2[index_2])
            {
                arr[k++] = a1[index_1++] ;
            }

            else
            {
                arr[k++] = a2[index_2++] ;
            }
        
        }//end of while loop
        
        //if any of the array's element  remain
        while (index_1 < length_1)
        {
            arr[k++] = a1[index_1++] ;
        }

        while (index_2 < length_2)
        {
            arr[k++] = a2[index_2++] ;
        }
    
    }//end of merge function

    static void sort_array (int[] arr , int n , int s , int e)
    {
        if (s >= e)
        {
            return ;
        }

        //find mid 
        int mid = s + (e - s) / 2 ;

        //main part of the function -- recusive call (use)
        sort_array(arr, n , 0 , mid );
        sort_array(arr, n, mid + 1, e);

        //function call -- to merge array
        merge(arr , n , s , e ,mid) ;

    
    }//end of function -- sort array

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
        sort_array (arr,n , 0 , n - 1) ;

        //printing the resultant array
        System.out.println();
        System.out.println("The resultant array is : ") ;
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        
    
    }//end of main class
    
}//end of the program
