package solid.liskovsubstitution.followingprogram;

public class WhatsappService implements SocialMediaService {

    // here WhatsappService is substitute of SocialMediaService
    @Override
    public void chat() {
        
    }

    @Override
    public void groupCall() {

    }
}
