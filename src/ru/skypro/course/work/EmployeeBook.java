package ru.skypro.course.work;

import java.util.Arrays;

public class EmployeeBook {
    private final Employee[] list;
    private  int size;
    public EmployeeBook() {
        this.list = new Employee[10];
    }
    public void printEmployeesList() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public int totalSalary() {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i].getSalary();
        }
        return sum;
    }

    public void maxSalary () {
        double maxSalary = list[0].getSalary();
        String maxSalaryName = list[0].getName();
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() > maxSalary) {
                maxSalary = list[i].getSalary();
                maxSalaryName = list[i].getName();
            }
        }
        System.out.println("Максимальная заработная плата: " + maxSalary + " руб." + " Сотрудник: " + maxSalaryName);
    }

    public void minSalary () {
        double minSalary = list[0].getSalary();
        String minSalaryName = list[0].getName();
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() < minSalary) {
                minSalary = list[i].getSalary();
                minSalaryName = list[i].getName();
            }
        }
        System.out.println("Минимальная заработная плата: " + minSalary + " руб." + " Сотрудник: " + minSalaryName);
    }

    public void midSalary () {
        double midSalary = (double) totalSalary()/list.length;
        System.out.println("Среднее значение зарплат составило: " + midSalary + " руб.");
    }

    public void allEmployeesNames () {
        System.out.println("ФИО всех сотрудников:");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getName());
        }
    }

    public void indexing (double index) {
        double newSalary = 0;
        for (int i = 0; i < list.length; i++) {
            newSalary = list[i].getSalary() + list[i].getSalary()*index;
            list[i].setSalary(newSalary);

            System.out.println("Зарплата сотрудника \"" + list[i].getName() + ", отдел № " + list[i].getDepartment()
                    + "\" после индексации составляет: " + list[i].getSalary());
        }
    }

    public void minSalaryDep(int department) {
        double minSalaryDep = totalSalary();
        String minSalaryDepName = null;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() < minSalaryDep && list[i].getDepartment() == department) {
                minSalaryDep = list[i].getSalary();
                minSalaryDepName = list[i].getName();
            }
        }
        System.out.println("Минимальная заработная плата" + " в отделе № " + department + " составляет "+ minSalaryDep
                + " руб." + " Сотрудник: " + minSalaryDepName);
    }

    public  void maxSalaryDep (int department) {
        String maxSalaryDepName = null;
        double maxSalaryDep = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() > maxSalaryDep && list[i].getDepartment() == department) {
                maxSalaryDep = list[i].getSalary();
                maxSalaryDepName = list[i].getName();
            }
        }
        System.out.println("Максимальная заработная плата" + " в отделе № " + department + " составляет "+ maxSalaryDep
                + " руб." + " Сотрудник: " + maxSalaryDepName);
    }

    public double totalSalaryDep (int department) {
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getDepartment() == department) {
                sum += list[i].getSalary();
            }
        }
        return sum;
    }

    public void midSalaryDep (int department) {
        int employeeDepQty = 0;
        double midSalaryDep = totalSalaryDep(department);
        for (employeeDepQty =0; employeeDepQty <= list[0].getDepartment(); employeeDepQty++) {

        }
                midSalaryDep = midSalaryDep/employeeDepQty;


        System.out.println("средняя зарплата по отделу № " + department + " составляет: " + midSalaryDep);
    }

    public void indexSalaryDep (int department, double percent) {
        System.out.println("зарплата сотрудников отдела № " + department + " составляет:");
        double newSalary = 0;
        String names = null;

        for (int i = 0; i < list.length; i++) {
            if (list[i].getDepartment() == department) {
                names = list[i].getName();
                newSalary = list[i].getSalary() + list[i].getSalary() * percent;
                list[i].setSalary(newSalary);

                System.out.println( names + " " + list[i].getSalary());
            }
        }
    }

    public void allEmployeesDepartment (int department) {
        System.out.println("сотрудники отдела № " + department + ":");
        for (int i = 0; i < list.length; i++) {
            if (list[i].getDepartment() == department) {
                System.out.println("id " + list[i].getId() + ": ФИО сотрудника " + list[i].getName() +
                        ", заработная плата: " + list[i].getSalary());
            }
        }
    }

    public void indicatorNumber (double number) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() < number) {

                System.out.println("зарплата ниже " + number + " " + list[i]);
            }
            if (list[i].getSalary() >= number) {
                System.out.println("зарплата выше " + number + " " + list[i]);
            }
        }
    }

    public void addEmployee (String name, int department, double salary) {


        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = new Employee(name, department, salary);
                return;
            }
        }
        Employee newList = new Employee(name, department, salary);
        list[size++] = newList;
    }

    public void removeEmployee(String name) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getName().equals(name)) {
                list[i] = null;
                size--;
                System.out.println("сотрудник " + name + " удален из списка");
                return;
            }
        }
    }

    public void changeEmployeeDep (String name, int department) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getName().equals(name)) {
                list[i].setDepartment(department);
                System.out.println("отдел сотрудника: " + name + " изменен: " + department);
            }
        }
    }
    
    public void changeEmployeeSal (String name, double salary) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getName().equals(name)) {
                list[i].setSalary(salary);
                System.out.println("зарплата сотрудника: " + name + " изменена: " + salary);
            }
        }
    }



    public void employeesByDepartment () {
        System.out.println("список сотрудников по отделениям:");
        for (int i = 0; i < list.length; i++) {
            Employee employee = list[i];

            System.out.println("отдел " + list[i].getDepartment() + " ФИО " + list[i].getName());
        }
    }


}
