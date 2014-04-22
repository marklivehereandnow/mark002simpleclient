/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleclient;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author mark
 */
public class SimpleClient {

    static Socket socket;
    static DataInputStream in;

    public static void main(String[] args) throws IOException {
        System.out.println("connecting...");
        socket=new Socket("localhost", 7777);
        System.out.println("connectted successfully");
        in=new DataInputStream(socket.getInputStream());
        System.out.println("receiving message...");
        String str=in.readUTF();
        System.out.println("message from server: "+str);
        
    }

}
