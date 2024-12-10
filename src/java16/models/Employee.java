package java16.models;

import java16.enums.Gender;
import java16.enums.Position;

public class Employee {

    private Long id;
    private String firstName;
    private String email;
    private String phoneNumber;
    private double expirence;
    private Position position;
    private Gender gender;

    public Employee(Long id, String firstName, String email, String phoneNumber, double expirence, Position position, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.expirence = expirence;
        this.position = position;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getExpirence() {
        return expirence;
    }

    public void setExpirence(double expirence) {
        this.expirence = expirence;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", expirence=" + expirence +
                ", position=" + position +
                ", gender=" + gender +
                '}';
    }
}
