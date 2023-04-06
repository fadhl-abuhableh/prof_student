package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {


            Prof prof = new Prof();
            prof.setName("Dr. Smith");
            prof.setSubject("Physics");

            Student student1 = new Student();
            student1.setName("Alice");

            Student student2 = new Student();
            student2.setName("Bob");

            prof.teach();
            student1.listen();
            student1.takeNotes();
            student2.listen();
            student2.takeNotes();
        }
    }
