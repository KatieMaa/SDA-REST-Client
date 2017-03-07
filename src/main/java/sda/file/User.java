package sda.file;

/**
 * Created by RENT on 2017-03-07.
 */
public class User {
    private String firstName;
    private String lastName;
    private Integer age;



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {

        return age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age;
    }
}
