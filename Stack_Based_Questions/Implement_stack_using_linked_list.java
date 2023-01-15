package Stack_Based_Questions;
public class Implement_stack_using_linked_list
{
    static class Node
    {
        int data ;
        Node next ;

        //contructor
        public Node(int data)
        {
            this.data = data ;
            this.next = null ;
        }
    }

    static class Stack
    { 
        //global head declaration -- >
        public static Node head ;
        
        //check the list is empty or not : if head == null } return true ; else return false --- >
        boolean isEmpty()
        {
            return head==null ;
        }

        //push operation of stack using linked-list --- >
        public void push (int data)
        {
            //creating new node -- >
            Node node = new Node(data) ;
           
        //checking the list is empty or not -- >
           if(isEmpty())
           {
              head = node ;
              return ; 
             
           }

           else
           {
               node.next = head ;
               head = node ;
           }
        }

        public  int pop ()
        {
            if(isEmpty())
            {
                return -1 ;
            }
            int top = head.data ;
            head = head.next ;
            return top ;
        
        }

        public  int peek () 
        {
            if(isEmpty())
            {
                return -1 ;
            }

            int top = head.data ;
            return top ;
        }
    }

   
    //main class --- >
    public static void main(String[] args) 
    {
        Stack s = new Stack() ;
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty())
        {
            System.out.print(s.peek()+" ");
            s.pop() ;
        }

        
    }
    
}
