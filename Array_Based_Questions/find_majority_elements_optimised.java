package Array_Based_Questions;

public class find_majority_elements_optimised 
{
    //function to find the majority element that appears more than n/2 times --- >
    static int find_majority (int[] arr , int n)
    {
        int count = 0 ; // to count the occurrence of the element

        int element = 0 ; // to store the element which have maximum count

        //for loop -- to traverse the array
        for(int i = 0 ; i < n ; i++)
        {
            if(count == 0)
            {
                element = arr[i] ;
            }

            if(element == arr[i])
            {
                count += 1 ;
            }

            else
            {
                count -= 1 ;
            }
        }

        return element ;
    }
    public static void main(String[] args) 
    {
        //Moore's voting Algorithm
        /** count = 0 ; element = 0 ; for(i=0 to n -1) --- > if(count == 0) : element = arr[i] 
         * if(element == arr[i]) : count += 1 else : count -= 1 ;
        */

     /**find elements that appears more than n/4 times 
      in the array **/ 

      /** here it was clearly mentioned that : majority element appears >n/2 times : that means the element which is a majority
       * element must be present in the end of the array --- > so with the help of moore's voting algorithm we just count the 
       * occurrence of a element and when another element appears which just cancel out the count by one and when it is 0 then 
       * we count the another element : and the count of element at the end of the array will be the majority elemet 
       */

    //declaring the array
    int[] arr = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5} ;

    //calculating the size of the array
    int n = arr.length ;

    //calling the function
    int answer = find_majority(arr,n) ;

    System.out.println(answer);


    }//end of the main class
    
}//end of the program
