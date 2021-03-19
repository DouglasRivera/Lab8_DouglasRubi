/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_douglasrivera;

import BD.PersonasDBA;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author river
 */
public class Principal extends javax.swing.JFrame {

    private int Id = -1;
    public ArrayList <Personas> personas = new ArrayList();
    private PersonasDBA Perdba = new PersonasDBA();
    public Principal() {
        initComponents();
        
        
        
        JtablePersonas.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nombre", "Apellido", "Nacionalidad", "Residencia", "Sexo", "Numero de Cuenta", "Profesion", "Lugar de Trabajo", "Facultad", "Tipo de Personas"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        JtablePersonas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // jTable1.getSelectedRow()
                if(JtablePersonas.getSelectedRow()<0) return;
                Personas U = personas.get(Id);
                txtNombre.setText(U.getNombre());
                txtApellido.setText(U.getApellido());
                txtNacionalidad.setText(U.getNacionalidad());
                txtResidencia.setText(U.getResidencia());
                txtSexo.setText(U.getSexo());
                txtNumeroCuenta.setText(U.getNumeroCuenta()+"");
                txtProfesion.setText(U.getProfesion());
                txtLugarTrabajo.setText(U.LugarTrabajo);
                txtFacultad.setText(U.getFacultad());
                jcbTipo.setSelectedItem(Tipo);
                Id = JtablePersonas.getSelectedRow();
                /*int i=0;
                for (Personas per : personas) {
                    if(per.getId() == U.getNumeroCuenta()){
                        jcbTipo.setSelectedIndex(i);     
                    }
                    i++;
                }*/
                //cmbRolUsuario.setSelectedItem(rolDBA.obtenerPorId(U.getRol_Usuario()));
                
            }

        });
        JtablePersonas.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nombre", "Apellido", "Nacionalidad", "Residencia", "Sexo", "Numero de Cuenta", "Profesion", "Lugar de Trabajo", "Facultad", "Tipo de Personas"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        
        recargarTabla(JtablePersonas);
    }
    private String Tipo = "";
     //Vaciar tabla para limpiar la tabla
        public void vaciarTabla(JTable tabla){
        DefaultTableModel Modelo = (DefaultTableModel) JtablePersonas.getModel();
        String titulos[] =  new String[]{
                           "Nombre", "Apellido", "Nacionalidad", "Residencia", "Sexo", "Numero de Cuenta", "Profesion", "Lugar de Trabajo", "Facultad", "Tipo de Personas"
                        };
        Modelo = new DefaultTableModel(null,titulos);
        //tabla.setSelectionMode(0);
        tabla.setModel(Modelo);

    }
    //Recargar tabla para capturar los datos de las tablas
    private void recargarTabla(JTable tabla){
        vaciarTabla(tabla);
         // Usuarios us = new Usuarios();
                for (Personas user : personas) {
                    Object row[] = {user.getNombre(), user.getApellido(), user.getNacionalidad(), user.getResidencia(),user.getSexo(), user.getNumeroCuenta(), user.getProfesion(), user.getLugarTrabajo(), user.getFacultad(), user.getTipoPersona()};
                    DefaultTableModel m =
                            (DefaultTableModel) tabla.getModel();
                    m.addRow(row);
                    tabla.setModel(m);
                }//fin for
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtResidencia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumeroCuenta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtProfesion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtLugarTrabajo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtFacultad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jcbTipo = new javax.swing.JComboBox<>();
        jbGuardar = new javax.swing.JButton();
        txtSexo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtablePersonas = new javax.swing.JTable();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BASE DE DATOS");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Apellido:");

        txtApellido.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        txtNacionalidad.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Nacionalidad:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Residencia:");

        txtResidencia.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Sexo:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Numero de Cuenta:");

        txtNumeroCuenta.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Profesion:");

        txtProfesion.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setText("Lugar de Trabajo:");

        txtLugarTrabajo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel10.setText("Facultad:");

        txtFacultad.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel11.setText("Tipo de Persona:");

        jcbTipo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Docente", "Administrativo", "Ejecutivo" }));

        jbGuardar.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/guardar.png"))); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        txtSexo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel6)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResidencia, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(txtProfesion)
                            .addComponent(txtLugarTrabajo)
                            .addComponent(txtFacultad)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(jbGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLugarTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(30, 30, 30)
                                .addComponent(txtFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(83, 83, 83)
                .addComponent(jbGuardar)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("AGREGAR", jPanel1);

        JtablePersonas.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        JtablePersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JtablePersonas);

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jbModificar)
                        .addGap(163, 163, 163)
                        .addComponent(jbEliminar)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar))
                .addContainerGap(242, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LISTAR", jPanel2);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setText("Buscar:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(399, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(555, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("BUSQUEDA LLAVE PRIMARIA", jPanel3);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("Buscar:");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel13)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(482, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel13))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(546, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("BUSQUEDA POR TIPO", jPanel4);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setText("Buscar:");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel14)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(409, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel14))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(541, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("BUSQUEDA DE CUALQUIER ATRIBUTO", jPanel5);

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("PERSONAS DE LA UNIVERSIDAD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(190, 190, 190))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        this.Tipo =  (String) jcbTipo.getSelectedItem();
        boolean valido = true;
        if (this.txtNombre.getText() == null || "".equals(this.txtNombre.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese el Nombre: ");
            valido = false; 
        }
        if (this.txtApellido.getText() == null || "".equals(this.txtApellido.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese el Apellido: ");
            valido = false;       
        }
        if (this.txtNacionalidad.getText() == null || "".equals(this.txtNacionalidad.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese la Nacionalidad: ");
            valido = false; 
        }
        if (this.txtResidencia.getText() == null || "".equals(this.txtResidencia.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese la Residencia: ");
            valido = false;       
        }
        if (this.txtSexo.getText() == null || "".equals(this.txtSexo.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese la Nacionalidad: ");
            valido = false; 
        }
        if (this.txtNumeroCuenta.getText() == null || "".equals(this.txtNumeroCuenta.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese el Numero de Cuenta: ");
            valido = false;       
        }
        if (this.txtProfesion.getText() == null || "".equals(this.txtProfesion.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese la Profesion: ");
            valido = false; 
        }
        if (this.txtLugarTrabajo.getText() == null || "".equals(this.txtLugarTrabajo.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese el Lugar de Trabajo: ");
            valido = false;       
        }
        if (this.txtFacultad.getText() == null || "".equals(this.txtFacultad.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese la Facultad: ");
            valido = false; 
        }
        if (this.Tipo == null || "".equals(this.Tipo)) {
            JOptionPane.showConfirmDialog(this, "Ingrese el Tipo de Persona: ");
            valido = false;       
        }
         if (valido && this.Id<0) {  
            Personas user = new Personas(0,txtNombre.getText(), txtApellido.getText(),txtNacionalidad.getText(), txtResidencia.getText(), txtSexo.getText(), Integer.parseInt(txtNumeroCuenta.getText()), txtProfesion.getText(), txtLugarTrabajo.getText(), txtFacultad.getText(),this.Tipo);
            int cr = this.Perdba.crear(user);
            if(cr !=0){ 
            vaciarTabla(JtablePersonas);
            recargarTabla(JtablePersonas);
            JOptionPane.showMessageDialog(this, "Se agrego correctamente");
        }else{
           JOptionPane.showMessageDialog(this, "Hubo un error y no se agrego");
            }
         }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        this.Tipo =  (String) jcbTipo.getSelectedItem();
         if(this.Id < 0){
            JOptionPane.showMessageDialog(this, "Seleccione primera una fila de la tabla para poder editar");
            return;        
        }
        boolean valido = true;
        if (this.txtNombre.getText() == null || "".equals(this.txtNombre.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese el Nombre: ");
            valido = false; 
        }
        if (this.txtApellido.getText() == null || "".equals(this.txtApellido.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese el Apellido: ");
            valido = false;       
        }
        if (this.txtNacionalidad.getText() == null || "".equals(this.txtNacionalidad.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese la Nacionalidad: ");
            valido = false; 
        }
        if (this.txtResidencia.getText() == null || "".equals(this.txtResidencia.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese la Residencia: ");
            valido = false;       
        }
        if (this.txtSexo.getText() == null || "".equals(this.txtSexo.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese la Nacionalidad: ");
            valido = false; 
        }
        if (this.txtNumeroCuenta.getText() == null || "".equals(this.txtNumeroCuenta.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese el Numero de Cuenta: ");
            valido = false;       
        }
        if (this.txtProfesion.getText() == null || "".equals(this.txtProfesion.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese la Profesion: ");
            valido = false; 
        }
        if (this.txtLugarTrabajo.getText() == null || "".equals(this.txtLugarTrabajo.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese el Lugar de Trabajo: ");
            valido = false;       
        }
        if (this.txtFacultad.getText() == null || "".equals(this.txtFacultad.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese la Facultad: ");
            valido = false; 
        }
        if (this.Tipo == null || "".equals(this.Tipo)) {
            JOptionPane.showConfirmDialog(this, "Ingrese el Tipo de Persona: ");
            valido = false;       
        }
        if (valido) {
        Personas us = this.personas.get(Id);
        us.setNombre(txtNombre.getText());
        us.setApellido(txtApellido.getText());
        us.setNacionalidad(txtNacionalidad.getText());
        us.setResidencia(txtResidencia.getText());
        us.setSexo(txtSexo.getText());
        us.setNumeroCuenta(Integer.parseInt(txtNumeroCuenta.getText()));
        us.setProfesion(txtProfesion.getText());
        us.setLugarTrabajo(txtLugarTrabajo.getText());
        us.setFacultad(txtFacultad.getText());
        us.setTipoPersona(Tipo);
        int Ac = Perdba.actualizar(us);
        if(Ac !=0){
            vaciarTabla(JtablePersonas);
            recargarTabla(JtablePersonas);
            JOptionPane.showMessageDialog(this, "Se actualizo correctamente");
        }else{
           JOptionPane.showMessageDialog(this, "Hubo un error y no se actualizo");
            }
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if(this.Id < 0){
            JOptionPane.showMessageDialog(this, "Seleccione primera una fila de la tabla para poder eliminar");
            return;        
        }
        Personas us = this.personas.get(Id);
        vaciarTabla(JtablePersonas);
                recargarTabla(JtablePersonas);               
        int ac = Perdba.eliminar(us.getId());
        if(ac !=0){
            this.personas.remove(Id);
            vaciarTabla(JtablePersonas);
            recargarTabla(JtablePersonas);
            JOptionPane.showMessageDialog(this, "Se elimino correctamente");
        }else{
           JOptionPane.showMessageDialog(this, "Hubo un error y no se actualizo");
            }
    }//GEN-LAST:event_jbEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtablePersonas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtFacultad;
    private javax.swing.JTextField txtLugarTrabajo;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroCuenta;
    private javax.swing.JTextField txtProfesion;
    private javax.swing.JTextField txtResidencia;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
