package ru.skypro.course.work;

public class Main {

    public static void main(String[] args) {
        // write your code
        Employee[] list = new Employee[10];
        list[0] = new Employee("Иван Иванович Иванов", 1, 50000);
        list[1] = new Employee("Борис Алексеевич Петров", 1, 70000);
        list[2] = new Employee("Роман Викторович Круглов", 2, 60000);
        list[3] = new Employee("Наталья Дмитриевна Громова", 2, 100000);
        list[4] = new Employee("Нина Васильевна Попова", 3, 90000);
        list[5] = new Employee("Алексей Борисович Панов", 3, 120000);
        list[6] = new Employee("Мария Романовна Финкова", 4, 85000);
        list[7] = new Employee("Никита Евгеньевич Фоменко", 4, 90000);
        list[8] = new Employee("Анатолий Павлович Яшин", 5, 62000);
        list[9] = new Employee("Светлана Александровна Фрунзе", 5, 70000);

        printEmployeesList(list);
        totalSalary(list);
        maxSalary(list);
        minSalary(list);
        midSalary(list);
        allEmployeesNames(list);
    }

    public static void printEmployeesList(Employee[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void totalSalary(Employee[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц составила: " + sum + " руб.");
    }

    public static void maxSalary (Employee[] list) {
        int maxSalary = list[0].getSalary();
        String maxSalaryName = list[0].getName();
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() > maxSalary) {
                maxSalary = list[i].getSalary();
                maxSalaryName = list[i].getName();
            }
        }
        System.out.println("Максимальная заработная плата: " + maxSalary + " руб." + " Сотрудник: " + maxSalaryName);
        }
    public static void minSalary (Employee[] list) {
        int minSalary = list[0].getSalary();
        String minSalaryName = list[0].getName();
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() < minSalary) {
                minSalary = list[i].getSalary();
                minSalaryName = list[i].getName();
            }
        }
        System.out.println("Максимальная заработная плата: " + minSalary + " руб." + " Сотрудник: " + minSalaryName);
    }

    public static void midSalary (Employee[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i].getSalary();
        }
        int midSalary = sum/10;
        System.out.println("Среднее значение зарплат составило: " + midSalary + " руб.");
    }

    public static void allEmployeesNames (Employee[] list) {
        String allNames;
        for (int i = 0; i < list.length; i++) {
            allNames = list[i].getName();
        System.out.println(allNames);
        }
    }
}



             
