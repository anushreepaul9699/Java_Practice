package Array_Based_Questions;

public class find_majority_elements 
{
    static void find_majority(int[] arr , int n)
    {
        //declaring the frequency_array
        int[] frequency_array = new int [n + 1] ;
        int n1 = frequency_array.length ;

        int ans = n / 4 ;

        //initialising frequency array with 0 
        for(int i = 0 ; i < n1 ; i++)
        {
            frequency_array[i] = 0;
        }

        //storing the count of elements of the original array in frequency_Array
        for(int i = 0 ; i < n ; i++)
        {
            frequency_array[arr[i]] += 1 ;
        }

        //traversing the frequency array -------- (i = 0 to n1 - 1)
        System.out.println("The element that appears more than n/4 times is : ") ;
        for(int i = 0 ; i < n1 ; i++)
        {
                if(frequency_array[i] > ans)
                   System.out.print(i + " ");
        }
    
    }//end of the function
   public static void main(String[] args) 
   {
      //find elements that appears more than n/4 times in the array 

    //declaring the array
    int[] arr = {3,1,2,2,1,2,3,3} ;

    //calculating the size of the array
    int n = arr.length ;

    //calling the function
    find_majority(arr,n) ;
    
   }//end of main classs
    
    
}//end of the program
