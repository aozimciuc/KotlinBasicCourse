package academy.learnprograming.javacode;

import static java.lang.System.*;

public class SomeClass {

    private static int privateVar = 123;

    public static void main(String[] args) {
        new SomeOtherClass().someOtherMethod();
    }

    public static void assessPrivateVar() {
        out.println("Accessing privateVar " + privateVar);
    }
}
