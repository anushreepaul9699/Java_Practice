package Array_Based_Questions;

public class Square_Root 
{
    //defining the function --- to find the integer part of the square root
    /**
     * @param target
     * @return
     */
    static long get_integer_part (long target)
    {
        //declaring the 's' and 'e' variable
        long  s = 0 ;
        long e = target ;

        //main part of the function ----

        //finding mid 
        long mid = s + (e - s) /2 ;

        //declaring 'ans' variable
        long ans = -1; 

        //start of while loop
        while (s <= e)
        {
            //storing the square in a variable --- here we take long to hold larger values 
            long  square = mid * mid ;

            if(square == target)
            {
                return mid ;
            }

            else if (square < target)
            {
                ans = mid ;
                s = mid + 1 ;
            }

            else 
            { 
                e = mid - 1 ;

            }

            //updating the mid 
            mid = s + ( e - s) /2 ;
        }

        return ans ;
    }
    //defining the function
    static double find_square_root (long target)
    {
        double temp_sol = get_integer_part(target) ;

        double factor = 1 ;

        int precission = 2 ;

        //start of for loop --- that runs until the precission
        for(int i = 0 ; i < precission ; i++)
        {
            factor = factor / 10 ;

            //taking another loop --- to compare : temp_sol * temp_sol < target --- > ans = j : j = j + factor
            for(double j =  temp_sol ; j * j < target ; j = j + factor)
            {
                temp_sol =  j ;
            }
        }

        return temp_sol ;
    }
    public static void main(String[] args) 
    {
        //Declaring the target
        long target = 27 ;

        //calling function
        double answer = find_square_root(target) ;

        //printing the result
        System.out.println("Printing the result ! "+answer) ;


        
    }//end of main class
    
}//end of the program