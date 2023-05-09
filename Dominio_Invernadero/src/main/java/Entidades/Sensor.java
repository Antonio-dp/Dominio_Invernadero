/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;
import org.bson.types.ObjectId;
/**
 *
 * @author tonyd
 */
public class Sensor {
    private ObjectId idSensor;
    private String zona;
    private String modelo;

    public Sensor() {
    }

    public Sensor(ObjectId idSensor, String zona, String modelo) {
        this.idSensor = idSensor;
        this.zona = zona;
        this.modelo = modelo;
    }

    public Sensor(String zona, String modelo) {
        this.zona = zona;
        this.modelo = modelo;
    }

    public ObjectId getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(ObjectId idSensor) {
        this.idSensor = idSensor;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
