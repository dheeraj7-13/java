class MyStack {
    int data[];
    int tos = -1;
    int size;

    // Constructor
    MyStack(int size) {
        this.size = size;
        data = new int[size];
    }

    void push(int ele) {
        if (tos < size - 1) { // Adjusted index check
            data[++tos] = ele;
            System.out.println("Pushed: " + ele);
        } else {
            System.out.println("Stack Overflow at tos: " + tos);
        }
    }

    int pop() {
        if (tos >= 0) {
            return data[tos--];
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    int peek() {
        if (tos >= 0) {
            return data[tos];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
}

class MyStackie {
    public static void main(String[] args) {
        MyStack m1 = new MyStack(4); // Stack of size 4

        // Adding 4 elements
        m1.push(10);
        m1.push(20);
        m1.push(30);
        m1.push(40);
        // Attempt to add a fifth element to trigger overflow
        m1.push(50); // Should show overflow
    }
}
