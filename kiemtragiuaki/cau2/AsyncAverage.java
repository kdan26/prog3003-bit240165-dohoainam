/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cau2;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class AsyncAverage {
    public static CompletableFuture<Double> calculateAsync(List<Student> students) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return GpaCalculator.calculateAverageGpa(students);
        });
    }
}
