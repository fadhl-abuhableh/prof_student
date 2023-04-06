package tr.edu.maltepe.oop;

public class Student {

    private static String name;

    private Student student;

    public static String getName() {
        return name;
    }

    public void setName(String newValue) {
        name = newValue;
    }

    public void listen() {
        System.out.println(student.getName() + " is listening to the professor");

    }


    public void takeNotes() {
        System.out.println(student.getName() + " is taking notes");
    }

}