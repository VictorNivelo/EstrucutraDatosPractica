/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Controlador.Controlador;
import Modelo.LeerJson;
import Modelo.Union;
import Modelo.comboTipoProgramador;
import Utilidades.UtilidadesFechas;
import Vista.VistaTabla;
import com.google.gson.Gson;
import java.awt.event.ItemEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor
 */
public class InterfazPresentacion extends javax.swing.JFrame {
    private VistaTabla presentarTabla = new VistaTabla();
    private Controlador crearTipoProgramador;

    /**
     * Creates new form InterfazPrincipal
     */
    
    private String dato;
//    private String datoNombre;
     
    public InterfazPresentacion() {
        initComponents();
        this.setLocationRelativeTo(null);
        MostrarFechaActualPresemtacion();
        CargarCombo();
        cargarTabla();
    }
    
    public void setDato(String dato){
        this.dato = dato;
        lblFechaIngreso.setText(dato);
    }
    
//    public void setDatoNombre(String datoNombre){
//        this.datoNombre = datoNombre;
//        lblUsuario.setText(datoNombre);
//    }
    
    public void MostrarFechaActualPresemtacion(){
        lblMostrarFechaActual.setText(UtilidadesFechas.fechaHoy());
    }
    
    public void CargarCombo(){
        Utilidades.UtilidadesCombo.cargarComboProgramador(cbxTipoProgramador);
    }
    
    private void cargarTabla() {
        if(crearTipoProgramador != null) {
            presentarTabla.setUniones(crearTipoProgramador.getCadenaProgramador().getUnionProgramadorSueldo());
            tblFinal.setModel(presentarTabla);
            tblFinal.updateUI();
            panTabla.setVisible(true);
        }else panTabla.setVisible(false);
    }
    
