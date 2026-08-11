package com.astrea.core.base;

import com.astrea.core.exceptions.AstreaException;
import com.astrea.core.exceptions.CombustibleInsuficienteException;

public abstract class NaveEspacial {
    protected String matricula;
    protected String modelo;
    protected double combustible;
    protected double capacidadCombustible;

    public NaveEspacial(String matricula, String modelo, double combustibleInicial, double capacidadCombustible) throws AstreaException {
        // TODO: Implementar validaciones y asignación
    }

    public void repostarCombustible(double cantidad) throws AstreaException {
        return cantidad;// TODO: Implementar lógica
    }

    public String getMatricula() {
        return matricula; // TODO: Implementar
    }

    public String getModelo() {
        return modelo; // TODO: Implementar
    }

    public double getCombustible() {
        return combustible; // TODO: Implementar
    }

    public double getCapacidadCombustible() {
        return capacidadCombustible; // TODO: Implementar
    }

    public abstract void viajar(double distanciaAniosLuz) throws CombustibleInsuficienteException, AstreaException;
}
