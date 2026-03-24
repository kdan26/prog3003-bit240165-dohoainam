/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject10;

public class Main {
    public static void main(String[] args) {

        // Phép cộng
        MathOperation add = (a, b) -> a + b;

        // Phép trừ
        MathOperation subtract = (a, b) -> a - b;

        // Phép nhân
        MathOperation multiply = (a, b) -> a * b;

        // Phép chia (chú ý chia cho 0)
        MathOperation divide = (a, b) -> {
            if (b == 0) {
                System.out.println("Không thể chia cho 0!");
                return 0;
            }
            return a / b;
        };

        // Test
        int a = 10;
        int b = 5;

        System.out.println("Cộng: " + add.compute(a, b));
        System.out.println("Trừ: " + subtract.compute(a, b));
        System.out.println("Nhân: " + multiply.compute(a, b));
        System.out.println("Chia: " + divide.compute(a, b));
    }
}
