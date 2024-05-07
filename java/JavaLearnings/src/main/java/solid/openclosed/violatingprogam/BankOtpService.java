package solid.openclosed.violatingprogam;

public class BankOtpService {

    // this is following single responsibility but still violating open closed,
    // if we have to add whatsapp notification, then we have to modify this class, which will break open closed principle

    public void sendMobileOTP() {



    }

    public void sendEmailOTP() {




    }

}
