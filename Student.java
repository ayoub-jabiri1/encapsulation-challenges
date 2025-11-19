import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private ArrayList<Cour> courses = new ArrayList<>();

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void courseRegister(Cour c) {
        this.courses.add(c);

        c.addStudent(this);
    }
}
