package Stack_Based_Questions;

public class double_ended_queue 
{
    int size ;
    int[] arr ; 
    int front ;
    int rear ; 

    double_ended_queue()
    {
        size = 5 ;
        arr = new int [size] ;
        front = -1 ;
        rear = -1 ;
    }

     boolean isFull()
    {
        if( (front == 0 && rear == size - 1) || front == rear + 1 )

           return true ;
        
       else
           
           return false ;
    }

    boolean isEmpty()
    {
         return front == -1 ;
    }

    void push_front(int data)
    {
        if(isFull())
        {
           System.out.println("Queue is full !");
           return ;
        }

        else
        {
            if(front == -1)
            {
                front = rear = 0 ;
                arr[front] = data ;
            }

            else if (front == 0)
            {
              front = size - 1 ;
              arr[front] = data ;
            }

            else 
            {
                front-- ;
                arr[front] = data ;
            }
        }
    }

    void push_rear (int data)
    {
        if( isFull())
        {
            return ;
        }

        else
        {
            if(front == -1)
            {
                front = rear = 0 ;
                arr[rear] = data ;
            }

            else if (rear == size - 1 && front != 0)
            {
                rear = 0;
                arr[rear] = data ;
            }

            else
            {
                rear++ ;
                arr[rear] = data ;
            }
        }
    }

    int pop_front()
    {
        if(isEmpty())
        {
           return -1 ;
        }

        else
        {
            int element = arr[front] ;
           
            if(front == rear)
            {
                front = rear = -1 ;
            }

            else if (front == size -1 )
            {
                front = 0 ;
            }

            else
            {
                front++ ;
            }

            return element ;
        }
    }

    /**
     * @return
     */

    int pop_rear()
    {
        if(isEmpty())
        {
            return -1 ;
        }

        else
        {
            int element = arr[rear] ;
            if(front == rear)
            {
                front = rear = -1 ;
            }

            else if (rear == 0)
            {
                rear = size - 1;
            }

            else
            {
               rear -- ;
            }

            return element ;
        }

    }

/**
 * 
 */
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
        double_ended_queue q = new double_ended_queue() ;
        q.push_front(1);
        q.push_front(2);
        q.push_rear(3);
       

        q.display() ;
        
    }
    
}
