package solid.liskovsubstitution.violatingprogram;

public class WhatsappService implements SocialMediaService{

    // here WhatsappService is not a substitue of SocialMediaService as it does not allow post
    // violating liskov substitution principle
    @Override
    public void chat() {
        
    }

    @Override
    public void post() {

        // not applicable for post
    }

    @Override
    public void groupCall() {

    }
}
