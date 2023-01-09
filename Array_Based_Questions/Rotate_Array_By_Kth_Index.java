package Array_Based_Questions;
public class Rotate_Array_By_Kth_Index
{
    //defining  the function -- to rotate the array
    static void rotate_array (int[] arr , int n , int k)
    {
        //taking the temp array to avoid loss of original data
        int[] temp = new int [n] ;

        //for loop to store the element in rotated form---- temp array
        for(int i = 0 ; i < n ; i++)
        {
            temp[(i+k)%n] = arr[i] ;
        }

        //copying the values of temp array into original array
        for(int i = 0 ; i < temp.length ; i++)
        {
            arr[i] = temp[i] ;
        }
    
    }//End of function
    public static void main(String[] args)
    {
        //declaring the array and storing the array size in the variable 'n'
        int [] arr = {1,3,6,8,9} ;
        int n = arr.length ;

        //printing the initial array
        System.out.println("The initial array before rotation is : ") ;
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
        
        //declaring 'k' ---- to rotate the array by kth index
        int k = 2 ;

        //calling the function to rotate the array
        rotate_array(arr,n,k) ;

        //printing the resultant array after rotation
        System.out.println("The array after rotation is : ");

        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+" ") ;
        }
    
    }//End of main class
    
}//End of the program
