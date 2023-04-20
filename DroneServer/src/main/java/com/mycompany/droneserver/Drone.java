/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.droneserver;

import java.io.Serializable;

/**
 *
 * @author Zac
 */
public class Drone implements Serializable{
     private String droneName;
    private int droneID;
    private int positionX;
    private int positionY;

    public Drone(String droneName, int droneID, int positionX, int positionY) {
        this.droneName = droneName;
        this.droneID = droneID;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public String getDroneName() {
        return droneName;
    }

    public void setDroneName(String droneName) {
        this.droneName = droneName;
    }

    public int getDroneID() {
        return droneID;
    }

    public void setDroneID(int droneID) {
        this.droneID = droneID;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    @Override
    public String toString() {
        return "Drone{" + "droneName=" + droneName + ", droneID=" + droneID +
                ", positionX=" + positionX + ", positionY=" + positionY + '}';
    }
}
