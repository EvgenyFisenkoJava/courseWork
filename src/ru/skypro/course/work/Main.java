package ru.skypro.course.work;

public class Main {
    private static Employee[] list = new Employee[10];

    public static void main(String[] args) {
        // write your code

        list[0] = new Employee("Иван Иванович Иванов", 1, 50000);
        list[1] = new Employee("Борис Алексеевич Петров", 1, 70000);
        list[2] = new Employee("Роман Викторович Круглов", 2, 60000);
        list[3] = new Employee("Наталья Дмитриевна Громова", 2, 100000);
        list[4] = new Employee("Нина Васильевна Попова", 3, 10000);
        list[5] = new Employee("Алексей Борисович Панов", 3, 120000);
        list[6] = new Employee("Мария Романовна Финкова", 4, 85000);
        list[7] = new Employee("Никита Евгеньевич Фоменко", 4, 90000);
        list[8] = new Employee("Анатолий Павлович Яшин", 5, 62000);
        list[9] = new Employee("Светлана Александровна Фрунзе", 5, 70003);

        printEmployeesList();
        System.out.println("Сумма затрат на зарплаты в месяц составила: " + totalSalary() + " руб.");
        maxSalary();
        minSalary();
        midSalary();
        allEmployeesNames();
        indexing(0.2);
        minSalaryDep(5);
        maxSalaryDep(4);
        System.out.println("сумма зарплат по отделу: " + totalSalaryDep(3));
        midSalaryDep(5);
        indexSalaryDep(4,1.0);
        allEmployeesDepartment(1);
        indicatorNumber(130000);
    }

    private static void printEmployeesList() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    private static int totalSalary() {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i].getSalary();
        }
        return sum;
    }

    private static void maxSalary () {
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

    private static void minSalary () {
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

    private static void midSalary () {
        double midSalary = (double) totalSalary()/list.length;
        System.out.println("Среднее значение зарплат составило: " + midSalary + " руб.");
        }

    public static void allEmployeesNames () {
        System.out.println("ФИО всех сотрудников:");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getName());
        }
    }

    private static void indexing (double index) {
        double newSalary = 0;
        for (int i = 0; i < list.length; i++) {
            newSalary = list[i].getSalary() + list[i].getSalary()*index;

            System.out.println("Зарплата сотрудника \"" + list[i].getName() + ", отдел № " + list[i].getDepartment()
                    + "\" после индексации составляет: " + list[i].setSalary(newSalary));
        }
    }

    private static void minSalaryDep(int department) {
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

    private static void maxSalaryDep (int department) {
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

        private static double totalSalaryDep (int department) {
            double sum = 0;
            for (int i = 0; i < list.length; i++) {
                if (list[i].getDepartment() == department) {
                    sum += list[i].getSalary();
                }
            }
            return sum;
        }

        private static void midSalaryDep (int department) {
        int employeeDepQty = 0;
        double midSalaryDep = 0;
            for (int i = 0; i < list.length; i++) {
                if (list[i].getDepartment() == department) {
                    employeeDepQty ++;
                    midSalaryDep = totalSalaryDep(department)/employeeDepQty;
                }
            }
            System.out.println("средняя зарплата по отделу № " + department + " составляет: " + midSalaryDep);
        }

        private static void indexSalaryDep (int department, double percent) {
            System.out.println("зарплата сотрудников отдела № " + department + " составляет:");
            double newSalary = 0;
            String names = null;

            for (int i = 0; i < list.length; i++) {
                if (list[i].getDepartment() == department) {
                    names = list[i].getName();
                    newSalary = list[i].getSalary() + list[i].getSalary() * percent;
            System.out.println( names + " " + list[i].setSalary(newSalary));
                }
            }
        }

        private static void allEmployeesDepartment (int department) {
            System.out.println("сотрудники отдела № " + department + ":");
            for (int i = 0; i < list.length; i++) {
                if (list[i].getDepartment() == department) {
                    System.out.println("id " + list[i].getId() + ": ФИО сотрудника " + list[i].getName() +
                            ", заработная плата: " + list[i].getSalary());
                }
            }
        }

        private static void indicatorNumber (double number) {
        for (int i = 0; i < list.length; i++) {
                if (list[i].getSalary() < number) {

                    System.out.println("зарплата ниже " + number + " " + list[i]);
                }
                if (list[i].getSalary() >= number) {
                    System.out.println("зарплата выше " + number + " " + list[i]);
                }
            }
    }
}



             
