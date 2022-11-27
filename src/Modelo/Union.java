/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class Union {
    private int Numero;
    private comboTipoProgramador comboTipoProgramador;
    private String ComboProgramador;
    private String porcentajeBonificacion;
    private String anoTrabajo;
    private String SueldoBonificacion;
    private String Sueldo;
    private String NombreUsuario;
    private String FechaIngreso;
    
    private ArrayList<Programador> unionJ;
    
    public Union(int Numero, String ComboProgramador, String porBonificacion,String SueldoPro, String TrabajoAno, String SuBonificacion, String NomUsuario, String FeIngreso){
        
        this.Numero = (Numero+1);
        this.ComboProgramador = ComboProgramador;
        this.porcentajeBonificacion = porBonificacion;
        this.Sueldo = SueldoPro;
        this.anoTrabajo = TrabajoAno;
        this.SueldoBonificacion = SuBonificacion;
        this.NombreUsuario = NomUsuario;
        this.FechaIngreso = FeIngreso;
        
        this.unionJ = new ArrayList();       
    }

    public comboTipoProgramador getComboTipoProgramador() {
        return this.comboTipoProgramador;
    }

    public void setComboTipoProgramador(comboTipoProgramador comboTipoProgramador) {
        this.comboTipoProgramador = comboTipoProgramador;
    }
    
    public ArrayList<Programador> getUnionJ() {
        return unionJ;
    }

    public void setUnionJ(ArrayList<Programador> unionJ) {
        this.unionJ = unionJ;
    }

    public int getNumero() {
        return this.Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public comboTipoProgramador getComboProgramador() {
        return this.comboTipoProgramador;
    }

    public void setComboProgramador(comboTipoProgramador comboProgramador) {
        this.comboTipoProgramador = comboProgramador;
    }

    public String getSueldo() {
        return this.Sueldo;
    }

    public void setSueldo(String Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getPorcentajeBonificacion() {
        return this.porcentajeBonificacion;
    }

    public void setPorcentajeBonificacion(String porcentajeBonificacion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    public String getAnoTrabajo() {
        return this.anoTrabajo;
    }

    public void setAnoTrabajo(String anoTrabajo) {
        this.anoTrabajo = anoTrabajo;
    }

    public String getSueldoBonificacion() {
        return this.SueldoBonificacion;
    }

    public void setSueldoBonificacion(String SueldoBonificacion) {
        this.SueldoBonificacion = SueldoBonificacion;
    }

    public String getNombreUsuario() {
        return this.NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getFechaIngreso() {
        return this.FechaIngreso;
    }

    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }
    
    @Override
    public String toString() {
        return comboTipoProgramador + "" + porcentajeBonificacion  + Sueldo + anoTrabajo + SueldoBonificacion + NombreUsuario + FechaIngreso;
    }
    
}
