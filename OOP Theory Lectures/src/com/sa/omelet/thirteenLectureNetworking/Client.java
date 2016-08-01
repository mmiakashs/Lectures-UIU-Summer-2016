package com.sa.omelet.thirteenLectureNetworking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by akashs on 7/30/16.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("127.0.1.1",8080);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream())
        );
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        String s = in.readLine();
        System.out.println(s);

        Scanner sc = new Scanner(System.in);
        while(true){
            String n = sc.next();
            out.println(n);
            String res = in.readLine();
            System.out.println(res);
        }
    }
}















