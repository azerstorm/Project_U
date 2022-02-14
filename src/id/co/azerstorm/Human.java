package id.co.azerstorm;

import java.time.LocalDate;

public class Human {
    private String firstName;
    private String lastName;
    private String birthLocation;
    private LocalDate birthDate;
    private String gender;
    private String humanId;
    private String religion;
    private String bloodType;

    public Human(String firstName, String lastName, String birthLocation, LocalDate birthDate, String gender
            , String humanId, String religion, String bloodType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthLocation = birthLocation;
        this.birthDate = birthDate;
        this.gender = gender;
        this.humanId = humanId;
        this.religion = religion;
        this.bloodType = bloodType;
    }

    public String getHumanFullName() {
        return String.format("%s %s", firstName, lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthLocation() {
        return birthLocation;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    public String getHumanId() {
        return humanId;
    }

    public String getReligion() {
        return religion;
    }

    public String getBloodType() {
        return bloodType;
    }
}
