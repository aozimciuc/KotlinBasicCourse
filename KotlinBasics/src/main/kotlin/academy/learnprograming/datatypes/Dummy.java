package academy.learnprograming.datatypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.String.format;
import static java.lang.System.out;

public class Dummy {

    public String call(Boolean value) {
        return format("Object is called with value: %s", value);
    }

    public void printInts(int[] ints) {
        Arrays.stream(ints).forEach(e -> out.println("Item: " + e));
    }
}
