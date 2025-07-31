package string;

public class StringDemo {
    private static int numInstances = 0;
    protected static int getCount() {
        return numInstances;
    }
    private static void addInstance() {
        numInstances++;
    }
    StringDemo(){
        StringDemo.addInstance();
    }

    public static void main(String[] args) {
        System.out.println("Starting with "+(StringDemo.getCount())+" instances");
        for (int i = 0; i < 500; i++) {
            new StringDemo();
        }
        System.out.println("Created "+(StringDemo.getCount())+" instances");
    }
}
