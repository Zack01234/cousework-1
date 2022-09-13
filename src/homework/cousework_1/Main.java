package homework.cousework_1;

public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("А-ков", "А-ей", "А-ович", 1, 20_000);
        employees[1] = new Employee("Б-ков", "Б-ей", "Б-ович", 2, 21_000);
        employees[2] = new Employee("В-ков", "В-ей", "В-ович", 3, 22_000);
        employees[3] = new Employee("Г-ков", "Г-ей", "Г-ович", 4, 23_000);
        employees[4] = new Employee("Д-ков", "Д-ей", "Д-ович", 5, 24_000);
        employees[5] = new Employee("Е-ков", "Е-ей", "Е-ович", 4, 25_000);
        employees[6] = new Employee("Ж-ков", "Ж-ей", "Ж-ович", 3, 26_000);
        employees[7] = new Employee("З-ков", "З-ей", "З-ович", 2, 27_000);
        employees[8] = new Employee("И-нов", "И-ей", "И-нович", 3, 28_000);

        System.out.println(" 'Базовая сложность' ");
        printAllDataEmployee(employees);
//        System.out.println("Сумма затрат на зарплаты"+getCalculateSumSalary());
        System.out.println("Min " + getEmployeeWithMinSalary());
        System.out.println("Max " + getEmployeeWithMaxSalary());
        System.out.println("Средняя ЗП " + getAverageSalary());
        printAllNameEmployee();
        System.out.println(" 'Повышенная сложность' ");
        System.out.println("После индексации " + getIndexSalary());
    }

    //Все данные
    public static void printAllDataEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    //Зарплата за месяц со всех
//    public static double getCalculateSumSalary() {
//        double sum = 0;
//        for (int i = 0; i < employees.length; i++) {
//            if (i != null) continue;
//            sum = sum + employees[(int) i].getSalary();
//        }
//        return sum;
//    }

    //Минимальная ЗП
    public static Employee getEmployeeWithMinSalary() {
        double min = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                min = employees[i].getSalary();
                index = i;
                break;
            }
        }
        Employee employeeMinSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                employeeMinSalary = employees[i];
            }
        }
        return employeeMinSalary;
    }

    //Максимальная ЗП
    public static Employee getEmployeeWithMaxSalary() {
        double max = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                max = employees[i].getSalary();
                index = i;
                break;
            }
        }
        Employee employeeMaxSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                employeeMaxSalary = employees[i];
            }
        }
        return employeeMaxSalary;
    }

    //Среднее значение ЗП
    public static double getAverageSalary() {
        double sum = 0;
        int countEmployee = 0;
        for (Employee employee : employees) {
            if (employee == null) continue;
            countEmployee++;
            sum = sum + employee.getSalary();
        }
        return sum / countEmployee;
    }

    //Все имена
    public static void printAllNameEmployee() {
        for (Employee i : employees) {
            if (i == null) continue;
            System.out.println(i.getFullName());
        }
    }

    //Индексация ЗП на 10%
    public static double getIndexSalary() {
        double indexUp = 10;
        double factor = (100 + indexUp) * 0.01;
        for (Employee i : employees) {
            if (i == null) continue;
            i.setSalary(i.getSalary()*factor);
        }
        return getIndexSalary();
    }

}
