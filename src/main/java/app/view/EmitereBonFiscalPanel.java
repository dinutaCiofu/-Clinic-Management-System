package app.view;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import lombok.Getter;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class EmitereBonFiscalPanel {
    @Getter
    private JPanel mainPanel;
    @Getter
    private JLabel programareLabel;
    @Getter
    private JList listaPacienti;
    @Getter
    private JPanel bonFiscalPanel;
    @Getter
    private JButton emiteBonBtn;
    @Getter
    private JLabel serviciiMedicaleLabel;
    @Getter
    private JList serviciiMedicaleList;
    @Getter
    private JLabel pretLabel;
    @Getter
    private JList pretList;
    @Getter
    private JLabel totalLabel;
    @Getter
    private JLabel totalValueLabel;
    @Getter
    private JButton backBtn;

    public EmitereBonFiscalPanel() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(4, 2, new Insets(20, 20, 20, 60), -1, -1));
        mainPanel.setBackground(new Color(-6308366));
        mainPanel.setMinimumSize(new Dimension(850, 650));
        mainPanel.setVisible(true);
        programareLabel = new JLabel();
        Font programareLabelFont = this.getFont("Segoe Print", Font.BOLD, 14, programareLabel.getFont());
        if (programareLabelFont != null) programareLabel.setFont(programareLabelFont);
        programareLabel.setText("Selecteaza pacientul");
        mainPanel.add(programareLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        mainPanel.add(spacer1, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        mainPanel.add(spacer2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        mainPanel.add(scrollPane1, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        listaPacienti = new JList();
        scrollPane1.setViewportView(listaPacienti);
        bonFiscalPanel = new JPanel();
        bonFiscalPanel.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));
        bonFiscalPanel.setBackground(new Color(-4343370));
        bonFiscalPanel.setVisible(true);
        mainPanel.add(bonFiscalPanel, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        serviciiMedicaleLabel = new JLabel();
        Font serviciiMedicaleLabelFont = this.getFont(null, Font.BOLD, 14, serviciiMedicaleLabel.getFont());
        if (serviciiMedicaleLabelFont != null) serviciiMedicaleLabel.setFont(serviciiMedicaleLabelFont);
        serviciiMedicaleLabel.setText("Servicii medicale");
        bonFiscalPanel.add(serviciiMedicaleLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        serviciiMedicaleList = new JList();
        serviciiMedicaleList.setBackground(new Color(-4343370));
        bonFiscalPanel.add(serviciiMedicaleList, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        pretLabel = new JLabel();
        Font pretLabelFont = this.getFont(null, Font.BOLD, 14, pretLabel.getFont());
        if (pretLabelFont != null) pretLabel.setFont(pretLabelFont);
        pretLabel.setText("Pret");
        bonFiscalPanel.add(pretLabel, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pretList = new JList();
        pretList.setBackground(new Color(-4343370));
        bonFiscalPanel.add(pretList, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        totalLabel = new JLabel();
        Font totalLabelFont = this.getFont(null, Font.BOLD, 14, totalLabel.getFont());
        if (totalLabelFont != null) totalLabel.setFont(totalLabelFont);
        totalLabel.setText("Total");
        bonFiscalPanel.add(totalLabel, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        totalValueLabel = new JLabel();
        totalValueLabel.setText("");
        bonFiscalPanel.add(totalValueLabel, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setBackground(new Color(-6308366));
        mainPanel.add(panel1, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        emiteBonBtn = new JButton();
        emiteBonBtn.setBackground(new Color(-6229286));
        Font emiteBonBtnFont = this.getFont("Segoe Print", Font.BOLD | Font.ITALIC, 14, emiteBonBtn.getFont());
        if (emiteBonBtnFont != null) emiteBonBtn.setFont(emiteBonBtnFont);
        emiteBonBtn.setText("Emite Bon");
        panel1.add(emiteBonBtn, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_NORTHEAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        backBtn = new JButton();
        backBtn.setBackground(new Color(-6229286));
        Font backBtnFont = this.getFont("Segoe Print", Font.BOLD | Font.ITALIC, 14, backBtn.getFont());
        if (backBtnFont != null) backBtn.setFont(backBtnFont);
        backBtn.setText("Back");
        panel1.add(backBtn, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));

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
        mainPanel.setLayout(new GridLayoutManager(4, 2, new Insets(20, 20, 20, 60), -1, -1));
        mainPanel.setBackground(new Color(-6308366));
        mainPanel.setMinimumSize(new Dimension(850, 650));
        mainPanel.setVisible(true);
        programareLabel = new JLabel();
        Font programareLabelFont = this.$$$getFont$$$("Segoe Print", Font.BOLD, 14, programareLabel.getFont());
        if (programareLabelFont != null) programareLabel.setFont(programareLabelFont);
        programareLabel.setText("Selecteaza pacientul");
        mainPanel.add(programareLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        mainPanel.add(spacer1, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        mainPanel.add(spacer2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        mainPanel.add(scrollPane1, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        listaPacienti = new JList();
        scrollPane1.setViewportView(listaPacienti);
        bonFiscalPanel = new JPanel();
        bonFiscalPanel.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));
        bonFiscalPanel.setBackground(new Color(-4343370));
        bonFiscalPanel.setVisible(true);
        mainPanel.add(bonFiscalPanel, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        serviciiMedicaleLabel = new JLabel();
        Font serviciiMedicaleLabelFont = this.$$$getFont$$$(null, Font.BOLD, 14, serviciiMedicaleLabel.getFont());
        if (serviciiMedicaleLabelFont != null) serviciiMedicaleLabel.setFont(serviciiMedicaleLabelFont);
        serviciiMedicaleLabel.setText("Servicii medicale");
        bonFiscalPanel.add(serviciiMedicaleLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        serviciiMedicaleList = new JList();
        serviciiMedicaleList.setBackground(new Color(-4343370));
        bonFiscalPanel.add(serviciiMedicaleList, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        pretLabel = new JLabel();
        Font pretLabelFont = this.$$$getFont$$$(null, Font.BOLD, 14, pretLabel.getFont());
        if (pretLabelFont != null) pretLabel.setFont(pretLabelFont);
        pretLabel.setText("Pret");
        bonFiscalPanel.add(pretLabel, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pretList = new JList();
        pretList.setBackground(new Color(-4343370));
        bonFiscalPanel.add(pretList, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        totalLabel = new JLabel();
        Font totalLabelFont = this.$$$getFont$$$(null, Font.BOLD, 14, totalLabel.getFont());
        if (totalLabelFont != null) totalLabel.setFont(totalLabelFont);
        totalLabel.setText("Total");
        bonFiscalPanel.add(totalLabel, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        totalValueLabel = new JLabel();
        totalValueLabel.setText("");
        bonFiscalPanel.add(totalValueLabel, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setBackground(new Color(-6308366));
        mainPanel.add(panel1, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        emiteBonBtn = new JButton();
        emiteBonBtn.setBackground(new Color(-6229286));
        Font emiteBonBtnFont = this.$$$getFont$$$("Segoe Print", Font.BOLD | Font.ITALIC, 14, emiteBonBtn.getFont());
        if (emiteBonBtnFont != null) emiteBonBtn.setFont(emiteBonBtnFont);
        emiteBonBtn.setText("Emite Bon");
        panel1.add(emiteBonBtn, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_NORTHEAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        backBtn = new JButton();
        backBtn.setBackground(new Color(-6229286));
        Font backBtnFont = this.$$$getFont$$$("Segoe Print", Font.BOLD | Font.ITALIC, 14, backBtn.getFont());
        if (backBtnFont != null) backBtn.setFont(backBtnFont);
        backBtn.setText("Back");
        panel1.add(backBtn, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
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
