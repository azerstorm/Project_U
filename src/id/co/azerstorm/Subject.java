package id.co.azerstorm;

import java.time.LocalDate;

public class Subject extends Major {
    private String subjectName;
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer point;

    public Subject(String majorName, String subjectName, LocalDate startDate, LocalDate endDate, Integer point) {
        super(majorName);
        this.subjectName = subjectName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.point = point;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Integer getPoint() {
        return point;
    }
}
