/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author Vastem
 */
public class Registro {
    private ObjectId _id;
    private float humedad;
    private float temperatura;
    private Date fecha;
    private Sensor sensor;

    public Registro() {
    }

    public Registro(ObjectId idRegistro, float humedad, float temperatura, Date fecha, Sensor sensor) {
        this._id = idRegistro;
        this.humedad = humedad;
        this.temperatura = temperatura;
        this.fecha = fecha;
        this.sensor = sensor;
    }

    public Registro(float humedad, float temperatura, Date fecha, Sensor sensor) {
        this.humedad = humedad;
        this.temperatura = temperatura;
        this.fecha = fecha;
        this.sensor = sensor;
    }
    

    public Registro(ObjectId _id) {
        this._id = _id;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }
    
    public float getHumedad() {
        return humedad;
    }

    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
    
}
