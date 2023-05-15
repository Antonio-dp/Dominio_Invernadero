/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

/**
 *
 * @author tonyd
 */
public class Sensor {

    @BsonId
    private String _id;
    private String zona;
    private String modelo;
    private String identificador;

    public Sensor() {
    }

    public Sensor(String idSensor, String zona, String modelo, String identificador) {
        this._id = idSensor;
        this.zona = zona;
        this.modelo = modelo;
        this.identificador = identificador;
    }

    public Sensor(String zona, String modelo) {
        this.zona = zona;
        this.modelo = modelo;
    }

    public Sensor(String zona, String modelo, String identificador) {
        this.zona = zona;
        this.modelo = modelo;
        this.identificador = identificador;
    }

    public String getId() {
        return _id;
    }

    public void setId(String idSensor) {
        this._id = idSensor;
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

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

}
