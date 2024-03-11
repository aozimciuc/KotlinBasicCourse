package academy.learnprograming.javacode;

import kotlin.Suppress;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Suppress(names = "UNUSED_PARAMETER")
public class CarJava {

    public static final String TOYOTA = "Toyota";

    private String model;
    private String color;

    private Integer year;

    private Object anyObject;

    public CarJava(String model, String color, Integer year) {
        this.model = model;
        this.color = color;
        this.year = year;
        // Call Kotlin function from Java, call @file:JvmName("CarKotlinFile") in CarKotlin.kt
        CarKotlinFile.topLevelFunction();
        CarKotlin toyota = new CarKotlin("Toyota", 2015, "Red");
        System.out.println(toyota.getModel());
        System.out.println(toyota.getYear());
        System.out.println(toyota.color);
        // extension function doesn't work in Java
        CarKotlinFile.printHello("Toyota");
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public @Nullable Integer getYear() {
        return year;
    }

    public void setModel(@NotNull String model) {
        this.model = model;
    }

    public void setColor(@Nullable String color) {
        this.color = color;
    }

    public void setYear(@NotNull Integer year) {
        this.year = year;
    }

    public void variableMethod(String... strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public void intArrayMethod(int[] ints) {
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public Object getAnyObject() {
        return anyObject;
    }

    public void setAnyObject(Object anyObject) {
        this.anyObject = anyObject;
    }

    public static Integer getStaticValue() {
        return 10;
    }

    public void runThread(Runnable runnable) {
        new Thread(runnable).start();
    }

    public void demoMethod() {
        System.out.println("Demo method");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing from the Runnable " + model);
            }
        }).start();
    }
}
