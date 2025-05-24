package lk.jiat.smarttrade.gui;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMaterialDarkerIJTheme;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import lk.jiat.smarttrade.panel.DashboardPanel;
import lk.jiat.smarttrade.panel.InvoicePanel;
import lk.jiat.smarttrade.util.AppIconUtil;
import org.kordamp.ikonli.swing.FontIcon;
import org.kordamp.ikonli.fontawesome.FontAwesome;

/**
 *
 * @author P A N S I L U
 */
public class HomeScreen extends javax.swing.JFrame {
    
    private DashboardPanel dashboardPanel;
    private InvoicePanel invoicePanel;
    private CardLayout contentPanelLayout;
    
    public HomeScreen() {
        initComponents();
        init();
    }
    
    private void addMenuIcons() {
        FontIcon dashboardIcon = FontIcon.of(FontAwesome.NEWSPAPER_O);
        dashboardIcon.setIconColor(Color.decode("#BBBBBB"));
        dashboardIcon.setIconSize(20);
        dashboardBtn.setIcon(dashboardIcon);
        
        FontIcon invoiceIcon = FontIcon.of(FontAwesome.MONEY);
        invoiceIcon.setIconColor(Color.decode("#BBBBBB"));
        invoiceIcon.setIconSize(20);
        invoiceBtn.setIcon(invoiceIcon);
    }
    
    private void makeStuffRound() {
        menuItemPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        headPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        contentScrollPane.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        contentPane.putClientProperty(FlatClientProperties.STYLE, "arc:20");
    }
    
    private void loadPanels() {
        if (contentPanelLayout == null && contentPane.getLayout() instanceof CardLayout) {
            this.contentPanelLayout = (CardLayout)contentPane.getLayout();
        }
        this.dashboardPanel = new DashboardPanel();
        this.invoicePanel = new InvoicePanel();
        
        this.contentPane.add(dashboardPanel, "dashboard_panel");
        this.contentPane.add(invoicePanel, "invoice_panel");
        
        SwingUtilities.updateComponentTreeUI(contentPane);
    }
    
    private void init() {
        AppIconUtil.applyIcon(this);
        makeStuffRound();
        addMenuIcons();
        loadPanels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuItemPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        dashboardBtn = new javax.swing.JButton();
        invoiceBtn = new javax.swing.JButton();
        headPanel = new javax.swing.JPanel();
        contentScrollPane = new javax.swing.JScrollPane();
        contentPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SmartTrade - Home");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        menuItemPanel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/jiat/smarttrade/img/icon.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Orbitron", 0, 36)); // NOI18N
        jLabel2.setText("SmartTrade");

        dashboardBtn.setBackground(new java.awt.Color(70, 73, 75));
        dashboardBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        dashboardBtn.setText("Dashboard");
        dashboardBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardBtn.setFocusable(false);
        dashboardBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboardBtn.setIconTextGap(15);
        dashboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtnActionPerformed(evt);
            }
        });

        invoiceBtn.setBackground(new java.awt.Color(70, 73, 75));
        invoiceBtn.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        invoiceBtn.setText("Invoice");
        invoiceBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        invoiceBtn.setFocusable(false);
        invoiceBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        invoiceBtn.setIconTextGap(15);
        invoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuItemPanelLayout = new javax.swing.GroupLayout(menuItemPanel);
        menuItemPanel.setLayout(menuItemPanelLayout);
        menuItemPanelLayout.setHorizontalGroup(
            menuItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItemPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItemPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(menuItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItemPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItemPanelLayout.createSequentialGroup()
                        .addComponent(dashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(menuItemPanelLayout.createSequentialGroup()
                        .addComponent(invoiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
            .addGroup(menuItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        menuItemPanelLayout.setVerticalGroup(
            menuItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItemPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(invoiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        headPanel.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout headPanelLayout = new javax.swing.GroupLayout(headPanel);
        headPanel.setLayout(headPanelLayout);
        headPanelLayout.setHorizontalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        headPanelLayout.setVerticalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        contentScrollPane.setBackground(new java.awt.Color(51, 51, 51));
        contentScrollPane.setForeground(new java.awt.Color(51, 51, 51));
        contentScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        contentPane.setLayout(new java.awt.CardLayout());
        contentScrollPane.setViewportView(contentPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentScrollPane))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(headPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contentScrollPane)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Maximizes Jframe window to full screen
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void dashboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnActionPerformed
        this.contentPanelLayout.show(contentPane, "dashboard_panel");
    }//GEN-LAST:event_dashboardBtnActionPerformed

    private void invoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceBtnActionPerformed
        this.contentPanelLayout.show(contentPane, "invoice_panel");
    }//GEN-LAST:event_invoiceBtnActionPerformed

    
    public static void main(String args[]) {
        FlatMTMaterialDarkerIJTheme.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPane;
    private javax.swing.JScrollPane contentScrollPane;
    private javax.swing.JButton dashboardBtn;
    private javax.swing.JPanel headPanel;
    private javax.swing.JButton invoiceBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menuItemPanel;
    // End of variables declaration//GEN-END:variables
}
