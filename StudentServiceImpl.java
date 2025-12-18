import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    private List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    @Override
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    @Override
    public void updateStudent(int id, String name) {
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Update not allowed directly (immutable fields demo).");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    @Override
    public void deleteStudent(int id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getId() == id) {
                iterator.remove();
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
