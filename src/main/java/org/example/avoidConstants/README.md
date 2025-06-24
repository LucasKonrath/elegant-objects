
# Avoiding Constants in Code

In his book "Elegant Objects," Yegor Bugayenko presents a controversial stance on constants in object-oriented programming. He argues that constants violate object-oriented principles and should be avoided.

## The Anti-Constants Argument

Bugayenko suggests that constants represent procedural thinking in an object-oriented context. His main arguments against constants include:

1. **They violate encapsulation**: Constants expose implementation details that should be hidden within objects.
2. **They create global state**: Constants act as global variables, which leads to tight coupling between parts of your system.
3. **They make code less testable**: Code using constants is harder to mock and test in isolation.

## Alternatives to Constants

Instead of constants, Bugayenko recommends using objects that encapsulate the constant values:

- Replace primitive constants with small objects
- Use enums when appropriate
- Create dedicated classes that provide the values when needed

## Example

Instead of:

```java
public static final int MAX_LOGIN_ATTEMPTS = 5;

if (attempts >= MAX_LOGIN_ATTEMPTS) {
    lockAccount();
}
```

Consider:

```java
class LoginAttempts {
    private final int max;
    
    LoginAttempts() {
        this(5); // Default value
    }
    
    LoginAttempts(int max) {
        this.max = max;
    }
    
    boolean exceeded(int attempts) {
        return attempts >= this.max;
    }
}

// Usage
if (new LoginAttempts().exceeded(attempts)) {
    lockAccount();
}
```

This approach provides more flexibility, better encapsulation, and makes the code more maintainable and testable.
```