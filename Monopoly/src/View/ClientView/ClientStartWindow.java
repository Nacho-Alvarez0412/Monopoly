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
public class ClientStartWindow extends javax.swing.JFrame {

    /**
     * Creates new form ClientStartWindow
     */
    public ClientStartWindow() {
        initComponents();
        this.setSize(905, 614);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        MonopolyLabel = new javax.swing.JLabel();
        UserLabel = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        PieceLabel = new javax.swing.JLabel();
        BattleshipButton = new javax.swing.JButton();
        CatButton = new javax.swing.JButton();
        CartButton = new javax.swing.JButton();
        CarButton = new javax.swing.JButton();
        DinosaurButton = new javax.swing.JButton();
        DogButton = new javax.swing.JButton();
        DuckButton = new javax.swing.JButton();
        HatButton = new javax.swing.JButton();
        IronButton = new javax.swing.JButton();
        PenguinButton = new javax.swing.JButton();
        ShoeButton = new javax.swing.JButton();
        ThimbleButton = new javax.swing.JButton();
        ConfirmButton = new javax.swing.JButton();
        ServerResponseLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        MainPanel.setBackground(new java.awt.Color(164, 208, 167));
        MainPanel.setLayout(null);

        MonopolyLabel.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        MonopolyLabel.setForeground(new java.awt.Color(255, 255, 255));
        MonopolyLabel.setText("Monopoly");
        MainPanel.add(MonopolyLabel);
        MonopolyLabel.setBounds(350, 10, 210, 70);

        UserLabel.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        UserLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserLabel.setText("Username");
        MainPanel.add(UserLabel);
        UserLabel.setBounds(20, 100, 150, 40);

        UsernameTextField.setBackground(new java.awt.Color(206, 230, 208));
        UsernameTextField.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        UsernameTextField.setForeground(new java.awt.Color(0, 0, 0));
        MainPanel.add(UsernameTextField);
        UsernameTextField.setBounds(170, 100, 220, 40);

        PieceLabel.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        PieceLabel.setForeground(new java.awt.Color(255, 255, 255));
        PieceLabel.setText("Piece");
        MainPanel.add(PieceLabel);
        PieceLabel.setBounds(20, 190, 90, 30);

        BattleshipButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        BattleshipButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/battleship.png"))); // NOI18N
        MainPanel.add(BattleshipButton);
        BattleshipButton.setBounds(80, 240, 110, 90);

        CatButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        CatButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cat.png"))); // NOI18N
        MainPanel.add(CatButton);
        CatButton.setBounds(210, 350, 110, 90);

        CartButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        CartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cart.png"))); // NOI18N
        MainPanel.add(CartButton);
        CartButton.setBounds(470, 240, 110, 90);

        CarButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        CarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/car.png"))); // NOI18N
        MainPanel.add(CarButton);
        CarButton.setBounds(340, 240, 110, 90);

        DinosaurButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        DinosaurButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dinosaur.png"))); // NOI18N
        MainPanel.add(DinosaurButton);
        DinosaurButton.setBounds(750, 240, 120, 90);

        DogButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        DogButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dog.png"))); // NOI18N
        MainPanel.add(DogButton);
        DogButton.setBounds(600, 240, 120, 90);

        DuckButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        DuckButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/duck.png"))); // NOI18N
        MainPanel.add(DuckButton);
        DuckButton.setBounds(80, 350, 110, 90);

        HatButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        HatButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hat.png"))); // NOI18N
        MainPanel.add(HatButton);
        HatButton.setBounds(210, 240, 110, 90);

        IronButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        IronButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iron.png"))); // NOI18N
        IronButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IronButtonActionPerformed(evt);
            }
        });
        MainPanel.add(IronButton);
        IronButton.setBounds(470, 350, 110, 90);

        PenguinButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        PenguinButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/penguin.png"))); // NOI18N
        MainPanel.add(PenguinButton);
        PenguinButton.setBounds(340, 350, 110, 90);

        ShoeButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        ShoeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shoe.png"))); // NOI18N
        MainPanel.add(ShoeButton);
        ShoeButton.setBounds(750, 350, 120, 90);

        ThimbleButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        ThimbleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/thimble.png"))); // NOI18N
        MainPanel.add(ThimbleButton);
        ThimbleButton.setBounds(610, 350, 120, 90);

        ConfirmButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        ConfirmButton.setText("Confirm");
        MainPanel.add(ConfirmButton);
        ConfirmButton.setBounds(400, 510, 130, 50);

        ServerResponseLabel.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        ServerResponseLabel.setForeground(new java.awt.Color(0, 0, 0));
        ServerResponseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ServerResponseLabel.setAlignmentX(0.5F);
        MainPanel.add(ServerResponseLabel);
        ServerResponseLabel.setBounds(260, 450, 410, 40);

        getContentPane().add(MainPanel);
        MainPanel.setBounds(0, 0, 890, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IronButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IronButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IronButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ClientStartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientStartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientStartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientStartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientStartWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BattleshipButton;
    public javax.swing.JButton CarButton;
    public javax.swing.JButton CartButton;
    public javax.swing.JButton CatButton;
    public javax.swing.JButton ConfirmButton;
    public javax.swing.JButton DinosaurButton;
    public javax.swing.JButton DogButton;
    public javax.swing.JButton DuckButton;
    public javax.swing.JButton HatButton;
    public javax.swing.JButton IronButton;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel MonopolyLabel;
    public javax.swing.JButton PenguinButton;
    private javax.swing.JLabel PieceLabel;
    public javax.swing.JLabel ServerResponseLabel;
    public javax.swing.JButton ShoeButton;
    public javax.swing.JButton ThimbleButton;
    private javax.swing.JLabel UserLabel;
    public javax.swing.JTextField UsernameTextField;
    // End of variables declaration//GEN-END:variables
}
