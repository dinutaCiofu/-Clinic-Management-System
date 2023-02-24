package app.single_point_access;

import app.service.ReceptionerProgramareService;
import app.service.UserService;
import app.service.implementation.ReceptionerProgramareServiceImpl;
import app.service.implementation.UserServiceImpl;

public class ServiceSinglePointAccess {
    private static UserService userService;
    private static ReceptionerProgramareService receptionerProgramareService;

    static{
       userService = new UserServiceImpl();
    }

    static{
        receptionerProgramareService = new ReceptionerProgramareServiceImpl();
    }

    public static UserService getUserService(){
        return userService;
    }
    public static ReceptionerProgramareService getReceptionerProgramareService(){return receptionerProgramareService; }

}
