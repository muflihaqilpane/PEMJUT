import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DeadlineReminder implements Displayable {
    private String taskName;
    private String courseName;
    private String dueDate;
    private static final String DATE_FORMAT = "yyyy-MM-dd";

    public DeadlineReminder(String taskName, String courseName, String dueDate) {
        this.taskName = taskName;
        this.courseName = courseName;
        this.dueDate = dueDate;
    }

    // 1. Encapsulate Field
    public String getTaskName() { return taskName; }
    public String getCourseName() { return courseName; }
    public String getDueDate() { return dueDate; }

    // 2. Extract Method - hitung sisa hari
    public long calculateRemainingDays() {
        LocalDate today = LocalDate.now();
        LocalDate due = LocalDate.parse(dueDate, DateTimeFormatter.ofPattern(DATE_FORMAT));
        return ChronoUnit.DAYS.between(today, due);
    }

    // 3. Implementasi interface Displayable
    @Override
    public void displayInfo() {
        System.out.println("- " + taskName + " (" + courseName + "), Deadline: " + dueDate +
                " (" + calculateRemainingDays() + " hari lagi)");
    }
}
