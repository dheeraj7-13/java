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
        System.out.println("a in Animal (super): " + super.a); // Accessing superclass's static variable directly
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("a in Animal class: " + Animal.a); // Accessing static variable

        Animal animal = new Animal();
        animal.printA();

        Cat cat = new Cat();
        cat.printA();
    }
}
/*a in Animal class: 10
a in Animal: 20
a in Cat: 30
a in Animal (super): 20
 */
