package lk.jiat.smarttrade.gui;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMaterialDarkerIJTheme;
import javax.swing.SwingUtilities;
import lk.jiat.smarttrade.util.AppIconUtil;

/**
 *
 * @author P A N S I L U
 */
public class SplashScreen extends javax.swing.JFrame {

    private static SplashScreen splashScreen;
    
    public SplashScreen() {
        initComponents();
        AppIconUtil.applyIcon(this);
        loadingAnimation();
    }
    
    // Loading Animation
    private void loadingAnimation() {
        new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                loadingBar.setValue(i);
                loadingText.setText(getLoadingMessage(i));

                try {
                    Thread.sleep(getDelayForProgress(i));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }

            SwingUtilities.invokeLater(() -> {
                new HomeScreen().setVisible(true);
                splashScreen.dispose();
            });
        }).start();
    }

    private String getLoadingMessage(int progress) {
        if (progress < 30) return "Starting Modules   " + progress + "%";
        if (progress <= 60) return "Database Connection Established   " + progress + "%";
        if (progress < 100) return "Loading Interface   " + progress + "%";
        return "Loading...";
    }

    private int getDelayForProgress(int progress) {
        if (progress == 100) return 3000;
        if (progress <= 30) return 100;
        if (progress <= 60) return 200;
        return 20;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backPanel = new javax.swing.JPanel();
        imgBanner = new javax.swing.JLabel();
        loadingBar = new javax.swing.JProgressBar();
        loadingText = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setEnabled(false);
        setUndecorated(true);
        setSize(new java.awt.Dimension(700, 396));

        imgBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/jiat/smarttrade/img/splashImage.jpg"))); // NOI18N

        loadingText.setText("Loading....");

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addComponent(imgBanner)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(backPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loadingText, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadingBar, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addComponent(imgBanner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loadingBar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loadingText))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        FlatMTMaterialDarkerIJTheme.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                splashScreen = new SplashScreen();
                splashScreen.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backPanel;
    private javax.swing.JLabel imgBanner;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar loadingBar;
    private javax.swing.JLabel loadingText;
    // End of variables declaration//GEN-END:variables
}
