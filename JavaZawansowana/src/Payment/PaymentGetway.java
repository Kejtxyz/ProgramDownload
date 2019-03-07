package Payment;

public interface PaymentGetway{
    /**
     *
     * Przeprowadza platnosc,
     *
     * @param amount
     * @throws PaymentGetwayException kiedy serwis wywola blad ktory jest gdizes pod spodem
     */
    void pay(int amount) throws PaymentGetwayException  // mowi ile zplacic, i moze zucac wyjatek jak cos  pojdize nie tak

}
