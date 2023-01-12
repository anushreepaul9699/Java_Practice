package Array_Based_Questions;

public class find_common_three_sorted_Arrays 
{
    //defining function --- to find the common elements
    static void find_common(int[] a1 , int n1 , int[] a2 , int n2 , int[] a3 , int n3)
    {
        //base case
        if(n1 == 0 && n2 == 0 && n3 == 0)
        {
            return ;
        }

        //main part of the function 
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;

        while(i < n1 && j <n2 && k < n3)
        {
            if(a1[i] == a2[j] && a2[j] == a3[k] && a1[i] == a3[k])
            {
                System.out.print (a1[i] + " ") ;
                i++ ;
                j++ ;
                k++ ;

            }

            //x < y

            else if (a1[i] < a2[j])
            {
                 i++ ;
 
            }

            // y < z

            else if(a2[j] < a3[k])
            {
               j++ ;
            }

        else
            {
                k++ ;
            }

        }
    }
    public static void main(String[] args) 
    {
        //declaring 3 arrays with their sizes -----
        int[] a1 = {1,5,10,20,40,80} ;
        int n1 = a1.length ;

        int[] a2 = {6,7,20,80,100} ;
        int n2 = a2.length ;

        int[] a3 = {3,4,15,20,30,70,80,120} ;
        int n3 = a3.length ;

        //calling function to find the common elements
        find_common (a1,n1,a2,n2,a3,n3) ;
        
    }//end of the main class
    
}//end of the function
