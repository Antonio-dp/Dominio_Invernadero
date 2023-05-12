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
    private ObjectId _id;
    private String tipo;
    private float limite;
    private Sensor sensor;

    public Alarma() {
    }

    public Alarma(ObjectId idAlarma, String tipo, float limite, Sensor sensor) {
        this._id = idAlarma;
        this.tipo = tipo;
        this.limite = limite;
        this.sensor = sensor;
    }
    
    public Alarma(String tipo, float limite, Sensor sensor) {
        this.tipo = tipo;
        this.limite = limite;
        this.sensor = sensor;
    }

    public Alarma(ObjectId idAlarma) {
        this._id = idAlarma;
    }
    
    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId idAlarma) {
        this._id = idAlarma;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
    
}
