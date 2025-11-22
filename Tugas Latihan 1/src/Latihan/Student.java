public class Student {
    private final String npm;
    private String name;
    private double gpa;

    public Student(String npm, String name, double gpa) {
        this.npm = npm;
        setName(name);
        setGpa(gpa);
    }

    public String getNpm() { return npm; }
    public String getName() { return name; }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name required");
        this.name = name;
    }

    public double getGpa() { return gpa; }

    public void setGpa(double gpa) {
        if (gpa < 0 || gpa > 4)
            throw new IllegalArgumentException("Invalid GPA");
        this.gpa = gpa;
    }

    public String display() {
        return npm + " - " + name + " | GPA: " + gpa;
    }
}