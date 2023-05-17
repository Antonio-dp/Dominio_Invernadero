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
public class Alarma {
    private ObjectId _id;
    private String tipo;
    private float limiteInferior;
    private float limiteSuperior;

    public Alarma() {
    }

    public Alarma(ObjectId idAlarma, String tipo, float limiteInferior, float limiteSuperior) {
        this._id = idAlarma;
        this.tipo = tipo;
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }

    public Alarma(String tipo, float limiteInferior, float limiteSuperior) {
        this.tipo = tipo;
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
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

    public float getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(float limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public float getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(float limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }
    
}
