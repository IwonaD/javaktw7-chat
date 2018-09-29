package pl.sdacademy.javaktw7.chat.server;

import com.sun.scenario.effect.impl.sw.sse.SSEDisplacementMapPeer;

import java.io.IOException;

public class ServerMain {
    public static void main(String[] args) {
        try {
            Runnable server = new ServerSocketDispatcher();
            Thread serverThread = new Thread(server);
            System.out.println("server created");
            serverThread.start();
            System.out.println("server started");
            serverThread.join();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
