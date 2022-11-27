/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Victor
 */
public class Programador {
    private String nombreProgramador;
    private String tipoProgramador;
    private Union unionProgramadorSueldo[];

    public String getNombreProgramador() {
        return this.nombreProgramador;
    }

    public void setNombreProgramador(String nombreProgramador) {
        this.nombreProgramador = nombreProgramador;
    }

    public String getTipoProgramador() {
        return this.tipoProgramador;
    }

    public void setTipoProgramador(String tipoProgramador) {
        this.tipoProgramador = tipoProgramador;
    }

    public Union[] getUnionProgramadorSueldo() {
        return this.unionProgramadorSueldo;
    }

    public void setUnionProgramadorSueldo(Union[] unionProgramadorSueldo) {
        this.unionProgramadorSueldo = unionProgramadorSueldo;
    }

    @Override
    public String toString() {
        return nombreProgramador + "" + tipoProgramador + "" + "" + unionProgramadorSueldo;
    }
    
}
