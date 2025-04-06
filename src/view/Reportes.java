/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

/**
 *
 * @author user
 */
public class Reportes extends javax.swing.JDialog {

    /**
     * Creates new form Reportes
     */
    public Reportes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setLocationRelativeTo(null);
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
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblReporteGeneral = new javax.swing.JLabel();
        lblReporteEmpleado = new javax.swing.JLabel();
        lblReporteDepartamento = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnReporteGeneral = new javax.swing.JButton();
        btnReporteEmpleado = new javax.swing.JButton();
        btnReporteDepartamento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(86, 130, 241));

        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Reportes Compuwork");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel4)
                .addContainerGap(212, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblReporteGeneral.setForeground(new java.awt.Color(0, 0, 0));
        lblReporteGeneral.setText("Generar reporte general");

        lblReporteEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        lblReporteEmpleado.setText("Generar reporte empleado");

        lblReporteDepartamento.setForeground(new java.awt.Color(0, 0, 0));
        lblReporteDepartamento.setText("Generar reporte departamento");

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver.setText("Volver");
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
        });

        btnReporteGeneral.setBackground(new java.awt.Color(255, 255, 255));
        btnReporteGeneral.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        btnReporteGeneral.setForeground(new java.awt.Color(0, 0, 0));
        btnReporteGeneral.setText("Reporte general");
        btnReporteGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReporteGeneralMouseClicked(evt);
            }
        });
        btnReporteGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteGeneralActionPerformed(evt);
            }
        });

        btnReporteEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        btnReporteEmpleado.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        btnReporteEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        btnReporteEmpleado.setText("Reporte empleado");
        btnReporteEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReporteEmpleadoMouseClicked(evt);
            }
        });
        btnReporteEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteEmpleadoActionPerformed(evt);
            }
        });

        btnReporteDepartamento.setBackground(new java.awt.Color(255, 255, 255));
        btnReporteDepartamento.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        btnReporteDepartamento.setForeground(new java.awt.Color(0, 0, 0));
        btnReporteDepartamento.setText("Reporte departamento");
        btnReporteDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReporteDepartamentoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(106, 106, 106))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReporteGeneral)
                    .addComponent(lblReporteEmpleado)
                    .addComponent(lblReporteDepartamento))
                .addGap(87, 87, 87)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReporteDepartamento)
                    .addComponent(btnReporteEmpleado)
                    .addComponent(btnReporteGeneral))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReporteGeneral)
                    .addComponent(btnReporteGeneral))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReporteEmpleado)
                    .addComponent(btnReporteEmpleado))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReporteDepartamento)
                    .addComponent(btnReporteDepartamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnReporteGeneralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteGeneralMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteGeneralMouseClicked

    private void btnReporteEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteEmpleadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteEmpleadoMouseClicked

    private void btnReporteDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteDepartamentoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteDepartamentoMouseClicked

    private void btnReporteGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteGeneralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteGeneralActionPerformed

    private void btnReporteEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteEmpleadoActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReporteDepartamento;
    private javax.swing.JButton btnReporteEmpleado;
    private javax.swing.JButton btnReporteGeneral;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblReporteDepartamento;
    private javax.swing.JLabel lblReporteEmpleado;
    private javax.swing.JLabel lblReporteGeneral;
    // End of variables declaration//GEN-END:variables
}
