package id.co.azerstorm;

import java.time.LocalDate;
import java.util.HashMap;

public class Student extends Human {

    private int studentId;
    private LocalDate startStudyDate;
    private HashMap<String, Subject> subjectList;

    public Student(String firstName, String lastName, String birthLocation, LocalDate birthDate, String gender
            , String humanId, String religion, String bloodType, LocalDate startStudyDate) {
        super(firstName, lastName, birthLocation, birthDate, gender, humanId, religion, bloodType);
        ++studentId;
        this.startStudyDate = startStudyDate;
    }


    public int getStudentId() {
        return studentId;
    }

    public LocalDate getStartStudyDate() {
        return startStudyDate;
    }

    public HashMap<String, Subject> getSubjectList() {
        return subjectList;
    }
}
