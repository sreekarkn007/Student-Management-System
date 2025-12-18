public abstract class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Encapsulation (Getters)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstraction
    public abstract String getStudentType();

    @Override
    public String toString() {
        return id + " | " + name + " | " + age + " | " + getStudentType();
    }
}
