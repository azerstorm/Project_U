package id.co.azerstorm;


import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

public class University {
    private static Scanner myInput = new Scanner(System.in);
    private static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
    private static HashMap<Integer, Student> studentList;
    private static HashMap<String, Subject> subjectList;
    private static int autoGenerate;

    public static void universityInitiated() {
        studentList = new HashMap<>();
        subjectList = new HashMap<>();
    }

//    public static void addStudent(Student newStudent) {
//        studentList.put(String.format("%d", studentList.size() + 1), newStudent);
//    }

    public static void addStudent(Student newStudent) {
        studentList.put(++autoGenerate, newStudent);
    }

    public static void printAllStudentList() {
        for (Student student : studentList.values()){
            System.out.printf("No. %s, Name: %s, Gender: %s, Start Study: %s\n", student.getStudentId()
                    ,student.getHumanFullName(), student.getGender()
                    , dateFormatter.format(student.getStartStudyDate()));
        }
    }

    public static HashMap<Integer, Student> getStudentList() {
        return studentList;
    }

    public static HashMap<String, Subject> getSubjectList() {
        return subjectList;
    }
}
