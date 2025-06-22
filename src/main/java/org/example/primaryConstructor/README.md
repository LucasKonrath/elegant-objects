## Elegant Objects, and Primary and Secondary Constructors

**Elegant Objects** is a design philosophy in object-oriented programming that emphasizes immutability, encapsulation, and simplicity. The approach encourages creating objects that are easy to understand, maintain, and extend, avoiding procedural code and mutable state.

### Primary and Secondary Constructors

In languages like Java, a **constructor** is a special method used to initialize new objects. There are two main types:

- **Primary Constructor**: The main constructor that initializes all required fields of a class. In Java, this is typically the constructor with the most parameters, ensuring the object is always in a valid state after creation.

- **Secondary Constructor**: Additional constructors that provide alternative ways to create an object, often by supplying default values or delegating to the primary constructor.

#### Example in Java

```java
public class User {
    private final String name;
    private final int age;

    // Primary constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Secondary constructor
    public User(String name) {
        this(name, 18); // Delegates to the primary constructor
    }
}