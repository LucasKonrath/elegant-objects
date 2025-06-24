
# Immutability

## In the Context of "Elegant Objects" by Yegor Bugayenko

In "Elegant Objects," Yegor Bugayenko strongly advocates for immutability as a core principle of object-oriented design. Here are the key aspects of immutability as presented in the book:

### Core Principles

1. **Objects Should Be Immutable**
    - Once an object is created, it should never change its state
    - Any operation should return a new object rather than modifying the existing one
    - No setters or methods that modify internal state

2. **Benefits of Immutability**
    - Thread safety without synchronization
    - Simplified reasoning about code
    - Protection against side effects
    - Easier testing and debugging
    - Natural implementation of the "Tell, Don't Ask" principle

3. **Implementation Patterns**
    - Use constructor for complete initialization
    - Make all fields final
    - Never expose mutable state
    - Return copies or new objects when operations are performed

### Code Example

```java
// Mutable (avoid this)
class MutablePoint {
    private int x;
    private int y;
    
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    // getters...
}

// Immutable (preferred)
class Point {
    private final int x;
    private final int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Point moveX(int delta) {
        return new Point(this.x + delta, this.y);
    }
    
    public Point moveY(int delta) {
        return new Point(this.x, this.y + delta);
    }
    // getters...
}
```

### Practical Considerations

When designing immutable objects:
- Encapsulate all fields
- Make defensive copies of mutable inputs
- Don't leak references to internal mutable objects
- Use composition over inheritance
- Apply the "Fail Fast" principle when validating inputs

Bugayenko argues that immutability is not just a technical choice but a philosophical approach to object design that leads to more maintainable, bug-free, and elegant code.
```