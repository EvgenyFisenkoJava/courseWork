package ru.skypro.course.work;

public class Employee {
    private static int counter = 1;
private String name;
private int department;
private double salary;
private int id;

public Employee(String name, int department, double salary) {
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

    public double getSalary() {
        return this.salary;
    }
    public void setDepartment(int department) {
    this.department = department;
    }

    public double setSalary(double salary) {
        this.salary = salary;
        return salary;
    }
    @Override
    public String toString () {
        return "id " + this.id + ": " + "ФИО сотрудника " + this.name + ". " + "Отдел № " + this.department + ". "
                + "Заработная плата " + this.salary + " руб.";
    }

}
