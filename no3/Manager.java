import java.util.GregorianCalendar;

public class Manager extends Employee {
    private String secretaryName;

    public Manager(String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);
        this.secretaryName = "";
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    public void setSecretaryName(String name) {
        this.secretaryName = name;
    }

    @Override
    public void raiseSalary(double byPercent) {
        // bonus 0.5% per tahun masa kerja
        GregorianCalendar calendar = new GregorianCalendar();
        int currentYear = calendar.get(GregorianCalendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }

    @Override
    public String toString() {
        return "Manager[" + super.toString() + ", secretaryName=" + secretaryName + "]";
    }
}
