package school;
//VideoVIP  vip1=5 vip2=10 vip3=20 test

import node.ListNode;

import java.util.*;

public class StudentTest {

    public void show(StudentService studentService) {
        System.out.println(studentService instanceof Doctor);
        System.out.println(studentService.getName() + "能借" + studentService.borrowBook() + "本书");
    }

    public void showDoctor(Doctor doctor) {
        System.out.println(doctor.getName() + "能借" + doctor.borrowBook() + "本书");
    }

    public static void main1(String[] args) {
        StudentTest studentTest = new StudentTest();
        studentTest.show(new Bachelor());

    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(20, "Bob"));
        students.add(new Student(21, "Bob"));
        students.add(new Student(20, "Alice"));
        students.add(new Student(18, "Tom"));
        List<ListNode> nodes = new ArrayList<>();
//        Collections.sort(nodes);
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.compareTo(o2);
            }
        });
        Comparator<Student> compareTo = Student::compareTo;
//        Comparator<Student> compareTo1 = (o1, o2) -> o1.compareTo(o2);
        students.sort((o1, o2) -> {
            if(o1.getName().compareTo(o2.getName()) != 0) {
                return o2.getName().compareTo(o1.getName());
            }
            return o2.getAge().compareTo(o1.getAge());
        });
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
