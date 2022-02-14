package id.co.azerstorm;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainMenu {

    private static Scanner myInput = new Scanner(System.in);
    private static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void mainMenuSelection() {
        String mainMenuSelect;
        int select;

        System.out.print("Select Menu\n" +
                "1. All Student Data\n" +
                "2. All Lecturer Data\n" +
                "3. About This University\n" +
                "4. Exit Application\n" +
                "Choose Menu: ");

        mainMenuSelect = myInput.nextLine();
        select = Integer.parseInt(mainMenuSelect);
        switch (select) {
            case 1:
                allStudentData();
            case 2:
                addStudentMenu();
            case 3:
                break;
            case 4:
                System.exit(0);

        }
    }

    public static void allStudentData() {
        University.printAllStudentList();
        mainMenuSelection();
    }

    public static void addStudentMenu() {
        String firstName, lastName, birthLocation, birthDate, gender, humanId, religion, bloodType, startStudyDate;
        LocalDate birthDateNew, startStudyDateNew;

        firstName = userInput("First Name");

        System.out.println("Last Name: ");
        lastName = myInput.nextLine();
        System.out.println("Birth Location: ");
        birthLocation = myInput.nextLine();
        System.out.println("Birth Date: ");
        birthDate = myInput.nextLine();
        birthDateNew = LocalDate.parse(birthDate, dateFormatter);
        System.out.println("Gender: ");
        gender = myInput.nextLine();
        System.out.println("ID: ");
        humanId = myInput.nextLine();
        System.out.println("Religion: ");
        religion = myInput.nextLine();
        System.out.println("Blood Type: ");
        bloodType = myInput.nextLine();
        System.out.println("Start Study Date: ");
        startStudyDate = myInput.nextLine();
        startStudyDateNew = LocalDate.parse(startStudyDate, dateFormatter);

        University.addStudent(new Student(firstName, lastName, birthLocation, birthDateNew, gender, humanId, religion
                , bloodType, startStudyDateNew));
        System.out.println("Successfull Added");
        mainMenuSelection();
    }

    public static String userInput(String label) {
        String input;
        System.out.println(label);
        input = myInput.nextLine();
        return input;
    }


}
