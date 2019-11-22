package laboratorio6_gabrielvasquez;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialog_Producto = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        p_nombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        p_marca = new javax.swing.JTextField();
        p_alcohol = new javax.swing.JSpinner();
        p_precio = new javax.swing.JSpinner();
        p_cantidad = new javax.swing.JSpinner();
        p_vencimiento = new com.toedter.calendar.JDateChooser();
        b_crearProducto = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        p_nacional = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        p_codigo = new javax.swing.JTextField();
        p_azucar = new javax.swing.JSpinner();
        p_lote = new javax.swing.JSpinner();
        cb_azul = new javax.swing.JCheckBox();
        cb_rojo = new javax.swing.JCheckBox();
        cb_verde = new javax.swing.JCheckBox();
        cb_giallo = new javax.swing.JCheckBox();
        cb_blanco = new javax.swing.JCheckBox();
        dialog_Factura = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mi_crearProducto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mi_crearFactura = new javax.swing.JMenuItem();

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nuevo Producto");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel4.setText("Marca");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel5.setText("Cantidad de Azúcar");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel6.setText("Cantidad de Alcohol (%)");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel7.setText("Bebida Nacional");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel8.setText("Número de Lote");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel9.setText("Precio");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel10.setText("Cantidad");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel11.setText("Fecha de Vencimineto");

        p_alcohol.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        p_alcohol.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        p_precio.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        p_precio.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        p_cantidad.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        p_cantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        b_crearProducto.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        b_crearProducto.setText("Crear");
        b_crearProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_crearProductoMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel12.setText("Coloroantes");

        p_nacional.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        p_nacional.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel13.setText("Código");

        p_azucar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        p_azucar.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        p_lote.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        p_lote.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        cb_azul.setText("Azul-4");

        cb_rojo.setText("Rojo_69");

        cb_verde.setText("Verde-420");

        cb_giallo.setText("Amarillo-77");

        cb_blanco.setText("Blanco-07");

        javax.swing.GroupLayout dialog_ProductoLayout = new javax.swing.GroupLayout(dialog_Producto.getContentPane());
        dialog_Producto.getContentPane().setLayout(dialog_ProductoLayout);
        dialog_ProductoLayout.setHorizontalGroup(
            dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_ProductoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(dialog_ProductoLayout.createSequentialGroup()
                        .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p_marca)
                            .addComponent(p_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(p_azucar, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(p_nacional, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(p_alcohol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialog_ProductoLayout.createSequentialGroup()
                        .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_vencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(p_lote, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(p_precio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                            .addGroup(dialog_ProductoLayout.createSequentialGroup()
                                .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cb_blanco)
                                    .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cb_verde)
                                        .addComponent(cb_azul)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_rojo)
                                    .addComponent(cb_giallo)))))
                    .addGroup(dialog_ProductoLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
            .addGroup(dialog_ProductoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_crearProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(520, 520, 520))
        );
        dialog_ProductoLayout.setVerticalGroup(
            dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_ProductoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dialog_ProductoLayout.createSequentialGroup()
                        .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_azucar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_alcohol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dialog_ProductoLayout.createSequentialGroup()
                        .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_lote, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(p_vencimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(38, 38, 38)
                .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_nacional, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_azul)
                    .addComponent(cb_rojo))
                .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialog_ProductoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_crearProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(dialog_ProductoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dialog_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_verde)
                            .addComponent(cb_giallo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_blanco)
                        .addContainerGap(20, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout dialog_FacturaLayout = new javax.swing.GroupLayout(dialog_Factura.getContentPane());
        dialog_Factura.getContentPane().setLayout(dialog_FacturaLayout);
        dialog_FacturaLayout.setHorizontalGroup(
            dialog_FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dialog_FacturaLayout.setVerticalGroup(
            dialog_FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Supermercado El Barrio");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Marca", "Nombre", "Azúcar", "Alcohol", "Nacional", "Lote", "Colorantes", "Precio", "Cantidad", "Vencimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(5).setResizable(false);
            table.getColumnModel().getColumn(6).setResizable(false);
            table.getColumnModel().getColumn(7).setResizable(false);
            table.getColumnModel().getColumn(8).setResizable(false);
            table.getColumnModel().getColumn(9).setResizable(false);
            table.getColumnModel().getColumn(10).setResizable(false);
        }

        jMenu1.setText("Productos");

        mi_crearProducto.setText("Crear");
        mi_crearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_crearProductoActionPerformed(evt);
            }
        });
        jMenu1.add(mi_crearProducto);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consulta");

        mi_crearFactura.setText("Cotizar");
        mi_crearFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_crearFacturaActionPerformed(evt);
            }
        });
        jMenu2.add(mi_crearFactura);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mi_crearFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_crearFacturaActionPerformed
        dialog_Factura.setModal(true);
        dialog_Factura.pack();
        dialog_Factura.setLocationRelativeTo(this);
        dialog_Factura.setVisible(true);
    }//GEN-LAST:event_mi_crearFacturaActionPerformed

    private void mi_crearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_crearProductoActionPerformed
        dialog_Producto.setModal(true);
        dialog_Producto.pack();
        dialog_Producto.setLocationRelativeTo(this);
        dialog_Producto.setVisible(true);
    }//GEN-LAST:event_mi_crearProductoActionPerformed

    private void b_crearProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_crearProductoMouseClicked
        String c, m, n, pert, nv;
        int az, ah, l, pre, cant;
        Date v;
        c = p_codigo.getText();
        m = p_marca.getText();
        n = p_nombre.getText();
        az = (int) p_azucar.getValue();
        ah = (int) p_alcohol.getValue();
        pert = (String) p_nacional.getSelectedItem();
        l = (int) p_lote.getValue();
        pre = (int) p_precio.getValue();
        cant = (int) p_cantidad.getValue();
        v = p_vencimiento.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
        nv = sdf.format(v);

        if (c.equals("") || m.equals("") || n.equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar todos los campos requeridos");
        } else {
            Producto nuevo = new Producto(c, m, n, az, ah, pert, l, pre, cant, nv);
            if (cb_azul.isSelected()) {
                nuevo.getColorantes().add("Azul-77");
            }
            if (cb_blanco.isSelected()) {
                nuevo.getColorantes().add("Blanco-07");
            }
            if (cb_giallo.isSelected()) {
                nuevo.getColorantes().add("Amarillo-77");
            }
            if (cb_rojo.isSelected()) {
                nuevo.getColorantes().add("Rojo-69");
            }
            if (cb_verde.isSelected()) {
                nuevo.getColorantes().add("Verde-420");
            }
            JOptionPane.showMessageDialog(this, "Producto Creado");

            p_codigo.setText("");
            p_marca.setText("");
            p_nombre.setText("");
            p_azucar.setValue(0);
            p_alcohol.setValue(0);
            p_nacional.setSelectedIndex(0);
            p_lote.setValue(0);
            p_precio.setValue(0);
            p_cantidad.setValue(0);
            cb_azul.setSelected(false);
            cb_blanco.setSelected(false);
            cb_giallo.setSelected(false);
            cb_rojo.setSelected(false);
            cb_verde.setSelected(false);
            
            Object[] newrow = {
                nuevo.getCodigo(),
                nuevo.getMarca(),
                nuevo.getNombre(),
                nuevo.getAzucar(),
                nuevo.getAlcohol(),
                nuevo.getPertenencia(),
                nuevo.getLote(),
                nuevo.getColorantes(),
                nuevo.getPrecio(),
                nuevo.getCantidad(),
                nuevo.getVencimiento()
            };
            DefaultTableModel modelo = (DefaultTableModel) table.getModel();
            modelo.addRow(newrow);
            table.setModel(modelo);
        }
    }//GEN-LAST:event_b_crearProductoMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_crearProducto;
    private javax.swing.JCheckBox cb_azul;
    private javax.swing.JCheckBox cb_blanco;
    private javax.swing.JCheckBox cb_giallo;
    private javax.swing.JCheckBox cb_rojo;
    private javax.swing.JCheckBox cb_verde;
    private javax.swing.JDialog dialog_Factura;
    private javax.swing.JDialog dialog_Producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mi_crearFactura;
    private javax.swing.JMenuItem mi_crearProducto;
    private javax.swing.JSpinner p_alcohol;
    private javax.swing.JSpinner p_azucar;
    private javax.swing.JSpinner p_cantidad;
    private javax.swing.JTextField p_codigo;
    private javax.swing.JSpinner p_lote;
    private javax.swing.JTextField p_marca;
    private javax.swing.JComboBox<String> p_nacional;
    private javax.swing.JTextField p_nombre;
    private javax.swing.JSpinner p_precio;
    private com.toedter.calendar.JDateChooser p_vencimiento;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}