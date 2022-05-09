// main/TestRuntime.java
package main;

import java.lang.invoke.MethodType;

public class TestRuntime {

    public static void main(String... args) {
        System.out.println(
            MethodType.fromMethodDescriptorString(
                "()Lfoo/Foo$Bar;",
                TestRuntime.class.getClassLoader()
            )
        );
    }

}
