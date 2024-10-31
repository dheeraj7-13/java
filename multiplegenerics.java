class Box<T, A, B> {
    private T item;
    private A attribute1;
    private B attribute2;

    public Box(T item, A attribute1, B attribute2) {
        this.item = item;
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
    }

    public T getItem() {
        return item;
    }

    public A getAttribute1() {
        return attribute1;
    }

    public B getAttribute2() {
        return attribute2;
    }
}

public class Main {
    public static void main(String[] args) {
        // Example usage:
        Box<String, Integer, Double> box = new Box<>("Hello", 10, 20.5);
        System.out.println(box.getItem());       // Output: Hello
        System.out.println(box.getAttribute1());  // Output: 10
        System.out.println(box.getAttribute2());  // Output: 20.5
    }
}
