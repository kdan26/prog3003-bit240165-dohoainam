/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TemperatureConverter extends Application {

    @Override
    public void start(Stage stage) {

        // TextField nhập độ C
        TextField txtCelsius = new TextField();
        txtCelsius.setPromptText("Nhập nhiệt độ °C");

        // Label hiển thị kết quả
        Label resultLabel = new Label("Kết quả: ");

        // Button chuyển đổi
        Button convertButton = new Button("Chuyển sang °F");

        // Xử lý khi bấm nút
        convertButton.setOnAction(e -> {
            try {
                double c = Double.parseDouble(txtCelsius.getText());
                double f = c * 9 / 5 + 32;
                resultLabel.setText("Kết quả: " + f + " °F");
            } catch (Exception ex) {
                resultLabel.setText("Vui lòng nhập số hợp lệ!");
            }
        });

        // Layout
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(txtCelsius, convertButton, resultLabel);

        // Scene
        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Chuyển đổi nhiệt độ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}