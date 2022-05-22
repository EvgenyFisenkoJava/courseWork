package ru.skypro.course.work;

public class Employee {
    private static int counter = 1;
private String name;
private int department;
private int salary;
private int id;

public Employee(String name, int department, int salary) {
    this.name = name;
    this.department = department;
    this.salary = salary;
    this.id = counter++;
    }

    public int getId() {
    return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getDepartment() {
    return this.department;
    }

    public int getSalary() {
        return this.salary;
    }
    public void setDepartment(int department) {
    this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString () {
        return this.id + ": " + "ФИО сотрудника " + this.name + ". " + "Отдел № " + this.department + ". "
                + "Заработная плата " + this.salary + " руб.";
    }

}
