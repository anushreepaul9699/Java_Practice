package Array_Based_Questions;

public class Move_Negative 
{
    //defining the function
    static void move_negative(int[] arr , int n)
    {
        //base case 
        if(n == 0)
        {
            return ;
        }
        
        //taking a temp variable for swapping purpose
        int temp = 0; 

        int j = 0 ;

        //main part of the function--- to move negative integers to one side
         for (int i = 0 ; i < n ;i++)
         {
            if(arr[i] < 0)
            {
               if(i != j)
               {
                  temp = arr[i] ;
                  arr[i] = arr[j] ;
                  arr[j] = temp ;
               }

               j++ ;

            }
         }//end of for loop
    
   }//end of function
    public static void main(String[] args) 
    {
        //declaring the array and calculating the size of the array
        int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9} ;
        int n = arr.length ;

        //printing the initial array 
        System.out.println("The initial array is  :") ;
        for(int i = 0 ; i < n ; i++)
        {
            System.out.println(arr[i]+ " ") ;
        }

        //calling the function
        move_negative(arr,n) ;

        //printing the resultant array
        System.out.println("The final array is : ") ;
        for(int i = 0 ; i < n ; i++)
        {
            System.out.println(arr[i]+" ") ;
        }
        
    }//End of main class
    
}//End of the program
