package Array_Based_Questions;

public class finding_missing_element 
{
    //defining the function -- to find the missing element
    static int find_missing (int[] arr , int n )
    {
        //taking extra array --- frequency_array : to store the count of elements
        int[] frequency_array = new int [n + 1] ;
        int n1 = frequency_array.length ;

        //taking a variable to store ans 
        int ans = -1; 

        //initialising with 0 --- frequency_Array
        for(int i = 0 ; i < n1 ; i++)
        {
            frequency_array[i] = 0 ;
        }

        //traversing the original array and storing the count of elements in the frequency array
        for(int i = 0 ; i < n ; i++)
        {
           
            frequency_array[arr[i]] += 1 ;
            
        }

        //traversing the frequency array and searching the element's count which is 0 
        for(int i = 0 ; i < n1 ; i++)
        {
            if(frequency_array[i] == 0)
            {
                ans = i ;
            }
        }

        return ans ;
    }
    public static void main(String[] args) 
    {
        //declaring the array and storing the size of the array in the variable 'n'
        int[] arr = {3,1,2,5,3 ,4,7} ;
        int n = arr.length ;

        //calling the function
        int ans = find_missing(arr,n) ;

        //printing the result
        System.out.println("The missing number is : "+ans) ;
        
    }//End of main class
    
}//End of the program
