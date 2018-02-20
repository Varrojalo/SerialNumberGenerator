/**
 * License GNU GPLv3 
 * Author: Varrojalo
 * Year: 2017
 */
package Classes;
import java.util.Random;

public class MainActivity extends javax.swing.JFrame {

    public MainActivity() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblSerialNumber = new javax.swing.JLabel();
        inputSerialCode = new javax.swing.JTextField();
        btnGenerate = new javax.swing.JButton();
        spinLength = new javax.swing.JSpinner();
        lblLength = new javax.swing.JLabel();
        checkNumbers = new javax.swing.JCheckBox();
        checkLetters = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Serial N° Generator");

        lblSerialNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSerialNumber.setText("Serial N°");

        btnGenerate.setText("Generate");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        spinLength.setModel(new javax.swing.SpinnerNumberModel(1, 1, 32, 1));

        lblLength.setText("Length: ");

        checkNumbers.setSelected(true);
        checkNumbers.setText("Numbers");

        checkLetters.setSelected(true);
        checkLetters.setText("Letters");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGenerate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblSerialNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputSerialCode))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLength, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spinLength, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(checkNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkLetters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLength))
                .addGap(18, 18, 18)
                .addComponent(checkNumbers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkLetters)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnGenerate)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNumber)
                    .addComponent(inputSerialCode, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        inputSerialCode.setText("");        
        inputSerialCode.setText(Generate((int)(spinLength.getValue())));
    }//GEN-LAST:event_btnGenerateActionPerformed

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
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainActivity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerate;
    private javax.swing.JCheckBox checkLetters;
    private javax.swing.JCheckBox checkNumbers;
    private javax.swing.JTextField inputSerialCode;
    private javax.swing.JLabel lblLength;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JSpinner spinLength;
    // End of variables declaration//GEN-END:variables

    private String Generate(int length)
    {
        String code = "";
        char[] options;
        char selected;
        options = fillOptions();
        
        
        for (int i = 0; i < length; i++) 
        {
            selected = PickRandom(options);
            code += selected;
        }
        
        return code;
    }
    private char PickRandom(char[] list)
    {
        Random ra = new Random();
        int rand = ra.nextInt(list.length);
        
        return list[rand];
    }
    
    private char[] fillOptions()
    {
        char c = ' ';
        char[] array = new char[62];
        int cont = 0;
        
        if(checkNumbers.isSelected() && checkLetters.isSelected())
        {
            for (int i = 48; i < 123; i++) 
            {
                c = (char) i;
                if(Character.isDigit(c) || Character.isLetter(c))
                { 
                    if(cont<array.length)
                    {
                        array[cont] = c;
                        cont++;
                    }
                }

            }
        }
        else if (checkNumbers.isSelected() && !checkLetters.isSelected())
        {
            for (int i = 48; i < 123; i++) 
            {
                c = (char) i;
                if(Character.isDigit(c))
                { 
                    
                    if(cont<array.length)
                    {
                        array[cont] = c;
                        cont++;
                    }
                }

            }
        }
        else if (checkLetters.isSelected() && !checkNumbers.isSelected())
        {
            for (int i = 48; i < 123; i++) 
            {
                c = (char) i;
                if(Character.isLetter(c))
                { 
                    if(cont<array.length)
                    {
                        array[cont] = c;
                        cont++;
                    }
                }

            }
        }
        else
        {
            for (int i = 0; i < array.length; i++) 
            {
                array[i] = '0';
            }
        }
        return array;
    }
    
}
