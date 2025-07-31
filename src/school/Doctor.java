package school;

public class Doctor implements StudentService{
    @Override
    public int borrowBook() {
        return 30;
    }

    @Override
    public String getName() {
        return "博士生";
    }
}
