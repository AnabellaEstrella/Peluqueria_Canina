package Igu;

import Logica.Controladora;
import javax.swing.JOptionPane;

/**
 *
 * @author Anabella
 */
public class Pantalla extends javax.swing.JFrame {
    Controladora control;

    public Pantalla(Controladora control) {
        this.control = control;
        this.setTitle("Peluquería canina");
        initComponents();
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
        lblPeluqueriaCanina = new javax.swing.JLabel();
        lblNumCliente = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblRaza = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblAlergico = new javax.swing.JLabel();
        lblAtencionEspecial = new javax.swing.JLabel();
        lblNombreDuenio = new javax.swing.JLabel();
        lblCelDuenio = new javax.swing.JLabel();
        lblObservaciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        txtNumCliente = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtNombreDuenio = new javax.swing.JTextField();
        txtCelDuenio = new javax.swing.JTextField();
        cmbAtencionEspecial = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        imgPerro = new javax.swing.JLabel();
        cmbAlergico = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(232, 112, 148));

        lblPeluqueriaCanina.setFont(new java.awt.Font("Gabriola", 1, 36)); // NOI18N
        lblPeluqueriaCanina.setForeground(new java.awt.Color(130, 52, 76));
        lblPeluqueriaCanina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeluqueriaCanina.setText("Peluquería canina");

        lblNumCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblNumCliente.setText("Cliente N°:");

        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre:");

        lblRaza.setForeground(new java.awt.Color(0, 0, 0));
        lblRaza.setText("Raza:");

        lblColor.setForeground(new java.awt.Color(0, 0, 0));
        lblColor.setText("Color:");

        lblAlergico.setForeground(new java.awt.Color(0, 0, 0));
        lblAlergico.setText("Alérgico:");

        lblAtencionEspecial.setForeground(new java.awt.Color(0, 0, 0));
        lblAtencionEspecial.setText("Atención especial:");

        lblNombreDuenio.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreDuenio.setText("Nombre del dueño:");

        lblCelDuenio.setForeground(new java.awt.Color(0, 0, 0));
        lblCelDuenio.setText("Cel. del dueño:");

