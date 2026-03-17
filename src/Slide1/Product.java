package Slide1;

public class Product {
    private String id;
    private String name;
    private double basePrice;
    // Constructor đầy đủ
    public Product(String id, String name, double basePrice) {
        setId(id);
        this.name = name;
        setBasePrice(basePrice);
    }
    // Getter
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getBasePrice() {
        return basePrice;
    }
    // Setter có validate
    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            System.out.println("ID không được rỗng!");
        } else {
            this.id = id;
        }
    }
    public void setBasePrice(double basePrice) {
        if (basePrice < 0) {
            System.out.println("Giá không được âm!");
        } else {
            this.basePrice = basePrice;
        }
    }
    // Method tính giá cuối
    public double finalPrice() {
        return basePrice;
    }
    // toString
    @Override
    public String toString() {
        return "ID: " + id + 
               ", Name: " + name + 
               ", Base Price: " + basePrice;
    }
}
