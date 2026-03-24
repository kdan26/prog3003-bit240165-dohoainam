package com.example.chat;

import org.glassfish.tyrus.server.Server;
import java.util.Scanner;

public class ChatServerLauncher {

    public static void main(String[] args) {
        // Khởi tạo Server với endpoint của chúng ta
        Server server = new Server(
            "localhost",           // host
            8080,                  // port
            "/ws",                 // context path
            null,                  // không dùng static content
            ChatServer.class       // endpoint class
        );

        try {
            server.start();
            System.out.println("==================================================");
            System.out.println("   WebSocket Chat Server ĐANG CHẠY");
            System.out.println("   URL: ws://localhost:8080/ws/chat");
            System.out.println("   Nhấn ENTER để dừng server...");
            System.out.println("==================================================");

            new Scanner(System.in).nextLine();   // chờ người dùng nhấn Enter

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            server.stop();
            System.out.println("Server đã dừng.");
        }
    }
}