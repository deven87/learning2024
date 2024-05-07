package solid.liskovsubstitution.followingprogram;

import solid.liskovsubstitution.violatingprogram.SocialMediaService;

public class FacebookService implements SocialMediaService, PostMediaService{

    // here fb is a complete substitute of SocialMediaService
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
