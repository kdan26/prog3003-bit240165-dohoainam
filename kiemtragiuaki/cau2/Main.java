/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cau2;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        StudentManager<Student> manager = new StudentManager<>();

        manager.add(new Student("SV001", "Nguyen Van A", 3.2));
        manager.add(new Student("SV002", "Tran Thi B", 3.8));
        manager.add(new Student("SV003", "Le Van C", 2.9));


        CompletableFuture<Double> futureAverage = AsyncAverage.calculateAsync(manager.getAll());


        futureAverage.thenAccept(avg -> 
            System.out.println("Điểm trung bình GPA của hệ thống là: " + avg)
        ).get(); 
    }
}
