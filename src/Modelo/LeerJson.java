/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Victor
 */
import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerJson {

    public static void main(String[] args) {

        Gson gson = new Gson();
        
        Union unionJson = new  Union(1, Interfaz.InterfazPresentacion.cbxTipoProgramador.getSelectedItem().toString(), Interfaz.InterfazPresentacion.cbxBonificacion.getSelectedItem().toString(), Interfaz.InterfazPresentacion.txtSueldoProgramador.getText(), Interfaz.InterfazPresentacion.lblBonificacion.getText(), Interfaz.InterfazPresentacion.lblSueldoBonificacion.getText(), Interfaz.InterfazPresentacion.lblUsuario.getText(), Interfaz.InterfazPresentacion.lblFechaIngreso.getText());

        String json = gson.toJson(unionJson);

        System.out.println(json);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Datos_Programador.json"))) {
            bw.write(json);
            System.out.println("REGISTRO GUARDADO");
        } catch (IOException ex) {
            Logger.getLogger(LeerJson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
