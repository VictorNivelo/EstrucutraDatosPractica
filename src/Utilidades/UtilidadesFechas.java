/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import static Interfaz.InterfazFecha.lblFechaActualMostrar;
import static Interfaz.InterfazFecha.lblFechaSeleccionadaMostrar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import jdk.nashorn.internal.parser.DateParser;


/**
 *
 * @author Victor
 */
public class  UtilidadesFechas extends Interfaz.InterfazFecha{
    
    public static String fechaHoy() {
        Calendar fecha = new GregorianCalendar();
        String año = Integer.toString(fecha.get(Calendar.YEAR));
        String mes = Integer.toString(fecha.get(Calendar.MONTH)+1);
        String dia = Integer.toString(fecha.get(Calendar.DAY_OF_MONTH));
        
        String fechaHoy = dia +"/"+ mes+"/" + año;
        return fechaHoy;
    }
    
    public static String fechaSeleccionada(){
        String diaChoseer = Integer.toString(chIngresarFecha.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mesChoseer = Integer.toString(chIngresarFecha.getCalendar().get(Calendar.MONTH) + 1);
        String anoChoseer = Integer.toString(chIngresarFecha.getCalendar().get(Calendar.YEAR));

        String fechaSeleccionada = diaChoseer + "/" + mesChoseer + "/" + anoChoseer;
        return fechaSeleccionada;
    }
    
    public static String calculoFecha(){
        Calendar fecha = new GregorianCalendar();
        String mesChoseer = Integer.toString(chIngresarFecha.getCalendar().get(Calendar.MONTH) + 1);
        String mes = Integer.toString(fecha.get(Calendar.MONTH)+1);
        
        String calculoFecha = mes + mesChoseer;

        return calculoFecha;
        }
    
}
