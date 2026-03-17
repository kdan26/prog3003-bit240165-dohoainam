/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject9;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SumCalculator extends Application {

    @Override
    public void start(Stage stage) {

        // Label
        Label lbl1 = new Label("Số thứ nhất:");
        Label lbl2 = new Label("Số thứ hai:");
        Label lblResult = new Label("Kết quả");

        // TextField
        TextField txt1 = new TextField();
        TextField txt2 = new TextField();

        // Button
        Button btnSum = new Button("Tính tổng");

        // Event khi bấm nút
        btnSum.setOnAction(e -> {
            try {
                double a = Double.parseDouble(txt1.getText());
                double b = Double.parseDouble(txt2.getText());

                double sum = a + b;
                lblResult.setText("Kết quả: " + sum);

            } catch (Exception ex) {
                lblResult.setText("Lỗi!");
            }
        });

        // GridPane
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(lbl1, 0, 0);
        grid.add(txt1, 1, 0);

        grid.add(lbl2, 0, 1);
        grid.add(txt2, 1, 1);

        grid.add(btnSum, 1, 2);

        grid.add(lblResult, 1, 3);

        Scene scene = new Scene(grid, 300, 200);

        stage.setTitle("Máy tính cộng");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
