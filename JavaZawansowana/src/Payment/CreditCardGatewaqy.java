package Payment;

public class CreditCardGatewaqy  implements PaymentGetway{
    @Override
    public void pay(int amount) throws PaymentGetwayException {
        System.out.println("Klient placi %d uzywajac karty kredytowej \n");
    }
}
