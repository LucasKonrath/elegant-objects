# Elegant Objects and Naming Conventions

## Elegant Objects

Elegant Objects is a book series by Yegor Bugayenko that promotes an object-oriented programming paradigm focused on making code more maintainable, readable, and truly object-oriented. The book advocates for treating objects as living entities rather than just data structures with methods.

## Naming Conventions in Elegant Objects

One of the key principles in Elegant Objects is the proper naming of methods:

### Methods that Manipulate Objects: Use Verbs

Methods that perform actions on objects or change their state should be named using verbs:

```java
// Good examples
user.rename("John");
document.save();
connection.close();
list.sort();

// Instead of
user.setName("John");
document.doSave();
connection.closeConnection();
```

This approach makes code read more naturally, like giving commands to objects.

### Methods that Create Objects: Use Nouns

Methods that construct and return new objects should be named using nouns:

```java
// Good examples
String email = user.email();
File config = settings.configFile();
List<User> admins = users.admins();

// Instead of
String email = user.getEmail();
File config = settings.getConfigFile();
List<User> admins = users.getAdmins();
```

This convention helps distinguish between methods that perform actions and those that simply return information, making the code's intent clearer.

By following these naming conventions, code becomes more expressive and follows the "tell, don't ask" principle, which is central to good object-oriented design.