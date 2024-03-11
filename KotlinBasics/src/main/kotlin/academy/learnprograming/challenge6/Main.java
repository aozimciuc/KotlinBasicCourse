package academy.learnprograming.challenge6;

import static academy.learnprograming.challenge6.Challenge.doMath;

public class Main {

    public static void main(String[] args) {
        int[] salaries = new int[10];

        KotlinCodeKt.sayHello("Java");
        EmployeeKotlin employee = new EmployeeKotlin("Jane", "Smith", 2018, salaries);
        employee.startYear = 2001;
        doMath(5, 4);
        employee.takesDefault("arg1");

        EmployeeKotlin1 employee1 = new EmployeeKotlin1("Jane", "Smith", 2018, salaries);
        employee1.setStartYear(2001);
        Challenge1.INSTANCE.doMath(5, 4);
        employee1.takesDefault("arg1", null);
    }
}