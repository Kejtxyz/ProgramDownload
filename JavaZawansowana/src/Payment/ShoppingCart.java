package Payment;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {
    private List<OrderLine> orderItems; // lista obiektow zamowionych z przedmiotami zamowienia.



    public ShoppingCart(OrderLine...orderItems) {
        this.orderItems = Arrays.asList(orderItems);
    }

    void payForOrder(PaymentGetway paymentGetway) {
        paymentGetway.pay(totalCost);

    }
    private int totalCost(){
        int sum = 0;
        for(OrderLine item : orderItems){
            sum+= item.cost();
        }
        return sum;
    }
}
