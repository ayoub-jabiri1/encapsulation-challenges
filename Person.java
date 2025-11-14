public class Person {
    private String name;
    private int age;
    private Passport passport;

    Person(String name, int age, Passport passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport newPassport) {
        this.passport = newPassport;
    }
}