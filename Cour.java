import java.util.ArrayList;

public class Cour {
    private int id;
    private String title;
    private ArrayList<Student> students = new ArrayList<>();

    Cour(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addStudent(Student s) {
        this.students.add(s);
    }
}
