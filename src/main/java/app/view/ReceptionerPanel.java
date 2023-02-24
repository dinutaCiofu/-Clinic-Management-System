package app.view;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import lombok.Getter;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class ReceptionerPanel {
    @Getter
    private JPanel mainPanel;
    private JLabel assistantImg;
    @Getter
    private JButton logoutButton;
    @Getter
    private JPanel meniuPanel;
    @Getter
    private JButton programarePacientButton;
    @Getter
    private JButton emitereBonFiscalButton;

    public ReceptionerPanel() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(1, 1, new Insets(10, 10, 10, 10), -1, -1));
        mainPanel.setBackground(new Color(-3611918));
        mainPanel.setEnabled(false);
        mainPanel.setForeground(new Color(-3611918));
        mainPanel.setMinimumSize(new Dimension(850, 650));
        meniuPanel = new JPanel();
        meniuPanel.setLayout(new GridLayoutManager(1, 3, new Insets(10, 30, 10, 10), -1, -1));
        meniuPanel.setBackground(new Color(-3611918));
        mainPanel.add(meniuPanel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        meniuPanel.setBorder(BorderFactory.createTitledBorder(null, "Meniu", TitledBorder.CENTER, TitledBorder.BELOW_TOP, this.getFont("Segoe Print", Font.BOLD, 20, meniuPanel.getFont()), new Color(-13881358)));
        programarePacientButton = new JButton();
        Font programarePacientButtonFont = this.getFont("Segoe Print", Font.BOLD, 14, programarePacientButton.getFont());
        if (programarePacientButtonFont != null) programarePacientButton.setFont(programarePacientButtonFont);
        programarePacientButton.setText("Programare Pacient");
        meniuPanel.add(programarePacientButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        emitereBonFiscalButton = new JButton();
        Font emitereBonFiscalButtonFont = this.getFont("Segoe Print", Font.BOLD, 14, emitereBonFiscalButton.getFont());
        if (emitereBonFiscalButtonFont != null) emitereBonFiscalButton.setFont(emitereBonFiscalButtonFont);
        emitereBonFiscalButton.setText("Emitere Bon Fiscal");
        meniuPanel.add(emitereBonFiscalButton, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        logoutButton = new JButton();
        logoutButton.setBackground(new Color(-6308366));
        logoutButton.setEnabled(true);
        Font logoutButtonFont = this.getFont("Segoe Print", Font.BOLD | Font.ITALIC, 14, logoutButton.getFont());
        if (logoutButtonFont != null) logoutButton.setFont(logoutButtonFont);
        logoutButton.setForeground(new Color(-13881358));
        logoutButton.setHideActionText(true);
        logoutButton.setHorizontalAlignment(0);
        logoutButton.setHorizontalTextPosition(0);
        logoutButton.setText("Logout");
        meniuPanel.add(logoutButton, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 27, false));

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
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(1, 1, new Insets(10, 10, 10, 10), -1, -1));
        mainPanel.setBackground(new Color(-3611918));
        mainPanel.setEnabled(false);
        mainPanel.setForeground(new Color(-3611918));
        mainPanel.setMinimumSize(new Dimension(850, 650));
        meniuPanel = new JPanel();
        meniuPanel.setLayout(new GridLayoutManager(1, 3, new Insets(10, 30, 10, 10), -1, -1));
        meniuPanel.setBackground(new Color(-3611918));
        mainPanel.add(meniuPanel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        meniuPanel.setBorder(BorderFactory.createTitledBorder(null, "Meniu", TitledBorder.CENTER, TitledBorder.BELOW_TOP, this.$$$getFont$$$("Segoe Print", Font.BOLD, 20, meniuPanel.getFont()), new Color(-13881358)));
        programarePacientButton = new JButton();
        Font programarePacientButtonFont = this.$$$getFont$$$("Segoe Print", Font.BOLD, 14, programarePacientButton.getFont());
        if (programarePacientButtonFont != null) programarePacientButton.setFont(programarePacientButtonFont);
        programarePacientButton.setText("Programare Pacient");
        meniuPanel.add(programarePacientButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        emitereBonFiscalButton = new JButton();
        Font emitereBonFiscalButtonFont = this.$$$getFont$$$("Segoe Print", Font.BOLD, 14, emitereBonFiscalButton.getFont());
        if (emitereBonFiscalButtonFont != null) emitereBonFiscalButton.setFont(emitereBonFiscalButtonFont);
        emitereBonFiscalButton.setText("Emitere Bon Fiscal");
        meniuPanel.add(emitereBonFiscalButton, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        logoutButton = new JButton();
        logoutButton.setBackground(new Color(-6308366));
        logoutButton.setEnabled(true);
        Font logoutButtonFont = this.$$$getFont$$$("Segoe Print", Font.BOLD | Font.ITALIC, 14, logoutButton.getFont());
        if (logoutButtonFont != null) logoutButton.setFont(logoutButtonFont);
        logoutButton.setForeground(new Color(-13881358));
        logoutButton.setHideActionText(true);
        logoutButton.setHorizontalAlignment(0);
        logoutButton.setHorizontalTextPosition(0);
        logoutButton.setText("Logout");
        meniuPanel.add(logoutButton, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 27, false));
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
        return mainPanel;
    }
}
