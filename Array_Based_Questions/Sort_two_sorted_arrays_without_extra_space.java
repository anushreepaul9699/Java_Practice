package Array_Based_Questions;

import java.util.Arrays;

public class Sort_two_sorted_arrays_without_extra_space
{
    //function definition
    static void sort_merge(int[] arr1 , int size_1 , int[] arr2 , int size_2)
    {
        int index_1 = 0;
        int index_2 = 0 ;
        int temp = 0 ;

        while (index_2 < size_2  && index_1 < size_1)
        {
            if(arr1[index_1] > arr2[index_2])
            {
                //swapping (arr1[index1] , arr2[index2])
                temp = arr1[index_1] ;
                arr1[index_1] = arr2[index_2] ;
                arr2[index_2] = temp ;
                
                Arrays.sort(arr2);
                index_1++ ;
            }

            else
            { 
                index_1++ ;

            }
        }

    }
    public static void main(String[] args) 
    {
        int[] arr1 = {1,4,7,8,10} ;
        int size_1 = arr1.length ;

        int[] arr2 = {2,3,9} ;
        int size_2 = arr2.length ;

        //function call kar rhe hai
        sort_merge(arr1 , size_1 , arr2 , size_2) ;

        //printing the resultant array 
        System.out.println("The first array is : ");
        for(int i = 0 ; i < size_1 ; i++)
        {
            System.out.print(arr1[i]+ " ");
        }

        //printing the resultant array
        System.out.println() ;
        System.out.println("The second array is : ") ;
        for(int i = 0 ; i < size_2 ; i++)
        {
            System.out.print(arr2[i]+" ");
        }
        
    }//End of main class
    
}//End of the program
