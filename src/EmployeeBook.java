public class EmployeeBook {
    private static final Employee[] employees = new Employee[10];

    public void printAll() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    //Получить Ф. И. О. всех сотрудников по отделам (напечатать список отделов и их сотрудников).
    public void printEmployeeByDepartment() {
        for (int i = 1; i <= employees.length; i++) {
            for (int j = 0; j < employees.length; j++) {
                if (employees[j] != null) {
                    if (employees[j].getDepartment() == i) {
                        System.out.println(employees[j]);
                    }
                }
            }
        }
    }

    public void changeDepartment(String surname, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSurname().equals(surname)) {
                    employees[i].setDepartment(department);
                }
            }
        }
    }

    public void changeSalary(String surname, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSurname().equals(surname)) {
                    employees[i].setSalary(salary);
                }
            }
        }
    }

    public void removeEmployee(String surname) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSurname().equals(surname)) {
                employees[i] = null;
            }
        }
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getId() == id) {
                    employees[i] = null;
                }
            }
        }
    }

    public void setEmployees(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
    }

    public void salaryHigherNumber(int number) {
        System.out.println("Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() >= number) {
                    System.out.println("id - " + employees[i].getId() + ". ФИО - " + employees[i].getSurname() + " " + employees[i].getName() + " ЗП - " + employees[i].getSalary());
                }
            }
        }
    }

    public void salaryLessNumber(int number) {
        System.out.println(" Получить в качестве параметра число и найти:\n" +
                "-  Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < number) {
                    System.out.println("id - " + employees[i].getId() + ". ФИО - " + employees[i].getSurname() + " " + employees[i].getName() + " ЗП - " + employees[i].getSalary());
                }
            }
        }
    }

    public void printEmployeeForOneDepartment(int department) {
        System.out.println("Напечатать всех сотрудников отдела (все данные, кроме отдела).");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartment() == department) {
                    System.out.println("ФИО - " + employees[i].getSurname() + " " + employees[i].getName() + " " + employees[i].getLastname() + ". ЗП - " + employees[i].getSalary());
                }
            }
        }
    }


    public void indexForDepartment(int department, int index) {
        System.out.println("Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartment() == department) {
                    employees[i].setSalary((int) (employees[i].getSalary() * ((index) + 100) / 100));
                    System.out.println(employees[i].getSurname() + " " + employees[i].getName() + " ЗП после индексации " + employees[i].getSalary());
                }
            }
        }
    }

    public void midlSlararyInDepartment(int department) {
        System.out.println("Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).");
        int summSalaryDepartment = 0;
        int employeesForDepartment = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartment() == department) {
                    summSalaryDepartment = summSalaryDepartment + employees[i].getSalary();
                    employeesForDepartment++;
                }
            }
        }
        System.out.println(summSalaryDepartment / employeesForDepartment);
    }


    public void salaryInDepartment(int department) {
        System.out.println("Сумму затрат на зарплату по отделу.");
        int salaryInOneDepartment = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartment() == department) {
                    salaryInOneDepartment = salaryInOneDepartment + employees[i].getSalary();
                }
            }
        }
        System.out.println(salaryInOneDepartment);
    }

    public void maxSalaryInDepartment(int department) {
        System.out.println("Сотрудника с максимальной зарплатой.");
        Employee employee = null;
        int maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartment() == department) {
                    if (maxSalary < employees[i].getSalary()) {
                        maxSalary = employees[i].getSalary();
                        employee = employees[i];
                    }
                }
            }
        }
        System.out.println(employee);
    }

    public void printEmployee() {
        System.out.println("Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public int printSalary() {
        System.out.println("Посчитать сумму затрат на зарплаты в месяц.");
        int salaryAll = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                salaryAll = salaryAll + employees[i].getSalary();
            }
        }
        return salaryAll;
    }

    public void minSalary() {
        System.out.println("Найти сотрудника с минимальной зарплатой. ");
        int minSalary = 999999999;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (minSalary > employees[i].getSalary()) {
                    minSalary = employees[i].getSalary();
                }
            }
        }
        System.out.println(minSalary);
    }

    public void maxSalary() {
        System.out.println("Найти сотрудника с максимальной зарплатой.");
        int maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (maxSalary < employees[i].getSalary()) {
                    maxSalary = employees[i].getSalary();
                }
            }
        }
        System.out.println(maxSalary);
    }

    public void midlSalary() {
        System.out.println("Подсчитать среднее значение зарплат (можно использовать для этого метод иz пункта b).");
        int midlSalary = printSalary() / employees.length;
        System.out.println(midlSalary);
    }

    public void printFIO() {
        System.out.println("Получить Ф. И. О. всех сотрудников (вывести в консоль).");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getLastname());
            }
        }
    }

    public void indexSalary() {
        System.out.println("Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].setSalary((int) (employees[i].getSalary() * 1.05));
                System.out.println(employees[i].getSalary());
            }
        }
    }

    public void minSalaryInDepartment(int department) {
        System.out.println(" Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):\n" +
                " Сотрудника с минимальной зарплатой.");
        Employee employee = null;
        int minSalary = 999999999;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartment() == department) {
                    if (minSalary > employees[i].getSalary()) {
                        minSalary = employees[i].getSalary();
                        employee = employees[i];
                    }
                }
            }
        }
        System.out.println(employee);
    }
}