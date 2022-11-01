public class Main {
    public static void main(String[] args) {
        Employee[] Employees = new Employee[10];
        Employees[0] = new Employee("Иванов","Иван","Иванович", 1, 50000));
        Employees[1] = new Employee("Петров","Петр","Петрович", 1, 56000));
        Employees[2] = new Employee("Сидоров","Сидор","Сидорович", 2, 53500));
        Employees[3] = new Employee("Кириллов","Иван","Иванович", 2, 50000));
        Employees[4] = new Employee("Урюпин","Эльдар","Петрович", 3, 55000));
        Employees[5] = new Employee("Курков","Юрий","Сидорович", 3, 58000));
        Employees[6] = new Employee("Юрьевич","Олег","Сидорович", 4, 52000));
        Employees[7] = new Employee("Новосёлов","Илья","Иванович", 4, 50000));
        Employees[8] = new Employee("Хиночек","Петр","Петрович", 5, 55000));
        Employees[9] = new Employee("Решетов","Сидор","Сидорович", 6, 53000));
    }

        Employees.employeesCout(Employees);
        Employees.sumSalary(Employees);
        Employees.maxSalary(Employees);
        Employees.minSalary(Employees);
        Employees.avarageSalary(Employees);


        Employees[2].setSalary(50000f);
        Employees[2].setDepartement(2);
        Employees[0].setFirstName("");
        Employees[2].setLastName("");

        Employees.employeesCout(Employees);
        Employees.sumSalary(Employees);
        Employees.maxSalary(Employees);
        Employees.minSalary(Employees);
        Employees.avarageSalary(Employees);

        //Повышеннаяя сложность
        float percent=0.5f;
        Employees.allPercentSalary(Employees,percent);
        byte number=5;

        Employees.departmentPeople(Employees,number);
        Employees.departmentSalarySum(Employees,number);
        Employees.departmentMaxSalary(Employees,number);
        Employees.departmentMinSalary(Employees,number);
        Employees.departmentAvarageSalary(Employees,number);
        percent=0.2f;
        Employee.departmentAddPercentSalary(Employees,number,percent);
        float highSalary=20_000f;
        Employees.compareHigherSalary(Employees,highSalary);
        float lowSalary=10_000f;
        Employees.compareLowerSalary(Employees,lowSalary);