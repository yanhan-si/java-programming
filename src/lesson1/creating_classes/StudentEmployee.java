package lesson1.creating_classes;

public class StudentEmployee extends Student{
    private String employeeId;
    private double rateOfPayPerHour;

    public StudentEmployee (String firstname, String lastname,
                            String studentid, String employeeId,
                            double rateOfPayPerHour) {
        super(firstname, lastname, studentid);
        this.employeeId =employeeId;
        this.rateOfPayPerHour = rateOfPayPerHour;
    }

    public double getRateOfPayPerHour() {
        return rateOfPayPerHour;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setRateOfPayPerHour(double rateOfPayPerHour) {
        this.rateOfPayPerHour = rateOfPayPerHour;
    }

    @Override
    public String toString() {
        return super.toString() + " employee ID " + employeeId + " pay " + rateOfPayPerHour;
    }
}
