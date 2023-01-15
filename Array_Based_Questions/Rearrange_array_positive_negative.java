package Array_Based_Questions;

public class Rearrange_array_positive_negative 
{
 
    /**
     * @param arr
     * @param n
     */
    static void rearrange_array (int[] arr , int n)
    {

        for(int i = 0 ; i < n ; i=i+2)
        {
            int correct_position = i ;

            int wrong_position = 0 ;

            
            //if first number is negative ---- > search for positive number for the next place
            if(arr[correct_position] < 0)
            {
                //check if the next position has +ve element
                if(arr[correct_position + 1] > 0)
                {
                    //do nothing and increase i by 2
                    continue ;
                }

                else
                {
                    //mark the correct position as wrong_position : if next element is -ve --- > search for +ve number
                    wrong_position = correct_position + 1 ;

                    //searching for +ve number from i+2 ;
                    for(int j = i+2 ; j < n ; j++)
                    {
                        //if you got a positive number
                        if(arr[j] > 0)
                        {
                            //mark the correct_position to that element
                            correct_position = j ;

                            //swap the wrong_position with correct position
                            int temp = arr[correct_position] ;
                            arr[correct_position] = arr[wrong_position] ;
                            arr[wrong_position] = temp ;

                            break ;
                        }
                    
                    }
                }//end of else
            
            }//end of if

            else 
            {
                if(arr[correct_position + 1] < 0)
                {
                    //do nothing and increase i by 2
                    continue ;
                }

                else 
                {
                    //mark the next element is wrong_position
                    wrong_position = correct_position + 1 ;

                    //search for negative element 
                    for(int j = i + 2 ; j < n ; j++)
                    {
                        if(arr[j] < 0)
                        {
                            //mark the jth element as correct position
                            correct_position = j ;

                            //swap the correct_position with wrong position
                            int temp_val = arr[correct_position] ;
                            arr[correct_position] = arr[wrong_position];
                            arr[wrong_position] = temp_val ;

                            break ;

                        }
                    }

                
                }
            
            }

        }

        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+ " ") ;
        }
        

    }
    public static void main(String[] args)
    {
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8} ;
        int n = arr.length ;

        //function call
        rearrange_array (arr,n) ;

     
        
    }//end of the main class
    
}//end of the program
