package laboratorio6_gabrielvasquez;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Login extends javax.swing.JFrame {

    public Login() {
        try {
            initComponents();
            setLocationRelativeTo(null);
            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;
            try {
                archivo = new File("./Productos.txt");
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null) {
                    Object[] atributo = linea.split("|");
                    cargados.add(new Bebida((String) atributo[0], (String) atributo[1], (String) atributo[2], Integer.parseInt(atributo[3].toString()), Integer.parseInt(atributo[4].toString()),
                            (String) atributo[5], Integer.parseInt(atributo[6].toString()), Integer.parseInt(atributo[7].toString()), Integer.parseInt(atributo[8].toString()), (String) atributo[9],
                            (String)atributo[10] ));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            br.close();
            fr.close();

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            for (Bebida b : cargados) {
                
                Object[] cargado = {
                    b.getCodigo(),
                    b.getMarca(),
                    b.getNombre(),
                    b.getAzucar(),
                    b.getAlcohol(),
                    b.getPertenencia(),
                    b.getLote(),
                    b.getPrecio(),
                    null,
                    b.getCantidad(),
                    b.getVencimiento()
                };
                model.addRow(cargado);
            }
            table.setModel(model);

        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

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
        products = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        b_palalista = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        b_facturar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        js_cant = new javax.swing.JSpinner();
        popup = new javax.swing.JPopupMenu();
        pop_eliminar = new javax.swing.JMenuItem();
        mod_codigo = new javax.swing.JMenuItem();
        mod_marca = new javax.swing.JMenuItem();
        mod_nombre = new javax.swing.JMenuItem();
        mod_azucar = new javax.swing.JMenuItem();
        mod_alcohol = new javax.swing.JMenuItem();
        mod_lote = new javax.swing.JMenuItem();
        mod_precio = new javax.swing.JMenuItem();
        mod_cantidad = new javax.swing.JMenuItem();
        ppup = new javax.swing.JPopupMenu();
        quitarlist = new javax.swing.JMenuItem();
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
                        .addContainerGap(19, Short.MAX_VALUE))))
        );

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Productos a Cotizar");

        b_palalista.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        b_palalista.setText("Agregar");
        b_palalista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_palalistaMouseClicked(evt);
            }
        });

        list.setModel(new DefaultListModel());
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(list);

        b_facturar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        b_facturar.setText("Facturar");
        b_facturar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_facturarMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Lista de Productos");

        js_cant.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        js_cant.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout dialog_FacturaLayout = new javax.swing.GroupLayout(dialog_Factura.getContentPane());
        dialog_Factura.getContentPane().setLayout(dialog_FacturaLayout);
        dialog_FacturaLayout.setHorizontalGroup(
            dialog_FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialog_FacturaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(dialog_FacturaLayout.createSequentialGroup()
                .addGroup(dialog_FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialog_FacturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dialog_FacturaLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(dialog_FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b_palalista, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(products, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(js_cant, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 96, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(dialog_FacturaLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(b_facturar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(dialog_FacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dialog_FacturaLayout.setVerticalGroup(
            dialog_FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_FacturaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(dialog_FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(js_cant, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(products, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(b_palalista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_facturar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pop_eliminar.setText("Eliminar");
        pop_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pop_eliminarActionPerformed(evt);
            }
        });
        popup.add(pop_eliminar);

        mod_codigo.setText("Modificar Código");
        mod_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mod_codigoActionPerformed(evt);
            }
        });
        popup.add(mod_codigo);

        mod_marca.setText("Modificar Marca");
        mod_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mod_marcaActionPerformed(evt);
            }
        });
        popup.add(mod_marca);

        mod_nombre.setText("Modificar Nombre");
        mod_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mod_nombreActionPerformed(evt);
            }
        });
        popup.add(mod_nombre);

        mod_azucar.setText("Modificar Azúcar");
        mod_azucar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mod_azucarActionPerformed(evt);
            }
        });
        popup.add(mod_azucar);

        mod_alcohol.setText("Modificar Alcohol");
        mod_alcohol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mod_alcoholActionPerformed(evt);
            }
        });
        popup.add(mod_alcohol);

        mod_lote.setText("Modificar Lote");
        mod_lote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mod_loteActionPerformed(evt);
            }
        });
        popup.add(mod_lote);

        mod_precio.setText("Modificar Precio");
        mod_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mod_precioActionPerformed(evt);
            }
        });
        popup.add(mod_precio);

        mod_cantidad.setText("Modificar Cantidad");
        mod_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mod_cantidadActionPerformed(evt);
            }
        });
        popup.add(mod_cantidad);

        quitarlist.setText("Quitar");
        quitarlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarlistActionPerformed(evt);
            }
        });
        ppup.add(quitarlist);

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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
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
        String c, m, n, pert, nv = "";
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

        boolean verifica = true;
        for (Bebida item : cargados) {
            if (item.equals(c)) {
                verifica = false;
            }
        }

        if (c.equals("") || m.equals("") || n.equals("") || p_vencimiento == null) {
            JOptionPane.showMessageDialog(this, "Debe ingresar todos los campos requeridos");
        } else if (verifica == false) {
            JOptionPane.showMessageDialog(this, "El código ya existe");
            p_codigo.setText("");
        } else {
            Bebida nuevo = new Bebida(c, m, n, az, ah, pert, l, pre, cant, nv);
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

            DefaultComboBoxModel cb = (DefaultComboBoxModel) products.getModel();
            cb.addElement(nuevo);
            products.setModel(cb);
            
            
        }
    }//GEN-LAST:event_b_crearProductoMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if (evt.isMetaDown()) {
            if (table.getSelectedRow() >= 0) {
                popup.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_tableMouseClicked

    private void pop_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pop_eliminarActionPerformed
        if (table.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) table.getModel();
            modelo.removeRow(table.getSelectedRow());
            table.setModel(modelo);
            items.remove(table.getSelectedRow());
            cargados.remove(table.getSelectedRow());
        }
    }//GEN-LAST:event_pop_eliminarActionPerformed

    private void mod_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mod_codigoActionPerformed
        if (table.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) table.getModel();
            String s = JOptionPane.showInputDialog("Nuevo Código");
            items.get(table.getSelectedRow()).setCodigo(s);
            table.setModel(modelo);
        }
    }//GEN-LAST:event_mod_codigoActionPerformed

    private void b_palalistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_palalistaMouseClicked
        DefaultListModel modelo = (DefaultListModel) list.getModel();
        modelo.addElement(products.getSelectedItem());
        list.setModel(modelo);
        items.add((Bebida) products.getSelectedItem());
    }//GEN-LAST:event_b_palalistaMouseClicked

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        if (list.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                ppup.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_listMouseClicked

    private void quitarlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarlistActionPerformed
        if (list.getSelectedIndex() >= 0) {
            DefaultListModel modelo = (DefaultListModel) list.getModel();
            modelo.remove(list.getSelectedIndex());
            list.setModel(modelo);
            items.remove(list.getSelectedIndex());
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un elemento de la lista");
        }
    }//GEN-LAST:event_quitarlistActionPerformed

    private void b_facturarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_facturarMouseClicked
        ++cont;
        try {
            File archivo = null;
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                archivo = new File("./facturas/Factura" + cont + ".txt");
                fw = new FileWriter(archivo, true);
                bw = new BufferedWriter(fw);
                Date hoy = new Date();
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                String oggi = format.format(hoy);
                bw.write("          Supermercado El Barrio          ");
                bw.newLine();
                bw.write("Factura #" + cont + "         " + hoy);
                bw.newLine();
                bw.write("Produc.               Cant                Precio");
                bw.newLine();
                int acum = 0;
                for (Bebida item : items) {
                    String linea = item.toString() + "                 " + (int) js_cant.getValue() + "                  L." + item.getPrecio();
                    acum += (int) js_cant.getValue() * item.getPrecio();
                    bw.write(linea);
                    bw.newLine();
                }
                bw.write("                    Total:\n                           L." + acum);
                bw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo facturar los productos");
        }
    }//GEN-LAST:event_b_facturarMouseClicked

    private void mod_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mod_marcaActionPerformed
        if (table.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) table.getModel();
            String s = JOptionPane.showInputDialog("Nueva Marca");
            items.get(table.getSelectedRow()).setMarca(s);
            table.setModel(modelo);
        }
    }//GEN-LAST:event_mod_marcaActionPerformed

    private void mod_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mod_nombreActionPerformed
        if (table.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) table.getModel();
            String s = JOptionPane.showInputDialog("Nuevo Nombre");
            items.get(table.getSelectedRow()).setNombre(s);
            table.setModel(modelo);
        }
    }//GEN-LAST:event_mod_nombreActionPerformed

    private void mod_azucarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mod_azucarActionPerformed
        if (table.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) table.getModel();
            int s = Integer.parseInt(JOptionPane.showInputDialog("Nueva Cantidad de Azúcar"));
            items.get(table.getSelectedRow()).setAzucar(s);
            table.setModel(modelo);
        }
    }//GEN-LAST:event_mod_azucarActionPerformed

    private void mod_alcoholActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mod_alcoholActionPerformed
        if (table.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) table.getModel();
            int s = Integer.parseInt(JOptionPane.showInputDialog("Nueva Cantidad de Alcohol"));
            items.get(table.getSelectedRow()).setAlcohol(s);
            table.setModel(modelo);
        }
    }//GEN-LAST:event_mod_alcoholActionPerformed

    private void mod_loteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mod_loteActionPerformed
        if (table.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) table.getModel();
            int s = Integer.parseInt(JOptionPane.showInputDialog("Nuevo Número de Lote"));
            items.get(table.getSelectedRow()).setLote(s);
            table.setModel(modelo);
        }
    }//GEN-LAST:event_mod_loteActionPerformed

    private void mod_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mod_precioActionPerformed
        if (table.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) table.getModel();
            int s = Integer.parseInt(JOptionPane.showInputDialog("Nuevo Precio"));
            items.get(table.getSelectedRow()).setPrecio(s);
            table.setModel(modelo);
        }
    }//GEN-LAST:event_mod_precioActionPerformed

    private void mod_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mod_cantidadActionPerformed
        if (table.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) table.getModel();
            int s = Integer.parseInt(JOptionPane.showInputDialog("Nueva Cantidad"));
            items.get(table.getSelectedRow()).setCantidad(s);
            table.setModel(modelo);
        }
    }//GEN-LAST:event_mod_cantidadActionPerformed

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
    private javax.swing.JButton b_facturar;
    private javax.swing.JButton b_palalista;
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
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner js_cant;
    private javax.swing.JList<String> list;
    private javax.swing.JMenuItem mi_crearFactura;
    private javax.swing.JMenuItem mi_crearProducto;
    private javax.swing.JMenuItem mod_alcohol;
    private javax.swing.JMenuItem mod_azucar;
    private javax.swing.JMenuItem mod_cantidad;
    private javax.swing.JMenuItem mod_codigo;
    private javax.swing.JMenuItem mod_lote;
    private javax.swing.JMenuItem mod_marca;
    private javax.swing.JMenuItem mod_nombre;
    private javax.swing.JMenuItem mod_precio;
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
    private javax.swing.JMenuItem pop_eliminar;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JPopupMenu ppup;
    private javax.swing.JComboBox<String> products;
    private javax.swing.JMenuItem quitarlist;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
    ArrayList<Bebida> items = new ArrayList();
    int cont = 0;
    Bebida actual;
    ArrayList<Bebida> cargados = new ArrayList();
    Date rn;
    Inventario i = new Inventario("./Productos.txt");
}