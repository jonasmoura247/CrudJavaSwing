package br.dev.pack.person.entity;

import Jm.JMascara;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonas
 */
public class Persons extends javax.swing.JFrame {

    ModelPersons model = new ModelPersons();

    /**
     * Creates new form Person
     */
    public Persons() {
        initComponents();
        tbPersons.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        titleName = new javax.swing.JLabel();
        titlePhone = new javax.swing.JLabel();
        titleSex = new javax.swing.JLabel();
        titleStreet = new javax.swing.JLabel();
        titleCity = new javax.swing.JLabel();
        titleDistrict = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPersons = new javax.swing.JTable();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtDistrict = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        btRegister = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        txtSex = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Pessoas");

        titleName.setText("Nome:");

        titlePhone.setText("Telefone:");

        titleSex.setText("Sexo:");

        titleStreet.setText("Logradouro:");

        titleCity.setText("CIdade:");

        titleDistrict.setText("Bairro:");

        tbPersons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbPersons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPersonsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPersons);

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneKeyReleased(evt);
            }
        });

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        btRegister.setText("Cadastrar");
        btRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegisterActionPerformed(evt);
            }
        });

        btUpdate.setText("Alterar");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btDelete.setText("Excluir");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        txtSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(btRegister)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btUpdate)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addComponent(btDelete)
                .addContainerGap(425, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titlePhone)
                    .addComponent(titleName)
                    .addComponent(txtPhone)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(titleSex)
                    .addComponent(txtSex, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleStreet)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtDistrict, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtStreet, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(titleDistrict, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(titleCity))
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleStreet)
                    .addComponent(titleName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titlePhone)
                    .addComponent(titleDistrict))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleSex)
                    .addComponent(titleCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRegister)
                    .addComponent(btUpdate)
                    .addComponent(btDelete))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterActionPerformed

        Person p = addPerson();

        if (validateCamps(p.getName(), p.getPhone(), p.getSex(), p.getStreet(), p.getDistrict(), p.getCity())) {
            this.model.registerPerson(p);

            cleanCamps();
        }
    }//GEN-LAST:event_btRegisterActionPerformed

    public Person addPerson() {
        String name = txtName.getText();
        String phone = txtPhone.getText();
        
        String sex = (String)txtSex.getSelectedItem();
        String street = txtStreet.getText();
        String district = txtDistrict.getText();
        String city = txtCity.getText();

        Person p = new Person(name, phone, sex, street, district, city);

        return p;
    }

    public void cleanCamps() {
        txtName.setText("");
        txtPhone.setText("");
        txtSex.setSelectedItem("");
        txtStreet.setText("");
        txtDistrict.setText("");
        txtCity.setText("");
    }

    public boolean validateCamps(String name, String phone, String sex, String street, String city, String district) {
        if (name.trim().isEmpty() || phone.trim().isEmpty() || sex.trim().isEmpty() || street.trim().isEmpty() || district.trim().isEmpty() || city.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "camps vazios!");
            return false;
        }
        return true;
    }


    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        Person p = addPerson();
        int index = tbPersons.getSelectedRow();
        if (validateCamps(p.getName(), p.getPhone(), p.getSex(), p.getStreet(), p.getDistrict(), p.getCity())) {
            if (JOptionPane.showConfirmDialog(this, "Tem certeza que quer alterar essa pessoa?", "Alterar", JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION) {

                this.model.updatePerson(index, p);

                cleanCamps();
            }
        }
    }//GEN-LAST:event_btUpdateActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtPhoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyReleased
        txtPhone.setText(JMascara.GetJmascaraFone(txtPhone.getText()));
    }//GEN-LAST:event_txtPhoneKeyReleased

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed

    }//GEN-LAST:event_txtPhoneActionPerformed

    private void tbPersonsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPersonsMouseClicked
        int index = tbPersons.getSelectedRow();
        Person p = this.model.returnPerson(index);

        txtName.setText(p.getName());
        txtPhone.setText(p.getPhone());
       // txtSex.setText(p.getSex());
        txtStreet.setText(p.getStreet());
        txtDistrict.setText(p.getDistrict());
        txtCity.setText(p.getCity());

    }//GEN-LAST:event_tbPersonsMouseClicked

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        int index = tbPersons.getSelectedRow();
        if (JOptionPane.showConfirmDialog(this, "Tem certeza que quer excluir essa pessoa?", "Excluir", JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {

            this.model.removePerson(index);

            cleanCamps();
        }
    }//GEN-LAST:event_btDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Persons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Persons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Persons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Persons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Persons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btRegister;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPersons;
    private javax.swing.JLabel titleCity;
    private javax.swing.JLabel titleDistrict;
    private javax.swing.JLabel titleName;
    private javax.swing.JLabel titlePhone;
    private javax.swing.JLabel titleSex;
    private javax.swing.JLabel titleStreet;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDistrict;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JComboBox<String> txtSex;
    private javax.swing.JTextField txtStreet;
    // End of variables declaration//GEN-END:variables
}
