package app.view;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import lombok.Getter;


import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.Locale;

public class LoginPanel {
    @Getter
    private JPanel loginPanel;
    @Getter
    private JPanel credentialsPanel;
    private JPanel messagePanel;

    @Getter
    private JPasswordField parola;
    @Getter
    private JButton btnOk;

    @Getter
    private JComboBox functie;
    @Getter
    private JTextField username;
    private JLabel functieLabel;
    private JLabel usernameLabel;
    private JLabel parolaLabel;
    private JLabel msg1Label;
    private JLabel msg2Label;

    public LoginPanel() {
        loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 20), -1, -1));
        loginPanel.setBackground(new Color(-3611918));
        Font loginPanelFont = this.getFont("Segoe Print", Font.BOLD, 0, loginPanel.getFont());
        if (loginPanelFont != null) loginPanel.setFont(loginPanelFont);
        loginPanel.setPreferredSize(new Dimension(850, 650));
        loginPanel.setVerifyInputWhenFocusTarget(true);
        final Spacer spacer1 = new Spacer();
        loginPanel.add(spacer1, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        messagePanel = new JPanel();
        messagePanel.setLayout(new GridLayoutManager(4, 1, new Insets(10, 10, 40, 10), -1, -1));
        messagePanel.setBackground(new Color(-3935529));
        loginPanel.add(messagePanel, new GridConstraints(0, 0, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        msg2Label = new JLabel();
        Font msg2LabelFont = this.getFont("Segoe Print", Font.BOLD, 18, msg2Label.getFont());
        if (msg2LabelFont != null) msg2Label.setFont(msg2LabelFont);
        msg2Label.setText("pe pagina de login");
        messagePanel.add(msg2Label, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        messagePanel.add(spacer2, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        msg1Label = new JLabel();
        Font msg1LabelFont = this.getFont("Segoe Print", Font.BOLD, 18, msg1Label.getFont());
        if (msg1LabelFont != null) msg1Label.setFont(msg1LabelFont);
        msg1Label.setText("Bine ați venit");
        messagePanel.add(msg1Label, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        messagePanel.add(spacer3, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        credentialsPanel = new JPanel();
        credentialsPanel.setLayout(new GridLayoutManager(7, 2, new Insets(0, 15, 10, 25), -1, -1));
        credentialsPanel.setBackground(new Color(-3611918));
        loginPanel.add(credentialsPanel, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        functieLabel = new JLabel();
        Font functieLabelFont = this.getFont("Segoe Print", Font.BOLD, 14, functieLabel.getFont());
        if (functieLabelFont != null) functieLabel.setFont(functieLabelFont);
        functieLabel.setText("Selectează funcția:");
        credentialsPanel.add(functieLabel, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        parolaLabel = new JLabel();
        Font parolaLabelFont = this.getFont("Segoe Print", Font.BOLD, 14, parolaLabel.getFont());
        if (parolaLabelFont != null) parolaLabel.setFont(parolaLabelFont);
        parolaLabel.setText("Parola:");
        credentialsPanel.add(parolaLabel, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        parola = new JPasswordField();
        credentialsPanel.add(parola, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        btnOk = new JButton();
        btnOk.setText("OK");
        credentialsPanel.add(btnOk, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        usernameLabel = new JLabel();
        Font usernameLabelFont = this.getFont("Segoe Print", Font.BOLD, 14, usernameLabel.getFont());
        if (usernameLabelFont != null) usernameLabel.setFont(usernameLabelFont);
        usernameLabel.setText("Username:");
        credentialsPanel.add(usernameLabel, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer4 = new Spacer();
        credentialsPanel.add(spacer4, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer5 = new Spacer();
        credentialsPanel.add(spacer5, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer6 = new Spacer();
        credentialsPanel.add(spacer6, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));

        functie = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("superAdmin");
        defaultComboBoxModel1.addElement("admin");
        defaultComboBoxModel1.addElement("medic");
        defaultComboBoxModel1.addElement("asistent");
        defaultComboBoxModel1.addElement("receptionist");
        defaultComboBoxModel1.addElement("contabil");
        defaultComboBoxModel1.addElement("inspectorHR");
        functie.setModel(defaultComboBoxModel1);
        credentialsPanel.add(functie, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        username = new JTextField();
        credentialsPanel.add(username, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));

    }


    private Font getFont(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 20), -1, -1));
        loginPanel.setBackground(new Color(-3611918));
        Font loginPanelFont = this.$$$getFont$$$("Segoe Print", Font.BOLD, 0, loginPanel.getFont());
        if (loginPanelFont != null) loginPanel.setFont(loginPanelFont);
        loginPanel.setPreferredSize(new Dimension(850, 650));
        loginPanel.setVerifyInputWhenFocusTarget(true);
        final Spacer spacer1 = new Spacer();
        loginPanel.add(spacer1, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        messagePanel = new JPanel();
        messagePanel.setLayout(new GridLayoutManager(4, 1, new Insets(10, 10, 40, 10), -1, -1));
        messagePanel.setBackground(new Color(-3935529));
        loginPanel.add(messagePanel, new GridConstraints(0, 0, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        msg2Label = new JLabel();
        Font msg2LabelFont = this.$$$getFont$$$("Segoe Print", Font.BOLD, 18, msg2Label.getFont());
        if (msg2LabelFont != null) msg2Label.setFont(msg2LabelFont);
        msg2Label.setText("pe pagina de login");
        messagePanel.add(msg2Label, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        messagePanel.add(spacer2, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        msg1Label = new JLabel();
        Font msg1LabelFont = this.$$$getFont$$$("Segoe Print", Font.BOLD, 18, msg1Label.getFont());
        if (msg1LabelFont != null) msg1Label.setFont(msg1LabelFont);
        msg1Label.setText("Bine ați venit");
        messagePanel.add(msg1Label, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        messagePanel.add(spacer3, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        credentialsPanel = new JPanel();
        credentialsPanel.setLayout(new GridLayoutManager(7, 2, new Insets(0, 15, 10, 25), -1, -1));
        credentialsPanel.setBackground(new Color(-3611918));
        loginPanel.add(credentialsPanel, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        functieLabel = new JLabel();
        Font functieLabelFont = this.$$$getFont$$$("Segoe Print", Font.BOLD, 14, functieLabel.getFont());
        if (functieLabelFont != null) functieLabel.setFont(functieLabelFont);
        functieLabel.setText("Selectează funcția:");
        credentialsPanel.add(functieLabel, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        parolaLabel = new JLabel();
        Font parolaLabelFont = this.$$$getFont$$$("Segoe Print", Font.BOLD, 14, parolaLabel.getFont());
        if (parolaLabelFont != null) parolaLabel.setFont(parolaLabelFont);
        parolaLabel.setText("Parola:");
        credentialsPanel.add(parolaLabel, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        parola = new JPasswordField();
        credentialsPanel.add(parola, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        btnOk = new JButton();
        btnOk.setText("OK");
        credentialsPanel.add(btnOk, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        usernameLabel = new JLabel();
        Font usernameLabelFont = this.$$$getFont$$$("Segoe Print", Font.BOLD, 14, usernameLabel.getFont());
        if (usernameLabelFont != null) usernameLabel.setFont(usernameLabelFont);
        usernameLabel.setText("Username:");
        credentialsPanel.add(usernameLabel, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer4 = new Spacer();
        credentialsPanel.add(spacer4, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer5 = new Spacer();
        credentialsPanel.add(spacer5, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer6 = new Spacer();
        credentialsPanel.add(spacer6, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        functie = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("superAdmin");
        defaultComboBoxModel1.addElement("admin");
        defaultComboBoxModel1.addElement("medic");
        defaultComboBoxModel1.addElement("asistent");
        defaultComboBoxModel1.addElement("receptionist");
        defaultComboBoxModel1.addElement("contabil");
        defaultComboBoxModel1.addElement("inspectorHR");
        functie.setModel(defaultComboBoxModel1);
        credentialsPanel.add(functie, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        username = new JTextField();
        credentialsPanel.add(username, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return loginPanel;
    }
}
