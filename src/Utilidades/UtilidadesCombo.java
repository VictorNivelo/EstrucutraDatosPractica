/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import Modelo.comboTipoProgramador;
import javax.swing.JComboBox;

/**
 *
 * @author Victor
 */
public class UtilidadesCombo {
    public static JComboBox cargarComboProgramador(JComboBox cbx){
        cbx.removeAllItems();
        for(comboTipoProgramador tipo: comboTipoProgramador.values()) {
            cbx.addItem(tipo);
        }
        return cbx;
    }
    
    public static comboTipoProgramador getComboProgramador(JComboBox  cbx){
        return (comboTipoProgramador)cbx.getSelectedItem();
    }
}
