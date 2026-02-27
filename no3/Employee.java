public class Employee extends Sortable {
    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;

    public Employee(String n, double s, int day, int month, int year) {
        this.name = n;
        this.salary = s;
        this.hireday = day;
        this.hiremonth = month;
        this.hireyear = year;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int hireYear() {
        return hireyear;
    }

    public void print() {
        System.out.println(name + " " + salary + " " + hireyear);
    }

    public void raiseSalary(double byPercent) {
        salary += salary * byPercent / 100;
    }

    @Override
    public int compare(Sortable other) {
        Employee otherEmp = (Employee) other;
        if (this.salary < otherEmp.salary) return -1;
        else if (this.salary > otherEmp.salary) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Employee[name=" + name + ", salary=" + salary
            + ", hireday=" + hireday + ", hiremonth=" + hiremonth
            + ", hireyear=" + hireyear + "]";
    }
}
