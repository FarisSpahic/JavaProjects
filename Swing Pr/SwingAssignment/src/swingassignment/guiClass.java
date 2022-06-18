package swingassignment;

import static com.sun.org.apache.xerces.internal.util.FeatureState.is;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.SwingWorker;
import javax.swing.Timer;

public class guiClass extends javax.swing.JFrame {

    public guiClass() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        onTimeRB = new javax.swing.JRadioButton();
        cntdRB = new javax.swing.JRadioButton();
        cntdFld = new javax.swing.JTextField();
        colorBtn = new javax.swing.JButton();
        colorLbl = new javax.swing.JLabel();
        speedLBl = new javax.swing.JLabel();
        startBtn = new javax.swing.JButton();
        stopBtn = new javax.swing.JButton();
        speedCB = new javax.swing.JComboBox<>();
        onTimeFld = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Assignment ");
        setSize(new java.awt.Dimension(400, 800));

        btnGroup.add(onTimeRB);
        onTimeRB.setText("On time:");
        onTimeRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onTimeRBActionPerformed(evt);
            }
        });

        btnGroup.add(cntdRB);
        cntdRB.setText("Countdown:");
        cntdRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cntdRBActionPerformed(evt);
            }
        });

        cntdFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cntdFldActionPerformed(evt);
            }
        });

        colorBtn.setText("Choose Color");
        colorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBtnActionPerformed(evt);
            }
        });

        colorLbl.setLabelFor(colorBtn);

        speedLBl.setText("Speed:");

        startBtn.setText("START");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        stopBtn.setText("STOP");
        stopBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopBtnActionPerformed(evt);
            }
        });

        speedCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        try {
            onTimeFld.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:## ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        onTimeFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onTimeFldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(onTimeRB)
                            .addComponent(cntdRB)
                            .addComponent(colorBtn))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stopBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(cntdFld)
                            .addComponent(colorLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(onTimeFld))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(speedCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedLBl)
                            .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onTimeRB)
                    .addComponent(onTimeFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cntdRB)
                    .addComponent(cntdFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(colorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addComponent(speedLBl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(speedCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startBtn)
                    .addComponent(stopBtn))
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cntdFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cntdFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cntdFldActionPerformed
    static boolean loopV = false;
    public static Color jcc;
    static int time, hh, mm, ss, red, blue, green;
    static Date lt = null, d;
    static Date now = new Date();
    static Timer t;
    static JFrame nf;
    static SwingWorker sw;
    static PopUpScreen ns;
    static Thread timer, nst;
    private void colorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBtnActionPerformed
        JColorChooser jc = new JColorChooser();
        Color initColor = this.getBackground();

        Color jcc = jc.showDialog(null, "Pick color: ", initColor);

        red = jcc.getRed();
        blue = jcc.getBlue();
        green = jcc.getGreen();

        colorLbl.setText("RGB(" + red + "," + green + "," + blue + ")");
        colorLbl.setForeground(jcc);
    }//GEN-LAST:event_colorBtnActionPerformed

    private void onTimeRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onTimeRBActionPerformed
        cntdFld.setEnabled(false);
        onTimeFld.setEnabled(true);
    }//GEN-LAST:event_onTimeRBActionPerformed

    private void cntdRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cntdRBActionPerformed
        onTimeFld.setEnabled(false);
        cntdFld.setEnabled(true);
    }//GEN-LAST:event_cntdRBActionPerformed

    private void onTimeFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onTimeFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_onTimeFldActionPerformed


    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed

        if (cntdRB.isSelected()) {
            time = Integer.parseInt(cntdFld.getText());
        } else {
            String strTime = onTimeFld.getText();
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            try {
                d = dateFormat.parse(strTime);
            } catch (ParseException ex) {
            }
            String tt = onTimeFld.getText();

            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
            sdf.setTimeZone(TimeZone.getTimeZone(ZoneId.systemDefault()));
            try {
                lt = sdf.parse(tt);
            } catch (Exception e) {
                System.out.println("Error in Time parsing!");
            }

            hh = lt.getHours();
            mm = lt.getMinutes();
            ss = lt.getSeconds();
        }

        sw = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {

                if (cntdRB.isSelected()) {
                    timer = new Thread(new Runnable() {
                        @Override
                        public void run() {

                            for (int i = time; i > 0; i--) {
                                time--;
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException ex) {

                                    sw.cancel(true);
                                }

                            }

                        }
                    });

                    try {
                        timer.start();
                        timer.join();
                    } catch (Exception e) {
                    }
                } else if (onTimeRB.isSelected()) {
                    t = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            now = new Date();
                            if (now.getHours() == d.getHours() && now.getMinutes() == d.getMinutes() && now.getSeconds() == d.getSeconds()) {

                                t.stop();
                            } else {

                            }

                        }
                    });
                    t.start();
                    try {
                        if (t.isRunning()) {
                            while (t.isRunning()) {
                                Thread.sleep(1000);
                            }
                        }
                    } catch (Exception e) {
                    }
                }

                ns = new PopUpScreen();
                ns.setColor(Color.WHITE);
                ns.setNewBackground();
                ns.addFrame();
                Integer speed = Integer.parseInt(speedCB.getSelectedItem().toString());
                nst = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (!sw.isCancelled() && ns.isOnScreen()) {
                            ns.setRGBColor(red, green, blue);
                            ns.setNewBackground();

                            try {
                                Thread.sleep(1000 / speed);

                            } catch (InterruptedException ex) {
                                sw.cancel(true);

                            }

                            ns.setRGBColor(255, 255, 255);
                            ns.setNewBackground();

                            try {
                                Thread.sleep(1000 / speed);
                            } catch (InterruptedException ex) {
                                sw.cancel(true);
                            }

                        }
                        ns.disposeFrame();
                    }
                });

                try {
                    nst.start();
                    nst.join();
                } catch (InterruptedException ex) {
                    sw.cancel(true);

                }

                return null;

            }

            @Override
            protected void done() {
                if (ns.isOnScreen()) {
                    ns.disposeFrame();
                }
                System.out.println("DONE");

            }

        };
        sw.execute();


    }//GEN-LAST:event_startBtnActionPerformed


    private void stopBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopBtnActionPerformed
        sw.cancel(true);
        try {

            if (t.isRunning()) {
                t.stop();
            }
            if (timer.isAlive()) {
                timer.stop();
            }
            if (nst.isAlive()) {
                nst.stop();
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_stopBtnActionPerformed

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
            java.util.logging.Logger.getLogger(guiClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JTextField cntdFld;
    private javax.swing.JRadioButton cntdRB;
    private javax.swing.JButton colorBtn;
    private javax.swing.JLabel colorLbl;
    private javax.swing.JFormattedTextField onTimeFld;
    private javax.swing.JRadioButton onTimeRB;
    public javax.swing.JComboBox<String> speedCB;
    private javax.swing.JLabel speedLBl;
    private javax.swing.JButton startBtn;
    private javax.swing.JButton stopBtn;
    // End of variables declaration//GEN-END:variables
}
