package Stack_Based_Questions;
import java.util.*;

import javax.lang.model.element.Element;
public class Circular_Queue 
{
    int size ;
    int[] arr ;
    int front ;
    int rear ;

    Circular_Queue()
    { 
        size = 5 ;
        arr = new int [size] ;
        front = -1 ;
        rear = -1 ;
    }

    //check if the queue is full or not
    boolean isFull()
    {
       if ( (front == 0 && rear == size - 1) || front == rear + 1 )
       {
          return true ;
       }

       return false ;
    }
    
    //check queue is empty or not 
    boolean isEmpty()
    {
        return front==-1 ;
    }

    //push operation
    void enqueue(int data)
    {
        if(isFull())
        {
            System.out.println("Queue is full !") ;
        }

        else
        {
            // condition for first element
            if(front == -1)
            {
                front = rear = 0 ;
                arr[rear] = data ;
            }

            //else if : condition = if rear is at the end of the size and front!= 0
            else if (rear == size - 1 && front != 0)
            {
                rear = 0 ;
                arr[rear] = data ;
            }

            //else : condition : normal push 
            else
            {
                rear++ ;
                arr[rear] = data ;
            }
            
        }
    }

    //pop operation
    int dequeue ()
    {
         //check queue is empty or not
         if(isEmpty())
         {
             return -1 ;
         }

         else
         {
            int element = arr[front] ;

            //condition 1 : For SIngle element
            if(front == rear)
            {
                front = rear = -1 ;
            }

            else
            {
                front++ ;
            }

            return element ;
         }      
    }

    //display operation 
    void display()
    {
        if(isFull())
        {
            System.out.println("Queue is Full !") ;
            return ;
        }

        else
        {
            
            System.out.println("Items :  ");
            

            for(int i = front ; i != rear ; i = (i+1) % size)
            {
                System.out.println(arr[i] + " ") ;
        
            }
        }
    }
   public static void main(String[] args) 
   {
      Circular_Queue q = new Circular_Queue() ;

      q.enqueue(1);
      q.enqueue(2);
      q.enqueue(3);
      q.enqueue(4);

      q.display();

      q.dequeue() ;
      q.display();
    
   }
}
