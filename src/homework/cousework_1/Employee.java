package homework.cousework_1;

import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;

public class Employee {
    private String name;
    private String surName;
    private String middleName;
    private String fullName;
    private int department;
    private double salary;
    private int id;
    private static int counter;

    public Employee(String surName, String name, String middleName, int department, double salary) {
        if (department < 0 || department > 5) {
            throw new IllegalArgumentException("Некорректные значения");
        }
        this.id = ++counter;
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.fullName = surName + " " + name + " " + middleName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setName(String name) {
        this.surName = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartment(int department) {
        if (department < 0 || department > 5) {
            throw new IllegalArgumentException("Некорректные значения");
        }
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "ЗП " + surName + " " + name + " " + middleName +
                " из " + department +
                " отдела " + salary +
                " руб., id=" + id;
    }
}
