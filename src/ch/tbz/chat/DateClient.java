package ch.tbz.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class DateClient {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the IP address of a machine running the date server:");
        var serverAddress = new Scanner(System.in).nextLine();
        var socket = new Socket(serverAddress, 9090);
        var in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        var response = in.readLine();
        System.out.println("Server response: " + response);
    }
}