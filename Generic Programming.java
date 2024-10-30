import java.util.*;
class Box <T>
{
     T item ;
     
    void setItem(T item )  
    {
        this.item = item;
    }

    T getItem() 
    {
        return item;
    }
    public static void main(String[] args) 
    {
        // Box<Integer> integerBox = new Box<>();           //normal object 
        var integerBox = new Box<Integer>();                //mentos object

        integerBox.setItem(10);
        System.out.println("Integer Value: " + integerBox.getItem());

        // Box<String> stringBox = new Box<>();             //normal object 
        var stringBox = new Box<String>();                  //mentos object   

        stringBox.setItem("wsupp homies!!");
        System.out.println(stringBox.getItem());        
        
    }
}