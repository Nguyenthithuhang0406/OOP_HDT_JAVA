public class PartTimeEmployee extends Employee{
    private int hoursPerWeek;

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public PartTimeEmployee(String name, int age, Gender gender, String employerName, String dateHired, int hoursPerWeek) {
        super(name, age, gender, employerName, dateHired);
        this.hoursPerWeek = hoursPerWeek;
    }

    public PartTimeEmployee(String employerName, String dateHired, int hoursPerWeek) {
        super(employerName, dateHired);
        this.hoursPerWeek = hoursPerWeek;
    }

    public PartTimeEmployee(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public PartTimeEmployee() {
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" + super.toString() +
                "hoursPerWeek=" + hoursPerWeek +
                '}';
    }
}
