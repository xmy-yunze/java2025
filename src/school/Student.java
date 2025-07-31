package school;

public class Student implements Comparable<Student> {
    private int age;
    private String name;

    @Override
    public int compareTo(Student o) {
        if (this.age != o.age) {
            return this.age - o.age;
        }
        return this.name.compareTo(o.name);
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return name + "(" + age + ")";
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
