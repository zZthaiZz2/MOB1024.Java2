package Slide1;

public class ImportedProduct extends Product {
    private double importTaxRate; // 0 → 1
    private double shippingFee;   // >= 0

    // Constructor
    public ImportedProduct(String id, String name, double basePrice,
                           double importTaxRate, double shippingFee) {
        super(id, name, basePrice);
        setImportTaxRate(importTaxRate);
        setShippingFee(shippingFee);
    }

    // Setter validate
    public void setImportTaxRate(double importTaxRate) {
        if (importTaxRate < 0 || importTaxRate > 1) {
            System.out.println("Thuế phải từ 0 đến 1!");
        } else {
            this.importTaxRate = importTaxRate;
        }
    }

    public void setShippingFee(double shippingFee) {
        if (shippingFee < 0) {
            System.out.println("Phí vận chuyển >= 0!");
        } else {
            this.shippingFee = shippingFee;
        }
    }

    // Override finalPrice
    @Override
    public double finalPrice() {
        return getBasePrice() 
             + getBasePrice() * importTaxRate 
             + shippingFee;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() +
               ", Tax: " + importTaxRate +
               ", Shipping: " + shippingFee;
    }
}