        lblObservaciones.setForeground(new java.awt.Color(0, 0, 0));
        lblObservaciones.setText("Observaciones:");

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        txtNumCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumClienteKeyTyped(evt);
            }
        });

        cmbAtencionEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Sí", "No" }));

        jPanel2.setBackground(new java.awt.Color(232, 112, 148));

        imgPerro.setForeground(new java.awt.Color(0, 0, 0));
        imgPerro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        imgPerro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/peluqueria_canina.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgPerro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgPerro, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        cmbAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Sí", "No" }));
        cmbAlergico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPeluqueriaCanina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombreDuenio)
                                    .addComponent(lblColor)
                                    .addComponent(lblAtencionEspecial)
                                    .addComponent(lblAlergico))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cmbAlergico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbAtencionEspecial, 0, 111, Short.MAX_VALUE))
                                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCelDuenio)
                                    .addComponent(lblObservaciones))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCelDuenio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLimpiar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRaza)
                            .addComponent(lblNombre)
                            .addComponent(lblNumCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnGuardar)
                        .addContainerGap(272, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPeluqueriaCanina, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRaza))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColor)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAlergico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAtencionEspecial))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreDuenio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCelDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCelDuenio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblObservaciones)
                                .addGap(67, 67, 67))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar))
                .addGap(37, 37, 37))
        );

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

    // Seteo los campos como vacíos en esta función para poder llamarla desde el botón de limpiar y
    // desde el mensaje que aparece al grabar el cliente.
    private void limpiarFormulario() {
        txtNumCliente.setText("");
        txtNombre.setText("");
        txtRaza.setText("");
        txtColor.setText("");
        cmbAlergico.setSelectedIndex(0);
        cmbAtencionEspecial.setSelectedIndex(0);
        txtNombreDuenio.setText("");
        txtCelDuenio.setText("");
        txtObservaciones.setText("");
    }
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // Seteo en 0 la variable de NumCliente si el usuario la dejo en blanco
        // para poder mostrar un mensaje en caso de que se cumpla esto, ya que este campo debe completarse obligatoriamente.
        int numCliente;
        if (txtNumCliente.getText().equals("")) {
            numCliente = 0;
        }
        else {
            numCliente = Integer.parseInt(txtNumCliente.getText());
        }
        String nombre = txtNombre.getText();
        String raza = txtRaza.getText();
        String color = txtColor.getText();
        boolean esAlergico = cmbAlergico.getSelectedIndex() == 1;
        boolean tieneAtencionEspecial = cmbAtencionEspecial.getSelectedIndex() == 1;
        String nombreDuenio = txtNombreDuenio.getText();
        String celularDuenio = txtCelDuenio.getText();
        String observaciones = txtObservaciones.getText();
        
        // Utilizo esta función booleana para saber si hay otra mascota en la base de datos con el mismo Núm. de Cliente que ingresó el usuario.
        if (!control.buscarMascota(numCliente)) {
            try {
                /* Valido que los campos no estén vacíos y muestro mensaje de advertencia en caso que eso suceda.
                    - Para numCliente pregunto por el seteo en 0 realizado anteriormente.
                    - Para los selectores 'alergico' y 'atencionEspecial' me aseguro que seleccionen 'Sí' o 'No'.
                    - El campo 'Observaciones' no se valida, por lo que puede quedar vacío si el usuario no desea ingresar más información.
                */
                if (numCliente == 0 || nombre.isEmpty() || raza.isEmpty() || color.isEmpty() || nombreDuenio.isEmpty() || celularDuenio.isEmpty() || cmbAlergico.getSelectedIndex() == 0 || cmbAtencionEspecial.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Información faltante. Por favor, complete los datos para guardar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
                // Si todos los campos están completos intento grabar el cliente mascota.
                else {
                    control.altaMascota(numCliente, nombre, raza, color, esAlergico, tieneAtencionEspecial, nombreDuenio, celularDuenio, observaciones);
                    
                    /* Creo el mensaje a mostrar cuando el cliente mascota fue grabado y las acciones a tomar por los botones.
                        - La opción 'Sí' limpiará el formulario para permitir cargar nueva información.
                        - La opción 'No' finalizará el programa.
                        - La opción 'Cancelar' simplemente cerrará el mensaje.
                    */
                    int confirmacion = JOptionPane.showConfirmDialog(null, "Cliente mascota guardado con éxito. ¿Ingresar un nuevo cliente?", "Información guardada", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (confirmacion == JOptionPane.YES_OPTION) {
                        limpiarFormulario();
                    }
                    else if (confirmacion == JOptionPane.NO_OPTION) {
                        System.exit(0);
                    }
                }
            }
            // Muestro este mensaje de error si hubo algún error desconocido y no se pudo crear el cliente mascota.
            catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "No fue posible crear el cliente mascota.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        // Muestro este mensaje de error si el Núm de Cliente ingresado ya existe.
        else {
            JOptionPane.showMessageDialog(rootPane, "El número de cliente ingresado ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    // Con este evento me aseguro que el usuario no ingrese letras o caracteres no permitidos en el Núm. de Cliente.
    private void txtNumClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumClienteKeyTyped
        char c = evt.getKeyChar();
        
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumClienteKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbAlergico;
    private javax.swing.JComboBox<String> cmbAtencionEspecial;
    private javax.swing.JLabel imgPerro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlergico;
    private javax.swing.JLabel lblAtencionEspecial;
    private javax.swing.JLabel lblCelDuenio;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreDuenio;
    private javax.swing.JLabel lblNumCliente;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblPeluqueriaCanina;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JTextField txtCelDuenio;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreDuenio;
    private javax.swing.JTextField txtNumCliente;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
