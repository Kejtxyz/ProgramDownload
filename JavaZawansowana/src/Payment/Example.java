package Payment;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        PaymentGetway paymentGetway = choosePaymentGetway();
        ShoppingCart cart = makeAnOrder();
    }
    private static ShoppingCart makeAnOrder(){
        return new ShoppingCart(new OrderLine("herbata", 50, 10),new OrderLine("kawa",30,1))
    }


    private static PaymentGetway choosePaymentGetway(){
        Scanner scanner = new Scanner(System.in);
        String strategy = scanner.next();
        Paymentmetody paymentmetody = Paymentmetody.valueOf(strategy);
        switch (paymentmetody){
            case CREDITCARD:
                return new CreditCardGatewaqy();}

                default:return null;
        }
        if("karta kredytowa".equals(strategy)) {
            return new CreditCardGatewaqy();
        }
        return null;
    }
}
