package school;

public class Bachelor implements StudentService{

    @Override
    public int borrowBook() {
        return 10;
    }

    @Override
    public String getName() {
        return "大学生";
    }
}
