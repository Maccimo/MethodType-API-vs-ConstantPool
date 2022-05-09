// foo/Foo.java
package foo;

public class Foo {
    public static Bar bar() {
        return new Bar();
    }

    static class Bar {}
}
