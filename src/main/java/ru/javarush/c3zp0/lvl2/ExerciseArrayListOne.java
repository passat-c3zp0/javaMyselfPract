package ru.javarush.c3zp0.lvl2;

import ru.javarush.c3zp0.IExercise;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ExerciseArrayListOne implements IExercise {
    private ArrayList<Employee> staff =  new ArrayList<Employee>();
    private ArrayList<EmployersSalary> estimateSalaty = new ArrayList<EmployersSalary>();

    public ExerciseArrayListOne(){
        this.staff.add(new Employee("Siarhei", 1000.0));
        this.staff.add(new Employee("Vladislav", 1500.0));
        this.staff.add(new Employee("Nikoli", 700.0));
        this.staff.add(new Employee("Kate", 800.0));
        this.staff.add(new Employee("Anatol", 600.0));
    }

    @Override
    public void execute() {
        Scanner stdin = new Scanner(System.in);
        boolean appWork = true;
        while (appWork) {
            for (Employee emp : this.staff) {
                System.out.printf("identifier: %s   Name: %s   Min Salary: %s \r\n", staff.indexOf(emp), emp.getName(), emp.getMinSalary());
            }
            System.out.printf("Select employee identifier to pay him: ");
            int empId = stdin.nextInt();
            double amount = 0;
            while (amount < staff.get(empId).getMinSalary()){
                System.out.printf("Enter amount of money to pay him: ");
                amount = stdin.nextDouble();
            }
            this.estimateSalaty.add(new EmployersSalary(staff.get(empId), amount));
            for (EmployersSalary payedSalary : estimateSalaty) {
                System.out.printf("Payed employee name: %s\r\nSalary: %s\r\nDate: %s\r\n",
                        payedSalary.getPerson().getName(),
                        payedSalary.getAmount(),
                        payedSalary.getDate()
                );
            }
            System.out.printf("Continue to work[Y/N]: ");
            String appWorkStdIn = stdin.next();
            if (!appWorkStdIn.equals("Y") && !appWorkStdIn.equals("y")) appWork = false;
        }
    }
}

class Employee{
    private String name;
    private Double minSalary;

    public Employee(String name, Double minSalary){
        this.minSalary = minSalary;
        this.name = name;
    }

    public Double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Double minSalary) {
        this.minSalary = minSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class EmployersSalary {
    private Calendar calendar;
    private Employee person;
    private String date;
    private Double amount;

    public EmployersSalary(Employee person, Double amount){
        this.person = person;
        this.amount = amount;
        this.calendar = new GregorianCalendar();
        this.date = calendar.get(Calendar.YEAR) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.DAY_OF_MONTH);
    }

    public String getDate() {
        return date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Employee getPerson() {
        return person;
    }

    public void setPerson(Employee person) {
        this.person = person;
    }
}
