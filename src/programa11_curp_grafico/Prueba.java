package programa11_curp_grafico;

public class Prueba extends javax.swing.JFrame {

    public Prueba() {
        initComponents();
    }

    private String nombre;
    private String paterno;
    private String materno;
    private int anio;
    private int dia;
    private int mes;
    private String genero;
    private String lugar;
    private String resultado;
    private String resultado1;
    private String resultado2;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldPaterno = new javax.swing.JTextField();
        jTextFieldMaterno = new javax.swing.JTextField();
        jTextFielGenero = new javax.swing.JTextField();
        jSpinnerAnio = new javax.swing.JSpinner();
        jSpinnerDia = new javax.swing.JSpinner();
        jSpinnerMes = new javax.swing.JSpinner();
        jTextFieldLugar = new javax.swing.JTextField();
        jButtonVerCurp = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldResultado = new javax.swing.JTextField();
        jTextFieldResultado1 = new javax.swing.JTextField();
        jTextFieldResultado2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(6, 6, 6, 6, new java.awt.Color(255, 0, 255)));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField1.setText("Nombre");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField2.setText("Paterno");

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField3.setText("Materno");

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField4.setText("Genero");

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField5.setText("Año De N.");

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField6.setText("Dia");

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField7.setText("Mes");

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField8.setText("Lugar de N.");

        jTextFieldNombre.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jTextFieldPaterno.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jTextFieldMaterno.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jTextFielGenero.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jSpinnerAnio.setModel(new javax.swing.SpinnerNumberModel(2000, 1950, 2022, 1));

        jSpinnerDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jSpinnerMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jTextFieldLugar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jButtonVerCurp.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonVerCurp.setText("Ver curp");
        jButtonVerCurp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerCurpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jTextFieldLugar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(30, 30, 30))
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldPaterno)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldMaterno)
                            .addComponent(jTextFielGenero)
                            .addComponent(jSpinnerAnio, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(jSpinnerDia)
                            .addComponent(jSpinnerMes, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jButtonVerCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFielGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerDia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerMes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButtonVerCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldResultado.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldResultado.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel2.add(jTextFieldResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 250, 40));

        jTextFieldResultado1.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldResultado1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel2.add(jTextFieldResultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 310, -1));

        jTextFieldResultado2.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldResultado2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldResultado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldResultado2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldResultado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 160, 30));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ernes\\Downloads\\curp-blanco-rellenar.jpg")); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerCurpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerCurpActionPerformed
        // TODO add your handling code here:
        nombre = jTextFieldNombre.getText();
        String l1 = String.valueOf(nombre.charAt(0));
        l1 = l1.toUpperCase();
        
        paterno = jTextFieldPaterno.getText();
        String l2 = String.valueOf(paterno.charAt(3));
        l2 = l2.toUpperCase();
        
        materno = jTextFieldMaterno.getText();
        String l3 = String.valueOf(materno.charAt(0));
        l3 = l3.toUpperCase();
        
        anio = (int) jSpinnerAnio.getValue();
        String anio2 = String.valueOf(anio);
        String lx = String.valueOf(anio2.charAt(2));
        String lx2 = String.valueOf(anio2.charAt(3));

        mes = (int) jSpinnerMes.getValue();
        String mes1 = String.valueOf(mes);
        String m = String.valueOf(mes1.charAt(0));
        String m2 = String.valueOf(mes1.charAt(1));

        dia = (int) jSpinnerDia.getValue();
        String dia1 = String.valueOf(dia);
        String n = String.valueOf(dia1.charAt(0));
        String n2 = String.valueOf(dia1.charAt(1));

        genero = jTextFielGenero.getText();
        String gene = String.valueOf(genero.charAt(0));
        gene = gene.toUpperCase();

        lugar = jTextFieldLugar.getText();
        String lug = String.valueOf(lugar.charAt(0));
        lug = lug.toUpperCase();
        String lugar1 = String.valueOf(lugar.charAt(4));
        lugar1 = lugar1.toUpperCase();
        
        paterno = jTextFieldPaterno.getText();
        String p1 = String.valueOf(paterno.charAt(1));
        p1 = p1.toUpperCase();
        
        materno = jTextFieldMaterno.getText();
        String m1 = String.valueOf(materno.charAt(1));
        m1 = m1.toUpperCase();
        
        nombre = jTextFieldNombre.getText();
        String n1 = String.valueOf(nombre.charAt(1));
        n1 = n1.toUpperCase();

        materno = jTextFieldMaterno.getText();
        String ma2 = String.valueOf(materno.charAt(0));
        ma2 = ma2.toUpperCase();
        
        mes = (int) jSpinnerMes.getValue();
        String me1 = String.valueOf(mes);
        String me2 = String.valueOf(mes1.charAt(0));
        
        //Curp clave: EAA011031HMCSRRA1
        
        resultado = l1 + l2 + l3 + lx + lx2 + m + m2 + n + n2 + gene + lug + lugar1 + p1 + m1 + n1 + ma2 + me2;
        
        jTextFieldResultado.setText(resultado);
        jTextFieldResultado.setText(resultado);
        
        
        //Nombre
        nombre = jTextFieldNombre.getText();
        nombre = nombre.toUpperCase();
        paterno = jTextFieldPaterno.getText();
        paterno = paterno.toUpperCase();
        materno = jTextFieldMaterno.getText();
        materno = materno.toUpperCase();
        
        resultado1 = nombre + paterno + materno;
        
        jTextFieldResultado1.setText(resultado1);
        
        
        //entidad de reguistro
        lugar = jTextFieldLugar.getText();
        lugar = lugar.toUpperCase();
        
        resultado2 = lugar;
        
        jTextFieldResultado2.setText(resultado2);

    }//GEN-LAST:event_jButtonVerCurpActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextFieldResultado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldResultado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldResultado2ActionPerformed

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
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVerCurp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinnerAnio;
    private javax.swing.JSpinner jSpinnerDia;
    private javax.swing.JSpinner jSpinnerMes;
    private javax.swing.JTextField jTextFielGenero;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextFieldLugar;
    private javax.swing.JTextField jTextFieldMaterno;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPaterno;
    private javax.swing.JTextField jTextFieldResultado;
    private javax.swing.JTextField jTextFieldResultado1;
    private javax.swing.JTextField jTextFieldResultado2;
    // End of variables declaration//GEN-END:variables
}
