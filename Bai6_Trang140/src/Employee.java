public abstract class Employee extends  Person {
    private String employerName;
    private String dateHired;

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public Employee(String name, int age, Gender gender, String employerName, String dateHired) {
        super(name, age, gender);
        this.employerName = employerName;
        this.dateHired = dateHired;
    }

    public Employee(String employerName, String dateHired) {
        this.employerName = employerName;
        this.dateHired = dateHired;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "employerName='" + employerName + '\'' +
                ", dateHired='" + dateHired + '\'' +
                '}';
    }
}
