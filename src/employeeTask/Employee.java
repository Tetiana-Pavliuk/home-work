package employeeTask;

import java.util.Random;

public class Employee {
    String name;
    String surname;
    int id;

    public Employee(String name, String surname) {
        setName(name);
        setSurname(surname);
        setId();
    }
    public Employee() {
        setId();
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setId() {
        Random random = new Random();
        id = random.nextInt();
    }

    public void print() {
        System.out.println(name + " " + surname + " : " + id);
    }
}
