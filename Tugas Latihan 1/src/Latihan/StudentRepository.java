import java.util.*;

public class StudentRepository {
    private Map<String, Student> students = new HashMap<>();

    public void add(Student s) {
        students.put(s.getNpm(), s);
    }

    public void remove(String npm) {
        students.remove(npm);
    }

    public Student findByNpm(String npm) {
        return students.get(npm);
    }

    public List<Student> getStudentsByGpa(double minGpa) {
        List<Student> result = new ArrayList<>();
        for (Student s : students.values()) {
            if (s.getGpa() >= minGpa) {
                result.add(s);
            }
        }
        return result;
    }
}