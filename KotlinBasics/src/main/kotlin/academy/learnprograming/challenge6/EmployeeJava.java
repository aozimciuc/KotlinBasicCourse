package academy.learnprograming.challenge6;


@SuppressWarnings("unused")
public class EmployeeJava {
    private String firstName;
    private String lastName;
    private int startYear;

    private int[] salary;

    public EmployeeJava(String firstName, String lastName, int startYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.startYear = startYear;
        this.salary = new int[12];
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public int[] getSalary() {
        return salary;
    }

    public void setSalary(int[] salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }
}
