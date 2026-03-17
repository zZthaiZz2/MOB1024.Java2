package Bài2;

public class FullTimeEmployee extends Employee {
    private double bonus;   // >=0
    private double penalty; // >=0
    // Constructor
    public FullTimeEmployee(String id, String name, double basicSalary,
                            double bonus, double penalty) {
        super(id, name, basicSalary);
        setBonus(bonus);
        setPenalty(penalty);
    }
    // Setter validate
    public void setBonus(double bonus) {
        if (bonus < 0) {
            System.out.println("Bonus >= 0!");
        } else {
            this.bonus = bonus;
        }
    }
    public void setPenalty(double penalty) {
        if (penalty < 0) {
            System.out.println("Penalty >= 0!");
        } else {
            this.penalty = penalty;
        }
    }
    // Override income
    @Override
    public double income() {
        return getBasicSalary() + bonus - penalty;
    }
    // toString
    @Override
    public String toString() {
        return super.toString() +
               ", Bonus: " + bonus +
               ", Penalty: " + penalty;
    }
}