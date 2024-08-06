package com.codegym.variable_constant;

public class Variable {

    public static void main(String[] args) {
        // Khai báo biến trong Java yêu cầu:
        // 1. Xác định kiểu dữ liệu cụ thể của biến được tạo ra
        // 2. Tên phải có ý nghĩa cho việc nó làm (meaningful name)
        // 3. Có thể khởi tạo giá trị cho biến tại lúc khai báo hoặc gán trị sau đó đều được
        // 4. Tên phải được viết theo quy tắc camelCase để đặt tên
        int maxSpeedInCity = 40;
        System.out.println(maxSpeedInCity);

        maxSpeedInCity = 60;
        System.out.println(maxSpeedInCity);
    }
}
