package id.co.azerstorm;

import java.util.HashMap;

public class Major {
    private String majorName;
    private HashMap<String, Subject> listSubjects;

    public Major(String majorName) {
        this.majorName = majorName;
        this.listSubjects = new HashMap<>();
    }

    public String getMajorName() {
        return majorName;
    }

    public HashMap<String, Subject> getListSubjects() {
        return listSubjects;
    }
}
