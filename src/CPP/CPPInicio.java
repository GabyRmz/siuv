/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CPP;

import java.awt.Dimension;


/**
 *
 * @author lscauv
 */
public class CPPInicio extends javax.swing.JFrame {

    /**
     * Creates new form CPCInicio
     */
    public CPPInicio() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Pagos = new java.awt.Button();
        button2 = new java.awt.Button();
        button1 = new java.awt.Button();
        button5 = new java.awt.Button();
        btnSalir = new java.awt.Button();
        lblNombre1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Pagos1 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        button6 = new java.awt.Button();
        btnSalir1 = new java.awt.Button();
        escritorio = new javax.swing.JDesktopPane();
        lblNombre3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Pagos2 = new java.awt.Button();
        PagosProveedor = new java.awt.Button();
        btnSalir3 = new java.awt.Button();
        PagosAcreedor = new java.awt.Button();
        Pagos3 = new java.awt.Button();
        Guardar = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        mnuPrincipal = new javax.swing.JMenuItem();
        NuevoAcreedor = new javax.swing.JMenuItem();
        reportePagosPeriodoMenu1 = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        NuevoPago = new javax.swing.JMenuItem();
        NuevoPago1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuConsultarP = new javax.swing.JMenuItem();
        mnuConsultarP1 = new javax.swing.JMenuItem();

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNombre.setText("Cuentas por Pagar: ");

        jLabel1.setText("Seleccione la opcion:");

        Pagos.setActionCommand("button2");
        Pagos.setLabel("Pagos");

        button2.setLabel("Pagos pendientes");

        button1.setActionCommand("button3");
        button1.setLabel("Consulta");

        button5.setActionCommand("button4");
        button5.setLabel("Generar reporte");
        button5.setName(""); // NOI18N

        btnSalir.setLabel("Salir");
        btnSalir.setName("Cancelar"); // NOI18N

        lblNombre1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNombre1.setText("Cuentas por Pagar: ");

        jLabel2.setText("Seleccione la opcion:");

        Pagos1.setActionCommand("button2");
        Pagos1.setLabel("Pagos");

        button3.setLabel("Pagos pendientes");

        button4.setActionCommand("button3");
        button4.setLabel("Consulta");

        button6.setActionCommand("button4");
        button6.setLabel("Generar reporte");
        button6.setName(""); // NOI18N

