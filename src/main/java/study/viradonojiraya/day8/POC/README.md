# Exceptions
## Checked Exceptions
<strong>Checked</strong> exceptions are meant to be detected by the compiler at compile time (even though it's thrown at execution time). These exceptions need to be handled by the developer and, normally, they occur due to user's fault.

When we're declaring a method we need to inform to the compiler what can go wrong by declaring the exception class at the header of the method. For example, we can declare that **saveFile** could throw an **FileNotFoundException**

Examples:

`public FileInputStream(String name) throws FileNotFoundException`

`public Image loadImage(String s) throws IOException`

`public Image loadImage(String s) throws
FileNotFoundException, EOFException`

In this way, the compiler can throw an object of the FileNotFoundException class.
<br>
It's important to note that, if a class B extends a class A which throws an exception, then B must throw a more specific exception than the one thrown by A. As matter of fact, B don't even need to throw an exception and, furthermore, if class A don't throw any exception, neither class B must do.

Assuming that we have an exception E<sub>1</sub> and its subclass E<sub>2</sub>, a class A could declare that it throws an exception E<sub>1</sub> even though it throws E<sub>2</sub>, since E<sub>2</sub> extends E<sub>1</sub>. In a more concrete example, a class `public Image loadImage(String s) throws IOException` could throw a IOException.

### How to throw an exception
`throw new EOFException();`

As simple as that. Here we can see a concrete example:

```
String readData(Scanner in) throws EOFException {
    . . .
    while (. . .) {
        if (!in.hasNext()) { // EOF encountered
            if (n < len)
                throw new EOFException();
        }
        . . .
    }
    return s;
}
```

When the exception is thrown, the return is not called and the code stop to execute right away.

### Creating our own exceptions
We just need to extend the Exception class or one of its subclasses. Check this example:

```
class FileFormatException extends IOException {
    public FileFormatException() {}
    public FileFormatException(String gripe) {
        super(gripe);
    }
}
```
Now, applying it:

```
String readData(Scanner in) throws FileFormatException {
. . .
    while (. . .) {
        if (ch == -1) { // EOF encountered
            if (n < len)
            throw new FileFormatException();
        }
. . .
    }
    return s;
}
```

## Try / catch / finally
When we know how to deal with the exception, we must handle that which some logic. Otherwise, is a good practice to just throw the Exception and let the exception handler deal with that.

```
public void read(String filename) {
    try {
        var in = new FileInputStream(filename);
        int b;
        while ((b = in.read()) != -1) {
            process input
        }
    } catch (IOException exception) {
        exception.printStackTrace();
    }
}
```

We're handling the exception in a not so good way, as it just print the exception to the user. In this case, maybe it could be more useful to just declare `throws IOException` in the method's header in order to tell the compiler what could go wrong.

### Catching multiple exceptions

Catching multiple exceptions can be useful when dealing with different types of exceptions.

```
try {
    code that might throw exceptions
} catch (FileNotFoundException e) {
    emergency action for missing files
} catch (UnknownHostException e) {
    emergency action for unknown hosts
} catch (IOException e) {
    emergency action for all other I/O problems
}
```

Or in a more compact way as of Java 7:

```
try {
    code that might throw exceptions
} catch (FileNotFoundException | UnknownHostException e) {
    emergency action for missing files and unknown hosts
} catch (IOException e) {
    emergency action for all other I/O problems
}
```

### Rethrowing and chaining exceptions

We can also chain exception when we want to change the exception type

```
try {
    access the database
} catch (SQLException e) {
    throw new ServletException("database error: " +
    e.getMessage());
}
```

Here we're catching a SQLException, but we want to throw a ServletException with, of course, some data from the original exception.

Even better, we could do this:

```
try {
    access the database
} catch (SQLException original) {
    var e = new ServletException("database error");
    e.initCause(original);
    throw e;
}
```

When the exception is caught, the original exception can be retrieved:

``Throwable original = caughtException.getCause(); ``


This wrapping technique is highly recommended. It allows you to throw
high-level exceptions in subsystems without losing the details of the original
failure.

### Finally
It's used when we want to handle some data from try clause even when an exception is thrown.

```
var in = new FileInputStream(. . .);
try {
    // 1
    code that might throw exceptions
    // 2
} catch (IOException e){
    // 3
    show error message
    // 4
} finally {
    // 5
    in.close();
}
// 6
```

If not errors occur, the code pass through all the points. If the code throws an exception that is caught by the catch clause, then the code pass through points 1, 3, 4 and 5. When catch clause doesn't catch the exception, the code passes through points 1 and 5 only.