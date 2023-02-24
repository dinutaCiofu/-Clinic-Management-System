package app.controller.gui;
import app.single_point_access.GUIFrameSinglePointAccess;
import app.single_point_access.ServiceSinglePointAccess;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import app.model.ReceptionerEntity;
import app.view.ReceptionerPanel;
import app.view.ReceptionerProgramarePacientPanel;


public class ReceptionerMenuController {
    private ReceptionerPanel receptionerPanel;

    public void startLogic(){
        receptionerPanel = new ReceptionerPanel();
        GUIFrameSinglePointAccess.changePanel(receptionerPanel.getMainPanel(), "Access Receptioner");

        receptionerPanel.getProgramarePacientButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReceptionerProgramareController receptionerProgramareController = new ReceptionerProgramareController();
                receptionerProgramareController.startLogic();
            }
        });

        receptionerPanel.getLogoutButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginController loginController = new LoginController();
                loginController.startLogic();
            }
        });


        receptionerPanel.getEmitereBonFiscalButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmitereBonFiscalController emitereBonFiscalController = new EmitereBonFiscalController();
                emitereBonFiscalController.startLogic();
            }
        });
    }
}
