
interface Calculator 
{ // to calculate 4 operation
 
    int add(int a,int b);
    int sub(int a,int b);
    int div(int a,int b);
    int mul(int a,int b);
} 


public class Calculatori implements Calculator 
{
            public int add(int a,int b) 
            {
                return a + b ;
            }

            public int sub(int a,int b) 
            {
                return a - b ;
            }
            public int mul(int a,int b) 
            {
                return a * b ;
            }
            public int div(int a,int b) 
            {
                return a / b ;
            }




}
class CalculatorDemo 
{
    public static void main(String[] args) 
    {
        Calculatori a1 = new Calculatori();
        System.out.println("Addition is        "+a1.add(10,20));
        System.out.println("Subtraction  is   "+a1.sub(10,20));
        System.out.println("Multiplication is  "+a1.mul(10,20));
        System.out.println("Division is        "+a1.div(10,20));
    }
}
