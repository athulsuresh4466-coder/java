class Employee {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + salary);
    }
}

class Developer extends Employee {
    Developer(int empId, String name, double salary) {
        super(empId, name, salary);
    }

    void work() {
        System.out.println("Developer is writing code.");
    }
}

class Tester extends Employee {
    Tester(int empId, String name, double salary) {
        super(empId, name, salary);
    }

    void test() {
        System.out.println("Tester is testing the software.");
    }
}

class Manager extends Employee {
    Manager(int empId, String name, double salary) {
        super(empId, name, salary);
    }

    void manage() {
        System.out.println("Manager is managing the team.");
    }
}

public class miniproject{
    public static void main(String[] args) {

        Developer d = new Developer(101, "hari", 50000);
        d.display();
        d.work();

        System.out.println();

        Tester t = new Tester(102, "hari", 45000);
        t.display();
        t.test();

        System.out.println();

        Manager m = new Manager(103, "Arun", 70000);
        m.display();
        m.manage();
    }
}