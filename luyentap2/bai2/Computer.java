/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ee;

class Computer {

    private String HDD;
    private String RAM;

    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public void showInfo() {
        System.out.println("HDD: " + HDD);
        System.out.println("RAM: " + RAM);
        System.out.println("Bluetooth: " + isBluetoothEnabled);
        System.out.println("--------------------");
    }

    public static class ComputerBuilder {

        private String HDD;
        private String RAM;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setBluetoothEnabled(boolean value) {
            this.isBluetoothEnabled = value;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
