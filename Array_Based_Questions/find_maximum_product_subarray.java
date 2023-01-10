package Array_Based_Questions;

public class find_maximum_product_subarray 
{
    static long maxProduct(int[] arr, int n)
    {
        // code here
        
        long max_product = arr[0] ;
        long current_product = 1 ;
        
        for(int i = 0 ; i < n ; i++)
        {
            current_product*= arr[i] ;
            
            if(current_product  > max_product)
            {
                max_product = current_product ;
            }
            
            if(current_product == 0)
            {
                current_product = 1 ;
            }
        }
        
        current_product = 1 ;
        
        for(int i = n - 1 ; i>= 0 ; i--)
        {
            current_product *= arr[i] ;
            
            if(current_product > max_product)
            {
                max_product = current_product ;
            }
            
            if(current_product == 0)
            {
                current_product = 1 ;
            }
        }
        
        return max_product ;
    }
    public static void main(String[] args) 
    {
        int[] arr = {6, -3, -10, 0, 2} ;
        int n = arr.length ;

        long max_pro = maxProduct(arr,n) ;

        System.out.println("The maximum product of the subarray is : "+max_pro) ;

    }//end of main class
    
}//end of the program
