/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.droneserver.droneclient;

import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Zac
 */
public class DroneClient {
    
    
    
    public static void main(String args[]) {

        Socket s = null;
        String hostName = "localhost";
        String message = "Hello and welcome";

        try {
            int serverPort = 4444;

            s = new Socket(hostName, serverPort);

        } catch (UnknownHostException e) {
            System.out.println("Sock:" + e.getMessage());
        } catch (EOFException e) {
            System.out.println("EOF:" + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO:" + e.getMessage());
        } finally {
            if (s != null)
	     try {
                s.close();
            } catch (IOException e) {
                System.out.println("close:" + e.getMessage());
            }
        }
    }
    //print following to command line
    private void registerDrone(){
        //ask user to enter drone info
        //ask for drone name
        //ask for drone id
        //connect to server
        //ask for position of drone
    }
    private void droneMessage(){
        //drone sends location every 10 seconds
        //send acknowledgement back
    }
    private void fireDetect(){
        //if drone detects fire report position to server
        //report fire position
    }
    private void recallMessage(){
        //recall message to drones
        //return message that drone is shutting down and returning to base
    }
}
