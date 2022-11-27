/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Programador;
import Modelo.Union;
import Modelo.comboTipoProgramador;
import controlador.excepciones.ArrayLlenoException;
import controlador.excepciones.DifferentTypeArrayException;
import controlador.utiles.Utiles;

/**
 *
 * @author Victor
 */
public class Controlador {
    public static String NombreCompartido = "VACIO";
    private Programador cadenaProgramador;
    private Union cadenaUnion;
    private Programador[] programadorEnlazado;
    
    public Controlador(Integer NumeroProgramador){
        programadorEnlazado = new Programador[NumeroProgramador];
        for(int i =0;1<NumeroProgramador;i++){
            Programador p = new Programador();
            p.setNombreProgramador(Controlador.NombreCompartido);
            programadorEnlazado[i] = p;
        }
    }
    
    public Controlador(String TipoProgramador, Integer tamanio){
        getCadenaProgramador().setTipoProgramador(TipoProgramador);
        getCadenaProgramador().setUnionProgramadorSueldo(new Union[tamanio]);
    }
    
    public boolean guardarElemento(Union union) throws ArrayLlenoException {
        if(estaLleno()) {
            throw new ArrayLlenoException("El arreglo esta lleno");
        } else {
            getCadenaProgramador().getUnionProgramadorSueldo()[verificarPosicion() + 1]=union;
            return true;
        }  
    }
    
    public int verificarPosicion() {
        int pos = -1;
        for(int i = 0; i < getCadenaProgramador().getUnionProgramadorSueldo().length;i++) {
            if(getCadenaProgramador().getUnionProgramadorSueldo()[i] == null) {
                break;
            } else {
                pos = i;
            }
        }
        return pos;
    }
    
    public boolean estaLleno() {
        return getCadenaProgramador().getUnionProgramadorSueldo().length <= verificarPosicion() + 1;
    }

    public Programador getCadenaProgramador() {
        if(cadenaProgramador ==null)
            cadenaProgramador = new Programador();
        return cadenaProgramador;
    }

    public void setCadenaProgramador(Programador cadenaProgramador) {
        this.cadenaProgramador = cadenaProgramador;
    }

    public Union getCadenaUnion() {
        if(cadenaUnion == null)
            cadenaUnion = new Union(0, NombreCompartido, NombreCompartido, NombreCompartido, NombreCompartido, NombreCompartido, NombreCompartido, NombreCompartido);
        return cadenaUnion;
    }

    public void setCadenaUnion(Union cadenaUnion) {
        this.cadenaUnion = cadenaUnion;
    }

    public Programador[] getProgramadorEnlazado() {
        return programadorEnlazado;
    }

    public void setProgramadorEnlazado(Programador[] programadorEnlazado) {
        this.programadorEnlazado = programadorEnlazado;
    }
    
}
