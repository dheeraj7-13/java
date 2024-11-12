import java.util.*;
class MyStack<T>
{
        //instance variable to store data
        ArrayList<T> data;
        //represents size of stack
        int size;
        //reprsents the pointer
        int tos=-1;

        MyStack(int size)
        {
                this.size=size;
                data=new ArrayList<>(size);
        }

        //push element on stack
        void push(T ele)
        {
                //increment tos
                tos++;
                if(tos<size)
                {
                        data.add(tos,ele);
                        System.out.println("Pushed!");
                }
                else
                {
                        System.out.println("Overflow!");
                }
        }

        //pop element
        T pop()
        {
                tos--;
                if(tos>=0)
                {
                        return data.remove(tos);
                }
                else
                {
                        System.out.println("Underflow!");
                        return null;
                }
        }

}

class GenericStackImpl
{
        public static void main(String[] args)
        {
                MyStack<Integer> s1=new MyStack<>(3);

                for(int i=1;i<=4;i++)
                {
                        s1.push(i*10);
                }
                for(int i=0;i<=3;i++)
                {
                        System.out.println("Popped: "+s1.pop());
                }
        }
}
