
# Unit Testing in the Context of Elegant Objects

In Yegor Bugayenko's "Elegant Objects" approach to object-oriented programming, unit testing follows specific principles that align with his object-centric philosophy.

## Key Testing Principles

1. **Test Objects, Not Methods**: Focus on testing object behavior rather than individual methods. An object should be tested as a whole unit.

2. **Immutability Simplifies Testing**: Since elegant objects are immutable, they are easier to test - no side effects or state changes to track.

3. **Mock-Free Testing**: Minimize the use of mocks. Instead, create small, focused objects with clear responsibilities that can be tested in isolation.

4. **Test Against Interfaces**: Test against interfaces rather than implementations to ensure loose coupling.

5. **Test Only Public Behavior**: Only test what's exposed through the public API. Implementation details should remain private.

## Practical Guidelines

- Write tests before implementation (TDD)
- Keep tests simple and focused
- Avoid testing implementation details
- Ensure each test verifies a single aspect of behavior
- Use composition to create testable objects

## Example Structure

```java
class BookTest {
  @Test
  void calculatesCorrectPrice() {
    final Book book = new Book("Title", 10.0);
    final double price = book.priceWithTax(0.2);
    assertEquals(12.0, price);
  }
}
```

This testing approach emphasizes object composition, behavior verification, and design-driven development.
```