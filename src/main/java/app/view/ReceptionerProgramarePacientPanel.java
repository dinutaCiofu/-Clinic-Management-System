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

public class ReceptionerProgramarePacientPanel {
    @Getter
    private JPanel mainPanel;
    @Getter
    private JPanel titlePanel;
    private JLabel titlu;
    @Getter
    private JButton inregistrarePacientButton;
    @Getter
    private JButton programarePacientButton;
    @Getter
    private JPanel inregistrarePacientBtnPanel;
    @Getter
    private JPanel programarePacientBtnPanel;
    @Getter
    private JPanel btnPanel;
    @Getter
    private JTabbedPane inregistrarePacientPanel;
    @Getter
    private JPanel actiuniPanel;
    @Getter
    private JPanel pacient;
    @Getter
    private JTextField cnpField;
    @Getter
    private JTextField numeField;
    @Getter
    private JTextField prenumeField;
    @Getter
    private JTabbedPane inregistrarePacient;
    @Getter
    private JLabel ziuaSaptamanaLabel;
    @Getter
    private JLabel dataLabel;
    @Getter
    private JPanel datePickerPanel;
    @Getter
    private JComboBox alegeZiuaBox;
    @Getter
    private JLabel serviciuMedicalLabel;
    @Getter
    private JButton alegeDataBtn;
    private JScrollPane serviciiMedicaleScrollPanel;
    @Getter
    private JList serviciiMedicaleList;
    @Getter
    private JLabel durataLabel;
    @Getter
    private JLabel durataValueLabel;
    @Getter
    private JPanel selectedDatePanel;
    @Getter
    private JLabel selectedDateLabel;
    @Getter
    private JLabel oraLabel;
    @Getter
    private JComboBox oraComboBox;
    @Getter
    private JLabel selecteazaPacientLabel;
    @Getter
    private JList pacientiList;
    @Getter
    private JButton backBtn;

