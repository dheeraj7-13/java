class MyStack {
    // Basic element to store data
    int data[];
    int tos = -1; // Top of the stack
    int size;

    // Constructor
    MyStack(int size) {
        this.size = size; // Giving size to the data stack
        data = new int[size];
    }

    // Method to push an element onto the stack
    void push(int ele) {
        if (tos < size ) 
        { // Adjusted condition for overflow
            data[tos]=ele;
            System.out.println("Overflow: cannot push " + ele);
        } 
        else
        {
            data[++tos] = ele; // Increment tos and push the element
        }
    }

    // Method to pop an element from the stack
    int pop() {
        if (tos < 0) {
            System.out.println("Underflow: stack is empty");
            return -1; // Indicate an error
        } else {
            return data[tos--]; // Return the top element and decrement tos
        }
    }
}

class MyStackie {
    MyStack m1;

    // Constructor to initialize the stack and push an element
    MyStackie() {
        m1 = new MyStack(3);
        m1.push(20); // Pushing an element
    }

    // Method to demonstrate stack functionality
    void demonstrate() {
        m1.push(30);
        m1.push(40);
        m1.push(50); // This should trigger overflow
        System.out.println("Popped: " + m1.pop());
        System.out.println("Popped: " + m1.pop());
    }

    public static void main(String[] args) {
        MyStackie stackie = new MyStackie();
        stackie.demonstrate(); // Demonstrate stack operations
    }
}
