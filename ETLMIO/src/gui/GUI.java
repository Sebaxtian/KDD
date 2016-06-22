/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControllerGUI;

/**
 *
 * @author sebaxtian
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        ControllerGUI.gui = this;
        
        ControllerGUI.loadSelectFecha();
        
        ControllerGUI.loadDescReporte();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupReportes = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panelFecha1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelFecha2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        selectRutas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        selectEstaciones = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        selectFranjaHoraria1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaReporte = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        lblMensajeLog = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuConectar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        radioReporte1 = new javax.swing.JRadioButtonMenuItem();
        radioReporte2 = new javax.swing.JRadioButtonMenuItem();
        radioReporte3 = new javax.swing.JRadioButtonMenuItem();
        radioReporte4 = new javax.swing.JRadioButtonMenuItem();
        radioReporte5 = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reportes ETL MIO");

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Fecha Inicio:");
        panelFecha1.add(jLabel1);

        jLabel2.setText("Fecha Final:");
        panelFecha2.add(jLabel2);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jLabel5.setText("Rutas:");

        selectRutas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        selectRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectRutasActionPerformed(evt);
            }
        });

        jLabel4.setText("Estaciones:");

        selectEstaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        selectEstaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectEstacionesActionPerformed(evt);
            }
        });

        jLabel3.setText("Franja Horaria:");

        selectFranjaHoraria1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "04:00 - 23:59", "04:00 - 04:59", "05:00 - 05:59", "06:00 - 06:59", "07:00 - 07:59", "08:00 - 08:59", "09:00 - 09:59", "10:00 - 10:59", "11:00 - 11:59", "12:00 - 12:59", "13:00 - 13:59", "14:00 - 14:59", "15:00 - 15:59", "16:00 - 16:59", "17:00 - 17:59", "18:00 - 18:59", "19:00 - 19:59", "20:00 - 20:59", "21:00 - 21:59", "22:00 - 22:59", "23:00 - 23:59" }));
        selectFranjaHoraria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFranjaHoraria1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reporte", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        textAreaReporte.setColumns(20);
        textAreaReporte.setLineWrap(true);
        textAreaReporte.setRows(5);
        jScrollPane1.setViewportView(textAreaReporte);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelFecha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectEstaciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectFranjaHoraria1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectRutas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelFecha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(selectFranjaHoraria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(selectEstaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(selectRutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConsultar)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel4.setLayout(new java.awt.BorderLayout());

        lblMensajeLog.setText("Log:");
        jPanel4.add(lblMensajeLog, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, java.awt.BorderLayout.SOUTH);

        jPanel3.setBackground(new java.awt.Color(254, 254, 254));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Archivo");

        menuConectar.setText("Conectar ...");
        menuConectar.setEnabled(false);
        menuConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConectarActionPerformed(evt);
            }
        });
        jMenu1.add(menuConectar);
        jMenu1.add(jSeparator1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Editar");

        jMenuItem3.setText("Base de Datos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Reporte");

        groupReportes.add(radioReporte1);
        radioReporte1.setSelected(true);
        radioReporte1.setText("Reporte 1");
        radioReporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioReporte1ActionPerformed(evt);
            }
        });
        jMenu2.add(radioReporte1);

        groupReportes.add(radioReporte2);
        radioReporte2.setText("Reporte 2");
        radioReporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioReporte2ActionPerformed(evt);
            }
        });
        jMenu2.add(radioReporte2);

        groupReportes.add(radioReporte3);
        radioReporte3.setText("Reporte 3");
        radioReporte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioReporte3ActionPerformed(evt);
            }
        });
        jMenu2.add(radioReporte3);

        groupReportes.add(radioReporte4);
        radioReporte4.setText("Reporte 4");
        radioReporte4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioReporte4ActionPerformed(evt);
            }
        });
        jMenu2.add(radioReporte4);

        groupReportes.add(radioReporte5);
        radioReporte5.setText("Reporte 5");
        radioReporte5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioReporte5ActionPerformed(evt);
            }
        });
        jMenu2.add(radioReporte5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        GuiConeccionDB.main(null);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConectarActionPerformed
        // TODO add your handling code here:
        ControllerGUI.conectarDB();
    }//GEN-LAST:event_menuConectarActionPerformed

    private void selectFranjaHoraria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFranjaHoraria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectFranjaHoraria1ActionPerformed

    private void selectEstacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectEstacionesActionPerformed
        // TODO add your handling code here:
        if(selectEstaciones.getSelectedIndex() == 0 && !ControllerGUI.visibleGuiEstaciones) {
            System.out.println("Selector de Estaciones");
            GuiSelectEstaciones.main(null);
        }
    }//GEN-LAST:event_selectEstacionesActionPerformed

    private void selectRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectRutasActionPerformed
        // TODO add your handling code here:
        if(selectRutas.getSelectedIndex() == 0 && !ControllerGUI.visibleGuiRutas) {
            System.out.println("Selector de Rutas");
            GuiSelectRutas.main(null);
        }
    }//GEN-LAST:event_selectRutasActionPerformed

    private void radioReporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioReporte1ActionPerformed
        // TODO add your handling code here:
        ControllerGUI.loadDescReporte();
    }//GEN-LAST:event_radioReporte1ActionPerformed

    private void radioReporte5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioReporte5ActionPerformed
        // TODO add your handling code here:
        ControllerGUI.loadDescReporte();
    }//GEN-LAST:event_radioReporte5ActionPerformed

    private void radioReporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioReporte2ActionPerformed
        // TODO add your handling code here:
        ControllerGUI.loadDescReporte();
    }//GEN-LAST:event_radioReporte2ActionPerformed

    private void radioReporte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioReporte3ActionPerformed
        // TODO add your handling code here:
        ControllerGUI.loadDescReporte();
    }//GEN-LAST:event_radioReporte3ActionPerformed

    private void radioReporte4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioReporte4ActionPerformed
        // TODO add your handling code here:
        ControllerGUI.loadDescReporte();
    }//GEN-LAST:event_radioReporte4ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnConsultar;
    public javax.swing.ButtonGroup groupReportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    public javax.swing.JLabel lblMensajeLog;
    public javax.swing.JMenuItem menuConectar;
    public javax.swing.JPanel panelFecha1;
    public javax.swing.JPanel panelFecha2;
    public javax.swing.JRadioButtonMenuItem radioReporte1;
    public javax.swing.JRadioButtonMenuItem radioReporte2;
    public javax.swing.JRadioButtonMenuItem radioReporte3;
    public javax.swing.JRadioButtonMenuItem radioReporte4;
    public javax.swing.JRadioButtonMenuItem radioReporte5;
    public javax.swing.JComboBox<String> selectEstaciones;
    public javax.swing.JComboBox<String> selectFranjaHoraria1;
    public javax.swing.JComboBox<String> selectRutas;
    public javax.swing.JTextArea textAreaReporte;
    // End of variables declaration//GEN-END:variables
}