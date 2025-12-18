public interface StudentService {
    void addStudent(Student student);
    void viewStudents();
    void updateStudent(int id, String name);
    void deleteStudent(int id);
}
