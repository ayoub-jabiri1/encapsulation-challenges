public class Main {
    public static void main(String[] args) {

        // Challenge 1:

        Passport p1 = new Passport(100, "Moroccan", "14/11/2025");

        Person pr1 = new Person("Ahmed", 20, p1);

        // Challenge 2:

        Course c1 = new Course(1, "English", "This is an english course");
        Course c2 = new Course(2, "Arabic", "This is an arabic course");
        
        Instructor in1 = new Instructor(1, "Ahmed", "English");

        in1.addCourse(c1);
        in1.addCourse(c2);

        // Challenge 3:

        Cour cr1 = new Cour(1, "English");
        Cour cr2 = new Cour(1, "Math");

        Student st1 = new Student(1, "Ali");
        Student st2 = new Student(2, "Ahmed");

        st1.courseRegister(cr1);
        st1.courseRegister(cr2);

        st2.courseRegister(cr1);
        st2.courseRegister(cr2);

        // Challenge 4:

        Product product1 = new Product("Water", 2.5, 5);
        Product product2 = new Product("Tea", 5, 3);

        Command cm1 = new Command(1);

        cm1.addProduct(product1);
        cm1.addProduct(product2);

        cm1.calcTotal();

        // Challenge 5:

        Car car1 = new Car(59846, "Ford", "Mustang");

        CartGrise cg1 = new CartGrise(1, car1, "18/11/2025");
    }
}
