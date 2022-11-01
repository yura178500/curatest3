public class Employee {
    private  StringfirstName;
    private  StringmiddleName;
    private  StringlastName;
    private  floatsalary;
    private int departement;
    private final int id;//идентификатор остается даже при увольнениии сотрудника
    public static int idCounter = 0;

    public  (String firstName, String middleName, String , float salary, int departement) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
        this.departement = departement;
        this.id = idCounter;
        idCounter++;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setDepartement(int departement) {
        this.departement = departement;
    }

    public float getSalary·) {
        return this.salary;
    }


    public int getDepartment() {
        return this.departement;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }





    @Override
    public String toString() {
        return "Идентификатор: " + this.id + " Отдел: " + this.departement + " Имя: " + this.firstName + " Фамилия: "
                + this.lastName + " Зарплата: " + this.salary ;
    }
}

