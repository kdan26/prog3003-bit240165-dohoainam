/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject8;

public class Main {

    public static void main(String[] args) {

        // chạy Thread
        WorkerThread thread = new WorkerThread();
        thread.start();

        // chạy Runnable
        WorkerRunnable runnable = new WorkerRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();

    }

}