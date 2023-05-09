/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;
import java.util.Date;
import org.bson.types.ObjectId;
/**
 *
 * @author tonyd
 */
public class Alarma {
    private ObjectId idAlarma;
    private Date fechaProgramada;
    private Sensor sensor;

    public Alarma() {
    }

    public Alarma(ObjectId idAlarma, Date fechaProgramada, Sensor sensor) {
        this.idAlarma = idAlarma;
        this.fechaProgramada = fechaProgramada;
        this.sensor = sensor;
    }

    public Alarma(Date fechaProgramada, Sensor sensor) {
        this.fechaProgramada = fechaProgramada;
        this.sensor = sensor;
    }

    public ObjectId getIdAlarma() {
        return idAlarma;
    }

    public void setIdAlarma(ObjectId idAlarma) {
        this.idAlarma = idAlarma;
    }

    public Date getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(Date fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
    
    
    
}
