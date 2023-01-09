package Array_Based_Questions;

public class Union_Two_Sorted_Arrays 
{
    //defining the function
    static void union_two_sorted_arrays (int[] a1 , int a , int[] a2 , int b)
    {
        //declaring two pointers 
        int point_1 = 0 ;
        int point_2 = 0 ;
        
        //start of while loop----------- to compare element 1 with element 2
        System.out.println("The union of two sorted array is : ") ;
        while (point_1 < a && point_2 < b)
        {
           if(a1[point_1] < a2[point_2])
           {
             System.out.print(a1[point_1] +" "); 
             point_1++ ;
           }

           else if (a1[point_1] > a2[point_2])
           {
            System.out.print(a2[point_2]+ " ");
            point_2++ ;
           }

           else 
           {
             System.out.print(a2[point_2] + " ");
             point_1++ ;
             point_2++ ;
           }
        }

        while (point_1 < a)
        {
            System.out.print(a1[point_1] +" "); 
            point_1++ ;
        }

        while (point_2 < b)
        {
            System.out.print(a2[point_2]+ " ");
            point_2++ ;
        }

    }//end of the function
    public static void main(String[] args) 
    {
        //declaring two sorted arrays
        int[] a1 = {1,2,3,5,7} ;
        int[] a2 = {2,4,6} ;

        //calculating the size of the arrays 
        int a = a1.length ;
        int b = a2.length ;

        //calling the function
        union_two_sorted_arrays(a1 , a , a2 , b) ;

    }//end of main class 
    
}//end of the program
