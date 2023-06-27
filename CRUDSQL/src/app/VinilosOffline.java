package app;

import com.formdev.flatlaf.FlatLightLaf;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.RowSetMetaData;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.RowSetFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ygnacio
 */
public class VinilosOffline extends javax.swing.JFrame {

    Connection con = Conexion.getConexion();
    private int respuesta;
    CachedRowSet crs;
    RowSetFactory rsf;

    public VinilosOffline() throws SQLException {
        initComponents();
        crs = RowSetProvider.newFactory().createCachedRowSet();
        jtxtID.setVisible(false);
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblVinilos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtArtista = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxtDisquera = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jbtnModificar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jcboCantidad = new javax.swing.JComboBox<>();
        jcboTipo = new javax.swing.JComboBox<>();
        jcboTamano = new javax.swing.JComboBox<>();
        jtxtID = new javax.swing.JTextField();
        jlblSencilloLider = new javax.swing.JLabel();
        jtxtSencilloLider = new javax.swing.JTextField();
        jbtnGuardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmnArchivo = new javax.swing.JMenu();
        jmnitModoConectado = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmnitSalir = new javax.swing.JMenuItem();
        jmnAyuda = new javax.swing.JMenu();
        jmnitVerAyuda = new javax.swing.JMenuItem();
        jmnitAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("20130778 - InventarioApp (Modo Desconectado)");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/principal.png")).getImage());
        setPreferredSize(new java.awt.Dimension(1216, 596));
        setSize(new java.awt.Dimension(1216, 596));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jtblVinilos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Tamaño", "Nombre", "Artista", "Precio", "Cantidad", "Disquera", "Activo", "Sencillo líder"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblVinilos.setShowGrid(true);
        jtblVinilos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblVinilosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblVinilos);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Discos de Vinilo");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Tipo:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Tamaño:");

        jtxtNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Nombre:");

        jtxtArtista.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Artista:");

        jtxtPrecio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Precio:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Cantidad:");

        jtxtDisquera.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Disquera:");

        jbtnModificar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtnModificar.setText("Modificar");
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });

        jbtnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jbtnEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jcboCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jcboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estándar", "Gatefold" }));

        jcboTamano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7", "10", "12" }));

        jlblSencilloLider.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlblSencilloLider.setText("Sencillo líder:");

        jtxtSencilloLider.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jbtnGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jtxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jbtnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnModificar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlblSencilloLider)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtSencilloLider))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcboTamano, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtxtPrecio)
                                        .addComponent(jtxtDisquera)
                                        .addComponent(jcboCantidad, 0, 275, Short.MAX_VALUE))
                                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcboTamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jcboCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtxtDisquera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtSencilloLider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblSencilloLider))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnModificar)
                    .addComponent(jbtnEliminar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnLimpiar)
                        .addComponent(jbtnGuardar)))
                .addGap(33, 33, 33))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 51, 0));
        jLabel9.setText("InventarioApp");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Estado:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("Desconectado");

        jmnArchivo.setText("Archivo");

        jmnitModoConectado.setText("Regresar a modo conectado");
        jmnitModoConectado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnitModoConectadoActionPerformed(evt);
            }
        });
        jmnArchivo.add(jmnitModoConectado);
        jmnArchivo.add(jSeparator1);

        jmnitSalir.setText("Salir");
        jmnitSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnitSalirActionPerformed(evt);
            }
        });
        jmnArchivo.add(jmnitSalir);

        jMenuBar1.add(jmnArchivo);

        jmnAyuda.setText("Ayuda");

        jmnitVerAyuda.setText("Ver la Ayuda");
        jmnitVerAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnitVerAyudaActionPerformed(evt);
            }
        });
        jmnAyuda.add(jmnitVerAyuda);

        jmnitAcercaDe.setText("Acerca de");
        jmnitAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnitAcercaDeActionPerformed(evt);
            }
        });
        jmnAyuda.add(jmnitAcercaDe);

        jMenuBar1.add(jmnAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(63, 63, 63))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(47, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)))
                .addGap(0, 0, 0)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        String tipo = jcboTipo.getSelectedItem().toString();
        int tamano = Integer.parseInt(jcboTamano.getSelectedItem() + "");
        String nombre = jtxtNombre.getText();
        String artista = jtxtArtista.getText();
        int precio = Integer.parseInt(jtxtPrecio.getText());
        int cantidad = Integer.parseInt(jcboCantidad.getSelectedItem() + "");
        String disquera = jtxtDisquera.getText();
        String sencilloLider = jtxtSencilloLider.getText();

        con = Conexion.getConexion();

        try {
            rsf = RowSetProvider.newFactory();
            crs = rsf.createCachedRowSet();

            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            String msq = "jdbc:sqlserver://localhost:1433;"
                    + "encrypt=false;"
                    + "database=tiendaVinilos;";
            
            crs.setUrl(msq);
            crs.setUsername("sa");
            crs.setPassword("123456");

            crs.setCommand("SELECT tipo, tamano, nombre, artista, precio, cantidad, disquera, activo, sencilloLider FROM vinilos WHERE activo=1 ORDER BY idVinilo");
            crs.execute();

            crs.moveToInsertRow();
            crs.updateString(1, tipo);
            crs.updateInt(2, tamano);
            crs.updateString(3, nombre);
            crs.updateString(4, artista);
            crs.updateInt(5, precio);
            crs.updateInt(6, cantidad);
            crs.updateString(7, disquera);
            crs.updateInt(8, 1);
            crs.updateString(9, sencilloLider);

            crs.insertRow();
            crs.moveToCurrentRow();
            crs.acceptChanges();

            PreparedStatement en = con.prepareStatement("OPEN SYMMETRIC KEY sencilloLider_sym_key DECRYPTION\n"
                    + "BY PASSWORD = 'ejercici03ncriptacion'\n"
                    + "UPDATE dbo.vinilos\n"
                    + "SET sencilloLider_enc = ENCRYPTBYKEY(KEY_GUID('sencilloLider_sym_key'), sencilloLider)\n"
                    + "\n"
                    + "CLOSE SYMMETRIC KEY sencilloLider_sym_key");

            en.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro guardado exitosamente", "Acción realizada", JOptionPane.INFORMATION_MESSAGE);;

            limpiar();
            cargarTabla();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Fallo al guardar", "Error",
                    JOptionPane.ERROR_MESSAGE);
            try {
                con.rollback();
                JOptionPane.showMessageDialog(this, "Rollback aplicado", "Error",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Fallo al aplicar rollback", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jtblVinilosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblVinilosMouseClicked
        int fila = jtblVinilos.getSelectedRow();
        Object[] offline = new Object[10];

        for (int i = 0; i < 10; i++) {
            offline[i] = jtblVinilos.getValueAt(fila, i);
        }

        jtxtID.setText(offline[0].toString());
        jcboTipo.setSelectedItem(offline[1].toString());
        jcboTamano.setSelectedItem(offline[2].toString());
        jtxtNombre.setText(offline[3].toString());
        jtxtArtista.setText(offline[4].toString());
        jtxtPrecio.setText(offline[5].toString());
        jcboCantidad.setSelectedItem(offline[6].toString());
        jtxtDisquera.setText(offline[7].toString());
        jtxtSencilloLider.setText(offline[9].toString());
    }//GEN-LAST:event_jtblVinilosMouseClicked

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        int id = Integer.parseInt(jtxtID.getText());
        String tipo = jcboTipo.getSelectedItem().toString();
        int tamano = Integer.parseInt(jcboTamano.getSelectedItem() + "");
        String nombre = jtxtNombre.getText();
        String artista = jtxtArtista.getText();
        int precio = Integer.parseInt(jtxtPrecio.getText());
        int cantidad = Integer.parseInt(jcboCantidad.getSelectedItem() + "");
        String disquera = jtxtDisquera.getText();
        String sencilloLider = jtxtSencilloLider.getText();

        respuesta = JOptionPane.showConfirmDialog(
                this,
                "La acción ejecutada modificará los datos previamente almacenados. \n"
                + "<html><b>¿Desea continuar?</b></html>",
                "Confirmar acción",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            try {
                rsf = RowSetProvider.newFactory();
                crs = rsf.createCachedRowSet();

                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                String msq = "jdbc:sqlserver://localhost:1433;"
                        + "encrypt=false;"
                        + "database=tiendaVinilos;";

                crs.setUrl(msq);
                crs.setUsername("sa");
                crs.setPassword("123456");

                crs.setCommand("SELECT idVinilo, tipo, tamano, nombre, artista, precio, cantidad, disquera, activo, sencilloLider FROM vinilos WHERE activo=1 ORDER BY idVinilo");
                crs.execute();

                while (crs.next()) {
                    if (crs.getInt("idVinilo") == id) {
                        crs.updateString(2, tipo);
                        crs.updateInt(3, tamano);
                        crs.updateString(4, nombre);
                        crs.updateString(5, artista);
                        crs.updateInt(6, precio);
                        crs.updateInt(7, cantidad);
                        crs.updateString(8, disquera);
                        crs.updateInt(9, 1);
                        crs.updateString(10, sencilloLider);
                        crs.updateRow();
                        crs.acceptChanges();
                        crs.close();
                    }
                }

                JOptionPane.showMessageDialog(null, "Registro modificado exitosamente", "Acción realizada", JOptionPane.INFORMATION_MESSAGE);

                limpiar();
                cargarTabla();

                } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Fallo al guardar.\n"
                        + "<html><b>Se aplicará rollback.</b></html>", "Error",
                        JOptionPane.ERROR_MESSAGE
                );
                try {
                    con.rollback();
                    JOptionPane.showMessageDialog(this, "<html><b>Rollback aplicado exitosamente.</b></html>", "Error",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "<html><b>Fallo al aplicar rollback.</b></html>\n "
                            + "Por favor, inténtelo de nuevo.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        int id = Integer.parseInt(jtxtID.getText());

        respuesta = JOptionPane.showConfirmDialog(
                this,
                "La acción ejecutada eliminará los datos previamente almacenados. \n"
                + "<html><b>¿Desea continuar?</b></html>",
                "Confirmar acción",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            try {
                rsf = RowSetProvider.newFactory();
                crs = rsf.createCachedRowSet();

                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                String msq = "jdbc:sqlserver://localhost:1433;"
                        + "encrypt=false;"
                        + "database=tiendaVinilos;";
                crs.setUrl(msq);
                crs.setUsername("sa");
                crs.setPassword("123456");

                crs.setCommand("SELECT idVinilo, tipo, tamano, nombre, artista, precio, cantidad, disquera, activo, sencilloLider FROM vinilos WHERE activo=1 ORDER BY idVinilo");
                crs.execute();

                while (crs.next()) {
                    if (crs.getInt("idVinilo") == id) {
                        crs.updateInt(9, 0);
                        crs.updateRow();
                        crs.acceptChanges();
                        crs.close();
                    }
                }

                JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente", "Acción realizada", JOptionPane.INFORMATION_MESSAGE);;

                limpiar();
                cargarTabla();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        respuesta = JOptionPane.showConfirmDialog(
                this,
                "La acción ejecutada limpiará los datos que todavía no han sido guardados. \n"
                + "<html><b>¿Desea continuar?</b></html>",
                "Confirmar acción",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if(respuesta == JOptionPane.YES_OPTION) {
            limpiar();
        }
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jmnitVerAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnitVerAyudaActionPerformed
        JOptionPane.showMessageDialog(
            this,
            "El modo desconectado de este programa hace uso de un objeto "
            + "de tipo CachedRowSet para poder almacenar la información "
            + "en memoria, para posteriormente mandarla a la base de "
            + "datos correctamente. \n"
            + "Cabe recalcar que sólo ejecuta la conexión a la base de datos "
            + "en el momento que se carga la información en la tabla y cuando "
            + "se ejecuta alguna de las operaciones planteadas (Altas, Bajas y "
            + "Cambios), por lo que si necesita hacer algo distinto en la "
            + "app, es fundamental regresar al modo conectado.",
            "Ayuda",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jmnitVerAyudaActionPerformed

    private void jmnitAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnitAcercaDeActionPerformed
        JOptionPane.showMessageDialog(
            this,
            "<html><b>InventarioApp v1.4.2</html>\n\n"
            + "<html><b>Autor: </b>Ygnacio Martínez Sánchez</html> \n"
            + "<html><b>No. de Control: </b>20130778</html> \n"
            + "<html><b>Semestre: </b>4</html> \n\n"
            + "<html><b>Materia: </b>Taller de Base de Datos</html> \n"
            + "<html><b>Unidad 7: </b>Conectividad</html> \n"
            + "<html><b>Grupo: </b>C15A</html> \n\n"
            + "<html><b>Profesor: </b>José Dolores Ruiz Ayala</html> \n"
            + "<html><b>Periodo: </b>Enero-Junio del 2022</html> \n",
            "Acerca de",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jmnitAcercaDeActionPerformed

    private void jmnitModoConectadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnitModoConectadoActionPerformed
        respuesta = JOptionPane.showConfirmDialog (
                this,
                "El programa regresará a modo conectado. \n"
                + "<html><b>¿Desea continuar?</b></html>",
                "Modo conectado",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            Vinilos app = new Vinilos();
            app.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jmnitModoConectadoActionPerformed

    private void jmnitSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnitSalirActionPerformed
        respuesta = JOptionPane.showConfirmDialog(
            this,
            "La información que no se haya guardado será eliminada al cerrar el programa. \n"
            + "<html><b>¿Desea continuar?</b></html>",
            "Advertencia",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_jmnitSalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        respuesta = JOptionPane.showConfirmDialog(
                this,
                "Puede que existan cambios sin guardar. \n"
                + "<html><b>¿Desea salir de la aplicación?</b></html>",
                "Advertencia",
                JOptionPane.YES_NO_OPTION
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void cargarTabla() {
        con = Conexion.getConexion();
        int columnas;
        int[] anchos = {10, 40, 30, 150, 70, 30, 30, 90, 20, 80};

        for (int i = 0; i < jtblVinilos.getColumnCount(); i++) {
            jtblVinilos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        DefaultTableModel modelo = (DefaultTableModel) jtblVinilos.getModel();
        modelo.setRowCount(0);

        try {
            crs = RowSetProvider.newFactory().createCachedRowSet();
            crs.setCommand("SELECT idVinilo, tipo, tamano, nombre, artista, precio, cantidad, disquera, activo, sencilloLider FROM vinilos WHERE activo=1 ORDER BY idVinilo");
            PreparedStatement pstmt = con.prepareStatement(crs.getCommand());
            ResultSet rs = pstmt.executeQuery();
            crs.populate(rs);

            RowSetMetaData rsmd = (RowSetMetaData) crs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (crs.next()) {
                Object[] fila = new Object[columnas];
                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = crs.getString(indice + 1);
                }
                modelo.addRow(fila);
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    private void limpiar() {
        jcboTipo.setSelectedIndex(0);
        jcboTamano.setSelectedIndex(0);
        jtxtNombre.setText("");
        jtxtArtista.setText("");
        jtxtPrecio.setText("");
        jcboCantidad.setSelectedIndex(0);
        jtxtDisquera.setText("");
    }

    public static void main(String args[]) {
        try {
            FlatLightLaf.setup();
        } catch (Exception ex) {
        }

        java.awt.EventQueue.invokeLater(() -> {
            try {
                new VinilosOffline().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(VinilosOffline.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JComboBox<String> jcboCantidad;
    private javax.swing.JComboBox<String> jcboTamano;
    private javax.swing.JComboBox<String> jcboTipo;
    private javax.swing.JLabel jlblSencilloLider;
    private javax.swing.JMenu jmnArchivo;
    private javax.swing.JMenu jmnAyuda;
    private javax.swing.JMenuItem jmnitAcercaDe;
    private javax.swing.JMenuItem jmnitModoConectado;
    private javax.swing.JMenuItem jmnitSalir;
    private javax.swing.JMenuItem jmnitVerAyuda;
    private javax.swing.JTable jtblVinilos;
    private javax.swing.JTextField jtxtArtista;
    private javax.swing.JTextField jtxtDisquera;
    private javax.swing.JTextField jtxtID;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtPrecio;
    private javax.swing.JTextField jtxtSencilloLider;
    // End of variables declaration//GEN-END:variables
}