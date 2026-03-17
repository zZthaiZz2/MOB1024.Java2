package Bài2;

public class Employee {
    private String id;
    private String name;
    private double basicSalary;
    // Constructor đầy đủ
    public Employee(String id, String name, double basicSalary) {
        setId(id);
        this.name = name;
        setBasicSalary(basicSalary);
    }
    // Getter
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getBasicSalary() {
        return basicSalary;
    }
    // Setter có validate
    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            System.out.println("ID không được rỗng!");
        } else {
            this.id = id;
        }
    }
    public void setBasicSalary(double basicSalary) {
        if (basicSalary < 0) {
            System.out.println("Lương >= 0!");
        } else {
            this.basicSalary = basicSalary;
        }
    }
    // Thu nhập mặc định
    public double income() {
        return basicSalary;
    }
    // toString
    @Override
    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Basic Salary: " + basicSalary;
    }
}