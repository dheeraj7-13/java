import java.util.*;
class Quetie
{
     ArrayList<Integer> queue;
     int front ,rear ;
    public  Quetie()
    {
        this.queue = new ArrayList<>();
        this.front = 0;
        this.rear= 0;
    }

    public void enqueue(int data)
    {
        queue.add(10);
        rear++;
        System.out.println("Enqueue" + data);
    }

    public void dequeue() 
    {
        if (queue.isEmpty())
        {
            throw new RuntimeException("there is no element");  
        }
        else
        {
            int removedata = queue.get(front);
            front++;
            System.out.println("The front is : " + removedata);
            
        } 
    }

        


        public  void display() 
        {
            if (queue.isEmpty()) 
            { 
                System.out.println("The queue is : " +queue);
                for(int i = front; i<rear;i++)
                {
                    System.out.println(queue.get(i)+" ");
                }
                System.out.println();
            }
                

        }




    public static void main(String[] args) 
    {
        Quetie q = new Quetie();
            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);
            q.enqueue(40);
            q.enqueue(50);
            q.enqueue(60);


    }
}
