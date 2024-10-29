class MyStack 
{
    //basic element to store data
    int data[];
    int tos=-1;
    int size;
    //constructor
    MyStack(int size)
    {
        this.size=size;
        data =new int [size];  //giving size size to the data stack

    }
    void push (int ele)
    {
        if (tos <size )
        {
            data[++tos]=ele;
        }
        else 
        {
            System.out.println("tos:"+tos+"Overflow");
        }
    }
}

class MyStackie
{
 MyStack m1 = new MyStack(0)   
}
