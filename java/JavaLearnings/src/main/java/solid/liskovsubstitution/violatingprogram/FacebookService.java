package solid.liskovsubstitution.violatingprogram;

public class FacebookService implements SocialMediaService{

    // here fb is a complete substitue of SocialMediaService
    @Override
    public void chat() {

    }

    @Override
    public void post() {

    }

    @Override
    public void groupCall() {

    }
}
