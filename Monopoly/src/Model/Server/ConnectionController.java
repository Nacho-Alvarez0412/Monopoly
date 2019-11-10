/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nacho
 */
public class ConnectionController extends Thread {
    Server server;
    int maxUsers;
    
    public ConnectionController(Server server,int maxUsers){
        this.server = server;
        this.maxUsers = maxUsers;
    }
    
    @Override
    public void run(){
        int cont = 1;
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            
            while (cont<=maxUsers) {
                Socket socket = serverSocket.accept();
                
                ClientListener listener = new ClientListener(socket,server,cont);
                server.addClient(listener);
                listener.start();
                server.view.ServerLogTextArea.append("\nClient "+cont+" joined succesfully");
                cont++;
            }
            
            server.view.ServerLogTextArea.append("\nParty full ready to start game!");
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
