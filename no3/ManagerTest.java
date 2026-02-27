public class ManagerTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
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

        // Test polymorphism - Manager dan Employee beda behavior raiseSalary
        System.out.println("\n=== Test Polymorphism ===");
        System.out.println("staff[0] class: " + staff[0].getClass().getSimpleName());
        System.out.println("staff[1] class: " + staff[1].getClass().getSimpleName());
        System.out.println("staff[2] class: " + staff[2].getClass().getSimpleName());

        // Test compare dan shell_sort
        System.out.println("\n=== Test Compare ===");
        System.out.println("Antonio vs Maria: " + staff[0].compare(staff[1]));

        System.out.println("\n=== Setelah Sorting ===");
        Sortable.shell_sort(staff);
        for (Employee e : staff) {
            e.print();
        }
    }
}
