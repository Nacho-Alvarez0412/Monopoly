/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.ClientView;

import Model.Game.Property;
import java.awt.Color;

/**
 *
 * @author nacho
 */
public class RailroadView extends javax.swing.JFrame {

    /**
     * Creates new form ServiceView
     */
    public RailroadView(Property Card) {
        initComponents();
        setSize(445,585);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        RailroadNameLabel.setText(Card.getName());
        
        if(Card.getOwner() != null){
            OwnerNameLabel.setText(Card.getOwner().name);
        }
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
        jPanel2 = new javax.swing.JPanel();
        TrainLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        RailroadNameLabel = new javax.swing.JLabel();
        RentLabel = new javax.swing.JLabel();
        RentLabel1 = new javax.swing.JLabel();
        RentLabel2 = new javax.swing.JLabel();
        RentLabel3 = new javax.swing.JLabel();
        RentLabel4 = new javax.swing.JLabel();
        RentLabel5 = new javax.swing.JLabel();
        RentLabel6 = new javax.swing.JLabel();
        RentLabel7 = new javax.swing.JLabel();
        RentLabel8 = new javax.swing.JLabel();
        OwnerLabel = new javax.swing.JLabel();
        OwnerNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(null);

        TrainLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TrainCardLogo.png"))); // NOI18N
        TrainLabel.setToolTipText("");
        jPanel2.add(TrainLabel);
        TrainLabel.setBounds(120, 30, 150, 120);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(null);

        RailroadNameLabel.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        RailroadNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        RailroadNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RailroadNameLabel.setText("READING RAILROAD");
        jPanel3.add(RailroadNameLabel);
        RailroadNameLabel.setBounds(10, 10, 360, 40);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(10, 160, 380, 60);

        RentLabel.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        RentLabel.setForeground(new java.awt.Color(0, 0, 0));
        RentLabel.setText("Mortgage Value                                $100");
        jPanel2.add(RentLabel);
        RentLabel.setBounds(30, 450, 360, 30);

        RentLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        RentLabel1.setForeground(new java.awt.Color(0, 0, 0));
        RentLabel1.setText("$200");
        jPanel2.add(RentLabel1);
        RentLabel1.setBounds(330, 370, 50, 30);

        RentLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        RentLabel2.setForeground(new java.awt.Color(0, 0, 0));
        RentLabel2.setText("If 2 R.R.'s are owned");
        jPanel2.add(RentLabel2);
        RentLabel2.setBounds(30, 290, 190, 30);

        RentLabel3.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        RentLabel3.setForeground(new java.awt.Color(0, 0, 0));
        RentLabel3.setText("If 3       ''       ''       ''");
        jPanel2.add(RentLabel3);
        RentLabel3.setBounds(30, 330, 180, 30);

        RentLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        RentLabel4.setForeground(new java.awt.Color(0, 0, 0));
        RentLabel4.setText("Rent");
        jPanel2.add(RentLabel4);
        RentLabel4.setBounds(30, 250, 50, 30);

        RentLabel5.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        RentLabel5.setForeground(new java.awt.Color(0, 0, 0));
        RentLabel5.setText("$25");
        jPanel2.add(RentLabel5);
        RentLabel5.setBounds(330, 250, 50, 30);

        RentLabel6.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        RentLabel6.setForeground(new java.awt.Color(0, 0, 0));
        RentLabel6.setText("$50");
        jPanel2.add(RentLabel6);
        RentLabel6.setBounds(330, 290, 50, 30);

        RentLabel7.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        RentLabel7.setForeground(new java.awt.Color(0, 0, 0));
        RentLabel7.setText("$100");
        jPanel2.add(RentLabel7);
        RentLabel7.setBounds(330, 330, 50, 30);

        RentLabel8.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        RentLabel8.setForeground(new java.awt.Color(0, 0, 0));
        RentLabel8.setText("If 4       ''       ''       ''");
        jPanel2.add(RentLabel8);
        RentLabel8.setBounds(30, 370, 180, 30);

        OwnerLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        OwnerLabel.setForeground(new java.awt.Color(0, 0, 0));
        OwnerLabel.setText("Owner: ");
        jPanel2.add(OwnerLabel);
        OwnerLabel.setBounds(20, 490, 90, 30);

        OwnerNameLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        OwnerNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        OwnerNameLabel.setText("FREE");
        jPanel2.add(OwnerNameLabel);
        OwnerNameLabel.setBounds(110, 490, 80, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 410, 530);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 430, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(RailroadView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RailroadView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RailroadView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RailroadView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RailroadView(new Property(0,0,Color.BLACK,"Reading Railroad",25,-1,100,200)).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OwnerLabel;
    private javax.swing.JLabel OwnerNameLabel;
    public javax.swing.JLabel RailroadNameLabel;
    private javax.swing.JLabel RentLabel;
    private javax.swing.JLabel RentLabel1;
    private javax.swing.JLabel RentLabel2;
    private javax.swing.JLabel RentLabel3;
    private javax.swing.JLabel RentLabel4;
    private javax.swing.JLabel RentLabel5;
    private javax.swing.JLabel RentLabel6;
    private javax.swing.JLabel RentLabel7;
    private javax.swing.JLabel RentLabel8;
    private javax.swing.JLabel TrainLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
