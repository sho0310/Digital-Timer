
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shotarohariu
 */
public class TimerFrame extends javax.swing.JFrame {
javax.swing.Timer tm;
    /**
     * Creates new form TimerFrame
     */
    public TimerFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        digitValue = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        showDigit = new javax.swing.JButton();
        AddOne = new javax.swing.JButton();
        OneSecsDisplay = new javax.swing.JButton();
        oneSecs = new javax.swing.JTextField();
        showOneSecs = new javax.swing.JButton();
        TenSecsDisplay = new javax.swing.JButton();
        tenSecs = new javax.swing.JTextField();
        showTenSecs = new javax.swing.JButton();
        Stop = new javax.swing.JButton();
        OneMinsDisplay = new javax.swing.JButton();
        TenMinsDisplay = new javax.swing.JButton();
        oneMins = new javax.swing.JTextField();
        tenMins = new javax.swing.JTextField();
        showOneMins = new javax.swing.JButton();
        showTenMins = new javax.swing.JButton();
        startTimer = new javax.swing.JButton();
        theTimeNow = new javax.swing.JButton();
        timeNow = new javax.swing.JTextField();
        SecsToStop = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Digital Timer");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        digitValue.setText("000");
        getContentPane().add(digitValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, -1, -1));

        jTextField1.setBackground(new java.awt.Color(51, 0, 204));
        jTextField1.setText("     ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 70, -1));

        jTextField2.setBackground(new java.awt.Color(51, 0, 204));
        jTextField2.setText("     ");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 30, 80));

        jTextField3.setBackground(new java.awt.Color(51, 0, 204));
        jTextField3.setText("      ");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 30, 80));

        jTextField4.setBackground(new java.awt.Color(51, 0, 204));
        jTextField4.setText("      ");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 70, -1));

        jTextField5.setBackground(new java.awt.Color(51, 0, 204));
        jTextField5.setText("      ");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 30, 80));

        jTextField6.setBackground(new java.awt.Color(51, 0, 204));
        jTextField6.setText("      ");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 30, 80));

        jTextField7.setBackground(new java.awt.Color(51, 0, 204));
        jTextField7.setText("      ");
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 70, -1));

        showDigit.setText("show the digit");
        showDigit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDigitActionPerformed(evt);
            }
        });
        getContentPane().add(showDigit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 130, -1));

        AddOne.setText("Add 1");
        AddOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOneActionPerformed(evt);
            }
        });
        getContentPane().add(AddOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 130, -1));

        OneSecsDisplay.setText("jButton1");
        OneSecsDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneSecsDisplayActionPerformed(evt);
            }
        });
        getContentPane().add(OneSecsDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 130, 180));

        oneSecs.setText("000");
        getContentPane().add(oneSecs, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, -1, -1));

        showOneSecs.setText("show one secs");
        showOneSecs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showOneSecsActionPerformed(evt);
            }
        });
        getContentPane().add(showOneSecs, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, -1));

        TenSecsDisplay.setText("jButton1");
        TenSecsDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenSecsDisplayActionPerformed(evt);
            }
        });
        getContentPane().add(TenSecsDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 130, 180));

        tenSecs.setText("000");
        tenSecs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenSecsActionPerformed(evt);
            }
        });
        getContentPane().add(tenSecs, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        showTenSecs.setText("show ten secs");
        showTenSecs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTenSecsActionPerformed(evt);
            }
        });
        getContentPane().add(showTenSecs, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, -1));

        Stop.setText("End");
        Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopActionPerformed(evt);
            }
        });
        getContentPane().add(Stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 130, -1));

        OneMinsDisplay.setText("jButton1");
        getContentPane().add(OneMinsDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 130, 180));

        TenMinsDisplay.setText("jButton2");
        TenMinsDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenMinsDisplayActionPerformed(evt);
            }
        });
        getContentPane().add(TenMinsDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 130, 180));

        oneMins.setText("000");
        oneMins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneMinsActionPerformed(evt);
            }
        });
        getContentPane().add(oneMins, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, -1, -1));

        tenMins.setText("000");
        tenMins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenMinsActionPerformed(evt);
            }
        });
        getContentPane().add(tenMins, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, -1, -1));

        showOneMins.setText("show one mins");
        showOneMins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showOneMinsActionPerformed(evt);
            }
        });
        getContentPane().add(showOneMins, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, -1, -1));

        showTenMins.setText("show ten mins");
        showTenMins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTenMinsActionPerformed(evt);
            }
        });
        getContentPane().add(showTenMins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        startTimer.setText("Start");
        startTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTimerActionPerformed(evt);
            }
        });
        getContentPane().add(startTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 130, -1));

        theTimeNow.setText("The Time Now");
        theTimeNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theTimeNowActionPerformed(evt);
            }
        });
        getContentPane().add(theTimeNow, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, -1, -1));

        timeNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeNowActionPerformed(evt);
            }
        });
        getContentPane().add(timeNow, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 140, -1));
        getContentPane().add(SecsToStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 120, -1));

        jLabel2.setText("Seconds to stop at");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void showDigitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDigitActionPerformed
        int digit1 = Integer.parseInt(digitValue.getText());
        if (digit1 == 0)  {
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField4.setVisible(false);
            jTextField5.setVisible(true);
            jTextField6.setVisible(true);
            jTextField7.setVisible(true);
        } 
        
        if (digit1 == 1)    {
            jTextField1.setVisible(false);
            jTextField2.setVisible(true);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
            jTextField5.setVisible(true);
            jTextField6.setVisible(false);
            jTextField7.setVisible(false);
        }
        
        if (digit1 == 2)    {
            jTextField1.setVisible(true);
            jTextField2.setVisible(false);
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jTextField6.setVisible(false);
            jTextField7.setVisible(true);      
        }  
        
        if (digit1 == 3)    {
            jTextField1.setVisible(true);
            jTextField2.setVisible(false);
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
            jTextField5.setVisible(false);
            jTextField6.setVisible(true);
            jTextField7.setVisible(true);  
        }
        
        if (digit1 == 4)    {
            jTextField1.setVisible(false);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
            jTextField5.setVisible(false);
            jTextField6.setVisible(true);
            jTextField7.setVisible(false); 
        }    
        
        if (digit1 == 5)    {
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(false);
            jTextField4.setVisible(true);
            jTextField5.setVisible(false);
            jTextField6.setVisible(true);
            jTextField7.setVisible(true);
        }
        
        if (digit1 == 6)    {
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(false);
            jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jTextField6.setVisible(true);
            jTextField7.setVisible(true);
        }
            
        if (digit1 == 7)    {
            jTextField1.setVisible(true);
            jTextField2.setVisible(false);
            jTextField3.setVisible(true);
            jTextField4.setVisible(false);
            jTextField5.setVisible(false);
            jTextField6.setVisible(true);
            jTextField7.setVisible(false);
        } 
        
        if (digit1 == 8)    {
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jTextField6.setVisible(true);
            jTextField7.setVisible(true);
        }
        
        if (digit1 == 9)    {
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
            jTextField5.setVisible(false);
            jTextField6.setVisible(true);
            jTextField7.setVisible(false);
        }
            
    }//GEN-LAST:event_showDigitActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void AddOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOneActionPerformed
        int dd = Integer.parseInt (digitValue.getText());
        dd = dd + 1;
      
        
        if (dd == 10){
            digitValue.setText("0");
            dd= 0;
            int oneD = Integer.parseInt (oneSecs.getText());
        oneD = oneD + 1;
        oneSecs.setText (Integer.toString(oneD));
            
            }
        String ss = Integer.toString ( dd); 
        digitValue.setText (ss);
        showDigitActionPerformed(evt); // Click Show Digit when AddOne is clicked    
        showOneSecsActionPerformed(evt); // Click Show One Secs when AddOne is clicked
        
        
    }//GEN-LAST:event_AddOneActionPerformed

    private void OneSecsDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneSecsDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OneSecsDisplayActionPerformed

    private void showOneSecsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showOneSecsActionPerformed
    OneSecsDisplay.setIcon(new javax.swing.ImageIcon("0.png"));
    int ones = Integer.parseInt(oneSecs.getText());
    if ( ones == 0){ 
        OneSecsDisplay.setIcon(new javax.swing.ImageIcon("0.png"));
        }
    if ( ones == 1){ 
        OneSecsDisplay.setIcon(new javax.swing.ImageIcon("1.png")); 
        }
    if ( ones == 2){ 
        OneSecsDisplay.setIcon(new javax.swing.ImageIcon("2.png"));  
        }
    if ( ones == 3){
        OneSecsDisplay.setIcon(new javax.swing.ImageIcon("3.png"));
        }
    if ( ones == 4){
        OneSecsDisplay.setIcon(new javax.swing.ImageIcon("4.png"));
        }
    if ( ones == 5){
        OneSecsDisplay.setIcon(new javax.swing.ImageIcon("5.png"));
        }
    if ( ones == 6){
        OneSecsDisplay.setIcon(new javax.swing.ImageIcon("6.png"));
        }
    if ( ones == 7){
        OneSecsDisplay.setIcon(new javax.swing.ImageIcon("7.png"));
        }
    if ( ones == 8){
        OneSecsDisplay.setIcon(new javax.swing.ImageIcon("8.png"));
        }
    if ( ones == 9){
        OneSecsDisplay.setIcon(new javax.swing.ImageIcon("9.png"));    
    } 
     int oneD = Integer.parseInt (oneSecs.getText());

        if (oneD == 10){
            
            oneD= 0;
            int tenD = Integer.parseInt (tenSecs.getText());
        tenD = tenD + 1;
        tenSecs.setText (Integer.toString(tenD));    
       }
        String ss = Integer.toString ( oneD); 
        oneSecs.setText (ss);
        
        
        showTenSecsActionPerformed(evt);
        
    }//GEN-LAST:event_showOneSecsActionPerformed

    private void TenSecsDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenSecsDisplayActionPerformed
        
    }//GEN-LAST:event_TenSecsDisplayActionPerformed

    private void tenSecsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenSecsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenSecsActionPerformed

    private void showTenSecsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTenSecsActionPerformed

        int tens = Integer.parseInt(tenSecs.getText());
        if (tens == 0){
            TenSecsDisplay.setIcon(new javax.swing.ImageIcon("0.png"));
        }
        if (tens == 1){
            TenSecsDisplay.setIcon(new javax.swing.ImageIcon("1.png"));
        }
        if (tens == 2){
            TenSecsDisplay.setIcon(new javax.swing.ImageIcon("2.png"));
        }
        if (tens == 3){
            TenSecsDisplay.setIcon(new javax.swing.ImageIcon("3.png"));
        }
        if (tens == 4){
            TenSecsDisplay.setIcon(new javax.swing.ImageIcon("4.png"));
        }
        if (tens == 5){
            TenSecsDisplay.setIcon(new javax.swing.ImageIcon("5.png"));
        }
        
        
        
        

        if (tens == 6){
            tens= 0;
            int oneM = Integer.parseInt (oneMins.getText());
        oneM = oneM + 1;
        oneMins.setText (Integer.toString(oneM));    
       }
        String ss = Integer.toString ( tens); 
        tenSecs.setText (ss);
        
        showOneMinsActionPerformed(evt);
        
        
    }//GEN-LAST:event_showTenSecsActionPerformed

    private void StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopActionPerformed
       this.dispose();
       System.exit(0);   
    }//GEN-LAST:event_StopActionPerformed

    private void oneMinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneMinsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oneMinsActionPerformed

    private void showOneMinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showOneMinsActionPerformed
        
        int onemins = Integer.parseInt(oneMins.getText());
        if (onemins == 0){
            OneMinsDisplay.setIcon(new javax.swing.ImageIcon("0.png"));
        }
        if (onemins == 1){
            OneMinsDisplay.setIcon(new javax.swing.ImageIcon("1.png"));
        }
        if (onemins == 2){
            OneMinsDisplay.setIcon(new javax.swing.ImageIcon("2.png"));
        }
        if (onemins == 3){
            OneMinsDisplay.setIcon(new javax.swing.ImageIcon("3.png"));
        }
        if (onemins == 4){
            OneMinsDisplay.setIcon(new javax.swing.ImageIcon("4.png"));
        }
        if (onemins == 5){
            OneMinsDisplay.setIcon(new javax.swing.ImageIcon("5.png"));
        }
        if (onemins == 6){
            OneMinsDisplay.setIcon(new javax.swing.ImageIcon("6.png"));
        }
        if (onemins == 7){
            OneMinsDisplay.setIcon(new javax.swing.ImageIcon("7.png"));
        }
        if (onemins == 8){
            OneMinsDisplay.setIcon(new javax.swing.ImageIcon("8.png"));
        }
        if (onemins == 9){
            OneMinsDisplay.setIcon(new javax.swing.ImageIcon("9.png"));
        }
        int oneM = Integer.parseInt (oneMins.getText());

        if (oneM == 10){
            oneM= 0;
            int tenM = Integer.parseInt (tenMins.getText());
        tenM = tenM + 1;
        tenMins.setText (Integer.toString(tenM));  
        }
        String ss = Integer.toString ( oneM); 
        oneMins.setText (ss);
        
        
        showTenMinsActionPerformed(evt);
        
        
    }//GEN-LAST:event_showOneMinsActionPerformed

    private void showTenMinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTenMinsActionPerformed
        
        int tenmins = Integer.parseInt(tenMins.getText());
        if (tenmins == 0){
            TenMinsDisplay.setIcon(new javax.swing.ImageIcon("0.png"));
        }
        if (tenmins == 1){
            TenMinsDisplay.setIcon(new javax.swing.ImageIcon("1.png"));
        }
        if (tenmins == 2){
            TenMinsDisplay.setIcon(new javax.swing.ImageIcon("2.png"));
        }
        if (tenmins == 3){
            TenMinsDisplay.setIcon(new javax.swing.ImageIcon("3.png"));
        }
        if (tenmins == 4){
            TenMinsDisplay.setIcon(new javax.swing.ImageIcon("4.png"));
        }
        if (tenmins == 5){
            TenMinsDisplay.setIcon(new javax.swing.ImageIcon("5.png"));
        }
        if (tenmins == 6){
            TenMinsDisplay.setIcon(new javax.swing.ImageIcon("6.png"));
        }
        
        
    }//GEN-LAST:event_showTenMinsActionPerformed

    private void TenMinsDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenMinsDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TenMinsDisplayActionPerformed

    private void tenMinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenMinsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenMinsActionPerformed

    private void timeNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeNowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeNowActionPerformed

    private void theTimeNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_theTimeNowActionPerformed
       //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
        dateFormat.format(time);
        timeNow.setText( dateFormat.format(time) );
        
        
    }//GEN-LAST:event_theTimeNowActionPerformed

    private void startTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTimerActionPerformed
    tm = new javax.swing.Timer(10, new ActionListener(){
         public void actionPerformed(ActionEvent evt) {
             AddOneActionPerformed(evt);
         }
     });
    tm.start();
    }//GEN-LAST:event_startTimerActionPerformed

    
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
            java.util.logging.Logger.getLogger(TimerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddOne;
    private javax.swing.JButton OneMinsDisplay;
    private javax.swing.JButton OneSecsDisplay;
    private javax.swing.JTextField SecsToStop;
    private javax.swing.JButton Stop;
    private javax.swing.JButton TenMinsDisplay;
    private javax.swing.JButton TenSecsDisplay;
    private javax.swing.JTextField digitValue;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField oneMins;
    private javax.swing.JTextField oneSecs;
    private javax.swing.JButton showDigit;
    private javax.swing.JButton showOneMins;
    private javax.swing.JButton showOneSecs;
    private javax.swing.JButton showTenMins;
    private javax.swing.JButton showTenSecs;
    private javax.swing.JButton startTimer;
    private javax.swing.JTextField tenMins;
    private javax.swing.JTextField tenSecs;
    private javax.swing.JButton theTimeNow;
    private javax.swing.JTextField timeNow;
    // End of variables declaration//GEN-END:variables
}
