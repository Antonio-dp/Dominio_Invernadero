/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Calendar;
import org.bson.types.ObjectId;

/**
 *
 * @author Vastem
 */
public class Registro {
    private ObjectId _id;
    private String humedad;
    private String temperatura;
    private Calendar fecha;
    private Sensor sensor;

    public Registro() {
    }

    public Registro(ObjectId idRegistro, String humedad, String temperatura, Calendar fecha, Sensor sensor) {
        this._id = idRegistro;
        this.humedad = humedad;
        this.temperatura = temperatura;
        this.fecha = fecha;
        this.sensor = sensor;
    }

    public Registro(ObjectId _id) {
        this._id = _id;
    }

    

    public ObjectId getIdRegistro() {
        return _id;
    }

    public void setIdRegistro(ObjectId _id) {
        this._id = _id;
    }

    
    
    public String getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
    
    
    
}
