public class Container<T> {
    private T value;

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create a Container of String type
        Container<String> stringContainer = new Container<>("Hello");
        System.out.println(stringContainer.getValue()); // Output: Hello

        // Create a Container of Integer type
        Container<Integer> intContainer = new Container<>(123);
        System.out.println(intContainer.getValue()); // Output: 123
    }
} 
