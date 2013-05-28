/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Proveedores;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class OrdenCompras extends javax.swing.JFrame {

    
    Connection conexion;
    ResultSet rs;
    PreparedStatement psExecute;
    Statement stmt;
    MysqlDataSource data = new MysqlDataSource();
    String nombre;
   
    
   
    public OrdenCompras() {
        this.psExecute = null;
        initComponents();
        setLocationRelativeTo(null);
       
        data.setUser("root");
        data.setPassword("uv");
        data.setDatabaseName("siuv");
        data.setServerName("127.0.0.1");
        txtFecha.setText(fechaActual());
        txtCredito.setText(fechaActual());
        txtFolio.setText(Folio());
    }
public static String fechaActual() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY/MM/dd");
        return formatoFecha.format(fecha);
    }

  public String Folio() {
        String FactSql = "SELECT MAX(ID_Compras)+1 AS NumeroFolio FROM orden_compras";
        try {
            conexion = data.getConnection();
            psExecute = conexion.prepareStatement(FactSql);
            rs = psExecute.executeQuery();
            while (rs.next()) {
                String fol = rs.getString("NumeroFolio");
                txtFolio.setText(fol);
                return fol;
            }
            String resu = FactSql;
            return (resu);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
            return "return catch";
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIDP = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        txtCredito = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        BotonEnviar = new javax.swing.JButton();
        CancelarOrden = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtFolio = new javax.swing.JLabel();
        BotonBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        ComboBoxBuscar = new javax.swing.JComboBox();
        limpiar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Euphemia", 1, 36)); // NOI18N
        jLabel1.setText("Orden de compras");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Producto:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Cantidad:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Fecha de compra:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Monto total:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Crédito:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("RFC Proveedor:");

        txtIDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDPActionPerformed(evt);
            }
        });

        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        txtMonto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });

        txtCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreditoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("$");

        BotonEnviar.setText("Enviar");
        BotonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEnviarActionPerformed(evt);
            }
        });

        CancelarOrden.setText("Cancelar");
        CancelarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarOrdenActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Folio:");

        txtFolio.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        txtFolio.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtFolioComponentAdded(evt);
            }
        });
        txtFolio.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtFolioAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        jLabel11.setText("MX");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Buscar:");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        ComboBoxBuscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Folio", "Fecha de compra" }));
        ComboBoxBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxBuscarActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        Borrar.setText("Eliminar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ComboBoxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(limpiar))
                                    .addComponent(jSeparator1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotonEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(CancelarOrden)
                                .addGap(90, 90, 90)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCredito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtIDP, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(limpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CancelarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
   int ValorCombo = ComboBoxBuscar.getSelectedIndex();
        if (ValorCombo == 0) {
            String Campo = txtBuscar.getText();
        
            String sqlBus = "SELECT ID_Compras, Cantidad, Fecha_compra, Monto_total, Tiempo_credito, ID_Proveedor, ID_Producto FROM orden_compras WHERE ID_Compras = '"+Campo+"'";
            try {
                conexion = data.getConnection();
                psExecute = conexion.prepareStatement(sqlBus);
                rs = psExecute.executeQuery();
               while (rs.next()) {
                String ID_Compras = rs.getString("ID_Compras");
                String Cantidad = rs.getString("Cantidad");
                String Fecha_compra = rs.getString("Fecha_compra");
                String Monto_total = rs.getString("Monto_total");
                String Tiempo_credito = rs.getString("Tiempo_credito");
                String ID_Proveedor = rs.getString("ID_Proveedor");
                String ID_Producto = rs.getString("ID_Producto");
                
                
                txtFolio.setText(ID_Compras);
                txtCantidad.setText(Cantidad);
                txtFecha.setText(Fecha_compra);
                txtMonto.setText(Monto_total);
                txtCredito.setText(Tiempo_credito);
                txtIDP.setText(ID_Proveedor);
                txtProducto.setText(ID_Producto);
                
                                
            }
                

                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
                
            }
            
        }
        else if(ValorCombo == 1)
        {
         String Campo = txtBuscar.getText();
        
           String sqlBus = "SELECT ID_Compras, Cantidad, Fecha_compra, Monto_total, Tiempo_credito, ID_Proveedor, ID_Producto FROM orden_compras WHERE Fecha_compra = '"+Campo+"'";
            try {
                conexion = data.getConnection();
                psExecute = conexion.prepareStatement(sqlBus);
                rs = psExecute.executeQuery();
               while (rs.next()) {
                String ID_Compras = rs.getString("ID_Compras");
                String Cantidad = rs.getString("Cantidad");
                String Fecha_compra = rs.getString("Fecha_compra");
                String Monto_total = rs.getString("Monto_total");
                String Tiempo_credito = rs.getString("Tiempo_credito");
                String ID_Proveedor = rs.getString("ID_Proveedor");
                String ID_Producto = rs.getString("ID_Producto");
                
                
                txtFolio.setText(ID_Compras);
                txtCantidad.setText(Cantidad);
                txtFecha.setText(Fecha_compra);
                txtMonto.setText(Monto_total);
                txtCredito.setText(Tiempo_credito);
                txtIDP.setText(ID_Proveedor);
                txtProducto.setText(ID_Producto);
                
                                
            }
                

                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
                
            }
            
        }    
          
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void txtFolioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtFolioAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFolioAncestorAdded

    private void txtFolioComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtFolioComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFolioComponentAdded

    private void CancelarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarOrdenActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarOrdenActionPerformed

    private void BotonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEnviarActionPerformed

        MysqlExecute m = new MysqlExecute();
        m.Insertar("orden_compras", "'" + txtFolio.getText() + "','" + txtCantidad.getText() + "','" + txtFecha.getText()+ "','" + txtMonto.getText() + "','" + txtCredito.getText() +"','" +txtIDP.getText()+ "','" + txtProducto.getText()+"'");
    }//GEN-LAST:event_BotonEnviarActionPerformed

    private void txtCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreditoActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed

    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void txtIDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDPActionPerformed
        //  stmt.setInt(7, Integer.parseInt(this.txtIDP.getText()));
    }//GEN-LAST:event_txtIDPActionPerformed

    private void ComboBoxBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxBuscarActionPerformed
             
    }//GEN-LAST:event_ComboBoxBuscarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
                txtFolio.setText(Folio());
                txtBuscar.setText("");
                txtCantidad.setText("");
                txtFecha.setText("");
                txtMonto.setText("");
                txtCredito.setText("");
                txtIDP.setText("");
                txtProducto.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
       int ValorCombo = ComboBoxBuscar.getSelectedIndex();
        if (ValorCombo == 0) {
            String Campo = txtBuscar.getText();
        
            String deleteStr = "DELETE FROM orden_compras WHERE ID_Compras = '"+Campo+"'";
            int id = 0;
            try {
                conexion = data.getConnection();
            stmt = conexion.createStatement();
            
            id = stmt.executeUpdate(deleteStr);            

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
                
            }
            
        }
        else if(ValorCombo == 1)
        {
          String Campo = txtBuscar.getText();
        
            String deleteStr = "DELETE FROM orden_compras WHERE Fecha_compra = '"+Campo+"'";
            int id = 0;
            try {
                conexion = data.getConnection();
            stmt = conexion.createStatement();
            
            id = stmt.executeUpdate(deleteStr);
              
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
                
            }
            
        }  
    }//GEN-LAST:event_BorrarActionPerformed

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
            java.util.logging.Logger.getLogger(OrdenCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdenCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdenCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdenCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrdenCompras().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonEnviar;
    private javax.swing.JButton CancelarOrden;
    private javax.swing.JComboBox ComboBoxBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCredito;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JLabel txtFolio;
    private javax.swing.JTextField txtIDP;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
