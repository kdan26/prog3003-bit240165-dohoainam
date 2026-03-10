/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gh;

import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {

        CompletableFuture<String> xacThuc = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Đang xác thực khách hàng...");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Xác thực khách hàng hoàn thành!");
            return "Khách hàng hợp lệ";
        });

        CompletableFuture<String> xuatVe = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Đang xuất vé xem phim...");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Xuất vé hoàn thành!");
            return "Vé đã được xuất";
        });

        CompletableFuture<String> ketQua = xacThuc.thenCombine(
                xuatVe,
                (kq1, kq2) -> kq1 + " | " + kq2
        );

        ketQua.thenAccept(result -> {
            System.out.println("Hệ thống hoàn thành: " + result);
        });

        ketQua.join();
    }
}