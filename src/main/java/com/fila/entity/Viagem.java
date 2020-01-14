/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fila.entity;

/**
 *
 * @author Luidi Matheus
 */
public class Viagem {
    public String nomeCondutor;
    public String placa;
    public String transportadora;
    public String status;
    
    public Viagem(String nomeCondutor, String placa, String transportadora, String status){
        this.nomeCondutor = nomeCondutor;
        this.placa = placa;
        this.status = status;
        this.transportadora = transportadora;
    }

    public String getNomeCondutor() {
        return nomeCondutor;
    }

    public void setNomeCondutor(String nomeCondutor) {
        this.nomeCondutor = nomeCondutor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(String transportadora) {
        this.transportadora = transportadora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
