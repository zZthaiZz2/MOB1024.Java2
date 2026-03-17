package Bài2;

import java.util.*;

public class MainEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        // Tạo >=5 nhân viên (>=2 fulltime, >=2 parttime)
        list.add(new Employee("E01", "An", 5000));
        list.add(new FullTimeEmployee("E02", "Binh", 6000, 1000, 200));
        list.add(new FullTimeEmployee("E03", "Cuong", 5500, 800, 100));
        list.add(new PartTimeEmployee("E04", "Dung", 100, 20));
        list.add(new PartTimeEmployee("E05", "Hanh", 120, 25));
        // In danh sách + thu nhập
        System.out.println("=== DANH SÁCH NHÂN VIÊN ===");
        for (Employee e : list) {
            System.out.println(e);
            System.out.println("Income: " + e.income());
            System.out.println("----------------------");
        }
        // Tìm nhân viên thu nhập cao nhất
        Employee maxEmp = list.get(0);

        for (Employee e : list) {
            if (e.income() > maxEmp.income()) {
                maxEmp = e;
            }
        }
        // In kết quả
        System.out.println("=== NHÂN VIÊN THU NHẬP CAO NHẤT ===");
        System.out.println(maxEmp);
        System.out.println("Income: " + maxEmp.income());
    }
}
