package tr.edu.maltepe.oop;

public class Prof {
    private static String name;
    private static String subject;

    public static String getName() {
        return name;
    }

    public void setName(String newValue) {
        name = newValue;
    }

    public static String getSubject() {
        return subject;
    }

    public void setSubject(String newValue) {
        subject = newValue;
    }

    public void teach() {
        System.out.println(Prof.getName() + " is teaching " + Prof.getSubject());
    }
}
