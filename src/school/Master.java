package school;

public class Master implements StudentService {
    @Override
    public int borrowBook() {
        return 20;
    }

    @Override
    public String getName() {
        return "硕士生";
    }
}