    private void crear(){
        crearTipoProgramador = new Controlador(cbxTipoProgramador.getSelectedItem().toString(),Integer.parseInt(cbxNumeroDeProgramador.getSelectedItem().toString()));
        cargarTabla();
    }
    private void cargarDatosProgramador(){
        try{
            if(crearTipoProgramador.getCadenaProgramador().getUnionProgramadorSueldo() !=null){
                
            }else{
                JOptionPane.showMessageDialog(null, "Por Favor actualize los datos","Error",JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e){
            
        }
    }
    
    public String[]programador(String programador){
        String[]tipos = new String[1];
        if(programador.equalsIgnoreCase("Junior")){
            tipos[0]="Sin bonificacion";
            lblAñosTrabajoXD.setText("Menos de 5 años");
            lblBonificacion.setText(""+0);
        }
        if(programador.equalsIgnoreCase("Senior")){
            tipos[0]="10%";
            lblAñosTrabajoXD.setText("Menos de 15 años");
            lblBonificacion.setText(""+10);
        }
        if(programador.equalsIgnoreCase("Veterano")){
            tipos[0]="20%";
            lblAñosTrabajoXD.setText("Mas de 15 años");
            lblBonificacion.setText(""+20);
        }
        return tipos;
    }
    
    private void AgregarElemento(){
        if(txtSueldoProgramador.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "La tabla no se ha creado","Error",JOptionPane.INFORMATION_MESSAGE);
        }if(lblSueldoBonificacion.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "La bonificacion no se ha calculado","Error",JOptionPane.INFORMATION_MESSAGE);
        }
            else{
            if(crearTipoProgramador !=null){
                crearTipoProgramador.getCadenaUnion().setComboProgramador(Utilidades.UtilidadesCombo.getComboProgramador(cbxTipoProgramador));
                crearTipoProgramador.getCadenaUnion().setPorcentajeBonificacion(cbxBonificacion.getSelectedItem().toString());
                crearTipoProgramador.getCadenaUnion().setSueldo("$ "+txtSueldoProgramador.getText());
                crearTipoProgramador.getCadenaUnion().setAnoTrabajo(lblAñosTrabajoXD.getText());
                crearTipoProgramador.getCadenaUnion().setSueldoBonificacion("$ "+lblSueldoBonificacion.getText());
                crearTipoProgramador.getCadenaUnion().setNombreUsuario(lblUsuario.getText());
                crearTipoProgramador.getCadenaUnion().setFechaIngreso(lblFechaIngreso.getText());
               try{
                   crearTipoProgramador.guardarElemento(crearTipoProgramador.getCadenaUnion());
                   JOptionPane.showMessageDialog(null, "Se ha guardado exitosamente","ERROR",JOptionPane.INFORMATION_MESSAGE);
                   crearTipoProgramador.setCadenaUnion(null);
                   cargarTabla();
               }catch(Exception e){
                   JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
               }
            }else JOptionPane.showMessageDialog(null, "Por favor ingrese los datos","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnCrearListaProgrmadores = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbxNumeroDeProgramador = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxBonificacion = new javax.swing.JComboBox<>();
        btnGuardarDatosTabla = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtSueldoProgramador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbxTipoProgramador = new javax.swing.JComboBox<>();
        lblBonificacion = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSueldoBonificacion = new javax.swing.JLabel();
        btnCalcularBono = new javax.swing.JButton();
        btnIngresarNuevoUsuario = new javax.swing.JToggleButton();
        lblAñosTrabajoXD = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnIngresarAFecha = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMostrarFechaActual = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblFechaIngreso = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        btnSalirInterfaz = new javax.swing.JButton();
        panTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFinal = new javax.swing.JTable();
        btnCargarRegistroJson = new javax.swing.JButton();
        btnGuardarRegistroJson = new javax.swing.JButton();
        btnPagarAEmpleado = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INTERFAZ PRINCIPAL");

        PanelPrincipal.setToolTipText("");
        PanelPrincipal.setName(""); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCrearListaProgrmadores.setText("CREAR TABLA DE EMPLEADOS");
        btnCrearListaProgrmadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearListaProgrmadoresActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Numero de trabajadores");

        cbxNumeroDeProgramador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCrearListaProgrmadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxNumeroDeProgramador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxNumeroDeProgramador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCrearListaProgrmadores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sueldo");

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bonificacion");

        btnGuardarDatosTabla.setText("GUARDAR EN LA TABLA");
        btnGuardarDatosTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDatosTablaActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Años de tabajo");

        txtSueldoProgramador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoProgramadorActionPerformed(evt);
            }
        });
        txtSueldoProgramador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSueldoProgramadorKeyTyped(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Tipo de programador");

        cbxTipoProgramador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTipoProgramadorItemStateChanged(evt);
            }
        });

        lblBonificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBonificacion.setText(".");

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Sueldo+Bonificacion");

        lblSueldoBonificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnCalcularBono.setText("CALCULAR BONO");
        btnCalcularBono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularBonoActionPerformed(evt);
            }
        });

        btnIngresarNuevoUsuario.setText("INGRESAR USUARIO");
        btnIngresarNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarNuevoUsuarioActionPerformed(evt);
            }
        });

        lblAñosTrabajoXD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAñosTrabajoXD.setText(".");

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Porcentaje de bonificacion");

        jLabel11.setText("%");

        btnIngresarAFecha.setText("INGRESAR FECHA");
        btnIngresarAFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAñosTrabajoXD, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSueldoBonificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalcularBono))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnIngresarNuevoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIngresarAFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)
                        .addComponent(btnGuardarDatosTabla))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxTipoProgramador, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxBonificacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSueldoProgramador, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblBonificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbxTipoProgramador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cbxBonificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSueldoProgramador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(lblBonificacion)
                            .addComponent(jLabel11))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblAñosTrabajoXD)
                            .addComponent(btnCalcularBono)
                            .addComponent(jLabel5)))
                    .addComponent(lblSueldoBonificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarDatosTabla)
                    .addComponent(btnIngresarNuevoUsuario)
                    .addComponent(btnIngresarAFecha))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Fecha actual");

        lblMostrarFechaActual.setText(".");

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Fecha de Ingreso");

        lblFechaIngreso.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFechaIngreso.setText(".");

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Usuario ");

        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsuario.setText(".");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMostrarFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addComponent(lblUsuario))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblMostrarFechaActual)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalirInterfaz.setText("SALIR");
        btnSalirInterfaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirInterfazActionPerformed(evt);
            }
        });

        panTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblFinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblFinal);

        javax.swing.GroupLayout panTablaLayout = new javax.swing.GroupLayout(panTabla);
        panTabla.setLayout(panTablaLayout);
        panTablaLayout.setHorizontalGroup(
            panTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panTablaLayout.setVerticalGroup(
            panTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCargarRegistroJson.setText("CARGAR REGISTRO");
        btnCargarRegistroJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarRegistroJsonActionPerformed(evt);
            }
        });

        btnGuardarRegistroJson.setText("GUARDAR REGISTRO");
        btnGuardarRegistroJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRegistroJsonActionPerformed(evt);
            }
        });

        btnPagarAEmpleado.setText("PAGAR A EMPLEADO SELECCIONADO");
        btnPagarAEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarAEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardarRegistroJson)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCargarRegistroJson)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPagarAEmpleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalirInterfaz))
                    .addComponent(panTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalirInterfaz)
                    .addComponent(btnCargarRegistroJson)
                    .addComponent(btnGuardarRegistroJson)
                    .addComponent(btnPagarAEmpleado))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirInterfazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirInterfazActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirInterfazActionPerformed

    private void btnIngresarAFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAFechaActionPerformed
        // TODO add your handling code here:
        InterfazFecha abrir = new InterfazFecha();
        abrir.setVisible(true);

    }//GEN-LAST:event_btnIngresarAFechaActionPerformed

    private void cbxTipoProgramadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTipoProgramadorItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()==ItemEvent.SELECTED){
            if(this.cbxTipoProgramador.getSelectedIndex()>0){
                this.cbxBonificacion.setModel(new DefaultComboBoxModel(this.programador(this.cbxTipoProgramador.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_cbxTipoProgramadorItemStateChanged

    private void btnGuardarDatosTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDatosTablaActionPerformed
        // TODO add your handling code here:
        AgregarElemento();
    }//GEN-LAST:event_btnGuardarDatosTablaActionPerformed

    private void btnCrearListaProgrmadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearListaProgrmadoresActionPerformed
        // TODO add your handling code here:
        
        crear();
        if(crearTipoProgramador.getCadenaProgramador().getTipoProgramador().equalsIgnoreCase(Controlador.NombreCompartido)){
            
        }else cargarDatosProgramador();
        btnCrearListaProgrmadores.setEnabled(false);
//        cargarDatosProgramador();
    }//GEN-LAST:event_btnCrearListaProgrmadoresActionPerformed

    private void txtSueldoProgramadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoProgramadorKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <=57;
        if(!numeros){
            evt.consume();
        }
    }//GEN-LAST:event_txtSueldoProgramadorKeyTyped

    private void btnCalcularBonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularBonoActionPerformed
        float Bono,Bonificacion, resultado;
        Bono = Integer.parseInt(txtSueldoProgramador.getText());
        Bonificacion = Integer.parseInt(lblBonificacion.getText());

        String opcion = (String)cbxTipoProgramador.getSelectedItem().toString();
        
        if(opcion.equals("Junior")){
            resultado = Bono + Bonificacion;
            lblSueldoBonificacion.setText(""+resultado);
        }
        if(opcion.equals("Senior")){
            float bonificacionxd = 0.1f;
            resultado = Bono + (Bono*bonificacionxd);
            lblSueldoBonificacion.setText(""+resultado);
        }
        if(opcion.equals("Veterano")){
            float bonificacionxdxd = 0.2f;
            resultado = Bono + (Bono*bonificacionxdxd);
            lblSueldoBonificacion.setText(""+resultado);
        }

    }//GEN-LAST:event_btnCalcularBonoActionPerformed

    private void btnGuardarRegistroJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRegistroJsonActionPerformed
        // TODO add your handling code here:
        
        Gson gson = new Gson();
        
        int i;

        Union unionJson = new Union(1, cbxNumeroDeProgramador.getSelectedItem().toString(), cbxBonificacion.getSelectedItem().toString(), txtSueldoProgramador.getText(), lblBonificacion.getText(), lblSueldoBonificacion.getText(), lblUsuario.getText(), lblFechaIngreso.getText());

        String json = gson.toJson(unionJson);

        System.out.println(json);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Datos_Programador.json"))) {
            bw.write(json);
            System.out.println("REGISTRO GUARDADO");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(LeerJson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarRegistroJsonActionPerformed

    private void btnIngresarNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarNuevoUsuarioActionPerformed
        // TODO add your handling code here:
        InterfazRegistro abrir = new InterfazRegistro();
        abrir.setVisible(true);
    }//GEN-LAST:event_btnIngresarNuevoUsuarioActionPerformed

    private void btnPagarAEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarAEmpleadoActionPerformed
        // TODO add your handling code here:
//        if(tblFinal.getSelectedRow() >=0){
//            DefaultTableModel tm = (DefaultTableModel)tblFinal.getModel();
//            int rpta = JOptionPane.showConfirmDialog(this,"DESEA REALIZAR EL PAGO","REALIZAR PAGO", JOptionPane.INFORMATION_MESSAGE);
//            if(rpta==JOptionPane.YES_OPTION){
//                tm.removeRow((tblFinal.getSelectedRow()));
//            }
//        }else{
//            JOptionPane.showMessageDialog(this, "SELECCIONE UNA FILA", "ERROR",JOptionPane.WARNING_MESSAGE);
//        }

    InterfazSimulacion abrir = new InterfazSimulacion();
    abrir.setVisible(true);
    }//GEN-LAST:event_btnPagarAEmpleadoActionPerformed

    private void btnCargarRegistroJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarRegistroJsonActionPerformed
        // TODO add your handling code here:
        Gson gson = new Gson();

        // Leo el fichero
        String fichero = "";

        try (BufferedReader br = new BufferedReader(new FileReader("Datos_Programador.json"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                fichero += linea;
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("REGISTRO CARGADO");

        // Creo una persona desde JSON
        Union persona = gson.fromJson(fichero, Union.class);

        System.out.println(persona);
    }//GEN-LAST:event_btnCargarRegistroJsonActionPerformed

    private void txtSueldoProgramadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoProgramadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoProgramadorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazPresentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPresentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPresentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPresentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPresentacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton btnCalcularBono;
    private javax.swing.JButton btnCargarRegistroJson;
    private javax.swing.JButton btnCrearListaProgrmadores;
    private javax.swing.JButton btnGuardarDatosTabla;
    private javax.swing.JButton btnGuardarRegistroJson;
    private javax.swing.JButton btnIngresarAFecha;
    private javax.swing.JToggleButton btnIngresarNuevoUsuario;
    private javax.swing.JToggleButton btnPagarAEmpleado;
    private javax.swing.JButton btnSalirInterfaz;
    public static javax.swing.JComboBox<String> cbxBonificacion;
    public static javax.swing.JComboBox<String> cbxNumeroDeProgramador;
    public static javax.swing.JComboBox<String> cbxTipoProgramador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAñosTrabajoXD;
    public static javax.swing.JLabel lblBonificacion;
    public static javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JLabel lblMostrarFechaActual;
    public static javax.swing.JLabel lblSueldoBonificacion;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panTabla;
    private javax.swing.JTable tblFinal;
    public static javax.swing.JTextField txtSueldoProgramador;
    // End of variables declaration//GEN-END:variables
}
