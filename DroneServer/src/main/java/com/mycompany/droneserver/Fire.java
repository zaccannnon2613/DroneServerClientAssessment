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
public class Fire implements Serializable{
    private int fireID;
    private int positionX;
    private int positionY;
    private int reportingDroneID;
    private int fireSeverity;

    public Fire(int fireID, int positionX, int positionY, int reportingDroneID, int fireSeverity) {
        this.fireID = fireID;
        this.positionX = positionX;
        this.positionY = positionY;
        this.reportingDroneID = reportingDroneID;
        this.fireSeverity = fireSeverity;
    }

    public int getFireID() {
        return fireID;
    }

    public void setFireID(int fireID) {
        this.fireID = fireID;
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

    public int getReportingDroneID() {
        return reportingDroneID;
    }

    public void setReportingDroneID(int reportingDroneID) {
        this.reportingDroneID = reportingDroneID;
    }

    public int getFireSeverity() {
        return fireSeverity;
    }

    public void setFireSeverity(int fireSeverity) {
        this.fireSeverity = fireSeverity;
    }

    @Override
    public String toString() {
        return "Fire{" + "fireID=" + fireID + ", positionX=" + positionX +
                ", positionY=" + positionY + ", reportingDroneID=" + 
                reportingDroneID + ", fireSeverity=" + fireSeverity + '}';
    }
}
