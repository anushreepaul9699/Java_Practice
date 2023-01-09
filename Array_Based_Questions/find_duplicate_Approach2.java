package Array_Based_Questions;

public class find_duplicate_Approach2
{
    //defining the function ------ to find the duplicate 
    static int find_duplicate (int[] arr , int n)
    {
        //creating a frequency array and initialise it with 0 ---- to store the count of elements
        int[] frequency_Array = new int [n + 1];

        //taking a variable ans 
        int ans = -1; 

        //initialisation of frequency_array with 0 
        for(int i = 0 ; i < frequency_Array.length ; i++)
        {
            frequency_Array[i] = 0 ;
        }

        //storing the count of elements of original array in frequency array
        for(int i = 0 ; i < n ; i++)
        {
            if(frequency_Array[arr[i]] == 0)
            {
                frequency_Array[arr[i]] += 1 ;
            }

            else
            {
                ans = arr[i] ;
                break ;
            }
            
        }

        return ans ;

    }
    public static void main(String[] args) 
    {
        //declaring the array and calculating the size of the array
        int[] arr = {1,3,4,2,2} ;
        int n = arr.length ;

        //calling the function
        int answer = find_duplicate(arr,n) ;

        //printing the result
        if(answer == -1)
        {
            System.out.println("No such element was found !");
        }

        else
        {
            System.out.println("The duplicate element is : "+answer) ;
        }
        
    }//End of main class
    
}//end of the program