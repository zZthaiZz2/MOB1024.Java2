package Bài2;

public class PartTimeEmployee extends Employee {
    private double workingHours; // >=0
    private double hourlyRate;   // >=0
    // Constructor
    public PartTimeEmployee(String id, String name,
                            double workingHours, double hourlyRate) {
        super(id, name, 0); // part-time không dùng basicSalary
        setWorkingHours(workingHours);
        setHourlyRate(hourlyRate);
    }
    // Setter validate
    public void setWorkingHours(double workingHours) {
        if (workingHours < 0) {
            System.out.println("Giờ làm >= 0!");
        } else {
            this.workingHours = workingHours;
        }
    }
    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            System.out.println("Lương giờ >= 0!");
        } else {
            this.hourlyRate = hourlyRate;
        }
    }
    // Override income
    @Override
    public double income() {
        return workingHours * hourlyRate;
    }
    // toString
    @Override
    public String toString() {
        return super.toString() +
               ", Hours: " + workingHours +
               ", Rate: " + hourlyRate;
    }
}