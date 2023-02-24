package app.controller.gui;

import app.model.UtilizatorEntity;
import app.service.UserService;
import app.single_point_access.GUIFrameSinglePointAccess;
import app.single_point_access.ServiceSinglePointAccess;
import app.view.LoginPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class LoginController {

    private LoginPanel loginPanel;

    private UserService userService = ServiceSinglePointAccess.getUserService();

    public void startLogic() {


        loginPanel = new LoginPanel();
        GUIFrameSinglePointAccess.changePanel(loginPanel.getLoginPanel(), "Login");

//
//        loginPanel.getFunctie().addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                String functie = (String) loginPanel.getFunctie().getSelectedItem();
//
//            }
//        });
//

        loginPanel.getBtnOk().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String functie = (String) loginPanel.getFunctie().getSelectedItem();
                String username = loginPanel.getUsername().getText();
                String parola = new String(loginPanel.getParola().getPassword());

                UtilizatorEntity utilizator = userService.login(username, parola);

                if (utilizator != null) {
                    if(Objects.equals(functie, "receptionist") && Objects.equals(utilizator.getFunctie().getNumeFunctie(), "receptionist")){
//                    if(functie == "receptionist" && utilizator.getFunctie().getNumeFunctie() == "receptionist"){
                        ReceptionerMenuController receptionerMenuController = new ReceptionerMenuController();
                        receptionerMenuController.startLogic();
                    }else {
                        System.out.println(functie);
                        System.out.println(utilizator.getFunctie().getNumeFunctie());
                       // UserDetailsController userDetailsController = new UserDetailsController();
                        //userDetailsController.startLogic(utilizator);
                    }
                } else {
                    GUIFrameSinglePointAccess.showDialogMessage("Invalid username or password");
                }
            }
        });

    }
}
