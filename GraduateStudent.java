public class GraduateStudent extends Student {

    private String specialization;

    public GraduateStudent(int id, String name, int age, String specialization) {
        super(id, name, age);
        this.specialization = specialization;
    }

    @Override
    public String getStudentType() {
        return "Graduate (" + specialization + ")";
    }
}
