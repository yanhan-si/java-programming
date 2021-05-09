package model;

import java.util.regex.Pattern;

public class Customer {
    String firstName;
    String lastName;
    String email;

    private String emailRegEx = "^(.+)@(.+).com$";
    private Pattern pattern = Pattern.compile(emailRegEx);

    public Customer(String firstName, String lastName, String email) {

        if (!pattern.matcher(email).matches()) {
            throw new IllegalArgumentException("Error, invalid email.");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!pattern.matcher(email).matches()) {
            throw new IllegalArgumentException("Error, invalid email.");
        }

        this.email = email;
    }

    @Override
    public String toString(){
        return "Your name: " + firstName + " " + lastName + "\nYour email: " + email;
    }
}
