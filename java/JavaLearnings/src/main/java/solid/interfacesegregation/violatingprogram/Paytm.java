package solid.interfacesegregation.violatingprogram;

public class Paytm implements UPIPayment{
    @Override
    public void pay() {

    }

    @Override
    public void getScratchCard() {
      // forced to implement as paytm does not provide scratch card
    }

    @Override
    public void getCashbackAsBalanace() {

        // forced to implement as paytm does not provide getCashbackAsBalanace


    }
}
