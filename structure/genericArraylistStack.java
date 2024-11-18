import java.util.*;
class MyStack<T>
{
        ArrayList<T> data;     /*ArrayList<T>    type data */
        int size;
        int tos=-1;

        MyStack(int size)
        {
                this.size=size;
                data=new ArrayList<>();
        }
        //push
        void push (T ele  )  //setter
        {
                tos++;
                if(tos<size)
                {
                        data.add(tos,ele);
                        System.out.println("Pushed!"+ele);
                }
                else
                {
                        System.out.println("Overflow!");
                }
                
        }
        T pop() //getter
        {
                tos--;
                if(tos>=0)       
                {
                        return data.remove(tos);
                }
                else
                {
                        System.out.println("underflow!!");
                        return null;
                }
        }

}


public class GenericStackImpl {

        public static void main(String[] args) 
        {
                MyStack<Integer> s1 = new MyStack<>(3);
                for(int i=1;i<=4;i++)
                {
                        s1.push(i*10);
                }
                for(int i=0;i<=3;i++)
                {
                        System.out.println("popped:"+s1.pop());
                }

        }
}
