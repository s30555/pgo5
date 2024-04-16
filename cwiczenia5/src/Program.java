import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Program {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
// Creating and adding developers
        Developer dev = new Developer("John", "Doe", "New York", "john@doe.com", "123456789", 2020);
        Technology t= Technology.Linux;
        dev.addTechnology(t);
        employees.add(dev);
// Creating and adding testers
        Tester tester = new Tester("Jane", "Smith", "Los Angeles", "jane@smith.com", "987654321", 2021);
        tester.addTest(Test.UNIT_TEST);
        employees.add(tester);
// Creating and adding a manager
        Manager manager = new Manager("Bob", "Johnson", "Chicago", "bob@johnson.com", "1122334455", 2019);
        Goal g=new Goal( "Implementing FB login", new Date(2010, Calendar.OCTOBER, 15), 1000);
        manager.addGoals(g);
        employees.add(manager);
// Calculating total amount to be paid
        int totalAmount = 0;
        for (Employee employee : employees) {
            totalAmount += employee.calculateSalary();
        }
        System.out.println("Total amount to be paid this month: " + totalAmount + " USD");
    }
}

