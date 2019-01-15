package ch.tbz.DateServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.util.Date;

public class DateServer {
    public static void main(String[] args) throws IOException {
    	// Creates a new Socket
        try (var listener = new ServerSocket(9090)) {
            System.out.println("The Date Server is running");
            while (true) {
                try (var socket = listener.accept()) {
                    var out = new PrintWriter(socket.getOutputStream(), true);
                    out.println(new Date().toString());
                }
            }
        }
    }
}