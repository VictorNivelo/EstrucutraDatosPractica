/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Union;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Victor
 */
public class VistaTabla extends AbstractTableModel {
    private Union uniones[];
    
    public Union[] getUnion() {
        return uniones;
    }

    public void setUniones(Union[] uniones) {
        this.uniones = uniones;
    } 

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public int getRowCount() {
        return uniones.length;
    }

    @Override
    public String getColumnName(int i) {
        switch (i) {
            case 0:
                return "Nro";
            case 1:
                return "Tipo de Programador";
            case 2:
                return "Bonificacion";
            case 3:
                return "Sueldo";
            case 4:
                return "Años de Trabajo";
            case 5:
                return "Sueldo + Bonificacion";
            case 6:
                return "Nombre de usuario";
            case 7:
                return "Fecha de ingreso";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Union u = uniones[i];
        switch (i1) {
            case 0:
                return (i + 1);
            case 1:
                return (u != null) ? u.getComboProgramador() : "VACIO";
            case 2:
                return (u != null) ? u.getPorcentajeBonificacion() : "VACIO";
            case 3:
                return (u != null) ? u.getSueldo() : "VACIO";
            case 4:
                return (u != null) ? u.getAnoTrabajo(): "VACIO";
            case 5:
                return (u != null) ? u.getSueldoBonificacion():"VACIO";
            case 6:
                return (u != null) ? u.getNombreUsuario():"VACIO";
            case 7:
                return (u != null) ? u.getFechaIngreso(): "VACIO";
            default:
                return null;
        }
    }
}
