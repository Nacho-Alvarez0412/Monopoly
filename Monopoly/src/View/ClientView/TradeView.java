/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.ClientView;

/**
 *
 * @author nacho
 */
public class TradeView extends javax.swing.JFrame {

    /**
     * Creates new form TradeView
     */
    public TradeView(String[] playerProperties, String[] players, String[] properties) {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        PlayerPropertyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(playerProperties));
        PlayersComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(players));
        PropertiesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(properties));
        setSize(710, 396);
    }
    
    public void setPlayerPropertyComboBox(String[] playerProperties){
        PlayerPropertyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(playerProperties));
    }
    
    public void setPlayersComboBox(String[] players){
        PlayersComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(players));
    }
    
    public void setPropertiesComboBox(String[] properties){
        PropertiesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(properties));
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PlayerPropertyComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        PlayersComboBox = new javax.swing.JComboBox<>();
        PropertiesComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(164, 208, 167));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Trade Properties");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 10, 250, 70);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Player");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(510, 90, 120, 35);

        PlayerPropertyComboBox.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        PlayerPropertyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(PlayerPropertyComboBox);
        PlayerPropertyComboBox.setBounds(30, 160, 200, 40);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Property");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(500, 190, 140, 35);

        PlayersComboBox.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        PlayersComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(PlayersComboBox);
        PlayersComboBox.setBounds(470, 140, 200, 40);

        PropertiesComboBox.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        PropertiesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(PropertiesComboBox);
        PropertiesComboBox.setBounds(470, 240, 200, 40);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("You");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 90, 70, 35);

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton1.setText("Request Trade");
        jPanel1.add(jButton1);
        jButton1.setBounds(260, 290, 180, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 370);

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
            java.util.logging.Logger.getLogger(TradeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TradeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TradeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TradeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TradeView(new String[]{},new String[]{},new String[]{}).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> PlayerPropertyComboBox;
    public javax.swing.JComboBox<String> PlayersComboBox;
    public javax.swing.JComboBox<String> PropertiesComboBox;
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
