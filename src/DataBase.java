public class DataBase {
    public static byte lengthCount(Employee[] arr) {
        byte k = 0;
        for (byte i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                k++;
            }
        }
        return k;
    }

    //Возможно, понадобиться узнать какие сотрудники имеют пустые поля (сотрудник уволился,или не был внесен, а идентификатор остался
    public static void nullEmployeesCout(Employee[] arr) {
        for (byte i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("Нет данных о сотруднике с идентификаторром " + i);
            }
        }
    }


    public static void employeesCout(Employee[] arr) { for (byte i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
    }

    public static float sumSalary(Employee[] arr) {
        float sum = 0f;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                sum += arr[i].getSalary();
            }
        }
        System.out.println("Сумарная зарплата: " + sum);
        return sum;
    }

    public static void maxSalary(Employee[] arr) {
        float max = 0f;
        byte k = 0;
        for (byte i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (max < arr[i].getSalary()) {
                    max = arr[i].getSalary();
                    k = i;
                }
            }
        }
        System.out.println("Максимальная зарплата у " + arr[k]);
    }

    public static void minSalary(Employee[] arr) {
        float min = arr[0].getSalary();
        byte k = 0;
        for (byte i = 1; i < arr.length; i++) {
            if (arr[i] != null) {
                {
                    if (min > arr[i].getSalary()) {
                        min = arr[i].getSalary();
                        k = i;
                    }
                }
            }
        }
        System.out.println("Минимальная зарплата у " + arr[k]);
    }

    public static void avarageSalary(Employee[] arr) {
        var l = lengthCount(arr);
        var averageSalary = EmployeesAction.sumSalary(arr) / l;
        System.out.println("Средняя зарплата: " + averageSalary);
    }

    public static void allPercentSalary(Employee[] arr, float percent) {
        for (byte i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                arr[i].setSalary(arr[i].getSalary() + arr[i].getSalary() * percent);
            }
        }
        System.out.println("Зарплаты подняты на " + percent * 100 + " процентов");
    }

    public static byte departmentPeopleCount(Employee[] arr, byte number) {
        byte k = 0;
        if (number < 6 || number > 0) {
            for (byte i = 0; i < arr.length; i++) {
                if (arr[i].getDepartment() == number) {  k++;
                }
            }
        } else    {throw new IllegalArgumentException("Введен неверный отдел");
        }
        return k;
    }

    public static float departmentSalarySum(Employee[] arr, byte number) {
        float sum = 0f;
        if (departmentPeopleCount(arr, number) > 0) {
            for (byte i = 0; i < arr.length; i++) {
                if (arr[i].getDepartment() == number) {
                    sum = sum + arr[i].getSalary();
                }
            }
            System.out.println("В отделе " + number + " сумарная зарплата=" + sum + " USD");
        } else {
            System.out.println("В отделе " + number + " нет сотрудников");
        }
        return  sum;
    }

    public static void departmentAvarageSalary(Employee[] arr, byte number) {
        float sum=departmentSalarySum(arr,number);
        byte k=departmentPeopleCount(arr, number);
        if (k>0){
            System.out.println("Средняя зарплата в отделе "+number+ ": "+sum/k+" USD");
        }
    }


    public static void departmentMaxSalary(Employee[] arr, byte number) {
        if (departmentPeopleCount(arr, number) > 0) {
            float max = 0f;
            byte t = 0;
            for (byte i = 0; i < arr.length; i++) {
                if (arr[i].getDepartment() == number) {
                    if (max < arr[i].getSalary()) {
                        max = arr[i].getSalary();
                        t = i;
                    }
                }
            }
            System.out.println("В отделе " + number + " максимальная зарплата " + max + " у " + arr[t].getLastName());
        } else {
            System.out.println("В отделе " + number + " нет сотрудников");
        }
    }

    public static void departmentMinSalary(Employee[] arr, byte number) {
        if (departmentPeopleCount(arr, number) > 0) {
            byte t = 0;
            float min = 50000000;
            for (byte i = 0; i < arr.length; i++) {
                if (arr[i].getDepartment() == number) {
                    if (min > arr[i].getSalary()) {
                        min = arr[i].getSalary();
                        t = i;
                    }
                }
            }
            System.out.println("В отделе " + number + " минимальная зарплата " + min + " USD у " + arr[t].getLastName());
        } else {
            System.out.println("В отделе " + number + " нет сотрудников");
        }
    }

    public static void departmentAddPercentSalary(Employee[] arr, byte number, float percent) {
        if (departmentPeopleCount(arr, number) > 0) {
            for (byte i = 0; i < arr.length; i++) {
                if (arr[i].getDepartment() == number) {
                    arr[i].setSalary(arr[i].getSalary() + arr[i].getSalary() * percent);
                }
            }
            System.out.println("В отделе " + number + " зарплата повышена на " + percent * 100 + " %");
        } else {
            System.out.println("В отделе " + number + " нет сотрудников");
        }

    }

    public static void departmentPeople(Employee[] arr, byte number) {
        if (departmentPeopleCount(arr, number) > 0) {
            System.out.println("Сотрудники отдела " + number+" :");
            for (byte i = 0; i < arr.length; i++) {
                if (arr[i].getDepartment() == number) {
                    System.out.println(arr[i].getFirstName() + " " + arr[i].getLastName());

                }
            }
        } else {
            System.out.println("В отделе " + number + " нет сотрудников");
        }

    }

    public static void compareLowerSalary(Employee[] arr, float salary){
        for (byte i = 0; i < arr.length; i++){
            if (arr[i]!=null){
                if(arr[i].getSalary()<salary){
                    System.out.println("Зарплата работника "+arr[i].getLastName()+ " меньше введенной " +
                            " и равна= "+arr[i].getSalary());
                }
            }
        }
    }

    public static void compareHigherSalary(Employee[] arr, float salary){
        for (byte i = 0; i < arr.length; i++){
            if (arr[i]!=null){
                if(arr[i].getSalary()>salary){
                    System.out.println("Зарплата работника "+arr[i].getLastName()+ " больше введенной " +
                            " и равна= "+arr[i].getSalary());
                }
            }
        }
    }

}

}
