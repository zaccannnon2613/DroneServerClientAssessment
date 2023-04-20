/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.droneserver;

import java.awt.Color;
import java.awt.Font;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

/**
 *
 * @author Zac
 */
public class DroneServer {

    private JFrame frmDroneFire;
    private JButton btnLoadData;
    private JButton btnDisplayMap;
    private JButton btnInstructDrone;
    private JButton btnReceiveDroneDetails;
    private JButton btnSaveDrone;
    private JButton btnDisplayDrone;
    private JButton btnDeleteFire;
    private JButton btnRecallDrone;
    private JButton btnMoveDrone;
    private JButton btnShutDown;
//    private JPanel pnlMap;
    private static JLabel lblHeader;

    public static void main(String[] args) {
        try {
            DroneServer dServer = new DroneServer();
            dServer.frmDroneFire.setVisible(true);

            int serverPort = 4444;
            ServerSocket listenSocket = new ServerSocket(serverPort);
            while (true) {
                Socket clientSocket = listenSocket.accept();
                Connection c = new Connection(clientSocket);
                System.out.printf("\nServer waiting on: %d for client from %d ",
                        listenSocket.getLocalPort(), clientSocket.getPort());
            }
        } catch (IOException e) {
            System.out.println("Listen :" + e.getMessage());
        }

    }

    public DroneServer() throws IOException {
        makeGui();
    }

    private void makeGui() throws IOException {
        frmDroneFire = new JFrame();
        frmDroneFire.getContentPane().setBackground(UIManager.getColor("Menubar.highlight"));
        frmDroneFire.setForeground(Color.white);
        frmDroneFire.setBackground(Color.white);
        frmDroneFire.setTitle("Drone and Fire map");
        frmDroneFire.getContentPane().setForeground(Color.white);
        frmDroneFire.setBounds(150, 150, 650, 450);
        frmDroneFire.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmDroneFire.getContentPane().setLayout(null);
        
        lblHeader = new JLabel();
        lblHeader.setFont(new Font("Comic Sans MS",Font.BOLD, 24));
        lblHeader.setBounds(75, 25, 70, 70);
        
        btnLoadData = new JButton();
        
        btnDisplayMap = new JButton();
        
        btnInstructDrone = new JButton();
        
        btnReceiveDroneDetails = new JButton();
        
        btnSaveDrone = new JButton();
        
        btnDisplayDrone = new JButton();
        
        btnDeleteFire = new JButton();
        
        btnRecallDrone = new JButton();
        
        btnMoveDrone = new JButton();
        
        btnShutDown = new JButton();

    }
}

class Connection extends Thread {

    DataInputStream in;
    DataOutputStream out;
    Socket clientSocket;

    public Connection(Socket aClientSocket) {
        try {
            clientSocket = aClientSocket;
            in = new DataInputStream(
                    clientSocket.getInputStream());
            out = new DataOutputStream(
                    clientSocket.getOutputStream());
            this.start();
        } catch (IOException e) {
            System.out.println("Connection:" + e.getMessage());
        }
    }

    public void run() {

    }

}