    public ReceptionerProgramarePacientPanel() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.setBackground(new Color(-3611918));
        mainPanel.setMinimumSize(new Dimension(850, 650));
        actiuniPanel = new JPanel();
        actiuniPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 10, 0, 10), -1, -1));
        actiuniPanel.setVisible(true);
        mainPanel.add(actiuniPanel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        inregistrarePacientPanel = new JTabbedPane();
        inregistrarePacientPanel.setBackground(new Color(-10651662));
        actiuniPanel.add(inregistrarePacientPanel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        pacient = new JPanel();
        pacient.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));
        pacient.setBackground(new Color(-3611918));
        inregistrarePacientPanel.addTab("Pacient nou", pacient);
        final JLabel label1 = new JLabel();
        Font label1Font = this.getFont(null, Font.BOLD, 14, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setText("Nume");
        pacient.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        Font label2Font = this.getFont(null, Font.BOLD, 14, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setText("Prenume");
        pacient.add(label2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        Font label3Font = this.getFont(null, Font.BOLD, 14, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setText("CNP");
        pacient.add(label3, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        cnpField = new JTextField();
        pacient.add(cnpField, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        numeField = new JTextField();
        pacient.add(numeField, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        prenumeField = new JTextField();
        pacient.add(prenumeField, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        inregistrarePacient = new JTabbedPane();
        inregistrarePacientPanel.addTab("Programare pacient", inregistrarePacient);
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(6, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setBackground(new Color(-6308366));
        inregistrarePacient.addTab("Programare noua", panel1);
        ziuaSaptamanaLabel = new JLabel();
        Font ziuaSaptamanaLabelFont = this.getFont(null, Font.BOLD, 14, ziuaSaptamanaLabel.getFont());
        if (ziuaSaptamanaLabelFont != null) ziuaSaptamanaLabel.setFont(ziuaSaptamanaLabelFont);
        ziuaSaptamanaLabel.setText("Alege ziua:");
        panel1.add(ziuaSaptamanaLabel, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dataLabel = new JLabel();
        Font dataLabelFont = this.getFont(null, Font.BOLD, 14, dataLabel.getFont());
        if (dataLabelFont != null) dataLabel.setFont(dataLabelFont);
        dataLabel.setText("Alege data:");
        panel1.add(dataLabel, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        datePickerPanel = new JPanel();
        datePickerPanel.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        datePickerPanel.setBackground(new Color(-3611918));
        panel1.add(datePickerPanel, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        alegeDataBtn = new JButton();
        alegeDataBtn.setBackground(new Color(-3935529));
        Font alegeDataBtnFont = this.getFont("Segoe Print", Font.BOLD, 14, alegeDataBtn.getFont());
        if (alegeDataBtnFont != null) alegeDataBtn.setFont(alegeDataBtnFont);
        alegeDataBtn.setText("Deschide calendarul");
        datePickerPanel.add(alegeDataBtn, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        selectedDatePanel = new JPanel();
        selectedDatePanel.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        selectedDatePanel.setBackground(new Color(-3611918));
        datePickerPanel.add(selectedDatePanel, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 1, false));
        selectedDateLabel = new JLabel();
        Font selectedDateLabelFont = this.getFont(null, -1, 14, selectedDateLabel.getFont());
        if (selectedDateLabelFont != null) selectedDateLabel.setFont(selectedDateLabelFont);
        selectedDateLabel.setText("");
        selectedDatePanel.add(selectedDateLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        selectedDatePanel.add(spacer1, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        serviciuMedicalLabel = new JLabel();
        Font serviciuMedicalLabelFont = this.getFont(null, Font.BOLD, 14, serviciuMedicalLabel.getFont());
        if (serviciuMedicalLabelFont != null) serviciuMedicalLabel.setFont(serviciuMedicalLabelFont);
        serviciuMedicalLabel.setText("Alege serviciul medical:");
        panel1.add(serviciuMedicalLabel, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        serviciiMedicaleScrollPanel = new JScrollPane();
        panel1.add(serviciiMedicaleScrollPanel, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        serviciiMedicaleList = new JList();
        serviciiMedicaleList.setBackground(new Color(-3611918));
        serviciiMedicaleList.setSelectionForeground(new Color(-3611918));
        serviciiMedicaleScrollPanel.setViewportView(serviciiMedicaleList);
        durataLabel = new JLabel();
        Font durataLabelFont = this.getFont(null, Font.BOLD, 14, durataLabel.getFont());
        if (durataLabelFont != null) durataLabel.setFont(durataLabelFont);
        durataLabel.setText("Durata:");
        panel1.add(durataLabel, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        durataValueLabel = new JLabel();
        durataValueLabel.setText("");
        panel1.add(durataValueLabel, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        alegeZiuaBox = new JComboBox();
        alegeZiuaBox.setBackground(new Color(-3935529));
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("Luni");
        defaultComboBoxModel1.addElement("Marți");
        defaultComboBoxModel1.addElement("Miercuri");
        defaultComboBoxModel1.addElement("Joi");
        defaultComboBoxModel1.addElement("Vineri");
        alegeZiuaBox.setModel(defaultComboBoxModel1);
        panel1.add(alegeZiuaBox, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        oraLabel = new JLabel();
        Font oraLabelFont = this.getFont(null, Font.BOLD, 14, oraLabel.getFont());
        if (oraLabelFont != null) oraLabel.setFont(oraLabelFont);
        oraLabel.setText("Alege ora:");
        panel1.add(oraLabel, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        oraComboBox = new JComboBox();
        oraComboBox.setBackground(new Color(-3935529));
        final DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel();
        defaultComboBoxModel2.addElement("07:00");
        defaultComboBoxModel2.addElement("07:30");
        defaultComboBoxModel2.addElement("08:00");
        defaultComboBoxModel2.addElement("08:30");
        defaultComboBoxModel2.addElement("09:00");
        defaultComboBoxModel2.addElement("09:30");
        defaultComboBoxModel2.addElement("10:00");
        defaultComboBoxModel2.addElement("10:30");
        defaultComboBoxModel2.addElement("11:00");
        defaultComboBoxModel2.addElement("11:30");
        defaultComboBoxModel2.addElement("12:00");
        defaultComboBoxModel2.addElement("12:30");
        defaultComboBoxModel2.addElement("13:00");
        defaultComboBoxModel2.addElement("13:30");
        defaultComboBoxModel2.addElement("14:00");
        defaultComboBoxModel2.addElement("14:30");
        defaultComboBoxModel2.addElement("15:00");
        defaultComboBoxModel2.addElement("15:30");
        defaultComboBoxModel2.addElement("16:00");
        defaultComboBoxModel2.addElement("16:30");
        defaultComboBoxModel2.addElement("17:00");
        defaultComboBoxModel2.addElement("17:30");
        defaultComboBoxModel2.addElement("18:00");
        oraComboBox.setModel(defaultComboBoxModel2);
        panel1.add(oraComboBox, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        selecteazaPacientLabel = new JLabel();
        Font selecteazaPacientLabelFont = this.getFont(null, Font.BOLD, 14, selecteazaPacientLabel.getFont());
        if (selecteazaPacientLabelFont != null) selecteazaPacientLabel.setFont(selecteazaPacientLabelFont);
        selecteazaPacientLabel.setText("Selectează pacientul:");
        panel1.add(selecteazaPacientLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pacientiList = new JList();
        pacientiList.setBackground(new Color(-3611918));
        panel1.add(pacientiList, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayoutManager(1, 3, new Insets(0, 40, 40, 40), -1, -1));
        btnPanel.setBackground(new Color(-6308366));
        btnPanel.setForeground(new Color(-6308366));
        mainPanel.add(btnPanel, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        inregistrarePacientBtnPanel = new JPanel();
        inregistrarePacientBtnPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 10, 10, 10), -1, -1));
        inregistrarePacientBtnPanel.setBackground(new Color(-6308366));
        btnPanel.add(inregistrarePacientBtnPanel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        inregistrarePacientButton = new JButton();
        inregistrarePacientButton.setBackground(new Color(-3935529));
        Font inregistrarePacientButtonFont = this.getFont("Segoe Print", Font.BOLD | Font.ITALIC, 16, inregistrarePacientButton.getFont());
        if (inregistrarePacientButtonFont != null) inregistrarePacientButton.setFont(inregistrarePacientButtonFont);
        inregistrarePacientButton.setText("Îregistrare pacient");
        inregistrarePacientBtnPanel.add(inregistrarePacientButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        programarePacientBtnPanel = new JPanel();
        programarePacientBtnPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 20, 20, 20), -1, -1));
        programarePacientBtnPanel.setBackground(new Color(-6308366));
        btnPanel.add(programarePacientBtnPanel, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        programarePacientButton = new JButton();
        programarePacientButton.setBackground(new Color(-3935529));
        Font programarePacientButtonFont = this.getFont("Segoe Print", Font.BOLD | Font.ITALIC, 16, programarePacientButton.getFont());
        if (programarePacientButtonFont != null) programarePacientButton.setFont(programarePacientButtonFont);
        programarePacientButton.setText("Programare pacient");
        programarePacientBtnPanel.add(programarePacientButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        backBtn = new JButton();
        backBtn.setBackground(new Color(-3935529));
        Font backBtnFont = this.getFont("Segoe Print", Font.BOLD | Font.ITALIC, 16, backBtn.getFont());
        if (backBtnFont != null) backBtn.setFont(backBtnFont);
        backBtn.setText("Menu");
        btnPanel.add(backBtn, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        label1.setLabelFor(numeField);
        label2.setLabelFor(prenumeField);
        label3.setLabelFor(cnpField);
        ziuaSaptamanaLabel.setLabelFor(alegeZiuaBox);
        serviciuMedicalLabel.setLabelFor(serviciiMedicaleScrollPanel);
        oraLabel.setLabelFor(oraComboBox);

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
        mainPanel.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.setBackground(new Color(-3611918));
        mainPanel.setMinimumSize(new Dimension(850, 650));
        actiuniPanel = new JPanel();
        actiuniPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 10, 0, 10), -1, -1));
        actiuniPanel.setVisible(true);
        mainPanel.add(actiuniPanel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        inregistrarePacientPanel = new JTabbedPane();
        inregistrarePacientPanel.setBackground(new Color(-10651662));
        actiuniPanel.add(inregistrarePacientPanel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        pacient = new JPanel();
        pacient.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));
        pacient.setBackground(new Color(-3611918));
        inregistrarePacientPanel.addTab("Pacient nou", pacient);
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$(null, Font.BOLD, 14, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setText("Nume");
        pacient.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        Font label2Font = this.$$$getFont$$$(null, Font.BOLD, 14, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setText("Prenume");
        pacient.add(label2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        Font label3Font = this.$$$getFont$$$(null, Font.BOLD, 14, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setText("CNP");
        pacient.add(label3, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        cnpField = new JTextField();
        pacient.add(cnpField, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        numeField = new JTextField();
        pacient.add(numeField, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        prenumeField = new JTextField();
        pacient.add(prenumeField, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        inregistrarePacient = new JTabbedPane();
        inregistrarePacientPanel.addTab("Programare pacient", inregistrarePacient);
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(6, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setBackground(new Color(-6308366));
        inregistrarePacient.addTab("Programare noua", panel1);
        ziuaSaptamanaLabel = new JLabel();
        Font ziuaSaptamanaLabelFont = this.$$$getFont$$$(null, Font.BOLD, 14, ziuaSaptamanaLabel.getFont());
        if (ziuaSaptamanaLabelFont != null) ziuaSaptamanaLabel.setFont(ziuaSaptamanaLabelFont);
        ziuaSaptamanaLabel.setText("Alege ziua:");
        panel1.add(ziuaSaptamanaLabel, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dataLabel = new JLabel();
        Font dataLabelFont = this.$$$getFont$$$(null, Font.BOLD, 14, dataLabel.getFont());
        if (dataLabelFont != null) dataLabel.setFont(dataLabelFont);
        dataLabel.setText("Alege data:");
        panel1.add(dataLabel, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        datePickerPanel = new JPanel();
        datePickerPanel.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        datePickerPanel.setBackground(new Color(-3611918));
        panel1.add(datePickerPanel, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        alegeDataBtn = new JButton();
        alegeDataBtn.setBackground(new Color(-3935529));
        Font alegeDataBtnFont = this.$$$getFont$$$("Segoe Print", Font.BOLD, 14, alegeDataBtn.getFont());
        if (alegeDataBtnFont != null) alegeDataBtn.setFont(alegeDataBtnFont);
        alegeDataBtn.setText("Deschide calendarul");
        datePickerPanel.add(alegeDataBtn, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        selectedDatePanel = new JPanel();
        selectedDatePanel.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        selectedDatePanel.setBackground(new Color(-3611918));
        datePickerPanel.add(selectedDatePanel, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 1, false));
        selectedDateLabel = new JLabel();
        Font selectedDateLabelFont = this.$$$getFont$$$(null, -1, 14, selectedDateLabel.getFont());
        if (selectedDateLabelFont != null) selectedDateLabel.setFont(selectedDateLabelFont);
        selectedDateLabel.setText("");
        selectedDatePanel.add(selectedDateLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        selectedDatePanel.add(spacer1, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        serviciuMedicalLabel = new JLabel();
        Font serviciuMedicalLabelFont = this.$$$getFont$$$(null, Font.BOLD, 14, serviciuMedicalLabel.getFont());
        if (serviciuMedicalLabelFont != null) serviciuMedicalLabel.setFont(serviciuMedicalLabelFont);
        serviciuMedicalLabel.setText("Alege serviciul medical:");
        panel1.add(serviciuMedicalLabel, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        serviciiMedicaleScrollPanel = new JScrollPane();
        panel1.add(serviciiMedicaleScrollPanel, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        serviciiMedicaleList = new JList();
        serviciiMedicaleList.setBackground(new Color(-3611918));
        serviciiMedicaleList.setSelectionForeground(new Color(-3611918));
        serviciiMedicaleScrollPanel.setViewportView(serviciiMedicaleList);
        durataLabel = new JLabel();
        Font durataLabelFont = this.$$$getFont$$$(null, Font.BOLD, 14, durataLabel.getFont());
        if (durataLabelFont != null) durataLabel.setFont(durataLabelFont);
        durataLabel.setText("Durata:");
        panel1.add(durataLabel, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        durataValueLabel = new JLabel();
        durataValueLabel.setText("");
        panel1.add(durataValueLabel, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        alegeZiuaBox = new JComboBox();
        alegeZiuaBox.setBackground(new Color(-3935529));
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("Luni");
        defaultComboBoxModel1.addElement("Marți");
        defaultComboBoxModel1.addElement("Miercuri");
        defaultComboBoxModel1.addElement("Joi");
        defaultComboBoxModel1.addElement("Vineri");
        alegeZiuaBox.setModel(defaultComboBoxModel1);
        panel1.add(alegeZiuaBox, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        oraLabel = new JLabel();
        Font oraLabelFont = this.$$$getFont$$$(null, Font.BOLD, 14, oraLabel.getFont());
        if (oraLabelFont != null) oraLabel.setFont(oraLabelFont);
        oraLabel.setText("Alege ora:");
        panel1.add(oraLabel, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        oraComboBox = new JComboBox();
        oraComboBox.setBackground(new Color(-3935529));
        final DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel();
        defaultComboBoxModel2.addElement("07:00");
        defaultComboBoxModel2.addElement("07:30");
        defaultComboBoxModel2.addElement("08:00");
        defaultComboBoxModel2.addElement("08:30");
        defaultComboBoxModel2.addElement("09:00");
        defaultComboBoxModel2.addElement("09:30");
        defaultComboBoxModel2.addElement("10:00");
        defaultComboBoxModel2.addElement("10:30");
        defaultComboBoxModel2.addElement("11:00");
        defaultComboBoxModel2.addElement("11:30");
        defaultComboBoxModel2.addElement("12:00");
        defaultComboBoxModel2.addElement("12:30");
        defaultComboBoxModel2.addElement("13:00");
        defaultComboBoxModel2.addElement("13:30");
        defaultComboBoxModel2.addElement("14:00");
        defaultComboBoxModel2.addElement("14:30");
        defaultComboBoxModel2.addElement("15:00");
        defaultComboBoxModel2.addElement("15:30");
        defaultComboBoxModel2.addElement("16:00");
        defaultComboBoxModel2.addElement("16:30");
        defaultComboBoxModel2.addElement("17:00");
        defaultComboBoxModel2.addElement("17:30");
        defaultComboBoxModel2.addElement("18:00");
        oraComboBox.setModel(defaultComboBoxModel2);
        panel1.add(oraComboBox, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        selecteazaPacientLabel = new JLabel();
        Font selecteazaPacientLabelFont = this.$$$getFont$$$(null, Font.BOLD, 14, selecteazaPacientLabel.getFont());
        if (selecteazaPacientLabelFont != null) selecteazaPacientLabel.setFont(selecteazaPacientLabelFont);
        selecteazaPacientLabel.setText("Selectează pacientul:");
        panel1.add(selecteazaPacientLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        panel1.add(scrollPane1, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        pacientiList = new JList();
        pacientiList.setBackground(new Color(-3611918));
        scrollPane1.setViewportView(pacientiList);
        btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayoutManager(1, 3, new Insets(0, 40, 40, 40), -1, -1));
        btnPanel.setBackground(new Color(-6308366));
        btnPanel.setForeground(new Color(-6308366));
        mainPanel.add(btnPanel, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        inregistrarePacientBtnPanel = new JPanel();
        inregistrarePacientBtnPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 10, 10, 10), -1, -1));
        inregistrarePacientBtnPanel.setBackground(new Color(-6308366));
        btnPanel.add(inregistrarePacientBtnPanel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        inregistrarePacientButton = new JButton();
        inregistrarePacientButton.setBackground(new Color(-3935529));
        Font inregistrarePacientButtonFont = this.$$$getFont$$$("Segoe Print", Font.BOLD | Font.ITALIC, 16, inregistrarePacientButton.getFont());
        if (inregistrarePacientButtonFont != null) inregistrarePacientButton.setFont(inregistrarePacientButtonFont);
        inregistrarePacientButton.setText("Îregistrare pacient");
        inregistrarePacientBtnPanel.add(inregistrarePacientButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        programarePacientBtnPanel = new JPanel();
        programarePacientBtnPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 20, 20, 20), -1, -1));
        programarePacientBtnPanel.setBackground(new Color(-6308366));
        btnPanel.add(programarePacientBtnPanel, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        programarePacientButton = new JButton();
        programarePacientButton.setBackground(new Color(-3935529));
        Font programarePacientButtonFont = this.$$$getFont$$$("Segoe Print", Font.BOLD | Font.ITALIC, 16, programarePacientButton.getFont());
        if (programarePacientButtonFont != null) programarePacientButton.setFont(programarePacientButtonFont);
        programarePacientButton.setText("Programare pacient");
        programarePacientBtnPanel.add(programarePacientButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        backBtn = new JButton();
        backBtn.setBackground(new Color(-3935529));
        Font backBtnFont = this.$$$getFont$$$("Segoe Print", Font.BOLD | Font.ITALIC, 16, backBtn.getFont());
        if (backBtnFont != null) backBtn.setFont(backBtnFont);
        backBtn.setText("Menu");
        btnPanel.add(backBtn, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        label1.setLabelFor(numeField);
        label2.setLabelFor(prenumeField);
        label3.setLabelFor(cnpField);
        ziuaSaptamanaLabel.setLabelFor(alegeZiuaBox);
        serviciuMedicalLabel.setLabelFor(serviciiMedicaleScrollPanel);
        oraLabel.setLabelFor(oraComboBox);
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
