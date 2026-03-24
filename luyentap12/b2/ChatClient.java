package com.example.chat;

import jakarta.websocket.*;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.net.URI;

@ClientEndpoint
public class ChatClient extends Application {

    private Session session;
    private TextArea chatArea;
    private TextField inputField;
    private String username = "User" + (int)(Math.random()*1000);

    @Override
    public void start(Stage stage) {
        stage.setTitle("JavaFX WebSocket Chat - " + username);

        chatArea = new TextArea();
        chatArea.setEditable(false);
        chatArea.setPrefHeight(400);

        inputField = new TextField();
        inputField.setPromptText("Nhập tin nhắn...");
        Button sendBtn = new Button("Gửi");

        sendBtn.setOnAction(e -> sendMessage());
        inputField.setOnAction(e -> sendMessage());

        VBox root = new VBox(10, chatArea, new HBox(10, inputField, sendBtn));
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 600, 500);
        stage.setScene(scene);
        stage.show();

        connectToServer();
    }

    private void connectToServer() {
        try {
            WebSocketContainer container = ContainerProvider.getWebSocketContainer();
            container.connectToServer(this, new URI("ws://localhost:8080/ws/chat"));
            appendMessage("Hệ thống: Đã kết nối đến server!");
        } catch (Exception e) {
            appendMessage("Lỗi kết nối: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
        Platform.runLater(() -> appendMessage("Hệ thống: Kết nối thành công!"));
    }

    @OnMessage
    public void onMessage(String message) {
        Platform.runLater(() -> appendMessage(message));
    }

    @OnClose
    public void onClose() {
        Platform.runLater(() -> appendMessage("Hệ thống: Mất kết nối với server."));
    }

    private void sendMessage() {
        String text = inputField.getText().trim();
        if (text.isEmpty() || session == null) return;

        String fullMessage = username + ": " + text;
        try {
            session.getBasicRemote().sendText(fullMessage);
            inputField.clear();
        } catch (Exception e) {
            appendMessage("Lỗi gửi tin nhắn: " + e.getMessage());
        }
    }

    private void appendMessage(String msg) {
        chatArea.appendText(msg + "\n");
    }

    public static void main(String[] args) {
        launch(args);
    }
}