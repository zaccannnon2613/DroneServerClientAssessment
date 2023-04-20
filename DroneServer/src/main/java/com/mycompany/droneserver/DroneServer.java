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
        frmDroneFire.setBounds(150, 150, 650, 600);
        frmDroneFire.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmDroneFire.getContentPane().setLayout(null);
        
        lblHeader = new JLabel();
        lblHeader.setFont(new Font("Comic Sans MS",Font.BOLD, 32));
        lblHeader.setBounds(200, 25, 650, 70);
        lblHeader.setText("Drone Map of Area");
        frmDroneFire.getContentPane().add(lblHeader);
        
        btnLoadData = new JButton();
        btnLoadData.setFont(new Font("Comic Sans MS",Font.BOLD, 16));
        btnLoadData.setForeground(Color.white);
        btnLoadData.setBackground(Color.gray);
        btnLoadData.setBounds(25, 75, 160, 40);
        btnLoadData.setText("Load Data");
        frmDroneFire.getContentPane().add(btnLoadData);
        
        btnDisplayMap = new JButton();
        btnDisplayMap.setFont(new Font("Comic Sans MS",Font.BOLD, 16));
        btnDisplayMap.setForeground(Color.white);
        btnDisplayMap.setBackground(Color.gray);
        btnDisplayMap.setBounds(25, 125, 160, 40);
        btnDisplayMap.setText("Display Map");
        frmDroneFire.getContentPane().add(btnDisplayMap);
        
        btnInstructDrone = new JButton();
        btnInstructDrone.setFont(new Font("Comic Sans MS",Font.BOLD, 16));
        btnInstructDrone.setForeground(Color.white);
        btnInstructDrone.setBackground(Color.gray);
        btnInstructDrone.setBounds(25, 175, 160, 40);
        btnInstructDrone.setText("Instruct Drone");
        frmDroneFire.getContentPane().add(btnInstructDrone);
        
        btnReceiveDroneDetails = new JButton();
        btnReceiveDroneDetails.setFont(new Font("Comic Sans MS",Font.BOLD, 16));
        btnReceiveDroneDetails.setForeground(Color.white);
        btnReceiveDroneDetails.setBackground(Color.gray);
        btnReceiveDroneDetails.setBounds(25, 225, 160, 40);
        btnReceiveDroneDetails.setText("Receive Drone Details");
        frmDroneFire.getContentPane().add(btnReceiveDroneDetails);
        
        btnSaveDrone = new JButton();
        btnSaveDrone.setFont(new Font("Comic Sans MS",Font.BOLD, 16));
        btnSaveDrone.setForeground(Color.white);
        btnSaveDrone.setBackground(Color.gray);
        btnSaveDrone.setBounds(25, 275, 160, 40);
        btnSaveDrone.setText("Save Drone");
        frmDroneFire.getContentPane().add(btnSaveDrone);
        
        btnDisplayDrone = new JButton();
        btnDisplayDrone.setFont(new Font("Comic Sans MS",Font.BOLD, 16));
        btnDisplayDrone.setForeground(Color.white);
        btnDisplayDrone.setBackground(Color.gray);
        btnDisplayDrone.setBounds(25, 325, 160, 40);
        btnDisplayDrone.setText("Display Drone");
        frmDroneFire.getContentPane().add(btnDisplayDrone);
        
        btnDeleteFire = new JButton();
        btnDeleteFire.setFont(new Font("Comic Sans MS",Font.BOLD, 16));
        btnDeleteFire.setForeground(Color.white);
        btnDeleteFire.setBackground(Color.gray);
        btnDeleteFire.setBounds(25, 375, 160, 40);
        btnDeleteFire.setText("Delete Fire");
        frmDroneFire.getContentPane().add(btnDeleteFire);
        
        btnRecallDrone = new JButton();
        btnRecallDrone.setFont(new Font("Comic Sans MS",Font.BOLD, 16));
        btnRecallDrone.setForeground(Color.white);
        btnRecallDrone.setBackground(Color.gray);
        btnRecallDrone.setBounds(25, 425, 160, 40);
        btnRecallDrone.setText("Recall Drone");
        frmDroneFire.getContentPane().add(btnRecallDrone);
        
        btnMoveDrone = new JButton();
        btnMoveDrone.setFont(new Font("Comic Sans MS",Font.BOLD, 16));
        btnMoveDrone.setForeground(Color.white);
        btnMoveDrone.setBackground(Color.gray);
        btnMoveDrone.setBounds(25, 475, 160, 40);
        btnMoveDrone.setText("Move Drone");
        frmDroneFire.getContentPane().add(btnMoveDrone);
        
        btnShutDown = new JButton();
        btnShutDown.setFont(new Font("Comic Sans MS",Font.BOLD, 16));
        btnShutDown.setForeground(Color.white);
        btnShutDown.setBackground(Color.gray);
        btnShutDown.setBounds(25, 525, 160, 40);
        btnShutDown.setText("Shut Down");
        frmDroneFire.getContentPane().add(btnShutDown);

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
