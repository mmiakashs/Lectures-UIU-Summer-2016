package com.sa.omelet.thirteenLectureNetworking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by akashs on 7/30/16.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while(true) {
            Socket socket = serverSocket.accept();

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Welcome to my server");
            ClientHandler client = new ClientHandler("client", socket);

            client.start();
        }
    }
}

class ClientHandler extends Thread {

    private String name;
    private Socket socket;

    public ClientHandler(String name, Socket socket) {
        super(name);
        this.name = name;
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            while (true){
                String s = in.readLine();
                if(s.equals("end")){
                    break;
                }
                int n = Integer.parseInt(s);
                if(n%2==0){
                    out.println("You enter an even number");
                }
                else{
                    out.println("You enter an odd number");
                }
            }
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}








