package app;

import app.controller.gui.EmitereBonFiscalController;
import app.controller.gui.LoginController;
import app.controller.gui.ReceptionerProgramareController;
import app.model.*;
import app.service.UserService;
import app.single_point_access.ServiceSinglePointAccess;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.InputStream;
import java.util.Properties;


@SpringBootApplication
public class Main {

    private static final String APPLICATION_CONFIGURATION_FILE = "app.configuration.properties";

    public static void main(String[] args) {

        try (InputStream input = Main.class.getClassLoader().getResourceAsStream(APPLICATION_CONFIGURATION_FILE)) {
            Properties properties = new Properties();
            properties.load(input);

            // Decide app mode from file
            String mode = properties.getProperty("mode");

            if (mode.equals("web")) {
                SpringApplication.run(Main.class, args);
            } else {
                LoginController loginController = new LoginController();
                loginController.startLogic();

//                ReceptionerProgramareController receptionerProgramareController = new ReceptionerProgramareController();
//                receptionerProgramareController.startLogic();

//                EmitereBonFiscalController emitereBonFiscalController=new EmitereBonFiscalController();
//                emitereBonFiscalController.startLogic();
            }
        } catch (Exception ex) {
            System.out.println("Error at starting application...");
            ex.printStackTrace();
        }
//
//        UtilizatorEntity utilizator = new UtilizatorEntity();
//        utilizator.setNume("Test");
//        utilizator.setPrenume("prenumeTest");
//        utilizator.setParola("1111");
//        utilizator.setUsername("test");
//
//        UserService userService = ServiceSinglePointAccess.getUserService();
//        UtilizatorEntity savedUser = userService.save(utilizator);

    }
}
