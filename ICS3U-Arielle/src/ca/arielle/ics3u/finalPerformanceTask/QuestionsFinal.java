/*
 * Arielle
 * Mon. Jan. 23, 2017.
 * Version 1.0
 * Multiple Choice Questions, Final page. 
 */
package ca.arielle.ics3u.finalPerformanceTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

/**
 *
 * @author 1ainabeari
 */
public class QuestionsFinal extends javax.swing.JFrame {
    Elements scores;
    Document doc;
    int finalScore;

    /**
     * Creates new form QuestionsFinal
     */
    public QuestionsFinal(int score) {
        initComponents();
        finalScore = score;
        double score2 = (double) score;
        double percentage = (score2/5.0) * 100.0;
        jLabelCorrect.setText("Correct Answers: " + score);
        jLabelWrong.setText("Incorrect Answers: " + (5 - score));
        jLabelPercentage.setText("Percentage: " + percentage + "%");
        
        //Suggestion
        switch (score){
            case 1:
                jLabelSuggestion.setText("Oohhh Looks like someone needs to review!");
                break;
            case 2:
                jLabelSuggestion.setText("Atleast you almost got half of it right!");
                break;
            case 3:
                jLabelSuggestion.setText("Still need to study a bit but not bad!");
                break;
            case 4:
                jLabelSuggestion.setText("So close, but so far!");
                break;
            case 5:
                jLabelSuggestion.setText("Yayy! You know practically everything! (Not really)");
                break;
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

        jPanelBottom = new javax.swing.JPanel();
        jButtonAgain = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();
        jLabelThanks = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jPanelTop = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelCorrect = new javax.swing.JLabel();
        jLabelWrong = new javax.swing.JLabel();
        jLabelPercentage = new javax.swing.JLabel();
        jLabelSuggestion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBottom.setBackground(new java.awt.Color(255, 255, 255));

        jButtonAgain.setText("Play Again?");
        jButtonAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgainActionPerformed(evt);
            }
        });

        jButtonClose.setText("Close");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        jLabelThanks.setText("Thanks for playing!");

        jButtonSave.setText("Save Score");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBottomLayout = new javax.swing.GroupLayout(jPanelBottom);
        jPanelBottom.setLayout(jPanelBottomLayout);
        jPanelBottomLayout.setHorizontalGroup(
            jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBottomLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabelThanks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonClose)
                    .addComponent(jButtonAgain)
                    .addComponent(jButtonSave))
                .addGap(49, 49, 49))
        );
        jPanelBottomLayout.setVerticalGroup(
            jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBottomLayout.createSequentialGroup()
                .addGroup(jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBottomLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButtonAgain))
                    .addGroup(jPanelBottomLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabelThanks)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSave)
                .addGap(17, 17, 17)
                .addComponent(jButtonClose)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanelTop.setBackground(new java.awt.Color(0, 255, 255));

        jLabelTitle.setFont(new java.awt.Font("Swis721 Blk BT", 1, 24)); // NOI18N
        jLabelTitle.setText("Final Score:");

        jLabelCorrect.setText("Correct Answers: 0");

        jLabelWrong.setText("Incorrect Answers: 0");

        jLabelPercentage.setText("Percentage: 60%");

        jLabelSuggestion.setFont(new java.awt.Font("Swis721 Blk BT", 2, 14)); // NOI18N
        jLabelSuggestion.setText("Oohhh Looks like someone needs to review!");

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPercentage)
                    .addComponent(jLabelCorrect)
                    .addComponent(jLabelTitle)
                    .addComponent(jLabelWrong))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabelSuggestion)
                .addGap(0, 111, Short.MAX_VALUE))
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCorrect)
                .addGap(18, 18, 18)
                .addComponent(jLabelWrong)
                .addGap(18, 18, 18)
                .addComponent(jLabelPercentage)
                .addGap(18, 18, 18)
                .addComponent(jLabelSuggestion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgainActionPerformed
        // Splash Page
        new QuestionsSplash().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAgainActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        // Close window
        this.dispose();
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        //Save Page
        new QuestionsSave(finalScore).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSaveActionPerformed

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
            java.util.logging.Logger.getLogger(QuestionsFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionsFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionsFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionsFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionsFinal(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgain;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabelCorrect;
    private javax.swing.JLabel jLabelPercentage;
    private javax.swing.JLabel jLabelSuggestion;
    private javax.swing.JLabel jLabelThanks;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelWrong;
    private javax.swing.JPanel jPanelBottom;
    private javax.swing.JPanel jPanelTop;
    // End of variables declaration//GEN-END:variables
}
