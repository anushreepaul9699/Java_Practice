package Array_Based_Questions;

public class find_intersection 
{
    //defining the function -- to find the intersection (common elements)
    /**
     * @param arr1
     * @param a
     * @param arr2
     * @param b
     */
    static void find_intersection_element(int[] arr1 , int a , int[] arr2 , int b)
    {
        //declaring two pointers
        int pointer_1 = 0 ;
        int pointer_2 = 0 ;

        //main part --- to find the intersection
        System.out.println("The intersection of the two array is : ") ;
        while (pointer_1 < a && pointer_2 < b)
        {
            if(arr1[pointer_1] == arr2[pointer_2])
            {
                System.out.print(arr1[pointer_1]+" ");
                pointer_1++ ;
                pointer_2++ ;
            }

            else if (arr1[pointer_1] < arr2[pointer_2])
             {

                pointer_1++ ;
            }

             else
             {
                pointer_2++ ;
             }

          
        }//end of while loop    

    }//end of function
    public static void main(String[] args) 
    {
        //declaring two sorted arrays ---- (arr1 and arr2)
        int[] arr1 = {1,5,7,9} ;
        int a = arr1.length ;

        int[] arr2 = {2,3,4,6 , 9} ;
        int b = arr2.length ;

        //calling the function
        find_intersection_element(arr1 , a, arr2 , b) ;


    }//end of main class
    
}//end of the program
