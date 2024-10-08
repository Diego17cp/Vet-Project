package gui;

import java.awt.Color;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import DB.ConexionOracle;
import java.awt.Image;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class LoginVet extends javax.swing.JFrame {
    ImageIcon eye = new ImageIcon(getClass().getResource("/resources/eye.png"));
    ImageIcon eyeslash = new ImageIcon(getClass().getResource("/resources/eye-slash.png"));
    private boolean novisible=true;
    int attempt=3;
    public LoginVet() {
        initComponents();
        this.setTitle("Vet Link - Iniciar Sesión");
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logocircle.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMainLogin = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblAcces = new javax.swing.JLabel();
        panelForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnVer = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnAcceder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMainLogin.setBackground(new java.awt.Color(13, 92, 141));
        panelMainLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(13, 92, 141));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAcces.setFont(new java.awt.Font("Lucida Sans", 1, 48)); // NOI18N
        lblAcces.setForeground(new java.awt.Color(151, 189, 183));
        lblAcces.setText("Iniciar Sesión");
        jPanel1.add(lblAcces, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 10, 340, 60));

        panelMainLogin.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 360, 90));

        panelForm.setBackground(new java.awt.Color(13, 92, 141));
        panelForm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(151, 189, 183), 3, true));
        panelForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(151, 189, 183));
        jLabel1.setText("Contraseña:");
        panelForm.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 150, -1));

        txtDni.setBackground(new java.awt.Color(13, 92, 141));
        txtDni.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        txtDni.setForeground(new java.awt.Color(151, 189, 183));
        txtDni.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(28, 155, 128)));
        panelForm.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 260, 40));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(151, 189, 183));
        jLabel2.setText("DNI:");
        panelForm.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, -1));

        txtPassword.setBackground(new java.awt.Color(13, 92, 141));
        txtPassword.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(151, 189, 183));
        txtPassword.setToolTipText("");
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(28, 155, 128)));
        panelForm.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 260, 40));

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/eye-slash.png"))); // NOI18N
        btnVer.setBorder(null);
        btnVer.setContentAreaFilled(false);
        btnVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        panelForm.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        panelMainLogin.add(panelForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 480, 300));

        btnCancel.setBackground(new java.awt.Color(121, 180, 211));
        btnCancel.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(151, 189, 183));
        btnCancel.setText("Cancelar");
        btnCancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(151, 189, 183), 3, true));
        btnCancel.setContentAreaFilled(false);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelMouseExited(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        panelMainLogin.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 150, 50));

        btnExit.setBackground(new java.awt.Color(121, 180, 211));
        btnExit.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(151, 189, 183));
        btnExit.setText("Salir");
        btnExit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(151, 189, 183), 3, true));
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        panelMainLogin.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 130, 50));

        btnAcceder.setBackground(new java.awt.Color(28, 155, 128));
        btnAcceder.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnAcceder.setForeground(new java.awt.Color(255, 255, 255));
        btnAcceder.setText("Acceder");
        btnAcceder.setBorder(null);
        btnAcceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAccederMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAccederMouseExited(evt);
            }
        });
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });
        panelMainLogin.add(btnAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 150, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMainLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMainLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked

    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtPassword.setText("");
        txtDni.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int x=JOptionPane.showConfirmDialog(null, "¿Desea Salir?","Veterinaria",JOptionPane.YES_NO_OPTION );
        if(x==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAccederMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccederMouseEntered
        btnAcceder.setBackground(new Color(86, 168, 124));
    }//GEN-LAST:event_btnAccederMouseEntered

    private void btnAccederMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccederMouseExited
        btnAcceder.setBackground(new Color(28,155,128));    
    }//GEN-LAST:event_btnAccederMouseExited

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        String dni=txtDni.getText();
        String contra=txtPassword.getText();
        if(!dni.isEmpty() || !contra.isEmpty()){
            try(Connection conn = ConexionOracle.getConnection()){
                String sql="SELECT veterinario_id FROM veterinario WHERE dni=? AND contraseña=?";
                PreparedStatement ps=conn.prepareStatement(sql);
                ps.setString(1, dni);
                ps.setString(2, contra);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    String idVet=rs.getString("veterinario_id");
                    System.out.println(idVet);
                    InicioVet ini = new InicioVet(idVet);
                    ini.setVisible(true);
                    ini.setLocationRelativeTo(null);
                    this.dispose();
                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso", "Vet Link - Iniciar Sesion Usuario",1);
                }
                else{
                    txtDni.setText("");
                    txtPassword.setText("");
                    JOptionPane.showMessageDialog(null, "DNI o Contraseña incorrectos. Tiene " + attempt+" intentos", "Vet Link - Incorrecto", 2);
                    attempt -= 1;
                    if (attempt ==0){
                        JOptionPane.showMessageDialog(null, "Número máximo de intentos alcanzado. Cerrando aplicación.","Nuevo Perú Bank",2);
                        System.exit(0);
                    }
                }
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error en la base de datos: " + ex.getMessage());
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Complete todos los campos para ingresar", "Vet Link", 2);
        }
    }//GEN-LAST:event_btnAccederActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        novisible=!novisible;
        if(novisible){
            btnVer.setIcon(eye);
            txtPassword.setEchoChar('*');
        }
        else {
            btnVer.setIcon(eyeslash);
            txtPassword.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_btnVerActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAcces;
    private javax.swing.JPanel panelForm;
    private javax.swing.JPanel panelMainLogin;
    private javax.swing.JTextField txtDni;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
