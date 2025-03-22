public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.setEmployees(new Employee("Виктор", "Шубин", "Васильевич", 1, 17000, 1));
        employeeBook.setEmployees(new Employee("Кирилл", "Татарчук", "Владимирович", 2, 25000, 2));
        employeeBook.setEmployees(new Employee("Диана", "Коробкина", "Александровна", 3, 27000, 3));
        employeeBook.setEmployees(new Employee("Алла", "Цупко", "Николаевна", 4, 40000, 4));
        employeeBook.setEmployees(new Employee("Валентина", "Валентина", "Николаевна", 5, 35000, 5));
        employeeBook.setEmployees(new Employee("Дмитрий", "Мухачев", "Викторович", 1, 29000, 6));
        employeeBook.setEmployees(new Employee("Максим", "Цупко", "Андреевич", 2, 30000, 7));
        employeeBook.printAll();
        employeeBook.removeEmployee(3);
        employeeBook.changeSalary("Шубин", 45000);
        employeeBook.changeDepartment("Шубин", 4);
        employeeBook.printEmployeeByDepartment();
        employeeBook.printEmployee();
        employeeBook.printSalary();
        employeeBook.minSalary();
        employeeBook.maxSalary();
        employeeBook.midlSalary();
        employeeBook.printFIO();
        employeeBook.indexSalary();
        employeeBook.minSalaryInDepartment(3);
        employeeBook.maxSalaryInDepartment(3);
        employeeBook.salaryInDepartment(1);
        employeeBook.midlSlararyInDepartment(5);
        employeeBook.indexForDepartment(1, 5);
        employeeBook.printEmployeeForOneDepartment(5);
        employeeBook.salaryLessNumber(17000);
        employeeBook.salaryHigherNumber(40000);
    }
}







    
