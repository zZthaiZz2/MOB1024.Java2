package Slide1;

import java.util.ArrayList;

public class MainProduct {
    public static void main(String[] args) {

        ArrayList<Product> list = new ArrayList<>();

        // Tạo 5 sản phẩm (>=2 imported)
        list.add(new Product("P01", "Laptop", 1000));
        list.add(new Product("P02", "Phone", 500));
        list.add(new Product("P03", "Tablet", 300));

        list.add(new ImportedProduct("P04", "Camera", 800, 0.1, 50));
        list.add(new ImportedProduct("P05", "Watch", 200, 0.2, 30));

        // In danh sách + giá cuối
        System.out.println("=== DANH SÁCH SẢN PHẨM ===");
        for (Product p : list) {
            System.out.println(p);
            System.out.println("Final Price: " + p.finalPrice());
            System.out.println("----------------------");
        }

        // Tìm sản phẩm có giá cao nhất
        Product maxProduct = list.get(0);

        for (Product p : list) {
            if (p.finalPrice() > maxProduct.finalPrice()) {
                maxProduct = p;
            }
        }

        // In kết quả
        System.out.println("=== SẢN PHẨM GIÁ CAO NHẤT ===");
        System.out.println(maxProduct);
        System.out.println("Final Price: " + maxProduct.finalPrice());
    }
}
