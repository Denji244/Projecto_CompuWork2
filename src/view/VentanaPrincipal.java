/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.Controlador;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        btnEmpleado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDepartamento = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnReportes = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(86, 130, 241));

        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sistema Compuwork");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        btnEmpleado.setPreferredSize(new java.awt.Dimension(166, 166));
        btnEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmpleadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEmpleadoMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imagenEmpleado.jpeg"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Empleado");

        javax.swing.GroupLayout btnEmpleadoLayout = new javax.swing.GroupLayout(btnEmpleado);
        btnEmpleado.setLayout(btnEmpleadoLayout);
        btnEmpleadoLayout.setHorizontalGroup(
            btnEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEmpleadoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(btnEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        btnEmpleadoLayout.setVerticalGroup(
            btnEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEmpleadoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btnDepartamento.setBackground(new java.awt.Color(255, 255, 255));
        btnDepartamento.setPreferredSize(new java.awt.Dimension(166, 166));
        btnDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDepartamentoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDepartamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDepartamentoMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imagenDepartamento.jpeg"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Departamento");

        javax.swing.GroupLayout btnDepartamentoLayout = new javax.swing.GroupLayout(btnDepartamento);
        btnDepartamento.setLayout(btnDepartamentoLayout);
        btnDepartamentoLayout.setHorizontalGroup(
            btnDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDepartamentoLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(21, 21, 21))
            .addGroup(btnDepartamentoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnDepartamentoLayout.setVerticalGroup(
            btnDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDepartamentoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btnReportes.setBackground(new java.awt.Color(255, 255, 255));
        btnReportes.setPreferredSize(new java.awt.Dimension(166, 166));
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportesMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imagenInforme.jpeg"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Reportes");

        javax.swing.GroupLayout btnReportesLayout = new javax.swing.GroupLayout(btnReportes);
        btnReportes.setLayout(btnReportesLayout);
        btnReportesLayout.setHorizontalGroup(
            btnReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReportesLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(btnReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5))
                .addGap(40, 40, 40))
        );
        btnReportesLayout.setVerticalGroup(
            btnReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReportesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btnDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
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

    private void btnEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadoMouseEntered
        // TODO add your handling code here:
        this.ingresandoMouse(btnEmpleado);
    }//GEN-LAST:event_btnEmpleadoMouseEntered

    private void btnEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadoMouseExited
        // TODO add your handling code here:
        this.saliendoMouse(btnEmpleado);
    }//GEN-LAST:event_btnEmpleadoMouseExited

    private void btnEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadoMouseClicked
        // TODO add your handling code here:
        EmpleadoControlador empleado = new EmpleadoControlador(this, true);
        empleado.setVisible(true);
    }//GEN-LAST:event_btnEmpleadoMouseClicked

    private void btnDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepartamentoMouseClicked
        // TODO add your handling code here:
        Departamento departamento = new Departamento(this, true);
        departamento.setVisible(true);
    }//GEN-LAST:event_btnDepartamentoMouseClicked

    private void btnDepartamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepartamentoMouseEntered
        // TODO add your handling code here:
        this.ingresandoMouse(btnDepartamento);
    }//GEN-LAST:event_btnDepartamentoMouseEntered

    private void btnDepartamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepartamentoMouseExited
        // TODO add your handling code here:
        this.saliendoMouse(btnDepartamento);
    }//GEN-LAST:event_btnDepartamentoMouseExited

    private void btnReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseClicked
        // TODO add your handling code here:
        Reportes reporte = new Reportes(this, true);
        reporte.setVisible(true);
    }//GEN-LAST:event_btnReportesMouseClicked

    private void btnReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseEntered
        // TODO add your handling code here:
        this.ingresandoMouse(btnReportes);
    }//GEN-LAST:event_btnReportesMouseEntered

    private void btnReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseExited
        // TODO add your handling code here:
        this.saliendoMouse(btnReportes);
    }//GEN-LAST:event_btnReportesMouseExited

    private void ingresandoMouse(JPanel panel) {
        panel.setBackground(new Color(86, 130, 241));
    }

    private void saliendoMouse(JPanel panel) {
        panel.setBackground(Color.WHITE);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnDepartamento;
    private javax.swing.JPanel btnEmpleado;
    private javax.swing.JPanel btnReportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
