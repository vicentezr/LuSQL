/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuSQL.grafica;

import LuSQL.comandos.Iniciar;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Conector extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Conector() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        siguiente = new javax.swing.JButton();
        direccion = new javax.swing.JTextField();
        usuario = new javax.swing.JTextField();
        tipo = new javax.swing.JComboBox<>();
        contrasena = new javax.swing.JPasswordField();
        borrarCampos = new javax.swing.JButton();
        conectarWindows = new javax.swing.JButton();
        cargando = new javax.swing.JLabel();
        menuBarra = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menuConectarWindows = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        ayuda = new javax.swing.JMenuItem();
        creditos = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LuSQL v1.5 (ventana de conexión)");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Tipo de base de datos:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Ruta de la base de datos:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Usuario:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Contraseña:");

        siguiente.setBackground(new java.awt.Color(215, 253, 244));
        siguiente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        direccion.setBackground(new java.awt.Color(190, 253, 220));

        usuario.setBackground(new java.awt.Color(190, 253, 220));

        tipo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mysql", "sqlserver" }));
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });

        contrasena.setBackground(new java.awt.Color(190, 253, 220));

        borrarCampos.setBackground(new java.awt.Color(215, 253, 244));
        borrarCampos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        borrarCampos.setText("Borrar campos");
        borrarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarCamposActionPerformed(evt);
            }
        });

        conectarWindows.setBackground(new java.awt.Color(215, 253, 244));
        conectarWindows.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        conectarWindows.setText("Conectar con el usuario actual de Windows");
        conectarWindows.setEnabled(false);
        conectarWindows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarWindowsActionPerformed(evt);
            }
        });

        cargando.setForeground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(conectarWindows)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(borrarCampos))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cargando, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 70, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conectarWindows)
                    .addComponent(borrarCampos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cargando, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        jMenu2.setText("Opciones");

        menuConectarWindows.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        menuConectarWindows.setText("Conectar con el usuario actual de Windows");
        menuConectarWindows.setEnabled(false);
        menuConectarWindows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConectarWindowsActionPerformed(evt);
            }
        });
        jMenu2.add(menuConectarWindows);

        menuBarra.add(jMenu2);

        jMenu1.setText("Ayuda y créditos");

        ayuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        ayuda.setText("Ayuda");
        ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaActionPerformed(evt);
            }
        });
        jMenu1.add(ayuda);

        creditos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        creditos.setText("Créditos");
        creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditosActionPerformed(evt);
            }
        });
        jMenu1.add(creditos);

        menuBarra.add(jMenu1);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed
        new Ayuda();
    }//GEN-LAST:event_ayudaActionPerformed

    private void creditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditosActionPerformed
        Iniciar.desplegarCreditos();
    }//GEN-LAST:event_creditosActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed


//        try {
            if (direccion.equals("")) {
                JOptionPane.showMessageDialog(null, "Se debe especificar una dirección.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (usuario.equals("")) {
                JOptionPane.showMessageDialog(null, "Se debe especificar un usuario.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (contrasena.equals("")) {
                JOptionPane.showMessageDialog(null, "Se debe especificar una contraseña.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
//                System.out.println("jdbc:" + tipo + ":" + direccion + " | " + usuario + " | " + contrasena);
//                System.out.println(usuario);
//                conexion = DriverManager.getConnection("jdbc:" + tipo.getSelectedItem().toString() + "://" + direccion.getText(), usuario.getText(), contrasena.getText());
//                new Consola(conexion, direccion.getText(), tipo.getSelectedItem().toString(), usuario.getText());
//                this.dispose();
            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error de conexión con la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_siguienteActionPerformed

    private void borrarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarCamposActionPerformed
        direccion.setText("");
        usuario.setText("");
        contrasena.setText("");
    }//GEN-LAST:event_borrarCamposActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        if (tipo.getSelectedItem().toString().equals("sqlserver")) {
            conectarWindows.setEnabled(true);
            menuConectarWindows.setEnabled(true);
        } else {
            conectarWindows.setEnabled(false);
            menuConectarWindows.setEnabled(false);
        }
    }//GEN-LAST:event_tipoActionPerformed

    private void conectarWindowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarWindowsActionPerformed
        conectarWindows();
    }//GEN-LAST:event_conectarWindowsActionPerformed

    private void menuConectarWindowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConectarWindowsActionPerformed
        conectarWindows();
    }//GEN-LAST:event_menuConectarWindowsActionPerformed

    private void conectarWindows() {
        JOptionPane.showMessageDialog(null, "Funcion no disponible.");
//        try {
//            conexion = DriverManager.getConnection("jdbc:sqlserver://localhost;integratedSecurity=true");
//            new Consola(conexion, direccion.getText(), "", "");
//            this.dispose();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ayuda;
    private javax.swing.JButton borrarCampos;
    private javax.swing.JLabel cargando;
    private javax.swing.JButton conectarWindows;
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JMenuItem creditos;
    private javax.swing.JTextField direccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenuItem menuConectarWindows;
    private javax.swing.JButton siguiente;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
    private java.sql.Connection conexion;
}
