package solid.interfacesegregation.followingprogram;

public class GPay implements UPIPayment, ScratchCardService, CashbackService {
    @Override
    public void pay() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashbackAsBalanace() {

    }
}
