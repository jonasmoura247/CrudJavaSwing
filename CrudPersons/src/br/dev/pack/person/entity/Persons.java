package br.dev.pack.person.entity;

import Jm.JMascara;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonas
 */
public class Persons extends javax.swing.JFrame {

    ModelPersons model = new ModelPersons();

    public Persons() {
        initComponents();
        tbPersons.setModel(model);
    }

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDateB = new javax.swing.JTextField();
        txtMother = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtConv = new javax.swing.JTextField();
        txtFather = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Pessoas");

        titleName.setText("Nome Completo:");

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

        jLabel2.setText("Data de Nascimento:");

        jLabel3.setText("Nome da Mãe:");

        jLabel4.setText("Nome do Pai:");

        txtDateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateBActionPerformed(evt);
            }
        });

        jLabel5.setText("CEP:");

        txtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepActionPerformed(evt);
            }
        });
        txtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCepKeyReleased(evt);
            }
        });

        jLabel6.setText("Convenio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(75, 75, 75))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(txtPhone)
                                .addComponent(txtName)
                                .addComponent(txtSex, 0, 211, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(txtMother)
                                .addComponent(titlePhone)
                                .addComponent(titleSex)
                                .addComponent(titleName)
                                .addComponent(jLabel2)
                                .addComponent(txtDateB)
                                .addComponent(jLabel6)
                                .addComponent(txtConv)
                                .addComponent(txtFather))
                            .addGap(625, 625, 625)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleCity)
                            .addComponent(titleStreet)
                            .addComponent(titleDistrict)
                            .addComponent(txtStreet)
                            .addComponent(txtCity)
                            .addComponent(jLabel5)
                            .addComponent(txtDistrict)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(310, 310, 310))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(btRegister)
                        .addGap(42, 42, 42)
                        .addComponent(btUpdate)
                        .addGap(45, 45, 45)
                        .addComponent(btDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titlePhone)
                        .addGap(9, 9, 9)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleSex)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleStreet)
                        .addGap(9, 9, 9)
                        .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleDistrict)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleCity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(txtDateB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRegister)
                    .addComponent(btUpdate)
                    .addComponent(btDelete))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterActionPerformed

        Person p = addPerson();

        if (validateCamps(
                p.getName(),
                p.getPhone(),
                p.getSex(),
                p.getMother(),
                p.getFather(),
                p.getDateB(),
                p.getConv(),
                p.getCep(),
                p.getStreet(),
                p.getDistrict(),
                p.getCity())) {
            this.model.registerPerson(p);

            cleanCamps();
        }
    }//GEN-LAST:event_btRegisterActionPerformed

    public Person addPerson() {
        String name = txtName.getText();
        String phone = txtPhone.getText();
        String sex = (String) txtSex.getSelectedItem();
        String mother = txtMother.getText();
        String father = txtFather.getText();
        String dateB = txtDateB.getText();
        String conv = txtConv.getText();
        String cep = txtCep.getText();
        String street = txtStreet.getText();
        String district = txtDistrict.getText();
        String city = txtCity.getText();

        Person p = new Person(name, phone, sex, mother, father, dateB, conv, cep, street, city, district);

        return p;
    }

    public void cleanCamps() {
        txtName.setText("");
        txtPhone.setText("");
        txtSex.setSelectedItem("");
        txtMother.setText("");
        txtFather.setText("");
        txtDateB.setText("");
        txtConv.setText("");
        txtCep.setText("");
        txtStreet.setText("");
        txtDistrict.setText("");
        txtCity.setText("");
    }

    public boolean validateCamps(String name, String phone, String sex, String mother, String father, String dateB, String conv, String cep, String street, String city, String district) {
        if (name.trim().isEmpty()
                || phone.trim().isEmpty()
                || sex.trim().isEmpty()
                || father.trim().isEmpty()
                || mother.trim().isEmpty()
                || dateB.trim().isEmpty()
                || conv.trim().isEmpty()
                || cep.trim().isEmpty()
                || street.trim().isEmpty()
                || district.trim().isEmpty()
                || city.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "campos vazios!");
            return false;
        }
        return true;
    }


    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        Person p = addPerson();
        int index = tbPersons.getSelectedRow();
        if (validateCamps(p.getName(),
                p.getPhone(),
                p.getSex(),
                p.getMother(),
                p.getFather(),
                p.getDateB(),
                p.getConv(),
                p.getCep(),
                p.getStreet(),
                p.getDistrict(),
                p.getCity())) {

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
        txtMother.setText(p.getMother());
        txtFather.setText(p.getFather());
        txtDateB.setText(p.getDateB());
        txtConv.setText(p.getConv());
        txtCep.setText(p.getCep());
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

    private void txtDateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateBActionPerformed

    }//GEN-LAST:event_txtDateBActionPerformed

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed


    }//GEN-LAST:event_txtCepActionPerformed

    private void txtCepKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepKeyReleased
        txtCep.setText(JMascara.GetJmascaraCep(txtCep.getText()));
    }//GEN-LAST:event_txtCepKeyReleased

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPersons;
    private javax.swing.JLabel titleCity;
    private javax.swing.JLabel titleDistrict;
    private javax.swing.JLabel titleName;
    private javax.swing.JLabel titlePhone;
    private javax.swing.JLabel titleSex;
    private javax.swing.JLabel titleStreet;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtConv;
    private javax.swing.JTextField txtDateB;
    private javax.swing.JTextField txtDistrict;
    private javax.swing.JTextField txtFather;
    private javax.swing.JTextField txtMother;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JComboBox<String> txtSex;
    private javax.swing.JTextField txtStreet;
    // End of variables declaration//GEN-END:variables
}
