import java.util.Objects;

public class Employee {

    private String name;
    private String surname;
    private String lastname;
    private int department;
    private int salary;
    private int id;
    private static int Counter = 1;


    @Override
    public String toString() {
        return "Сотрудник - " +
                "имя: " + name + '\'' +
                ", фамилия: " + surname + '\'' +
                ", отчество: " + lastname + '\'' +
                ", отдел - " + department +
                ", зарплата - " + salary +
                ", id - " + id;
    }

    public Employee(String name, String surname, String lastname, int department, int salary, int id) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.department = department;
        this.salary = salary;
        this.id = Counter++;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return Counter;
    }
}


