/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.client.dlg;

import fr.freeboxos.ftb.metier.entitys.Processeur;
import fr.freeboxos.ftb.metier.enums.cpuMarque;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author alan
 */
public class AddProcesseurDlg extends javax.swing.JDialog {

    private long id = 0;
    private Processeur processeur = null;

    /**
     * Creates new form AddProcesseurDlg
     *
     * @param parent
     * @param modal
     */
    public AddProcesseurDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.jLabelTitre.setText("Ajout d'un processeur");
        this.jComboBox1.setModel(new DefaultComboBoxModel(cpuMarque.values()));
    }

    public AddProcesseurDlg(java.awt.Frame parent, boolean modal, Processeur processeur) {
        super(parent, modal);
        initComponents();

        this.id = processeur.getId();
        this.jLabelTitre.setText("Modification d'un processeur");
        this.jTextFieldModele.setText(processeur.getModele());
        this.jTextFieldSocket.setText(processeur.getSocket());
        this.jTextFieldFrequence.setText(processeur.getFrequence());
        this.jTextFieldTurbo.setText(processeur.getTurbo());
        this.jTextFieldCore.setText(String.valueOf(processeur.getCore()));
        this.jTextFieldThread.setText(String.valueOf(processeur.getThread()));
        this.jTextFieldPlateforme.setText(processeur.getPlateforme_nom());
        this.jTextFieldGravure.setText(processeur.getFinesse_gravure());
        this.jTextFieldTPD.setText(processeur.getTDP());
        this.jTextFieldL1.setText(processeur.getL1());
        this.jTextFieldL2.setText(processeur.getL2());
        this.jTextFieldL3.setText(processeur.getL3());
        this.jTextFieldPrix.setText(processeur.getPrix());
        this.jComboBox1.setModel(new DefaultComboBoxModel(cpuMarque.values()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextFieldModele = new javax.swing.JTextField();
        jTextFieldSocket = new javax.swing.JTextField();
        jTextFieldFrequence = new javax.swing.JTextField();
        jTextFieldTurbo = new javax.swing.JTextField();
        jTextFieldCore = new javax.swing.JTextField();
        jTextFieldThread = new javax.swing.JTextField();
        jTextFieldPlateforme = new javax.swing.JTextField();
        jTextFieldGravure = new javax.swing.JTextField();
        jTextFieldTPD = new javax.swing.JTextField();
        jTextFieldL1 = new javax.swing.JTextField();
        jTextFieldL2 = new javax.swing.JTextField();
        jTextFieldL3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldPrix = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitre.setText("jLabel1");

        jLabel1.setText("Marque");

        jLabel2.setText("Modele");

        jLabel3.setText("Socket");

        jLabel4.setText("Fréquence normale");

        jLabel5.setText("Fréquence turbo");

        jLabel6.setText("Nombre de core");

        jLabel7.setText("Nombre de thread");

        jLabel8.setText("Nom de la plateforme");

        jLabel9.setText("Finesse de gravure");

        jLabel10.setText("TDP");

        jLabel11.setText("Cache L1");

        jLabel12.setText("Cache L2");

        jLabel13.setText("Cache L3");

        jTextFieldModele.setText("?");

        jTextFieldSocket.setText("?");

        jTextFieldFrequence.setText("?");

        jTextFieldTurbo.setText("?");

        jTextFieldCore.setText("0");

        jTextFieldThread.setText("0");

        jTextFieldPlateforme.setText("?");

        jTextFieldGravure.setText("?");

        jTextFieldTPD.setText("?");

        jTextFieldL1.setText("?");

        jTextFieldL2.setText("?");

        jTextFieldL3.setText("?");

        jButton1.setText("Annuler");

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel14.setText("Prix");

        jTextFieldPrix.setText("?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jLabelTitre))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13)))
                        .addGap(0, 181, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldSocket)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldModele)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldFrequence)
                                    .addComponent(jTextFieldTurbo)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldCore))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldThread))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldPlateforme))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldGravure))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldTPD))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(22, 22, 22)
                                .addComponent(jTextFieldPrix))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldL3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldL2)
                                    .addComponent(jTextFieldL1))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitre)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldModele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldSocket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldFrequence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldTurbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldCore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldThread, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldPlateforme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldGravure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldTPD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldL3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldPrix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Action du bouton ok
     *
     * @param evt
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String marqueProcesseur = this.jComboBox1.getSelectedItem().toString();
            String modele = this.jTextFieldModele.getText();
            String socket = this.jTextFieldSocket.getText();
            String frequence = this.jTextFieldFrequence.getText();
            String turbo = this.jTextFieldTurbo.getText();
            String core = this.jTextFieldCore.getText();
            String thread = this.jTextFieldThread.getText();
            String plateforme = this.jTextFieldPlateforme.getText();
            String gravure = this.jTextFieldGravure.getText();
            String tdp = this.jTextFieldTPD.getText();
            String l1 = this.jTextFieldL1.getText();
            String l2 = this.jTextFieldL2.getText();
            String l3 = this.jTextFieldL3.getText();
            String prix = this.jTextFieldPrix.getText();

            if (modele.length() == 0) {
                throw new Exception("Veuillez mettre un modele ou un \"?\" ");
            }

            if (socket.length() == 0) {
                throw new Exception("Veuillez mettre un socket ou un \"?\" ");
            }
            if (frequence.length() == 0) {
                throw new Exception("Veuillez mettre une fréquence ou un \"?\" ");
            }

            if (turbo.length() == 0) {
                throw new Exception("Veuillez mettre une fréquence turbo ou un \"?\" ");
            }

            if (core.length() == 0) {
                throw new Exception("Veuillez mettre le nombre de core ou un \"?\" ");
            }

            if (thread.length() == 0) {
                throw new Exception("Veuillez mettre le nombre de threads ou un \"?\" ");
            }

            if (plateforme.length() == 0) {
                throw new Exception("Veuillez mettre le nom de la plateforme ou un \"?\" ");
            }

            if (gravure.length() == 0) {
                throw new Exception("Veuillez mettre la finnesse de gravure ou un \"?\" ");
            }

            if (tdp.length() == 0) {
                throw new Exception("Veuillez mettre un TDP ou un \"?\" ");
            }

            if (l1.length() == 0) {
                throw new Exception("Veuillez mettre le cache L1 ou un \"?\" ");
            }

            if (l2.length() == 0) {
                throw new Exception("Veuillez mettre le cache L2 ou un \"?\" ");
            }

            if (l3.length() == 0) {
                throw new Exception("Veuillez mettre le cache L3 ou un \"?\" ");
            }

            if (prix.length() == 0) {
                throw new Exception("Veuillez mettre le prix ou un \"?\" ");
            }

            int Core = Integer.parseInt(core);
            int Thread = Integer.parseInt(thread);

            processeur = new Processeur(marqueProcesseur, modele, socket, frequence, turbo, Core, Thread, plateforme, gravure, tdp, l1, l2, l3, prix);
            this.processeur.setId(id);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddProcesseurDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProcesseurDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProcesseurDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProcesseurDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                AddProcesseurDlg dialog = new AddProcesseurDlg(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JTextField jTextFieldCore;
    private javax.swing.JTextField jTextFieldFrequence;
    private javax.swing.JTextField jTextFieldGravure;
    private javax.swing.JTextField jTextFieldL1;
    private javax.swing.JTextField jTextFieldL2;
    private javax.swing.JTextField jTextFieldL3;
    private javax.swing.JTextField jTextFieldModele;
    private javax.swing.JTextField jTextFieldPlateforme;
    private javax.swing.JTextField jTextFieldPrix;
    private javax.swing.JTextField jTextFieldSocket;
    private javax.swing.JTextField jTextFieldTPD;
    private javax.swing.JTextField jTextFieldThread;
    private javax.swing.JTextField jTextFieldTurbo;
    // End of variables declaration//GEN-END:variables

    public Processeur getProcesseur() {
        return processeur;
    }
}
