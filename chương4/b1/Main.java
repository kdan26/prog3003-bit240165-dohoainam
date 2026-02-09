/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kkkkk;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {

        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        System.out.println("Cộng: " + add.compute(10, 5));
        System.out.println("Trừ: " + subtract.compute(10, 5));
        System.out.println("Nhân: " + multiply.compute(10, 5));
        System.out.println("Chia: " + divide.compute(10, 5));
    }
}

