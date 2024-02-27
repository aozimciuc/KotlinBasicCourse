package academy.learnprograming.accessmodifiers.javacode;

public class JavaEmployee {
    private final String firstName;
    private final boolean fullTime;

    public JavaEmployee(String firstName) {
        this.firstName = firstName;
        this.fullTime = true;
    }

    public JavaEmployee(String firstName, boolean fullTime) {
        this.firstName = firstName;
        this.fullTime = fullTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean isFullTime() {
        return fullTime;
    }
}
