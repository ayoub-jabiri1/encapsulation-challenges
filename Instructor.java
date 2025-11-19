import java.util.ArrayList;

public class Instructor {
    private int id;
    private String name;
    private String speciality;
    private ArrayList<Course> courses = new ArrayList<>();

    Instructor(int id, String name, String speciality) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
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

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void addCourse(Course c) {
        this.courses.add(c);
    }
}
