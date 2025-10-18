package Collection;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', marks=" + marks + '}';
    }

}

public class GroupByStudentsByMarks {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 85),
                new Student("Bob", 75),
                new Student("Charlie", 90),
                new Student("Dave", 60)
        );

        // Filter students with marks > 80 and collect as Map<String, Student>
        Map<String, Student> result = students.stream()
                .filter(s -> s.getMarks() > 80)
                .collect(Collectors.toMap(
                        Student::getName, // key
                        student -> student // value
                ));

        //This will throw an IllegalStateException if there are duplicate names.
        // If that's a possibility, you can resolve it with a merge function

        Map<String, Student> result1= students.stream()
                .filter(s -> s.getMarks() > 80).collect(Collectors.toMap(
                Student::getName,
                student -> student,
                (existing, replacement) -> existing // or replacement
        ));

        // Print the map
        result.forEach((name, student) -> System.out.println(name + ": " + student));

        // Print the map
        result1.forEach((name, student) -> System.out.println(name + ": " + student));
    }
}