        btnSalir1.setLabel("Salir");
        btnSalir1.setName("Cancelar"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Módulo de cuentas por cobrar");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(0, 0));
        setMinimumSize(new java.awt.Dimension(450, 350));
        getContentPane().setLayout(null);

        lblNombre3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblNombre3.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre3.setText("Cuentas por Pagar: ");
        lblNombre3.setBounds(410, 90, 450, 60);
        escritorio.add(lblNombre3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seleccione la opcion:");
        jLabel4.setBounds(530, 260, 220, 50);
        escritorio.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Pagos2.setActionCommand("button2");
        Pagos2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Pagos2.setLabel("Pagos acreedor");
        Pagos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pagos2ActionPerformed(evt);
            }
        });
        Pagos2.setBounds(120, 500, 230, 70);
        escritorio.add(Pagos2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        PagosProveedor.setActionCommand("button3");
        PagosProveedor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PagosProveedor.setLabel("Consulta Proveedor");
        PagosProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagosProveedorActionPerformed(evt);
            }
        });
        PagosProveedor.setBounds(500, 380, 240, 70);
        escritorio.add(PagosProveedor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnSalir3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSalir3.setLabel("Salir");
        btnSalir3.setName("Cancelar"); // NOI18N
        btnSalir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir3ActionPerformed(evt);
            }
        });
        btnSalir3.setBounds(930, 380, 250, 70);
        escritorio.add(btnSalir3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        PagosAcreedor.setActionCommand("button3");
        PagosAcreedor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PagosAcreedor.setLabel("Consulta Acreedor");
        PagosAcreedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagosAcreedorActionPerformed(evt);
            }
        });
        PagosAcreedor.setBounds(500, 500, 240, 70);
        escritorio.add(PagosAcreedor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Pagos3.setActionCommand("button2");
        Pagos3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Pagos3.setLabel("Pagos proveedor");
        Pagos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pagos3ActionPerformed(evt);
            }
        });
        Pagos3.setBounds(120, 380, 230, 70);
        escritorio.add(Pagos3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(escritorio);
        escritorio.setBounds(0, 0, 1370, 750);

        Guardar.setText("Nuevo");
        getContentPane().add(Guardar);
        Guardar.setBounds(0, 0, 63, 23);

        jMenu3.setText("Menú");

        mnuPrincipal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        mnuPrincipal.setText("Menú principal");
        mnuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPrincipalActionPerformed(evt);
            }
        });
        jMenu3.add(mnuPrincipal);

        NuevoAcreedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        NuevoAcreedor.setText("Nuevo acreedor");
        NuevoAcreedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoAcreedorActionPerformed(evt);
            }
        });
        jMenu3.add(NuevoAcreedor);

        reportePagosPeriodoMenu1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        reportePagosPeriodoMenu1.setText("Reporte de pagos por período");
        reportePagosPeriodoMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportePagosPeriodoMenu1ActionPerformed(evt);
            }
        });
        jMenu3.add(reportePagosPeriodoMenu1);

        mnuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu3.add(mnuSalir);

        menuBar.add(jMenu3);

        jMenu2.setText("Pagos");

        NuevoPago.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        NuevoPago.setText("Nuevo Pago proveedor");
        NuevoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoPagoActionPerformed(evt);
            }
        });
        jMenu2.add(NuevoPago);

        NuevoPago1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        NuevoPago1.setText("Nuevo Pago Acreedor");
        NuevoPago1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoPago1ActionPerformed(evt);
            }
        });
        jMenu2.add(NuevoPago1);

        menuBar.add(jMenu2);

        jMenu4.setText("Opciones");

        mnuConsultarP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mnuConsultarP.setText("Consultar Proveedor");
        mnuConsultarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultarPActionPerformed(evt);
            }
        });
        jMenu4.add(mnuConsultarP);

        mnuConsultarP1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mnuConsultarP1.setText("Consultar Acreedor");
        mnuConsultarP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultarP1ActionPerformed(evt);
            }
        });
        jMenu4.add(mnuConsultarP1);

        menuBar.add(jMenu4);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Pagos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pagos2ActionPerformed
        // TODO add your handling code here:
        NuevoPagoAcreedor a = new NuevoPagoAcreedor();
        escritorio.add(a);
        a.show();
   
    }//GEN-LAST:event_Pagos2ActionPerformed

    private void btnSalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalir3ActionPerformed

    private void PagosAcreedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagosAcreedorActionPerformed
        PagosAcreedores obj = new PagosAcreedores();
        escritorio.add(obj);
        obj.show();        
    }//GEN-LAST:event_PagosAcreedorActionPerformed

    private void PagosProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagosProveedorActionPerformed
        PagosProveedores obj = new PagosProveedores();
        escritorio.add(obj);
        obj.show();
    }//GEN-LAST:event_PagosProveedorActionPerformed

    private void mnuConsultarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultarPActionPerformed
        PagosProveedores obj = new PagosProveedores();
        escritorio.add(obj);
        obj.show();
    }//GEN-LAST:event_mnuConsultarPActionPerformed

    private void mnuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPrincipalActionPerformed
        //  Inicio principal = new Inicio();
        //   principal.setVisible(true);
    }//GEN-LAST:event_mnuPrincipalActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void NuevoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoPagoActionPerformed
        // TODO add your handling code here:
        Pagos obj = new Pagos();
        escritorio.add(obj);
        obj.show();
    }//GEN-LAST:event_NuevoPagoActionPerformed

    private void reportePagosPeriodoMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportePagosPeriodoMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportePagosPeriodoMenu1ActionPerformed

    private void NuevoAcreedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoAcreedorActionPerformed
        // TODO add your handling code here:
        Acreedor a = new Acreedor();
        escritorio.add(a);
        a.show();
        
               
    }//GEN-LAST:event_NuevoAcreedorActionPerformed

    private void Pagos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pagos3ActionPerformed
        // TODO add your handling code here:
        Pagos obj = new Pagos();
        escritorio.add(obj);
        obj.show();
    }//GEN-LAST:event_Pagos3ActionPerformed

    private void NuevoPago1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoPago1ActionPerformed
        // TODO add your handling code here:
        NuevoPagoAcreedor a = new NuevoPagoAcreedor();
        escritorio.add(a);
        a.show();
    }//GEN-LAST:event_NuevoPago1ActionPerformed

    private void mnuConsultarP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultarP1ActionPerformed
        PagosAcreedores obj = new PagosAcreedores();
        escritorio.add(obj);
        obj.show();        
    }//GEN-LAST:event_mnuConsultarP1ActionPerformed

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
            java.util.logging.Logger.getLogger(CPPInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CPPInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CPPInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CPPInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CPPInicio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JMenuItem NuevoAcreedor;
    private javax.swing.JMenuItem NuevoPago;
    private javax.swing.JMenuItem NuevoPago1;
    private java.awt.Button Pagos;
    private java.awt.Button Pagos1;
    private java.awt.Button Pagos2;
    private java.awt.Button Pagos3;
    private java.awt.Button PagosAcreedor;
    private java.awt.Button PagosProveedor;
    private java.awt.Button btnSalir;
    private java.awt.Button btnSalir1;
    private java.awt.Button btnSalir3;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnuConsultarP;
    private javax.swing.JMenuItem mnuConsultarP1;
    private javax.swing.JMenuItem mnuPrincipal;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenuItem reportePagosPeriodoMenu1;
    // End of variables declaration//GEN-END:variables
}
