package app;

import conexion.Conexion;
import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Ygnacio
 */
public class Vinilos extends javax.swing.JFrame {

    Connection con = Conexion.getConexion();
    private String password;
    private int respuesta;
    static int banderita = -1;
    static int cancelar = -1;

    public Vinilos() {
        initComponents();
        jlblSencilloLider.setVisible(false);
        jtxtSencilloLider.setEnabled(false);
        jtxtSencilloLider.setVisible(false);
        jtxtID.setVisible(false);
        jbtnMostrarVista.setVisible(false);

        cargarTabla();
    }

    public void mostrarVista() {
        jbtnMostrarVista.doClick();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
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
        jbtnGuardar = new javax.swing.JButton();
        jbtnModificar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jcboCantidad = new javax.swing.JComboBox<>();
        jcboTipo = new javax.swing.JComboBox<>();
        jcboTamano = new javax.swing.JComboBox<>();
        jtxtID = new javax.swing.JTextField();
        jtxtSencilloLider = new javax.swing.JTextField();
        jlblSencilloLider = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jbtnMostrarVista = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmnArchivo = new javax.swing.JMenu();
        jmnitSalir = new javax.swing.JMenuItem();
        jmnUnidad2y3 = new javax.swing.JMenu();
        jmnitGuardar = new javax.swing.JMenuItem();
        jmnitModificar = new javax.swing.JMenuItem();
        jmnitLimpiar = new javax.swing.JMenuItem();
        jmnitEliminar = new javax.swing.JMenuItem();
        jmnUnidad4 = new javax.swing.JMenu();
        jmnitIniciarSesion = new javax.swing.JMenuItem();
        jmnitCerrarSesion = new javax.swing.JMenuItem();
        jmnUnidad = new javax.swing.JMenu();
        jmnitTransacConcurr = new javax.swing.JMenuItem();
        jmnUnidad6 = new javax.swing.JMenu();
        jmnitVistas = new javax.swing.JMenu();
        jmnitVistasCrearVista = new javax.swing.JMenuItem();
        jmnitVistasEliminarVista = new javax.swing.JMenuItem();
        jmnitProcAlmac = new javax.swing.JMenu();
        jmnitProcAlmacEjecutar = new javax.swing.JMenuItem();
        jmnitTriggers = new javax.swing.JMenu();
        jmnitTriggerMostrar = new javax.swing.JMenuItem();
        jmnUnidad7 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmnitVerAyuda = new javax.swing.JMenuItem();
        jmnitAcercaDe = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("20130778 - InventarioApp");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/principal.png")).getImage());
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
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

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
        jtxtDisquera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDisqueraActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Disquera:");

        jbtnGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

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
        jcboCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboCantidadActionPerformed(evt);
            }
        });

        jcboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estándar", "Gatefold" }));

        jcboTamano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7", "10", "12" }));

        jtxtSencilloLider.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jlblSencilloLider.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlblSencilloLider.setText("Sencillo líder:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlblSencilloLider)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtSencilloLider)
                    .addComponent(jtxtDisquera)
                    .addComponent(jcboCantidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtArtista)
                    .addComponent(jtxtNombre)
                    .addComponent(jcboTamano, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jbtnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnModificar)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jtxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jtxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcboTamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcboCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtDisquera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtSencilloLider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblSencilloLider))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnEliminar)
                        .addComponent(jbtnModificar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnLimpiar)
                        .addComponent(jbtnGuardar)))
                .addGap(32, 32, 32))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 51, 0));
        jLabel9.setText("InventarioApp");

        jbtnMostrarVista.setText("Mostrar vista");
        jbtnMostrarVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMostrarVistaActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Estado:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 153, 0));
        jLabel11.setText("Conectado");

        jmnArchivo.setText("Archivo");

        jmnitSalir.setText("Salir");
        jmnitSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnitSalirActionPerformed(evt);
            }
        });
        jmnArchivo.add(jmnitSalir);

        jMenuBar1.add(jmnArchivo);

        jmnUnidad2y3.setText("Unidad 2 y 3");

        jmnitGuardar.setText("Guardar");
        jmnitGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnitGuardarActionPerformed(evt);
            }
        });
        jmnUnidad2y3.add(jmnitGuardar);

        jmnitModificar.setText("Modificar");
        jmnitModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnitModificarActionPerformed(evt);
            }
        });
        jmnUnidad2y3.add(jmnitModificar);

        jmnitLimpiar.setText("Limpiar");
        jmnitLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnitLimpiarActionPerformed(evt);
            }
        });
        jmnUnidad2y3.add(jmnitLimpiar);

        jmnitEliminar.setText("Eliminar");
        jmnitEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnitEliminarActionPerformed(evt);
            }
        });
        jmnUnidad2y3.add(jmnitEliminar);

        jMenuBar1.add(jmnUnidad2y3);

        jmnUnidad4.setText("Unidad 4");

        jmnitIniciarSesion.setText("Iniciar sesión");
        jmnitIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnitIniciarSesionActionPerformed(evt);
            }
        });
        jmnUnidad4.add(jmnitIniciarSesion);

        jmnitCerrarSesion.setText("Cerrar sesión");
        jmnitCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnitCerrarSesionActionPerformed(evt);
            }
        });
        jmnUnidad4.add(jmnitCerrarSesion);

        jMenuBar1.add(jmnUnidad4);

        jmnUnidad.setText("Unidad 5");

        jmnitTransacConcurr.setText("Transacciones y concurrencia");
        jmnitTransacConcurr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnitTransacConcurrActionPerformed(evt);
            }
        });
        jmnUnidad.add(jmnitTransacConcurr);

        jMenuBar1.add(jmnUnidad);

        jmnUnidad6.setText("Unidad 6");

        jmnitVistas.setText("Vistas");

        jmnitVistasCrearVista.setText("Crear vista");
        jmnitVistasCrearVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnitVistasCrearVistaActionPerformed(evt);
            }
        });
        jmnitVistas.add(jmnitVistasCrearVista);

        jmnitVistasEliminarVista.setText("Eliminar vista");
        jmnitVistasEliminarVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnitVistasEliminarVistaActionPerformed(evt);
            }
        });
        jmnitVistas.add(jmnitVistasEliminarVista);

        jmnUnidad6.add(jmnitVistas);

        jmnitProcAlmac.setText("Procedimientos almacenados");

        jmnitProcAlmacEjecutar.setText("Ejecutar procedimiento almacenado");
        jmnitProcAlmacEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnitProcAlmacEjecutarActionPerformed(evt);
            }
        });
        jmnitProcAlmac.add(jmnitProcAlmacEjecutar);

        jmnUnidad6.add(jmnitProcAlmac);

        jmnitTriggers.setText("Triggers");

        jmnitTriggerMostrar.setText("Mostrar trigger");
        jmnitTriggerMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnitTriggerMostrarActionPerformed(evt);
            }
        });
        jmnitTriggers.add(jmnitTriggerMostrar);

        jmnUnidad6.add(jmnitTriggers);

        jMenuBar1.add(jmnUnidad6);

        jmnUnidad7.setText("Unidad 7");

        jMenuItem3.setText("Modo desconectado");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jmnUnidad7.add(jMenuItem3);

        jMenuBar1.add(jmnUnidad7);

        jMenu3.setText("Ayuda");

        jmnitVerAyuda.setText("Ver la Ayuda");
        jmnitVerAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnitVerAyudaActionPerformed(evt);
            }
        });
        jMenu3.add(jmnitVerAyuda);

        jmnitAcercaDe.setText("Acerca de");
        jmnitAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnitAcercaDeActionPerformed(evt);
            }
        });
        jMenu3.add(jmnitAcercaDe);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnMostrarVista)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jbtnMostrarVista)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)))
                .addGap(0, 0, 0)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        jmnitGuardar.doClick();
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jtblVinilosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblVinilosMouseClicked
        if (!jbtnGuardar.isEnabled()) {
            cancelar = 0;
        }

        try {
            int fila = jtblVinilos.getSelectedRow();
            int id = Integer.parseInt(jtblVinilos.getValueAt(fila, 0).toString());
            ResultSet rs;
            con = Conexion.getConexion();

            PreparedStatement ps = con.prepareStatement("OPEN SYMMETRIC KEY sencilloLider_sym_key DECRYPTION\n"
                    + "BY PASSWORD = '" + password + "'\n"
                    + "\n"
                    + "SELECT tipo, tamano, nombre, artista, precio, cantidad, disquera, sencilloLider FROM vinilos WHERE idVinilo=?"
                    + "\n"
                    + "CLOSE SYMMETRIC KEY sencilloLider_sym_key"
            );

            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                jtxtID.setText(String.valueOf(id));
                jcboTipo.setSelectedItem(rs.getString("tipo"));
                jcboTamano.setSelectedItem(rs.getString("tamano"));
                jtxtNombre.setText(rs.getString("nombre"));
                jtxtArtista.setText(rs.getString("artista"));
                jtxtPrecio.setText(rs.getString("precio"));
                jcboCantidad.setSelectedItem(rs.getString("cantidad"));
                jtxtDisquera.setText(rs.getString("disquera"));
                jtxtSencilloLider.setText(rs.getString("sencilloLider"));
            }
        } catch (SQLException ex) {
            if (cancelar == -1) {
                jmnitIniciarSesion.doClick();
                if (jbtnGuardar.isEnabled()) {
                    cancelar = 0;
                }
            }
        }
    }//GEN-LAST:event_jtblVinilosMouseClicked

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        jmnitModificar.doClick();
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        jmnitEliminar.doClick();
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        jmnitLimpiar.doClick();
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

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

    private void jmnitIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnitIniciarSesionActionPerformed
        password = JOptionPane.showInputDialog(
                this,
                "<html><b>Contraseña: </html></b>",
                "Iniciar sesión",
                JOptionPane.INFORMATION_MESSAGE
        );

        cargarTablaDesenc(password);
    }//GEN-LAST:event_jmnitIniciarSesionActionPerformed

    private void jmnitCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnitCerrarSesionActionPerformed
        if (jtxtSencilloLider.isEnabled() == false) {
            JOptionPane.showMessageDialog(
                    this,
                    "<html><b>No hay sesión activa.</html></b>"
                    + "\nInicie sesión para continuar.",
                    "Cerrar sesión",
                    JOptionPane.QUESTION_MESSAGE
            );
        } else {
            respuesta = JOptionPane.showConfirmDialog(
                    this,
                    "<html><b>¿Desea cerrar sesión?</b></html>",
                    "Cerrar sesión",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            if (respuesta == JOptionPane.YES_OPTION) {
                cargarTabla();
                limpiar();
                password = null;
                jtxtSencilloLider.setEnabled(false);
                jlblSencilloLider.setVisible(false);
                jtxtSencilloLider.setVisible(false);
            }
        }
    }//GEN-LAST:event_jmnitCerrarSesionActionPerformed

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

    private void jtxtDisqueraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDisqueraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDisqueraActionPerformed

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

    private void jmnitVerAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnitVerAyudaActionPerformed
        JOptionPane.showMessageDialog(
                this,
                "Para poder modificar los registros, es necesario ingresar la "
                + "contraseña de la llave simétrica, proveniente de la base "
                + "de datos tiendaVinilos (sencilloLider_sym_key).\n"
                + "Es importante cerrar la sesión desde el apartado de Inventario "
                + "al terminar los cambios realizados, puesto que mantiene la"
                + "confidencialidad del dato que se encriptó previamente.\n"
                + "<html>La contraseña para el inicio de sesión es: <b>ejercici03ncriptacion</b></html>\n",
                "Ayuda",
                JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jmnitVerAyudaActionPerformed

    private void jcboCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcboCantidadActionPerformed

    private void jmnitGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnitGuardarActionPerformed
        String tipo = jcboTipo.getSelectedItem().toString();
        int tamano = Integer.parseInt(jcboTamano.getSelectedItem() + "");
        String nombre = jtxtNombre.getText();
        String artista = jtxtArtista.getText();
        int precio = Integer.parseInt(jtxtPrecio.getText());
        int cantidad = Integer.parseInt(jcboCantidad.getSelectedItem() + "");
        String disquera = jtxtDisquera.getText();
        String sencilloLider = jtxtSencilloLider.getText();

        try {
            con.setAutoCommit(false);
            PreparedStatement ps = con.prepareStatement("INSERT INTO dbo.vinilos "
                    + "(tipo, tamano, nombre, artista, precio, cantidad, disquera, activo, sencilloLider) "
                    + "VALUES (?,?,?,?,?,?,?,?,?)");
            con.commit();

            ps.setString(1, tipo);
            ps.setInt(2, tamano);
            ps.setString(3, nombre);
            ps.setString(4, artista);
            ps.setInt(5, precio);
            ps.setInt(6, cantidad);
            ps.setString(7, disquera);
            ps.setInt(8, 1);
            ps.setString(9, sencilloLider);

            ps.executeUpdate();

            PreparedStatement en = con.prepareStatement("OPEN SYMMETRIC KEY sencilloLider_sym_key DECRYPTION\n"
                    + "BY PASSWORD = '" + password + "'\n"
                    + "UPDATE dbo.vinilos\n"
                    + "SET sencilloLider_enc = ENCRYPTBYKEY(KEY_GUID('sencilloLider_sym_key'), sencilloLider)\n"
                    + "\n"
                    + "CLOSE SYMMETRIC KEY sencilloLider_sym_key");

            en.executeUpdate();

            con.commit();

            JOptionPane.showConfirmDialog(this, "Registro guardado exitosamente.", "Acción realizada", JOptionPane.OK_OPTION);

            limpiar();
            cargarTablaDesenc(password);

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
    }//GEN-LAST:event_jmnitGuardarActionPerformed

    private void jmnitModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnitModificarActionPerformed
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
                con.setAutoCommit(false);
                PreparedStatement ps = con.prepareStatement("UPDATE dbo.vinilos "
                        + "SET tipo=?, tamano=?, nombre=?, artista=?, precio=?, "
                        + "cantidad=?, disquera=?, sencilloLider=? WHERE idVinilo=?");
                con.commit();

                ps.setString(1, tipo);
                ps.setInt(2, tamano);
                ps.setString(3, nombre);
                ps.setString(4, artista);
                ps.setInt(5, precio);
                ps.setInt(6, cantidad);
                ps.setString(7, disquera);
                ps.setString(8, sencilloLider);
                ps.setInt(9, id);

                ps.executeUpdate();

                PreparedStatement en = con.prepareStatement("OPEN SYMMETRIC KEY sencilloLider_sym_key DECRYPTION\n"
                        + "BY PASSWORD = '" + password + "'\n"
                        + "UPDATE dbo.vinilos\n"
                        + "SET sencilloLider_enc = ENCRYPTBYKEY(KEY_GUID('sencilloLider_sym_key'), sencilloLider)\n"
                        + "\n"
                        + "CLOSE SYMMETRIC KEY sencilloLider_sym_key");

                en.executeUpdate();
                con.commit();

                JOptionPane.showMessageDialog(null, "Registro modificado exitosamente", "Acción realizada", JOptionPane.INFORMATION_MESSAGE);

                limpiar();
                cargarTablaDesenc(password);

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
        }
    }//GEN-LAST:event_jmnitModificarActionPerformed

    private void jmnitLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnitLimpiarActionPerformed
        respuesta = JOptionPane.showConfirmDialog(
                this,
                "La acción ejecutada limpiará los datos que todavía no han sido guardados. \n"
                + "<html><b>¿Desea continuar?</b></html>",
                "Confirmar acción",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            limpiar();
        }
    }//GEN-LAST:event_jmnitLimpiarActionPerformed

    private void jmnitEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnitEliminarActionPerformed
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
                con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("UPDATE dbo.vinilos SET activo=0 WHERE idVinilo=?");

                ps.setInt(1, id);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente", "Acción realizada", JOptionPane.INFORMATION_MESSAGE);

                limpiar();
                cargarTablaDesenc(password);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
    }//GEN-LAST:event_jmnitEliminarActionPerformed

    private void jmnitVistasCrearVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnitVistasCrearVistaActionPerformed
        Selector selectorVista = new Selector(this, true);
        selectorVista.setVisible(true);

        if (banderita == 0) {
            DefaultTableModel modelo = (DefaultTableModel) jtblVinilos.getModel();
            modelo.setRowCount(0);

            jbtnGuardar.setEnabled(false);
            jbtnLimpiar.setEnabled(false);
            jbtnEliminar.setEnabled(false);
            jbtnModificar.setEnabled(false);

            ResultSet rs;
            ResultSetMetaData rsmd;
            int columnas;
            int[] anchos = {10, 40, 30, 150, 70, 30, 30, 90, 20, 80};

            for (int i = 0; i < jtblVinilos.getColumnCount(); i++) {
                jtblVinilos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            try {
                con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("IF OBJECT_ID ('personalizada_view', 'V') IS NOT NULL "
                        + "DROP VIEW personalizada_view;");

                ps.executeUpdate();

                ps = con.prepareStatement("CREATE VIEW personalizada_view AS"
                        + " SELECT " + Selector.getConsulta() + " FROM vinilos");

                ps.executeUpdate();

                ps = con.prepareStatement("SELECT * FROM personalizada_view");

                JTableHeader tableHeader = jtblVinilos.getTableHeader();
                TableColumnModel tableColumnModel = tableHeader.getColumnModel();

                rs = ps.executeQuery();
                rsmd = rs.getMetaData();
                columnas = rsmd.getColumnCount();

                while (rs.next()) {
                    Object[] fila = new Object[Selector.getContador()];
                    for (int indice = 0; indice < Selector.getContador(); indice++) {
                        fila[indice] = rs.getString(indice + 1);
                        modelo.setColumnCount(Selector.getContador());
                    }
                    modelo.addRow(fila);
                }

                String col = Selector.getID();

                for (int indice = 0; indice < Selector.getContador(); indice++) {
                    TableColumn tableColumn = tableColumnModel.getColumn(indice);

                    char id = col.charAt(indice);

                    switch (id) {
                        case '0':
                            tableColumn.setHeaderValue("ID");
                            break;
                        case '1':
                            tableColumn.setHeaderValue("Tipo");
                            break;
                        case '2':
                            tableColumn.setHeaderValue("Tamaño");
                            break;
                        case '3':
                            tableColumn.setHeaderValue("Nombre");
                            break;
                        case '4':
                            tableColumn.setHeaderValue("Artista");
                            break;
                        case '5':
                            tableColumn.setHeaderValue("Precio");
                            break;
                        case '6':
                            tableColumn.setHeaderValue("Cantidad");
                            break;
                        case '7':
                            tableColumn.setHeaderValue("Disquera");
                            break;
                        case '8':
                            tableColumn.setHeaderValue("Activo");
                            break;
                        case '9':
                            tableColumn.setHeaderValue("Sencillo líder");
                            break;
                    }
                    tableHeader.repaint();
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
            banderita = -1;
        }
    }//GEN-LAST:event_jmnitVistasCrearVistaActionPerformed

    private void jbtnMostrarVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMostrarVistaActionPerformed
        //jLabel10.setText(SelectorVista.getConsulta() + "");
        DefaultTableModel modelo = (DefaultTableModel) jtblVinilos.getModel();
        modelo.setRowCount(0);

        jbtnGuardar.setEnabled(false);
        jbtnLimpiar.setEnabled(false);
        jbtnEliminar.setEnabled(false);
        jbtnModificar.setEnabled(false);

        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        int[] anchos = {10, 40, 30, 150, 70, 30, 30, 90, 20, 80};

        for (int i = 0; i < jtblVinilos.getColumnCount(); i++) {
            jtblVinilos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        try {
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("IF OBJECT_ID ('personalizada_view', 'V') IS NOT NULL "
                    + "DROP VIEW personalizada_view;");

            ps.executeUpdate();

            ps = con.prepareStatement("CREATE VIEW personalizada_view AS"
                    + " SELECT " + Selector.getConsulta() + " FROM vinilos");

            ps.executeUpdate();

            ps = con.prepareStatement("SELECT * FROM personalizada_view");

            JTableHeader tableHeader = jtblVinilos.getTableHeader();
            TableColumnModel tableColumnModel = tableHeader.getColumnModel();

            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[Selector.getContador()];
                for (int indice = 0; indice < Selector.getContador(); indice++) {
                    fila[indice] = rs.getString(indice + 1);
                    modelo.setColumnCount(Selector.getContador());
                }
                modelo.addRow(fila);
            }

            String col = Selector.getID();

            for (int indice = 0; indice < Selector.getContador(); indice++) {
                TableColumn tableColumn = tableColumnModel.getColumn(indice);

                char id = col.charAt(indice);

                switch (id) {
                    case '0':
                        tableColumn.setHeaderValue("ID");
                        break;
                    case '1':
                        tableColumn.setHeaderValue("Tipo");
                        break;
                    case '2':
                        tableColumn.setHeaderValue("Tamaño");
                        break;
                    case '3':
                        tableColumn.setHeaderValue("Nombre");
                        break;
                    case '4':
                        tableColumn.setHeaderValue("Artista");
                        break;
                    case '5':
                        tableColumn.setHeaderValue("Precio");
                        break;
                    case '6':
                        tableColumn.setHeaderValue("Cantidad");
                        break;
                    case '7':
                        tableColumn.setHeaderValue("Disquera");
                        break;
                    case '8':
                        tableColumn.setHeaderValue("Activo");
                        break;
                    case '9':
                        tableColumn.setHeaderValue("Sencillo líder");
                        break;
                }
                tableHeader.repaint();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_jbtnMostrarVistaActionPerformed

    private void jmnitVistasEliminarVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnitVistasEliminarVistaActionPerformed
        cancelar = -1;

        jbtnGuardar.setEnabled(true);
        jbtnLimpiar.setEnabled(true);
        jbtnEliminar.setEnabled(true);
        jbtnModificar.setEnabled(true);

        DefaultTableModel modelo = (DefaultTableModel) jtblVinilos.getModel();

        modelo.setColumnCount(10);

        int[] anchos = {10, 40, 30, 150, 70, 30, 30, 90, 20, 80};

        JTableHeader tableHeader = jtblVinilos.getTableHeader();
        TableColumnModel tableColumnModel = tableHeader.getColumnModel();

        String[] titulos = {"ID", "Tipo", "Tamaño", "Nombre", "Artista",
            "Precio", "Cantidad", "Disquera", "Activo",
            "Sencillo líder"};

        for (int i = 0; i < jtblVinilos.getColumnCount(); i++) {
            jtblVinilos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            TableColumn tableColumn = tableColumnModel.getColumn(i);
            tableColumn.setHeaderValue(titulos[i]);
        }

        tableHeader.repaint();

        cargarTabla();
    }//GEN-LAST:event_jmnitVistasEliminarVistaActionPerformed

    private void jmnitProcAlmacEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnitProcAlmacEjecutarActionPerformed
        String tipo = jcboTipo.getSelectedItem().toString();
        int tamano = Integer.parseInt(jcboTamano.getSelectedItem() + "");
        String nombre = jtxtNombre.getText();
        String artista = jtxtArtista.getText();
        int precio = Integer.parseInt(jtxtPrecio.getText());
        int cantidad = Integer.parseInt(jcboCantidad.getSelectedItem() + "");
        String disquera = jtxtDisquera.getText();
        String sencilloLider = jtxtSencilloLider.getText();

        try {
            con.setAutoCommit(false);
            PreparedStatement ps = con.prepareStatement("EXECUTE insert_sp "
                    + "?, ?, ?, ?, ?, ?, ?, ?, ?");
            con.commit();

            ps.setString(1, tipo);
            ps.setInt(2, tamano);
            ps.setString(3, nombre);
            ps.setString(4, artista);
            ps.setInt(5, precio);
            ps.setInt(6, cantidad);
            ps.setString(7, disquera);
            ps.setInt(8, 1);
            ps.setString(9, sencilloLider);

            ps.executeUpdate();

            PreparedStatement en = con.prepareStatement("OPEN SYMMETRIC KEY sencilloLider_sym_key DECRYPTION\n"
                    + "BY PASSWORD = '" + password + "'\n"
                    + "UPDATE dbo.vinilos\n"
                    + "SET sencilloLider_enc = ENCRYPTBYKEY(KEY_GUID('sencilloLider_sym_key'), sencilloLider)\n"
                    + "\n"
                    + "CLOSE SYMMETRIC KEY sencilloLider_sym_key");

            en.executeUpdate();

            con.commit();

            JOptionPane.showConfirmDialog(this, "Registro guardado exitosamente.", "Acción realizada", JOptionPane.OK_OPTION);

            limpiar();
            cargarTablaDesenc(password);

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
    }//GEN-LAST:event_jmnitProcAlmacEjecutarActionPerformed

    private void jmnitTriggerMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnitTriggerMostrarActionPerformed
        Stock stock = new Stock(this, true);
        stock.setVisible(true);
    }//GEN-LAST:event_jmnitTriggerMostrarActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        int resp = -1;
        if (!jbtnGuardar.isEnabled()) {
            resp = JOptionPane.showConfirmDialog (
                    this,
                    "<html><b>Editor deshabilitado.</b></html>"
                    + "\n¿Desea eliminar la vista para continuar?", "Error",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );
        }

        if (resp == JOptionPane.YES_OPTION) {
            jmnitVistasEliminarVista.doClick();
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jmnitTransacConcurrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnitTransacConcurrActionPerformed
        JOptionPane.showMessageDialog(
                this,
                "Las transacciones y concurrencia para esta aplicación se "
                + "encuentran contenidas dentro de los botones Guardar y "
                + "Modificar.\nEn el momento que se requiera almacenar o "
                + "modificar la información mostrada en la app, y siempre "
                + "y cuando la información sea consistente con lo que se "
                + "haya insertado previamente al definir la base de datos, "
                + "se aplicará commit y rollback, respectivamente.",
                "Transacciones y concurrencia",
                JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jmnitTransacConcurrActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        respuesta = JOptionPane.showConfirmDialog (
                this, 
                "El programa entrará en modo desconectado. \n"
                + "<html><b>¿Desea continuar?</b></html>",
                "Modo desconectado",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
        
        if(respuesta == JOptionPane.YES_OPTION) {
            try {
                VinilosOffline app = new VinilosOffline();
                app.setVisible(true);
                this.setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(Vinilos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    
    private void cargarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jtblVinilos.getModel();
        modelo.setRowCount(0);

        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        int [] anchos = {10, 40, 30, 150, 70, 30, 30, 90, 20, 80};

        for (int i = 0; i < jtblVinilos.getColumnCount(); i++) {
            jtblVinilos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        try {
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("SELECT idVinilo, tipo, tamano, nombre, artista, precio, cantidad, disquera, activo, sencilloLider_enc FROM vinilos WHERE activo=1 ORDER BY idVinilo");

            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = rs.getString(indice + 1);
                }
                modelo.addRow(fila);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    private void cargarTablaDesenc(String password) {
        DefaultTableModel modelo = (DefaultTableModel) jtblVinilos.getModel();
        modelo.setRowCount(0);

        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        int[] anchos = {10, 40, 30, 150, 70, 30, 30, 90, 20, 80};

        for (int i = 0; i < jtblVinilos.getColumnCount(); i++) {
            jtblVinilos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        try {
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("OPEN SYMMETRIC KEY sencilloLider_sym_key DECRYPTION\n"
                    + "BY PASSWORD = '" + password + "'\n"
                    + "\n"
                    + "SELECT idVinilo, tipo, tamano, nombre, artista, precio, cantidad, disquera, activo, CONVERT(VARCHAR(50), DECRYPTBYKEY(sencilloLider_enc)) FROM vinilos WHERE activo=1 ORDER BY idVinilo"
                    + "\n"
                    + "CLOSE SYMMETRIC KEY sencilloLider_sym_key");

            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = rs.getString(indice + 1);
                }
                modelo.addRow(fila);
            }
            jlblSencilloLider.setVisible(true);
            jtxtSencilloLider.setEnabled(true);
            jtxtSencilloLider.setVisible(true);

        } catch (SQLException ex) {
            cargarTabla();
            JOptionPane.showMessageDialog(this, "<html><b>Contraseña incorrecta.</b></html>"
                    + "\nPor favor, inténtelo de nuevo.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jlblSencilloLider.setVisible(false);
            jtxtSencilloLider.setVisible(false);
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
        jtxtSencilloLider.setText("");
    }

    public static void main(String args[]) {
        try {
            FlatLightLaf.setup();
        } catch (Exception ex) {
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Vinilos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
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
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JButton jbtnMostrarVista;
    private javax.swing.JComboBox<String> jcboCantidad;
    private javax.swing.JComboBox<String> jcboTamano;
    private javax.swing.JComboBox<String> jcboTipo;
    private javax.swing.JLabel jlblSencilloLider;
    private javax.swing.JMenu jmnArchivo;
    private javax.swing.JMenu jmnUnidad;
    private javax.swing.JMenu jmnUnidad2y3;
    private javax.swing.JMenu jmnUnidad4;
    private javax.swing.JMenu jmnUnidad6;
    private javax.swing.JMenu jmnUnidad7;
    private javax.swing.JMenuItem jmnitAcercaDe;
    private javax.swing.JMenuItem jmnitCerrarSesion;
    private javax.swing.JMenuItem jmnitEliminar;
    private javax.swing.JMenuItem jmnitGuardar;
    private javax.swing.JMenuItem jmnitIniciarSesion;
    private javax.swing.JMenuItem jmnitLimpiar;
    private javax.swing.JMenuItem jmnitModificar;
    private javax.swing.JMenu jmnitProcAlmac;
    private javax.swing.JMenuItem jmnitProcAlmacEjecutar;
    private javax.swing.JMenuItem jmnitSalir;
    private javax.swing.JMenuItem jmnitTransacConcurr;
    private javax.swing.JMenuItem jmnitTriggerMostrar;
    private javax.swing.JMenu jmnitTriggers;
    private javax.swing.JMenuItem jmnitVerAyuda;
    private javax.swing.JMenu jmnitVistas;
    private javax.swing.JMenuItem jmnitVistasCrearVista;
    private javax.swing.JMenuItem jmnitVistasEliminarVista;
    private javax.swing.JTable jtblVinilos;
    private javax.swing.JTextField jtxtArtista;
    private javax.swing.JTextField jtxtDisquera;
    private javax.swing.JTextField jtxtID;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtPrecio;
    private javax.swing.JTextField jtxtSencilloLider;
    // End of variables declaration//GEN-END:variables
}
