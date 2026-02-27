public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        System.out.println("=== Data Awal ===");
        for (Employee e : staff) {
            e.print();
        }

        // Raise salary 5%
        System.out.println("\n=== Setelah Raise Salary 5% ===");
        for (Employee e : staff) {
            e.raiseSalary(5);
            e.print();
        }

        // Test compare()
        System.out.println("\n=== Test Compare ===");
        System.out.println("Antonio vs Maria: " + staff[0].compare(staff[1]));
        System.out.println("Maria vs Isabel: " + staff[1].compare(staff[2]));
        System.out.println("Isabel vs Antonio: " + staff[2].compare(staff[0]));

        // Test shell_sort
        System.out.println("\n=== Setelah Sorting (berdasarkan salary) ===");
        Sortable.shell_sort(staff);
        for (Employee e : staff) {
            e.print();
        }
    }
}
