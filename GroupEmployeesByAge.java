package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{

    private int id;
    private String name;
    private int age;


    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class GroupEmployeesByAge {
    public static void main(String[] args){

        List<Employee> employees =Arrays.asList(
                new Employee(1,"kalyan",41),
                new Employee(2,"Saritha",37),
                new Employee(3,"SaiSrikar",21),
                new Employee(4,"Ramesh",38),new Employee(5,"Durga",41),
                new Employee(5,"Durga",41),
                new Employee(6,"Goutham",21),
                new Employee(7,"Laxmi",37)
                );

    //Group the elements by Age:
        Map<Integer,List<Employee>> listOfEmployees =employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getAge()));

        listOfEmployees.forEach((key,value)->{
            System.out.println("Age is :"+key);
            System.out.println("Employee is"+value);
                });

    }
}
