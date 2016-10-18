/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import clases.Persona;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rmorales1
 */
public class Agregar extends javax.swing.JDialog {

    /**
     * Creates new form Agregar
     */
    String ruta;
    ObjectOutputStream salida;
    ArrayList<Persona> personas;

    public Agregar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ruta = "src/datos/personas.txt";
        try {
            //personas = new ArrayList();
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        Helper.llenarTabla(tblTablaPersonas, ruta);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cmdGuardar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaPersonas = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AGREGAR PERSONAS");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, -1));

        cmdEliminar.setText("Eliminar");
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 120, 120));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Persona"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cédula:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 20));
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 120, -1));

        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 120, -1));

        jLabel3.setText("Apellido:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 120, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 230, 120));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Personas"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Cédula", "Nombre", "Apellido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTablaPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaPersonasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTablaPersonas);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 350, 190));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 370, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(419, 448));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        String cedula, nombre, apellido;
        cedula = txtCedula.getText();
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();

        Persona p = new Persona(cedula, nombre, apellido);
        try {
            p.guardar(salida);
        } catch (IOException ex) {
            Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
        }

        Helper.llenarTabla(tblTablaPersonas, ruta);

        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCedula.requestFocusInWindow();


    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");

        txtCedula.requestFocusInWindow();
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void tblTablaPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaPersonasMouseClicked
        int i;
        Persona p;
        i = tblTablaPersonas.getSelectedRow();
        p = personas.get(i);

        txtCedula.setText(p.getCedula());
        txtNombre.setText(p.getNombre());
        txtApellido.setText(p.getApellido());


    }//GEN-LAST:event_tblTablaPersonasMouseClicked

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        int i, op;
        op = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar a esta persona?", "Eliminar", JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            i = tblTablaPersonas.getSelectedRow();
            personas.remove(i);
            Helper.llenarTabla(tblTablaPersonas, ruta);
            txtCedula.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtCedula.requestFocusInWindow();
        }

    }//GEN-LAST:event_cmdEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Agregar dialog = new Agregar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblTablaPersonas;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
