/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luyentap2;

import java.util.TreeSet;

public class bai1 {
    public static void main(String[] args) {
        
        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");

        System.out.println("Danh sách sau khi sắp xếp:");
        System.out.println(names);
        
        String first = names.first();
        String last = names.last();

        System.out.println("Phần tử nhỏ nhất: " + first);
        System.out.println("Phần tử lớn nhất: " + last);
    }
}