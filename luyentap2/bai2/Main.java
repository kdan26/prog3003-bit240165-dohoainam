/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ee;

public class Main {
    public static void main(String[] args) {

        // Máy tính có Bluetooth
        Computer computer1 = new Computer.ComputerBuilder("1TB", "16GB")
                .setBluetoothEnabled(true)
                .build();

        // Máy tính không có Bluetooth
        Computer computer2 = new Computer.ComputerBuilder("500GB", "8GB")
                .setBluetoothEnabled(false)
                .build();

        computer1.showInfo();
        computer2.showInfo();
    }
}