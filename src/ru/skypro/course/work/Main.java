package ru.skypro.course.work;

public class Main {


    public static void main(String[] args) {
        // write your code
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee ("Иван Иванович Иванов", 1, 50000);
        employeeBook.addEmployee("Борис Алексеевич Петров", 1, 70000);
        employeeBook.addEmployee("Роман Викторович Круглов", 2, 60000);
        employeeBook.addEmployee("Наталья Дмитриевна Громова", 2, 100000);
        employeeBook.addEmployee("Нина Васильевна Попова", 3, 10000);
        employeeBook.addEmployee("Алексей Борисович Панов", 3, 120000);
        employeeBook.addEmployee("Мария Романовна Финкова", 4, 85000);
        employeeBook.addEmployee("Никита Евгеньевич Фоменко", 4, 90000);
        employeeBook.addEmployee("Анатолий Павлович Яшин", 5, 62000);
        employeeBook.addEmployee("Светлана Александровна Фрунзе", 5, 70003);


        employeeBook.printEmployeesList();
        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц составила: " + employeeBook.totalSalary() + " руб.");
        System.out.println();
        employeeBook.maxSalary();
        System.out.println();
        employeeBook.minSalary();
        System.out.println();
        employeeBook.midSalary();
        System.out.println();
        employeeBook.allEmployeesNames();
        System.out.println();
        employeeBook.indexing(0.2);
        System.out.println();
        employeeBook.minSalaryDep(5);
        System.out.println();
        employeeBook.maxSalaryDep(4);
        System.out.println();
        System.out.println("сумма зарплат по отделу: " + employeeBook.totalSalaryDep(5));
        System.out.println();
        employeeBook.midSalaryDep(5 );
        System.out.println();
        employeeBook.indexSalaryDep(4,1.0);
        System.out.println();
        employeeBook.allEmployeesDepartment(1);
        System.out.println();
        employeeBook.indicatorNumber(130000);
        System.out.println();
        employeeBook.removeEmployee("Мария Романовна Финкова");

        employeeBook.addEmployee("Виктор Алексеевич Львов", 5, 87000);
        System.out.println();
        employeeBook.changeEmployeeDep("Анатолий Павлович Яшин",  1);
        System.out.println();
        employeeBook.changeEmployeeSal("Анатолий Павлович Яшин", 75000);
        System.out.println();
        employeeBook.employeesByDepartment();
    }


}



             
