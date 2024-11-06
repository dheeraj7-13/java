interface CalculatorLambda 
{ // fucntional interface

   int op(int a,int b);
} 
class CalculatorLambdaImpl
{
   public static void main(String[] args) 
   {
       //instantiate 
       CalculatorLambda add=(a,b)-> a+b;
       CalculatorLambda sub=(a,b)-> a-b;
       CalculatorLambda mul=(a,b)-> a*b;
       CalculatorLambda div=(a,b)-> a/b;
 
       //call the funciton
       System.out.println("Addition: "+add.op(10,20));
       System.out.println("Subtraction: "+sub.op(10,20));
       System.out.println("Multiplication: "+mul.op(10,20));
       System.out.println("Division: "+div.op(10,20));
       
   }
}
