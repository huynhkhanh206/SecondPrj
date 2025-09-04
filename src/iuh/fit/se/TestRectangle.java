package iuh.fit.se;

import java.util.Scanner;

/**
 * @description Lớp kiểm thử tạo Rectangle, nhập từ bàn phím và in kết quả
 * @author Huỳnh Võ Ngọc Khánh
 * @version 1.0
 * @created 30-Aug-2024 1:35:50 PM
 */

public class TestRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double length = sc.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double width = sc.nextDouble();
        
        Rectangle r = new Rectangle(length, width);

        System.out.println("Diện tích = " + r.getArea());
        System.out.println("Chu vi = " + r.getPerimeter());
        System.out.println("Đối tượng: " + r);

        sc.close();
    }
}
