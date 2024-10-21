Java

 class Animal {
    static int a = 10; // Class variable

    public Animal() {
        a = 20; // Instance variable
    }

    public void printA() {
        System.out.println("a in Animal: " + a);
    }
}

class Cat extends Animal {
    public Cat() {
        a = 30; // Overriding instance variable
    }

    public void printA() {
        System.out.println("a in Cat: " + a);
        System.out.println("a in Animal (super): " + Animal.a);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("a in Animal class: " + Animal.a);

        Animal animal = new Animal();
        animal.printA();

        Cat cat = new Cat();
        cat.printA();
    }
} 
/*
Use code [with caution.](https://www.notion.so/faq#coding)

**Explanation:**

- ** Animal  class:**
    -  a = 10 : Defines a class variable named  a  with an initial value of 10. This variable is shared by all instances of the  Animal  class.
    -  Animal() : The constructor initializes the instance variable  a  with a value of 20. This variable is specific to each  Animal  object and overrides the class variable.
    -  printA() : This method prints the value of the instance variable  a  for the current  Animal  object.
- ** Cat  class:**
    - Inherits from the  Animal  class.
    -  Cat() : The constructor overrides the instance variable  a  with a value of 30.
    -  printA() : Prints the value of the instance variable  a  for the current  Cat  object and also accesses the class variable  a  using  Animal.a .

**Output:**

 a in Animal class: 10
a in Animal: 20
a in Cat: 30
a in Animal (super): 10 

This code demonstrates the interaction between class variables, instance variables, inheritance, and accessing class variables from subclasses in Java.*/
