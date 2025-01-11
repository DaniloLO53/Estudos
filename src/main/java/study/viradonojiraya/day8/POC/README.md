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

`String readData(Scanner in) throws EOFException {
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
`