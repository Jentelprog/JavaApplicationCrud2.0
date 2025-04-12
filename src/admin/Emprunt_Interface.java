/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SBS
 */
public class Emprunt_Interface extends javax.swing.JFrame {

    public static Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public Emprunt_Interface(Connection con) {
        this.con = con;
        initComponents();
        TableEmprunt();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        return_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        input_usager = new javax.swing.JTextField();
        input_de = new javax.swing.JTextField();
        input_dr = new javax.swing.JTextField();
        input_livre = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        Supprimer_btn = new javax.swing.JButton();
        Modifier_btn = new javax.swing.JButton();
        Ajout_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableEmprunt = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        Input_Recherche_usager = new javax.swing.JTextField();
        input_rendu = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        input_recherche_livre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel16.setFont(new java.awt.Font("Century", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Gestion Emprunt");

        return_btn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        return_btn.setText("return");
        return_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(277, 277, 277))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(return_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(return_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(jLabel16)
                .addGap(41, 41, 41))
        );

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("ID Livre : ");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Date Emprunt :");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Rendu:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("ID Usager : ");

        input_usager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_usagerActionPerformed(evt);
            }
        });

        input_de.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_deActionPerformed(evt);
            }
        });

        input_dr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_drActionPerformed(evt);
            }
        });

        input_livre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_livreActionPerformed(evt);
            }
        });

        jPanel18.setBackground(new java.awt.Color(153, 204, 255));

        Supprimer_btn.setBackground(new java.awt.Color(153, 204, 255));
        Supprimer_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Supprimer_btn.setForeground(new java.awt.Color(255, 255, 255));
        Supprimer_btn.setText("Supprimer");
        Supprimer_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Supprimer_btnActionPerformed(evt);
            }
        });

        Modifier_btn.setBackground(new java.awt.Color(153, 204, 255));
        Modifier_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Modifier_btn.setForeground(new java.awt.Color(255, 255, 255));
        Modifier_btn.setText("Modifier");
        Modifier_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modifier_btnActionPerformed(evt);
            }
        });

        Ajout_btn.setBackground(new java.awt.Color(153, 204, 255));
        Ajout_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Ajout_btn.setForeground(new java.awt.Color(255, 255, 255));
        Ajout_btn.setText("Ajouter");
        Ajout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ajout_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Modifier_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Supprimer_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ajout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Ajout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Supprimer_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Modifier_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        TableEmprunt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TableEmprunt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TableEmpruntMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(TableEmprunt);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("RECHERCHER par usager id:");

        Input_Recherche_usager.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Input_Recherche_usagerKeyReleased(evt);
            }
        });

        input_rendu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        input_rendu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Non", "Oui" }));
        input_rendu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_renduActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Date Retour :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("RECHERCHER par livre id:");

        input_recherche_livre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                input_recherche_livreKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_usager, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_livre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel20))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(input_dr, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(input_de, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(input_rendu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(101, 101, 101)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Input_Recherche_usager, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_recherche_livre, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(input_usager, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(input_livre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(input_de, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(input_dr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(input_rendu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Input_Recherche_usager, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_recherche_livre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void input_usagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_usagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_usagerActionPerformed

    private void input_deActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_deActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_deActionPerformed

    private void input_drActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_drActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_drActionPerformed

    private void input_livreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_livreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_livreActionPerformed

    private void Supprimer_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Supprimer_btnActionPerformed
        try {
            // Get the ID entered by the user
            String livreId = input_livre.getText();
            String usagerId = input_usager.getText();

            // Check if the ID already exists in the database
            String checkIdQuery = "SELECT COUNT(*) FROM emprunt WHERE id_livre = ? and id_usager=?";
            pst = con.prepareStatement(checkIdQuery);
            pst.setString(1, livreId);
            pst.setString(2, usagerId);
            rs = pst.executeQuery();
            if (rs.getInt(1) == 0) {
                JOptionPane.showMessageDialog(null, "cette emprunt n'existe pas", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                // If the ID doesn't exist, insert the new record
                String insertQuery = "delete from emprunt WHERE id_livre = ? and id_usager=?";
                pst = con.prepareStatement(insertQuery);
                pst.setString(1, input_livre.getText());
                pst.setString(2, input_usager.getText());
                pst.executeUpdate();
                String idlivre = input_livre.getText();
                String cQuery = "UPDATE livre SET exemplaire=exemplaire+1 where id_livre=?";
                pst = con.prepareStatement(cQuery);
                pst.setString(1, idlivre);
                pst.executeUpdate();
                // Show success message and refresh the table
                JOptionPane.showMessageDialog(null, "Suppression réussi");
                TableEmprunt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_Supprimer_btnActionPerformed

    private void Modifier_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modifier_btnActionPerformed
        try {
            String idlivre = input_livre.getText();
            String idusager = input_usager.getText();
           
            String checkIdQuery = "SELECT COUNT(*) FROM emprunt WHERE id_livre = ? and id_usager=?";
            pst = con.prepareStatement(checkIdQuery);
            pst.setString(1, idlivre);
            pst.setString(2, idusager);
            rs = pst.executeQuery();

            // If the ID already exists, show a warning message
            if (rs.getInt(1) == 0) {
                JOptionPane.showMessageDialog(null, "emprunteur n'existe pas", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                // If the ID doesn't exist, insert the new record
                String insertQuery = "update emprunt set date_emprunt=?,date_retour=?,rendu=? WHERE id_livre = ? and id_usager=?";
                pst = con.prepareStatement(insertQuery);
                pst.setString(1, input_de.getText());
                pst.setString(2, input_dr.getText());
                pst.setString(3, (String) input_rendu.getSelectedItem());
                pst.setString(4, idlivre);
                pst.setString(5, idusager);
                pst.executeUpdate();

                // Show success message and refresh the table
                JOptionPane.showMessageDialog(null, "Modification réussie");
                TableEmprunt();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_Modifier_btnActionPerformed

    private void Ajout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ajout_btnActionPerformed
        try {
            // Get the ID entered by the user
            String enteredId = input_usager.getText();

            // Check if the ID already exists in the database
            String checkIdQuery = "SELECT COUNT(*) FROM usager WHERE id_usager = ?";
            pst = con.prepareStatement(checkIdQuery);
            pst.setString(1, enteredId);
            rs = pst.executeQuery();
            // If the ID already exists, show a warning message
            if(input_livre.getText().isEmpty()||input_usager.getText().isEmpty()||input_de.getText().isEmpty()||input_dr.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "don't leave it empty", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if (rs.getInt(1) == 0) {
                JOptionPane.showMessageDialog(null, "ID usager non valider ,cree un compte", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                String enteredliv = input_livre.getText();
                checkIdQuery = "SELECT COUNT(*) FROM livre WHERE id_livre = ?";
                pst = con.prepareStatement(checkIdQuery);
                pst.setString(1, enteredliv);
                rs = pst.executeQuery();
                if (rs.getInt(1) == 0) {
                    JOptionPane.showMessageDialog(null, "ID livre n'existe pas", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    String test_exemplaire = input_livre.getText();
                    checkIdQuery = "SELECT exemplaire FROM livre WHERE id_livre = ?";
                    pst = con.prepareStatement(checkIdQuery);
                    pst.setString(1, test_exemplaire);
                    rs = pst.executeQuery();
                    if (rs.getInt(1) < 1) {
                        JOptionPane.showMessageDialog(null, "il nya pas des livre", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else {
                        String insertQuery = "INSERT INTO emprunt VALUES (?, ?, ?, ?,?)";
                        pst = con.prepareStatement(insertQuery);
                        pst.setString(1, input_livre.getText());
                        pst.setString(2, input_usager.getText());
                        pst.setString(3, input_de.getText());
                        pst.setString(4, input_dr.getText());
                        pst.setString(5, (String) input_rendu.getSelectedItem());
                        pst.executeUpdate();

                        // Show success message and refresh the table
                        JOptionPane.showMessageDialog(null, "Enregistrement réussi");
                        TableEmprunt();
                        String idlivre = input_livre.getText();
                        String cQuery = "UPDATE livre SET exemplaire=exemplaire-1 where id_livre=?";
                        pst = con.prepareStatement(cQuery);
                        pst.setString(1, idlivre);
                        pst.executeUpdate();
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "cette livre est deja emprunter par cet usager", "Warning", JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_Ajout_btnActionPerformed

    private void input_renduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_renduActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_renduActionPerformed

    private void Input_Recherche_usagerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Input_Recherche_usagerKeyReleased
        TableEmpruntRechercheUsager(Input_Recherche_usager.getText());
    }//GEN-LAST:event_Input_Recherche_usagerKeyReleased

    private void return_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_btnActionPerformed
        A_principale p = new A_principale(con);
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_return_btnActionPerformed

    private void TableEmpruntMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableEmpruntMouseReleased
        int i = TableEmprunt.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) TableEmprunt.getModel();
        input_livre.setText(model.getValueAt(i, 0).toString());
        input_usager.setText(model.getValueAt(i, 1).toString());
        input_de.setText(model.getValueAt(i, 2).toString());
        input_dr.setText(model.getValueAt(i, 3).toString());
        input_rendu.setSelectedItem(model.getValueAt(i, 4).toString());
    }//GEN-LAST:event_TableEmpruntMouseReleased

    private void input_recherche_livreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_recherche_livreKeyReleased
        TableEmpruntRechercheLivre(input_recherche_livre.getText());
    }//GEN-LAST:event_input_recherche_livreKeyReleased

    public void TableEmprunt() {
        String[] livre = {"ID LIVRE", "ID USAGER", "DATE EMPRUNT", "DATE RETOUR", "RENDU"};
        String[] afficher = new String[6];  // Changed size to 4 to match columns
        DefaultTableModel model = new DefaultTableModel(null, livre);
        String sql = "select * from emprunt";

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);  // Corrected to use 'st.executeQuery(sql)'

            // Iterate through the result set and populate the table
            while (rs.next()) {
                afficher[0] = rs.getString("id_livre");  // Column name must match database
                afficher[1] = rs.getString("id_usager");
                afficher[2] = rs.getString("date_emprunt");
                afficher[3] = rs.getString("date_retour");
                afficher[4] = rs.getString("rendu");
                model.addRow(afficher);
            }

            // Set the table model to update the UI
            TableEmprunt.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void TableEmpruntRechercheUsager(String valeur) {
        String[] livre = {"ID LIVRE", "ID USAGER", "DATE EMPRUNT", "DATE RETOUR", "RENDU"};
        String[] afficher = new String[6];  // Changed size to 4 to match columns
        DefaultTableModel model = new DefaultTableModel(null, livre);
        String sql = "select * from emprunt where id_usager like '%" + valeur + "%'";

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql); // Corrected to use 'st.executeQuery(sql)'

            // Iterate through the result set and populate the table
            while (rs.next()) {
                afficher[0] = rs.getString("id_livre");  // Column name must match database
                afficher[1] = rs.getString("id_usager");
                afficher[2] = rs.getString("date_emprunt");
                afficher[3] = rs.getString("date_retour");
                afficher[4] = rs.getString("rendu");
                model.addRow(afficher);
            }

            // Set the table model to update the UI
            TableEmprunt.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void TableEmpruntRechercheLivre(String valeur) {
        String[] livre = {"ID LIVRE", "ID USAGER", "DATE EMPRUNT", "DATE RETOUR", "RENDU"};
        String[] afficher = new String[6];  // Changed size to 4 to match columns
        DefaultTableModel model = new DefaultTableModel(null, livre);
        String sql = "select * from emprunt where id_livre like '%" + valeur + "%'";

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql); // Corrected to use 'st.executeQuery(sql)'

            // Iterate through the result set and populate the table
            while (rs.next()) {
                afficher[0] = rs.getString("id_livre");  // Column name must match database
                afficher[1] = rs.getString("id_usager");
                afficher[2] = rs.getString("date_emprunt");
                afficher[3] = rs.getString("date_retour");
                afficher[4] = rs.getString("rendu");
                model.addRow(afficher);
            }

            // Set the table model to update the UI
            TableEmprunt.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
            java.util.logging.Logger.getLogger(Emprunt_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Emprunt_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Emprunt_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emprunt_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Emprunt_Interface(con).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajout_btn;
    private javax.swing.JTextField Input_Recherche_usager;
    private javax.swing.JButton Modifier_btn;
    private javax.swing.JButton Supprimer_btn;
    private javax.swing.JTable TableEmprunt;
    public javax.swing.JTextField input_de;
    public javax.swing.JTextField input_dr;
    public javax.swing.JTextField input_livre;
    private javax.swing.JTextField input_recherche_livre;
    private javax.swing.JComboBox<String> input_rendu;
    public javax.swing.JTextField input_usager;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton return_btn;
    // End of variables declaration//GEN-END:variables
}
